package models;

import java.sql.*;

public class Member {
    static String dbname = "sample.db";
    static Connection conn = null;
    static PreparedStatement pstmt = null;

    public static void regist(String memberName){
        /* データの挿入 */
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:" + dbname);

            pstmt = conn.prepareStatement("CREATE TABLE IF NOT EXISTS member (name text)");
            pstmt.executeUpdate();

            pstmt = conn.prepareStatement("INSERT INTO member VALUES(?)");
            pstmt.setString(1, memberName);

            pstmt.executeUpdate();

            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
