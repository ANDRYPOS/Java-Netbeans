/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author PANASONIC
 */
public class Connect {
    public static Connection con;
    public static Statement statement;
    public static Connection GetConnection(){
        {
            try {
                String url ="jdbc:mysql://localhost:3306/inventory";
                String username ="root";
                String password ="";
                con = DriverManager.getConnection(url,username,password);
                statement = con.createStatement();
                //JOptionPane.showMessageDialog(null,"\nSave Succesfully\n\n","Succes",1);
            }
            catch (SQLException e){
                System.out.println("Koneksi Database Gagal");
            }
        } return con;
    }
}
