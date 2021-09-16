package bettyHomeWork;

import java.util.Map;

public class Main {

    public static void main(String...args) throws Exception{
        MyClass myClass = new MyClass();
        Initializer initializer=new Initializer();
        Map myMap  = initializer.initialize(myClass);
        myClass.setRandomChild((RandomChild)myMap.get("randomChild"));
        System.out.println(myClass);
    }
}
