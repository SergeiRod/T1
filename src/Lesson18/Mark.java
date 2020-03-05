package Lesson18;

import java.util.stream.Stream;

public class Mark {
    @MyLog
    public void doSmt() {
        System.out.println(".doSmt");
        Stream.iterate(3,i-> i+3).limit(5).forEach(integer -> System.out.println("i " + integer));
    }

    @MyLog
    public int getRandom () {
        System.out.println(".getRandom()");
        return 2;
    }


    public int getRandom1 () {
        System.out.println(".getRandom1");
        return 3;
    }

}
