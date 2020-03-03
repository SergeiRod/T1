package Lesson11;

import Lesson11.generic.*;

import java.util.*;

public class Main {
    public static List<Integer> searchInArrayList(List<Integer> list, Integer searchCriteria) {
        //TODO...
        List<Integer> result = new ArrayList<>();
        for (Integer item : list) {
            if (item.equals(searchCriteria)) {
                result.add(item);
            }
        }
        System.out.print("Searched " + searchCriteria + " was found " + result.size() + " times = ");
        return result;
    }

    public static List<Integer> reverseInArrayList(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }
        //Collections.reverse(list);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>();
        testList.add(5);
        testList.add(2);
        testList.add(4);
        testList.add(7);
        testList.add(8);
        testList.add(9);
        testList.add(3);
        testList.add(1);
        testList.add(6);
        testList.add(6);

        System.out.println("ArrayList<> = " + testList);
        List<Integer> searchResult = searchInArrayList(testList, 6);
        System.out.println(searchResult);

        List<Integer> reverseResult = reverseInArrayList(testList);
        System.out.println(reverseResult);

        Collections.reverse(testList);
        System.out.println(testList);

        int lookup = Collections.binarySearch(testList, 9);
        System.out.println("Binary Search: " + lookup);
        System.out.println("Lookup Value: " + testList.get(lookup));

        Collections.shuffle(testList);
        System.out.println(testList);

        Set<Integer> testSet = new HashSet<>();
        System.out.println("Add 4: " + testSet.add(4));
        System.out.println("Add 3: " + testSet.add(3));
        System.out.println("Add 5: " + testSet.add(5));
        System.out.println("Add 6: " + testSet.add(6));
        System.out.println("Add 2: " + testSet.add(2));
        System.out.println("Add 3: " + testSet.add(3));
        System.out.println(testSet);

        Set<String> testSetString = new TreeSet<>();
        testSetString.add("aab");
        testSetString.add("1");
        testSetString.add("aaa");
        testSetString.add("aac");
        testSetString.add("aaC");
        testSetString.add("2");
        testSetString.add("aaa");
        System.out.println(testSetString);
        System.out.println("1++++++++++++++++++++++++++++++++++++");

        Auto auto1 = new Auto(3000, "BMW", 2000);
        Auto auto2 = new Auto(2000, "Honda", 3000);
        Auto auto3 = new Auto(5000, "Citroen", 1000);
        Set<Auto> autoSet = new TreeSet<>();
        autoSet.add(auto1);
        autoSet.add(auto2);
        autoSet.add(auto3);
        System.out.println(autoSet);
        System.out.println("2++++++++++++++++++++++++++++++++++++");

        AutoPriceComparator priceComparator = new AutoPriceComparator();
        Set<Auto> autoSetWithComparator = new TreeSet<>(priceComparator);
        autoSetWithComparator.add(auto1);
        autoSetWithComparator.add(auto2);
        autoSetWithComparator.add(auto3);
        System.out.println(autoSetWithComparator);

        System.out.println("3++++++++++++++++++++++++++++++++++++");

