package ExceptionHandling.Throws;


import java.io.*;

public class ThrowsDemo {

    static void fileReader() throws FileNotFoundException {
        FileInputStream fileInput = new FileInputStream("index.txt");
        System.out.println("hello, Java");
    }

    public void createToObject() throws ClassNotFoundException {
//       Class.forName();
    }

    void writeToFile() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("index.txt"));
        bw.write("java");
        bw.close();
    }

    public void test() throws ArithmeticException 
    {
        System.out.println("run time Exception ");
    }

    public void display(ThrowsDemo d) throws NullPointerException  {
        d = null;
        d.test();
    }

    public static void main(String[] arg) {
        ThrowsDemo demo = new ThrowsDemo();

        try {
            fileReader();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            demo.display(demo);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            demo.writeToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            demo.createToObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        demo.test();
    }
}