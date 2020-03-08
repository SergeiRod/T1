package Lesson19.HW;

import Lesson19.HW.MyClass;
import Lesson19.Lesson19;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MyProfileProcessor {
    public void executeAllMethodsWithProfile(MyClass obj , String methodName) {
        Class<?> clazz = obj.getClass();
        Method[] methods = clazz.getMethods();

        Method method = Arrays.asList(methods).stream()
                .filter(m -> m.getName().equals(methodName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No such Method in object: " + methodName));

        try {
            long timeBefore = System.currentTimeMillis();
            method.invoke(obj);
            long timeAfter = System.currentTimeMillis();
            long executionTime = timeAfter -  timeBefore;
            System.out.println("\n Execution time of " + methodName + ": " + executionTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
