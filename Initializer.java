package bettyHomeWork;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class Initializer {

    void initialize(Object myObject) throws Exception {

        Class<?> objectClass = Objects.requireNonNull(myObject).getClass();

        for (Field field : objectClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(BettyCustomAnnotation.class)) {
                for (Method m:objectClass.getMethods()) {
                    if (m.getName().startsWith("set")&&m.getName().substring(3).equalsIgnoreCase(field.getName())){
                        //Method.invoke(classObj, param1, param2…)
                        m.invoke(myObject,Class.forName(field.getGenericType().getTypeName()).getConstructor().newInstance());
                    }

                }
            }
            System.out.println(myObject);
        }
    }
}