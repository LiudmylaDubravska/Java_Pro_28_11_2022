import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LessonDao {
    //метод отримання всіх уроків
    public List<Lesson> getAllLessons() {
        List<Lesson> lessonList = new ArrayList<>();
        Connection connection = null;
        try {
            connection = DataBaseConnection.getConnection();
            try (Statement statement = connection.createStatement()) {
                try (ResultSet resultSet = statement.executeQuery("SELECT l.id as l_id, l.name as l_name, " +
                        "l.updatedat as l_updatedat, l.homework_id as l_homework_id, h.id as h_id, h.name as h_name, " +
                        "h.description as h_description" +
                        " FROM lesson as l " +
                        "LEFT JOIN homework as h ON l.homework_id = h.id;")) {
                    while (resultSet.next()) {
                        Lesson lesson = new Lesson();
                        lesson.setId(resultSet.getInt("l_id"));
                        lesson.setName(resultSet.getString("l_name"));
                        lesson.setUpdatedAt(resultSet.getDate("l_updatedat"));

                        Homework homework = new Homework();
                        homework.setId(resultSet.getInt("h_id"));
                        homework.setName(resultSet.getString("h_name"));
                        homework.setDescription((resultSet.getString("h_description")));
                        lesson.setHomework(homework);

                        lessonList.add(lesson);
                    }
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } finally {
            DataBaseConnection.close(connection);
        }
        return lessonList;
    }

    public Lesson getLessonById(int id) {
        Connection connection = null;
        try {
            connection = DataBaseConnection.getConnection();
            try (Statement statement = connection.createStatement()) {
                try (ResultSet resultSet = statement.executeQuery("SELECT l.id as l_id, l.name as l_name, " +
                        "l.updatedat as l_updatedat, l.homework_id as l_homework_id, h.id as h_id, h.name as h_name, " +
                        "h.description as h_description" +
                        " FROM lesson as l " +
                        "LEFT JOIN homework as h ON l.homework_id = h.id " +
                        "WHERE l.id = " + id + ";")) {
                    if (resultSet.next()) {
                        Lesson lesson = new Lesson();
                        lesson.setId(resultSet.getInt("l_id"));
                        lesson.setName(resultSet.getString("l_name"));
                        lesson.setUpdatedAt(resultSet.getDate("l_updatedat"));

                        Homework homework = new Homework();
                        homework.setId(resultSet.getInt("h_id"));
                        homework.setName(resultSet.getString("h_name"));
                        homework.setDescription((resultSet.getString("h_description")));
                        lesson.setHomework(homework);
                        return lesson;
                    }
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } finally {
            DataBaseConnection.close(connection);
        }
        return null;
    }

    public int deleteLessonById(int id) {
        Connection connection = null;
        int result = 0;
        try {
            connection = DataBaseConnection.getConnection();
            try (Statement statement = connection.createStatement()) {
                result = statement.executeUpdate("DELETE FROM lesson WHERE id = " + id + ";");

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } finally {
            DataBaseConnection.close(connection);
        }
        return result;
    }

    public Integer addLesson(Lesson lesson) {
        Connection connection = null;
        Integer id = null;
        try {
            connection = DataBaseConnection.getConnection();
            try (PreparedStatement updateStatement = connection.prepareStatement("INSERT INTO lesson (name) VALUES (?)",
                    Statement.RETURN_GENERATED_KEYS)){
                updateStatement.setString(1, lesson.getName());
//                updateStatement.setInt(2, (lesson.getHomework()==null ? null : lesson.getHomework().getId()));
                updateStatement.executeUpdate();
                ResultSet generatedKeys = updateStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    id = generatedKeys.getInt(1);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } finally {
            DataBaseConnection.close(connection);
        }
        return id;
    }
}