        Set<Auto> setWithAnonymousComparator = new TreeSet<>(new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return o1.getProducer().compareTo(o2.getProducer());
            }
        });
        setWithAnonymousComparator.add(auto1);
        setWithAnonymousComparator.add(auto2);
        setWithAnonymousComparator.add(auto3);

        System.out.println(setWithAnonymousComparator);

        System.out.println("4++++++++++++++++++++++++++++++++++++");

        Person employee1 = new Employee("Mark", 23, Gender.MALE, 20_000);
        Person employee2 = new Employee("Sergio", 37, Gender.MALE, 70_000);
        Person employee3 = new Employee("Sandra", 30, Gender.FEMALE, 50_000);

        Person citizen1 = new Citizen("Egor", 37, Gender.MALE, true);
        Person citizen2 = new Citizen("Helga", 19, Gender.FEMALE, true);
        //citizen2.setAge(17);
        System.out.println("age exception test "+citizen2.getAge());
        Person citizen3 = new Citizen("Maria", 56, Gender.FEMALE, false);

        Set<Person> personSet = new HashSet<>();
        personSet.add(employee1);
        personSet.add(employee2);
        personSet.add(employee3);
        System.out.println(citizen3.getAge());
        citizen2.setGender(Gender.UNKNOWN);
        System.out.println(citizen2.getGender());

        personSet.add(citizen1);
        personSet.add(citizen2);
        personSet.add(citizen3);

        System.out.println(personSet);

        System.out.println("5++++++++++++++++++++++++++++++++++++");

        Set<Person> setPersonWithAnonymousComparator = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        setPersonWithAnonymousComparator.add(citizen1);
        setPersonWithAnonymousComparator.add(citizen2);
        setPersonWithAnonymousComparator.add(citizen3);
        setPersonWithAnonymousComparator.add(employee1);
        setPersonWithAnonymousComparator.add(employee2);
        setPersonWithAnonymousComparator.add(employee3);

        System.out.println(setPersonWithAnonymousComparator);

        System.out.println("6++++++++++++++++++++++++++++++++++++");

        PersonAgeComparator personAgeComparator = new PersonAgeComparator();
        TreeSet<Person> personSetWithComparator = new TreeSet<>(personAgeComparator);
        personSetWithComparator.add(employee1);
        personSetWithComparator.add(employee2);
        personSetWithComparator.add(employee3);
        personSetWithComparator.add(citizen1);
        personSetWithComparator.add(citizen2);
        personSetWithComparator.add(citizen3);


        // TODO ???????
        Iterator iterator = personSetWithComparator.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("7++++++++++++++++++++++++++++++++++++");

        System.out.println((personSetWithComparator).last());

        System.out.println((personSetWithComparator).floor(citizen1));

        System.out.println("8++++++++++++++++++++++++++++++++++++");
        PersonAgeComparator personAgeComparator2 = new PersonAgeComparator();
        Set<Person> personSetWithComparator1 = new TreeSet<>(personAgeComparator2);
        personSetWithComparator1.add(employee1);
        personSetWithComparator1.add(employee2);
        personSetWithComparator1.add(employee3);
        System.out.println(personSetWithComparator1);
        System.out.println(personSetWithComparator1.size());

        Set<Person> personSetWithComparator2 = new TreeSet<>(personAgeComparator2);
        personSetWithComparator2.add(citizen1);
        personSetWithComparator2.add(citizen2);
        personSetWithComparator2.add(citizen3);
        System.out.println(personSetWithComparator2);
        System.out.println(personSetWithComparator2.size());

        personSetWithComparator1.addAll(personSetWithComparator2);
        System.out.println(personSetWithComparator1);
        System.out.println(personSetWithComparator1.size());

        System.out.println("9++++++++++++++++++++++++++++++++++++");

        Set<Integer> hashSetPersonComparator1 = new HashSet<Integer>();
        hashSetPersonComparator1.add(citizen1.getAge());
        hashSetPersonComparator1.add(citizen2.getAge());
        hashSetPersonComparator1.add(citizen3.getAge());

        Set<Integer> hashSetPersonComparator2 = new HashSet<Integer>();
        hashSetPersonComparator2.add(employee1.getAge());
        hashSetPersonComparator2.add(employee2.getAge());
        hashSetPersonComparator2.add(employee3.getAge());

        System.out.println(hashSetPersonComparator1.contains(employee1.getAge()));

        System.out.println(hashSetPersonComparator1.equals(hashSetPersonComparator2));

        System.out.println(hashSetPersonComparator1.retainAll(hashSetPersonComparator2));
        System.out.println(hashSetPersonComparator1);

        System.out.println("10++++++++++++++++++++++++++++++++++++");

        HashSet<Person>result_set = new HashSet<Person>();
        for (Integer res: hashSetPersonComparator1) {
            System.out.println(hashSetPersonComparator2.contains(res) ? "Yes":"No");
        }
        System.out.println("11++++++++++++++++++++++++++++++++++++");

        Set<Person> personHashSet1 = new HashSet<>();
        personHashSet1.add(employee1);
        personHashSet1.add(employee2);
        personHashSet1.add(employee3);

        Set<Person> personHashSet2 = new HashSet<>();
        personHashSet2.add(citizen1);
        personHashSet2.add(citizen2);
        personHashSet2.add(citizen3);

        System.out.println("Set Elements1- " + personHashSet1);
        System.out.println("Set Elements2- " + personHashSet2);
        //Convert HashSet to list
        List<Person> personArrayList1 = new ArrayList<>(personHashSet1);
        List<Person> personArrayList2 = new ArrayList<>(personHashSet2);
        // Sort ArrayList
        Collections.reverse(personArrayList1);
        Collections.shuffle(personArrayList2);
        System.out.println("After Reverse " + personArrayList1);
        System.out.println("After Reverse " + personArrayList2);









    }
}
