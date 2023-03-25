import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestRunner {
    static void start(Class clas) throws InvocationTargetException, IllegalAccessException {
        invokeBeforeSuiteMethods(clas);
        invokeTestMethods(clas);
        invokeAfterSuiteMethods(clas);

    }

    private static void invokeTestMethods(Class clas) throws IllegalAccessException, InvocationTargetException {
        List<Method> methods = getTestMethods(clas);
        for (Method method : methods) {
            Object result = method.invoke(null);
            if (method.toString().contains(result.toString())) {
                System.out.println("Method OK    :" + method.toString() + " " + result);
            } else {
                System.out.println("Method Fails :" + method.toString() + " " + result);
            }
        }
    }

    private static void invokeBeforeSuiteMethods(Class clas) throws IllegalAccessException, InvocationTargetException {
        List<Method> methods = getBeforeSuiteMethod(clas);
        if (methods.size() > 1) {
            throw new RuntimeException("Only one method should have @BeforeSuite annotation ");
        } else if (methods.size() == 1) {
            methods.get(0).invoke(null);
        }
    }

    private static void invokeAfterSuiteMethods(Class clas) throws IllegalAccessException, InvocationTargetException {
        List<Method> methods = getAfterSuiteMethod(clas);
        if (methods.size() > 1) {
            throw new RuntimeException("Only one method should have @AfterSuite annotation ");
        } else if (methods.size() == 1) {
            methods.get(0).invoke(null);
        }
    }

    private static List<Method> getTestMethods(Class clas) {
        List<Method> methods = Arrays.asList(clas.getDeclaredMethods());
        List<Method> result = methods
                .stream()
                .filter(m -> m.isAnnotationPresent(Test.class))
                .sorted((m1, m2) -> {
                    Test annotInstance = m1.getAnnotation(Test.class);
                    int priority1 = annotInstance.priority();
                    annotInstance = m2.getAnnotation(Test.class);
                    int priority2 = annotInstance.priority();
                    return Integer.compare(priority1, priority2);
                } )
                .collect(Collectors.toList());
        return result;
    }

    private static List<Method> getBeforeSuiteMethod(Class clas) {
        List<Method> methods = Arrays.asList(clas.getDeclaredMethods());
        List<Method> result = methods
                .stream()
                .filter(m -> m.isAnnotationPresent(BeforeSuite.class))
                .collect(Collectors.toList());
        return result;
    }

    private static List<Method> getAfterSuiteMethod(Class clas) {
        List<Method> methods = Arrays.asList(clas.getDeclaredMethods());
        List<Method> result = methods
                .stream()
                .filter(m -> m.isAnnotationPresent(AfterSuite.class))
                .collect(Collectors.toList());
        return result;
    }
}
