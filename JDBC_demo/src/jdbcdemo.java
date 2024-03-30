import java.sql.*;

public class jdbcdemo {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String username = "root";
        String password = "Muramovi0527";
        String query = "SELECT * FROM jdbcdemo";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {
                System.out.println("id is: " + rs.getInt(1));
                System.out.println("name is: " + rs.getString(2));
                System.out.println("salary is: " + rs.getInt(3));
                System.out.println(); 
            } 
            con.close();
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
