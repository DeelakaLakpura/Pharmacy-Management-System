/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Deelaka
 */
public class Tables {
    
    public static void main(String[] args) {
        try {
            Connection con = DBConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("CREATE TABLE tbl_user (user_pk INT AUTO_INCREMENT PRIMARY KEY, user_role VARCHAR(300), name VARCHAR(200), dob VARCHAR(50), mobileNo VARCHAR(30), email VARCHAR(200), username VARCHAR(200), password VARCHAR(30), address VARCHAR(230))");
            JOptionPane.showMessageDialog(null, "Table Created Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

