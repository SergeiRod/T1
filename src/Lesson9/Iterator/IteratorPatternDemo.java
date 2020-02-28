package Lesson9.Iterator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        CollectionNames cmpnyRepository = new CollectionNames();
        for (Iterator iter = cmpnyRepository.getIterator(); iter.hasNext(); ) {
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
