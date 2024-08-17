package ExceptionHandling.CustomException;

import java.io.*;
import java.util.Scanner;

class IncorrectFileNameException extends RuntimeException {
    IncorrectFileNameException() {
        super("Please enter the corrct file path");
    }

    IncorrectFileNameException(String s) {
        super(s);
    }
}


class ZeroNumberException extends Exception {
    ZeroNumberException() {
        super();
    }

    ZeroNumberException(String s) {
        super(s);
    }
}

class UnderAgeGenrationException extends RuntimeException {
    UnderAgeGenrationException() {
        super();
    }

    UnderAgeGenrationException(String s) {
        super(s);
    }
}

public class CustomException implements Serializable {
    static Scanner scanner = new Scanner(System.in);

    static void readToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("index.txt"))) {
            bw.write("java programming language");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Scanner scanner = new Scanner(new File("index.txt"))) {
            while (scanner.hasNext()) {
                String readFile = scanner.nextLine();
                System.out.println(readFile);
            }
        } catch (FileNotFoundException e) {
            throw new IncorrectFileNameException("please correct path enter");
        }
    }

    static void addTwoNumberExceptions() {

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            if (e instanceof ArithmeticException) {
                try {
                    throw new ZeroNumberException("The number should be not a zero");
                } catch (ZeroNumberException zero) {
                    zero.printStackTrace();
                }
            }
        } finally {
            scanner.close();
        }
    }

    static void genrationStatus() {
        int age = scanner.nextInt();
        if (age >= 0 && age <= 18) {
            try {
                throw new UnderAgeGenrationException("This is the yonger Age " + age);
            } catch (UnderAgeGenrationException e) {
                e.printStackTrace();
            }
        } else if (age > 18 && age <= 40) {
            try {
                throw new UnderAgeGenrationException("This is the yonger Age " + age);
            } catch (UnderAgeGenrationException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] arg) {
        CustomException.readToFile();
        CustomException.addTwoNumberExceptions();
        CustomException.genrationStatus();
    }
}