package java23.jdbc;

public class DBConnect {
    public static java.sql.Connection connectionMySQL(){
    String url  = "jdbc:mysql://localhost:3306/book_db";
    String user = "root";
    String pawd = "1234";
    java.sql.Connection conn = null;
    
    try {
        Class.forName("com.mysql.jdbc.Driver"); // mysql driver 로딩
        conn = java.sql.DriverManager.getConnection(url, user, pawd); // DB 연결
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        } catch (java.sql.SQLException e) {
        e.printStackTrace();
        }
        return conn;
    }

    public static java.sql.Connection makeConnection() {
        // TODO Auto-generated method stub
        return connectionMySQL();
        
    }
}
