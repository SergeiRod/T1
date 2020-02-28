package Lesson12.HomeWork12;


import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;


public class Main {

    static void iterateQueue(PriorityQueue<String> itr) {
        for (String element : itr) {
            System.out.println(element);
        }

    }
    static PriorityQueue<String> queueToQueue (PriorityQueue<String> q1, PriorityQueue<String> q2){
        q1.addAll(q2);
        return q1;
    }

    static PriorityQueue<String>  insertToQueue (PriorityQueue<String> que, String s1) {
        que.offer(s1);
        return que;
    }

    static void clearQueue(PriorityQueue<String> que) {
        que.clear();
        System.out.println(que);
    }

    static void firstElementQueue (PriorityQueue<String> que) {
        System.out.println("Original Priority Queue: "+que);
        System.out.println("The first element of the Queue: "+que.peek());
        System.out.println("Removes the first element: "+que.poll());
        System.out.println("Priority Queue after removing first element: "+que);
    }

    static ArrayList<String> queueToArray (PriorityQueue<String> que) {
        ArrayList<String> arrList = new ArrayList<>(que);
        return arrList;
    }

    static void queueToString (PriorityQueue<String> que){
        String str;
        str = que.toString();
        System.out.println("String representation of the Priority Queue: "+str);
    }

    static void queueMaxOrder (PriorityQueue<Integer> que) {
        System.out.print("\nMaximum Priority Queue: ");
        Integer val = null;
        while( (val = que.poll()) != null) {
            System.out.print(val+"  ");
        }
    }




    public static void main(String[] args) {
        System.out.println("1::::::::::::::::::::::::::::::::");
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Orange");
        pq.add("White");
        pq.add("Black");

        iterateQueue(pq);

        System.out.println("2::::::::::::::::::::::::::::::::");

        PriorityQueue<String> queue1 = new PriorityQueue<String>();
        queue1.add("Red");
        queue1.add("Green");
        queue1.add("Orange");
        System.out.println("Priority Queue1: "+queue1);
        PriorityQueue<String> queue2 = new PriorityQueue<String>();
        queue2.add("Pink");
        queue2.add("White");
        queue2.add("Black");
        System.out.println("Priority Queue2: "+queue2);

        System.out.println("Priority Queue1 + Queue2: "+queueToQueue(queue1,queue2));

        System.out.println("3::::::::::::::::::::::::::::::::");
        System.out.println("The New Priority Queue: " + insertToQueue (pq,"Blue"));

        System.out.println("4::::::::::::::::::::::::::::::::");
        clearQueue(queue2);

        System.out.println("5::::::::::::::::::::::::::::::::");
        firstElementQueue(pq);

        System.out.println("6::::::::::::::::::::::::::::::::");
        System.out.println("Array containing all of the elements in the queue: " + queueToArray(pq));
        System.out.println(queueToArray(pq));

        System.out.println("7::::::::::::::::::::::::::::::::");
        queueToString(queue1);


        System.out.println("8::::::::::::::::::::::::::::::::");
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(10, Collections.reverseOrder());

        pq1.add(10);
        pq1.add(22);
        pq1.add(36);
        pq1.add(25);
        pq1.add(16);
        pq1.add(70);
        pq1.add(82);
        pq1.add(89);
        pq1.add(14);
        System.out.println("\nOriginal Priority Queue: "+pq1);
        queueMaxOrder(pq1);


    }

}




