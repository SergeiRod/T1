package Lesson15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Lesson15 {

    public static void main(String[] args) {
        //comment form local
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        String string1 = new String("str");
        String string2 = new String("str");

        System.out.println(string1==string2); // сравниваются объекты
        System.out.println(string1.compareTo(string2));
        System.out.println(string1.equals(string2));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        String string3 = new String("stR");
        String string4 = new String("str");
        System.out.println(string3.compareTo(string4));
        System.out.println("Ignore case: "+string3.equalsIgnoreCase(string4));



        System.out.println("String pool+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        String string5 = "str";
        String string6 = "str";
        System.out.println(string5==string6); // сравнивается pool строк, объект не создается поэтому true

        System.out.println("Immutability+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        String string7 = "str";
        string7 +=  "()"+string3;
        System.out.println("After concatenation: "+string7);
        StringBuilder stringBuilder = new StringBuilder(string7);
        for (int i = 0; i < 3; i++) {
            stringBuilder.append("    DJLJD   "+i);
        }
        System.out.println(stringBuilder.toString());

        System.out.println("Trim+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Trim
        String stringToTrim = "     lkoijfoiewjf     ";
        System.out.println("\""+ stringToTrim +"\"");
        System.out.println("\""+ stringToTrim.trim()+"\"");
        System.out.println("New line symbol: "+"\n \\n" +"\nTab symbol: \t \\t");

        System.out.println("Char at, index of+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Char at, index of
        String forCharAt = "ABCDEF";
        System.out.println("3 Char at in "+ forCharAt + forCharAt.charAt(3));
        System.out.println("CD Index of in "+ forCharAt + forCharAt.indexOf("CD"));
        System.out.println(forCharAt.indexOf("Z"));//- 1 если не нашел

        System.out.println("Substring+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Substring
        String substring = "Hello Nick! I am good.";
        System.out.println("Person name: "+ substring.substring(6,10));
        System.out.println("Person name: "+ substring.substring(6));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Replace
        String forReplace = "OUOWUOWNO";
        System.out.println("Before replace: "+forReplace);
        System.out.println("After replace: "+forReplace.replace('O', '-'));

        System.out.println("Contains+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Contains
        String forContains = "ABCD";
        System.out.println(forContains + "  contains A is " + forContains.contains("A"));
        System.out.println(forContains + "  contains CD is " + forContains.contains("CD"));
        System.out.println(forContains + "  contains CX is " + forContains.contains("BD"));
        System.out.println(forContains + "  contains CX is " + forContains.contains("CX"));

        System.out.println("Start with+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Start with
        String forStartWith = "ABCD";
        System.out.println(forContains + "  contains A is " + forContains.startsWith("A"));
        System.out.println(forContains + "  contains A is " + forContains.startsWith("B"));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        String forCaseChange1 = "ABCD";
        System.out.println(forContains + "  contains A is " + forCaseChange1.toLowerCase());
        String forCaseChange2 = "abcd";
        System.out.println(forContains + "  contains A is " + forCaseChange2.toUpperCase());

        System.out.println("Split +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Split
        String forSplit = "Hello-my-friend!-...e-rer";
        String[]  split = forSplit.split("-");
        List<String> list = Arrays.asList(split);

        list.forEach(w-> System.out.println(w));
        System.out.println("++++++++");
        list.forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        list.stream().map(w -> w.length()).forEach(System.out::println);
        System.out.println("++++++++");
        list.stream().map(String::length).forEach(System.out::println);

        System.out.println("+++TASK+++");

        String string = "Hello my dear friends. I am glad to see you today " +
                "and hope you enjoy to see me. Les't do some tasks. All are happy. The car";

        processString(string);
        System.out.println(replacer("Hello: Who are you: .. ::"));

        String textForHomeWork;
        textForHomeWork = "Anyone who reads Old and Middle English literary texts will be " +
                "familiar with the mid-brown volumes of the EETS, with the symbol of Alfred's " +
                "jewel embossed on the front cover. Most of the works attributed to King Alfred " +
                "or to Aelfric, along with some of those by bishop Wulfstan and much anonymous prose" +
                " and verse from the pre-Conquest period, are to be found within the Society's three series;" +
                " all of the surviving medieval drama, most of the Middle English romances, much religious and " +
                "secular prose and verse including the English works of John Gower, Thomas Hoccleve and " +
                "most of Caxton's prints all find their place in the publications. Without EETS editions, " +
                "study of medieval English texts would hardly be possible";


        findLongestShortestWord(textForHomeWork);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }

    public static void findLongestShortestWord(String text) {
        String[] stringText = text.split(" ");
        List<String> listText = Arrays.asList(stringText);
        listText.stream().mapToInt(w -> w.length()).forEach(System.out::println);

    }


    static void processString(String sentence){
        String[] stringSent = sentence.split(" ");
        List<String> listSent = Arrays.asList(stringSent);
        listSent.stream().filter(w-> w.startsWith("a") || w.startsWith("A")).forEach(System.out::println);
        listSent.stream().filter(w-> w.endsWith("y")).forEach(System.out::println);
        listSent.stream().filter(w-> w.contains("t") || w.startsWith("T")).forEach(System.out::println);
        listSent.stream().filter(w-> w.contains("t") || w.startsWith("T")).forEach(System.out::println);
        listSent.stream().filter(w-> w.contains("A")).map(String::toLowerCase).forEach(System.out::println);

    }
    static String replacer (String replace){
        /*String[] stringRep = replace.split(" ");
        List<String> listRep = Arrays.asList(stringRep);
        listRep.stream().filter(w-> w.replace(":", ";").;
        return replace;*/

        String newString = replace.replace(":", ";");
        return newString;




    }

    private static List<String> spliterator(String string, String regexp){
        String[] split = string.split(regexp);
        return Arrays.asList(split);
    }

//git config --global user.email "srvsilver@yahoo.com"
//git config --global user.email "SergeiRod"



}
