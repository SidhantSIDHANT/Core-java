package CustomPackage;

public class InnerrClass {

    public static void main(String[] arg) {
        Show obj = new Show();
        Show.Add obj2 = obj.new Add();
        obj2.data = obj.new Add();
    }
}
