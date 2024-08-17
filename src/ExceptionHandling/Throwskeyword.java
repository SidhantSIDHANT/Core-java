package ExceptionHandling;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Throwskeyword {

    static FileInputStream fileInputStream() throws IOException {
        FileInputStream fileInput = new FileInputStream("index.txt");
        System.out.println("fileInputStream in java");
        return fileInput;
    }

    static FileOutputStream fileOutputStream() throws IOException {
        FileOutputStream fileOutput = new FileOutputStream(new File("index.txt"));
        return fileOutput;
    }

    void classExceptions() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class c = Class.forName("ExceptionHandling.Throwskeyword");
        Throwskeyword obj = (Throwskeyword) c.newInstance();
    }

    void sqlException() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://@localhost:3306/users", "root", "Sid@123456789");
        PreparedStatement ps = con.prepareStatement("insert into users_details(usersName, userDetails, userMob, userAddress) values ('bhila', 'bhikari', '5546988712', 'bhikari pakistan ')");

        int i = ps.executeUpdate();
        System.out.println(i);
    }

    void sqlSelectQuery() {

    }

    public static void main(String arg[]) {
        Throwskeyword obj = new Throwskeyword();

        try {
            fileInputStream();
            fileOutputStream();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            obj.classExceptions();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        try {
            obj.sqlException();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Main method is worked");
    }
}