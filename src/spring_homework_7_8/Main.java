package spring_homework_7_8;

import java.sql.*;

public class Main {
    // Настройки соединения с БД
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/spring_homework_7_8";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "postgres";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

        System.out.println("Подключились к базе данных!");

        createTables(connection); // Создать таблицы, если они ещё не созданы
        testCrudOperations(connection); // Тестирование CRUD операций

        connection.close();
    }

    /**
     * Проверяем наличие таблиц и создаем их, если их нет.
     */
    private static void createTables(Connection conn) throws SQLException {
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS groups (" +
                            "id SERIAL PRIMARY KEY," +
                            "name NVARCHAR(10) UNIQUE NOT NULL CHECK(name <> '')," +
                            "year INT NOT NULL CHECK(year BETWEEN 1 AND 5)," +
                            "department_id INT NOT NULL REFERENCES departments(id)" +
                            ");"
            );

            stmt.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS subjects (" +
                            "id SERIAL PRIMARY KEY," +
                            "name NVARCHAR(100) UNIQUE NOT NULL CHECK(name <> '')" +
                            ");"
            );

            stmt.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS teachers (" +
                            "id SERIAL PRIMARY KEY," +
                            "name NVARCHAR(50) NOT NULL CHECK(name <> '')," +
                            "salary MONEY NOT NULL CHECK(salary > 0)," +
                            "surname NVARCHAR(50) NOT NULL CHECK(surname <> '')" +
                            ");"
            );

            System.out.println("Таблицы созданы или проверены.");
        }
    }

    /**
     * Выполняем тестовые операции CRUD.
     */
    private static void testCrudOperations(Connection conn) throws SQLException {
        // Создание записей
        insertGroup(conn, "Группа А", 3, 1);
        insertSubject(conn, "Математика");
        insertTeacher(conn, "Иван", "Иванов", 50000);

        // Чтение записей
        selectAllFromTable(conn, "groups");
        selectAllFromTable(conn, "subjects");
        selectAllFromTable(conn, "teachers");

        // Обновление записи
        updateGroup(conn, 1, "Новая Группа А", 4);

        // Удаление записи
        deleteGroup(conn, 1);
    }

    /**
     * Добавляем новую группу.
     */
    private static void insertGroup(Connection conn, String groupName, int year, int deptId) throws SQLException {
        try (PreparedStatement pstmt = conn.prepareStatement(
                "INSERT INTO groups (name, year, department_id) VALUES (?, ?, ?)"
        )) {
            pstmt.setString(1, groupName);
            pstmt.setInt(2, year);
            pstmt.setInt(3, deptId);
            pstmt.executeUpdate();
            System.out.println("Запись о группе создана.");
        }
    }

    /**
     * Добавляем новую дисциплину.
     */
    private static void insertSubject(Connection conn, String subjectName) throws SQLException {
        try (PreparedStatement pstmt = conn.prepareStatement(
                "INSERT INTO subjects (name) VALUES (?)"
        )) {
            pstmt.setString(1, subjectName);
            pstmt.executeUpdate();
            System.out.println("Запись о дисциплине создана.");
        }
    }

    /**
     * Добавляем нового преподавателя.
     */
    private static void insertTeacher(Connection conn, String teacherName, String surname, double salary) throws SQLException {
        try (PreparedStatement pstmt = conn.prepareStatement(
                "INSERT INTO teachers (name, surname, salary) VALUES (?, ?, ?::money)"
        )) {
            pstmt.setString(1, teacherName);
            pstmt.setString(2, surname);
            pstmt.setDouble(3, salary);
            pstmt.executeUpdate();
            System.out.println("Запись о преподавателе создана.");
        }
    }

    /**
     * Получаем список всех записей из указанной таблицы.
     */
    private static void selectAllFromTable(Connection conn, String tableName) throws SQLException {
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + tableName);
            while (rs.next()) {
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    System.out.print(rs.getObject(i) + "\t");
                }
                System.out.println();
            }
        }
    }

    /**
     * Обновляем запись о группе.
     */
    private static void updateGroup(Connection conn, int groupId, String newName, int newYear) throws SQLException {
        try (PreparedStatement pstmt = conn.prepareStatement(
                "UPDATE groups SET name = ?, year = ? WHERE id = ?"
        )) {
            pstmt.setString(1, newName);
            pstmt.setInt(2, newYear);
            pstmt.setInt(3, groupId);
            pstmt.executeUpdate();
            System.out.println("Обновили группу с ID=" + groupId);
        }
    }

    /**
     * Удаляем запись о группе.
     */
    private static void deleteGroup(Connection conn, int groupId) throws SQLException {
        try (PreparedStatement pstmt = conn.prepareStatement(
                "DELETE FROM groups WHERE id = ?"
        )) {
            pstmt.setInt(1, groupId);
            pstmt.executeUpdate();
            System.out.println("Удалили группу с ID=" + groupId);
        }
    }
}