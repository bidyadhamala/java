import java.sql.*;
public class DBConnection {

private static final String url="jdbc:mysql://localhost:3306/bcis";
private static  final String username="root";
private static final String password=";


public static void main(String args[]) {
try{

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con =DriverManager.getConnection(url, username,password);
if(con !=null){
System.out.prfintln("connected");
}else{
System.out.println("failed");
}
}catch(SQLException e){
e.printStackTrack();
}catch (ClassNotFoundException e){
System.out.println(e.getMessage());
}
}
}
