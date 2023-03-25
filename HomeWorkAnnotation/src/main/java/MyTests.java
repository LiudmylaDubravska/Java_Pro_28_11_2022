public class MyTests {

    @BeforeSuite
    public static void hello(){
        System.out.println("Hello");
    }

    @AfterSuite
    public static void goodBye(){
        System.out.println("Good Bye!");
    }

    @Test(priority = 3)
    public static int check5(){
        return 5;
    }

    @Test(priority = 2)
    public static int check3(){
        return 3;
    }

    @Test(priority = 1)
    public static int check2(){
        return 1;
    }

    public static int shouldBeIgnored(){
        return 5;
    }
}
