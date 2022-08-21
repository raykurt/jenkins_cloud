package jenkins;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Api_Medunna_Database_Utilities {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;
    static ResultSetMetaData rsmd;


    public static void createConnection() {
        String url = "jdbc:postgresql://medunna.com:5432/medunna_db";
        String user = "medunnadb_user";
        String password = "Medunnadb_@129";
        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeConnection() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Object> getColumnData(String query, String column) {
        executeQuery(query);
        List<Object> rowList = new ArrayList<>();
        try {
            rsmd = resultSet.getMetaData();
            while (resultSet.next()) {
                rowList.add(resultSet.getObject(column));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowList;
    }

    public static void executeQuery(String query) {
        try {
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
