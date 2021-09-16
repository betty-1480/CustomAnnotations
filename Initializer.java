package bettyHomeWork;

import java.lang.reflect.Field;
import java.util.*;

public class Initializer {

    Map initialize(Object myObject) throws Exception {
        Map<String,Object> fieldObjectMap=new HashMap<>();
        Class<?> objectClass = Objects.requireNonNull(myObject).getClass();
        for (Field field : objectClass.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(BettyCustomAnnotation.class)) {
                fieldObjectMap.put(field.getName(),Class.forName(field.getGenericType().getTypeName()).getConstructor().newInstance());
            }
        }
        return fieldObjectMap;
    }
}