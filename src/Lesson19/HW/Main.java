package Lesson19.HW;

import Lesson19.Lesson19;

public class Main {
    public static void main(String[] args) {
        MyProfileProcessor processor = new MyProfileProcessor();
        MyClass obj = new MyClass();
        processor.executeAllMethodsWithProfile(obj, "do1");
        processor.executeAllMethodsWithProfile(obj, "do2");
        processor.executeAllMethodsWithProfile(obj, "do3");
    }
}
