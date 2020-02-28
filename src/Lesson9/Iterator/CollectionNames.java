package Lesson9.Iterator;

public class CollectionNames implements Container {
    public String name[] = {"Ashwani Rajput", "Soono Jaiswal",
            "Rishi Kumar", "Rahul Mehta", "Hemant Mishra"};

    @Override
    public Iterator getIterator() {
        return new CollectionOfNameIterate();
    }

    private class CollectionOfNameIterate implements Iterator {
        int i;

        @Override
        public boolean hasNext() {
            if (i < name.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return  name [i++];
            }
            return null;
        }
    }
}
