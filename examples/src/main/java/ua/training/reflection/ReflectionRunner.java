package ua.training.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionRunner {

    public static void main(String[] args) throws Exception {
        String className = "ua.training.reflection.immutaible.SomeClass";
        Class clazz = Class.forName(className);
        Object someObject = clazz.newInstance();

        for (Method m : clazz.getMethods()) {
            System.out.println(Modifier.toString(m.getModifiers()) + " "
                    + m.getReturnType() + " " + m.getName());
            if (m.isAnnotationPresent(CallMe.class)) {
                Object obj = m.invoke(someObject);
                if (obj != null) {
                    System.out.println(obj);
                }
            }
        }

        Field field = clazz.getDeclaredField("field");
        field.setAccessible(true);
        field.setInt(someObject, -100500);

        System.out.println(someObject);
    }

}
