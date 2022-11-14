package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
   public static Connection getConnection() {
      try {
          
         // 오라클인 경우 
         Class.forName("oracle.jdbc.driver.OracleDriver");
         return DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.12:1521:xe", "scott", "tiger");
         
         
         //Class.forName("org.mariadb.jdbc.Driver");
         //return DriverManager.getConnection("jdbc:mariadb://localhost:3306/test", "root", "admin1234");

      } catch (Exception e) {
         e.printStackTrace();
      }
      return null;
   }

   public static void close(PreparedStatement stmt, Connection conn) {
      if (stmt != null) {
         try {
            if (!stmt.isClosed())
               stmt.close();
         } catch (Exception e) {
            e.printStackTrace();
         } finally {
            stmt = null;
         }
      }
      if (conn != null) {
         try {
            if (!conn.isClosed())
               conn.close();
         } catch (Exception e) {
            e.printStackTrace();
         } finally {
            conn = null;
         }
      }
   }

   public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
      if (rs != null) {
         try {
            if (!rs.isClosed())
               rs.close();
         } catch (Exception e) {
            e.printStackTrace();
         } finally {
            rs = null;
         }
      }
      if (stmt != null) {
         try {
            if (!stmt.isClosed())
               stmt.close();
         } catch (Exception e) {
            e.printStackTrace();
         } finally {
            stmt = null;
         }
      }
      if (conn != null) {
         try {
            if (!conn.isClosed())
               conn.close();
         } catch (Exception e) {
            e.printStackTrace();
         } finally {
            conn = null;
         }
      }
   }
}