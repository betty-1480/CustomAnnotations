package bettyHomeWork;

import java.util.Map;

public class Main {

    public static void main(String... args) throws Exception {
        MyClass myClass = new MyClass();
        Initializer initializer = new Initializer();
        initializer.initialize(myClass);
        System.out.println(myClass);
    }
}
