import java.sql.*;

public class DbTest1 {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connect = DriverManager.getConnection("jdbc:sqlite:D:/Filelatihan/sqlite/dbtest1.db");
            Statement stat = connect.createStatement();


            stat.executeUpdate("CREATE TABLE IF NOT EXISTS barang (kode TEXT, namabar TEXT, harga INTEGER);");

            ResultSet rs = stat.executeQuery("select * from barang");
            while (rs.next()){
                String a = rs.getString("kode");
                System.out.println(a);
                String b = rs.getString("namabar");
                int c = rs.getInt("harga");
                System.out.println("\t"+c);
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Eror"+e.getMessage());
        }
    }
}