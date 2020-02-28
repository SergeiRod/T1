package Lesson12;

import java.util.function.Function;

public class MyFunction implements Function<Integer,String> {
    @Override
    public String apply(Integer integer) {
        return "String from class: "+ integer.toString();
    }
}
