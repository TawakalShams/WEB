import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class Servlet extends javax.servlet.http.HttpServlet {
    //reg drive
    static  final String JDBC_DRIVER = "com.mysql.jdbc.Driver";



//    String name = rs.getString("name");
//    String reg = rs.getString("reg");
//    String grade = rs.getString("grade");
//    String phone = rs.getString("phone");
//    String email = rs.getString("email");
//    String gender = rs.getString("gender");
//    String status = rs.getString("status");

    protected void getAll(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String DB_USER = "root";
        String DB_PASS = "";
        String DB_URL = "jdbc:mysql://localhost:3306/bita";

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try         {
            //reg Driver
            Class.forName(JDBC_DRIVER);
            //Opening connection
            Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS );
            //SQL statement
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO students(name,regno,grade, phone, email, gender, regstatus) VALUES('name','reg','grade','phone','email','gender','status')";
            int outi = stmt.executeUpdate(sql);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }



    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        getAll(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        getAll(request,response);
    }
}
