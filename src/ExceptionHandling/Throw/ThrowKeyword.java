package ExceptionHandling.Throw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;

class InvalidAgeException extends Exception {
    InvalidAgeException(String input) {
        super(input);
    }
}

class SqlConnectionException extends RuntimeException {
    public SqlConnectionException(String input) {
        super(input);
    }
}


public class ThrowKeyword {

    void filenotFondexceptionThrow() throws FileNotFoundException {
        FileInputStream fileInputStream = null;
        if (fileInputStream == null) {
            throw new FileNotFoundException("The file is not Found ");
        }
    }

    public void addingNumbers(Integer value) {
        List<Integer> arrList = new ArrayList<Integer>();
        arrList.add(value);
        if (arrList.contains(value)) {
            throw new IllegalArgumentException("please adding proper value");
        }
    }

    public void sqlException() throws ClassNotFoundException,
            IllegalAccessException, InstantiationException, SQLException {
        Class c = Class.forName("com.mysql.cj.jdbc.Driver");
//        Object obj = (Object) c.newInstance();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "Sid@123456789");
        if (con != null) {
            PreparedStatement ps = con.prepareStatement("insert into users_details(usersName,userDetails, userMob, userAddress) values('Vasudev shri krishna', 'durkanagari', 55456789512, 'shrikirshna durka nagari')");
            int i = ps.executeUpdate();
            if (i > 0)
                System.out.println("success Full");
            else
                System.out.println("connection is failed");
        } else {
            throw new SqlConnectionException("The server connection is failed");
        }
    }

    public void invalidUserAge() throws InvalidAgeException {
//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//        if (age > 0 && age <= 100) {
//            return;
//        } else {
//            throw new InvalidAgeException("invalid age input " + age);
//        }
    }

    public static void main(String[] arg) {
        ThrowKeyword obj = new ThrowKeyword();

        try {
            obj.filenotFondexceptionThrow();
        } catch (FileNotFoundException fle) {
        }

        try {
            obj.addingNumbers(1);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            obj.invalidUserAge();
        } catch (InvalidAgeException iva) {
            iva.printStackTrace();
        }

        try {
            obj.sqlException();
        } catch (ClassNotFoundException | IllegalAccessException | SQLException | InstantiationException |
                 SqlConnectionException e) {
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}



