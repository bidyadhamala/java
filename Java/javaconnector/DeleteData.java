import java.sql.*;
import java.util.Scanner;

public class DeleteData{

private static final String url="jdbc:mysql://localhost://localhost:3306/bcis";
private static final String username="root";
private static final String password="";

public static void main(String args[]) throws SQLException,ClassNotFoundException{

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con =DriverManager.getConnection(url, username,password);
String query="DELETE FROM students WHERE id=?";
Scanner sc= new Scanner(System.in);

System.out.println("Enter the ID of the students to delete:");
int id=sc.nextInt();

PreparedStatement ps=con.prepareStatement(query);
ps.setInt(1,id);
int rs =ps.executeUpdate();

if(rs>0){
System.out.println("data added successfully");
}
else{
System.out.println("failed");
}
con.close();
}
}



