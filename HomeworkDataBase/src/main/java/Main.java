import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        LessonDao lessonDao = new LessonDao();
        List<Lesson> lessonList = lessonDao.getAllLessons();
        System.out.println("Lesson list: ");
        for (Lesson lesson : lessonList) {
            System.out.println(lesson);
        }
        int id = 1;
        System.out.println("Find Lesson by id = " + id);
        System.out.println(lessonDao.getLessonById(id));

        id = 100;
        System.out.println("Find Lesson by id = " + id);
        System.out.println(lessonDao.getLessonById(id));

        String name = "Strings";
        Lesson lesson = new Lesson();
        lesson.setName(name);
        System.out.println("Add Lesson with name = " + name);
        Integer id2 = lessonDao.addLesson(lesson);
        System.out.println("Find Lesson by id = " + id2);
        System.out.println(lessonDao.getLessonById(id2));

        lessonList = lessonDao.getAllLessons();
        System.out.println("Lesson list: ");
        for (Lesson lesson2 : lessonList) {
            System.out.println(lesson2);
        }

        System.out.println("Delete Lesson by id = " + id2);
        int isDelete = lessonDao.deleteLessonById(id2);
        if(isDelete == 0){
            System.out.println("Lesson with id " + id2 + " does not exist!");
        } else System.out.println("Lesson with id " + id2 + " was successfully deleted!");

        lessonList = lessonDao.getAllLessons();
        System.out.println("Lesson list: ");
        for (Lesson lesson2 : lessonList) {
            System.out.println(lesson2);
        }

    }
}
