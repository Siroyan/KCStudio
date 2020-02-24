package models;

import java.sql.*;

public class Member {
    static String dbname = "sample.db";
    static Connection conn = null;
    static Statement stmt = null;

    public static void regist(){
        connectDB();
        /* データの挿入 */
        try {
            stmt.executeUpdate("INSERT INTO products VALUES(1, 'AAA', 100)");
            stmt.executeUpdate("INSERT INTO products VALUES(2, 'BBB', 80)");
            stmt.executeUpdate("INSERT INTO products VALUES(3, 'CCC', 220)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        disconnectDB();
    }

    /* DBと接続 */
    private static void connectDB(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:" + dbname);
            System.out.println("接続成功");

            stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS products (pid INTEGER, name VARCHAR(20), price INTEGER)");
            System.out.println("テーブル作成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* DBと切断 */
    private static void disconnectDB(){
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
