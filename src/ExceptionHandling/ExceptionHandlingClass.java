package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class DownCasting {

}

class CastingClass extends DownCasting {
    public void show() {
        System.out.println("show");
    }
}

public class ExceptionHandlingClass {
    Scanner scanner = new Scanner(System.in);

    public void arithmeticException() {
        System.out.println("please enter the Number");
        int a = 10;
        int b = scanner.nextInt();
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("please enter the valid number");
        }
    }

    public void numberFormatException() {
        String languageName = "java programming ";
        int age = Integer.parseInt("" + this.scanner.nextInt());
    }

    public void instantialExcpeiton() {
        try {
            Class c = Class.forName("ExceptionHandlingClass");
            ExceptionHandlingClass obj = (ExceptionHandlingClass) c.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public void classCastException() {
        try {
            CastingClass obj = (CastingClass) new DownCasting();
            obj.show();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] arg) throws ArithmeticException {
        ExceptionHandlingClass obj = new ExceptionHandlingClass();
        try {
            obj.arithmeticException();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        ;
        obj.numberFormatException();
        obj.instantialExcpeiton();
        obj.classCastException();
        System.out.println("handle the arithmetic Exception ");
    }
}