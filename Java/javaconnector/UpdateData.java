import java.sql.*;
import java.util.Scanner;

public class UpdateData {

    private static final String url = "jdbc:mysql://localhost:3306/bcis";
    private static final String username = "root";
    private static final String password = "";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (
            Scanner sc = new Scanner(System.in);
            Connection con = DriverManager.getConnection(url, username, password);
        ) {
            String query = "UPDATE students SET name=?, dob=?, age=? WHERE id=?";
            System.out.println("Enter the ID of the student to update:");
            int id = sc.nextInt();
            sc.nextLine(); // Consume the newline

            System.out.println("Enter the new name:");
            String name = sc.nextLine();

            System.out.println("Enter the new date of birth (YYYY-MM-DD):");
            String dob = sc.nextLine();
            Date sqlDate = Date.valueOf(dob); // Validate date format

            System.out.println("Enter the new age:");
            int age = sc.nextInt();

            try (PreparedStatement ps = con.prepareStatement(query)) {
                ps.setString(1, name);
                ps.setDate(2, sqlDate);
                ps.setInt(3, age);
                ps.setInt(4, id);

                int rs = ps.executeUpdate();

                if (rs > 0) {
                    System.out.println("Data updated successfully.");
                } else {
                    System.out.println("Update failed. No student found with the given ID.");
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}