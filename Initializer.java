package bettyHomeWork;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class Initializer {

    void initialize(Object myObject) throws Exception {

        Class<?> objectClass = Objects.requireNonNull(myObject).getClass();

        for (Field field : objectClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(BettyCustomAnnotation.class)) {
                field.setAccessible(true);
                field.set(myObject,Class.forName(field.getGenericType().getTypeName()).getConstructor().newInstance());
            }
        }
    }
}