package AnonomusClass;

class Employee {

    public void employ() {
        System.out.println("this is the employ() method");
    }

    public void salary() {
        System.out.println("This is the salary Method in java");
    }
}

public class AnnonomusClass {

    public static void main(String[] arg){
        Employee emp = new Employee(){
            public void employ(){
                System.out.println("Override the employ method ");
            }
        };

        emp.employ();
    }
}