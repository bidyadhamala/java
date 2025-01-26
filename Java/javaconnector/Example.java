import java.sql.*;

public class Example {

private static final String URL = "jdbc:mysql://localhost:3306/pokharaUniversity";
private static final String USERNAME = "root";
private static final String PASSWORD = "";

public static void main(String[] args) throws SQLException, ClassNotFoundException {
       
Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
String insertQuery = "INSERT INTO student (id, s_name, s_address, s_gender, s_course) VALUES (?, ?, ?, ?, ?)";
PreparedStatement insertStmt = con.prepareStatement(insertQuery);
insertStmt.setInt(1, 10205);
insertStmt.setString(2, "Sam");
insertStmt.setString(3, "London");
insertStmt.setString(4, "M");
insertStmt.setString(5, "BE");
insertStmt.executeUpdate();
System.out.println("Record inserted successfully!");

String updateQuery = "UPDATE student SET s_address = ?, s_course = ? WHERE id = ?";
PreparedStatement updateStmt = con.prepareStatement(updateQuery);
updateStmt.setString(1, "Chitwan");
updateStmt.setString(2, "BCIS");
updateStmt.setInt(3, 10205);
updateStmt.executeUpdate();
System.out.println("Record updated successfully!");

        
String selectQuery = "SELECT * FROM student WHERE id = ?";
 PreparedStatement selectStmt = con.prepareStatement(selectQuery);
 selectStmt.setInt(1, 10205);
 ResultSet rs = selectStmt.executeQuery();

 while (rs.next()) {
 int id = rs.getInt("id");
 String name = rs.getString("s_name");
 String address = rs.getString("s_address");
 String gender = rs.getString("s_gender");
 String course = rs.getString("s_course");

System.out.println("ID: " + id + ", Name: " + name + ", Address: " + address + ", Gender: " + gender + ", Course: " + course);
 }

       
rs.close();
selectStmt.close();
updateStmt.close();
insertStmt.close();
con.close();
    }
}