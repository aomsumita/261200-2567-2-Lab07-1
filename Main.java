import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!" + args[2] + " " + args[3]);
        List<String> aList = new ArrayList();

        for(int i = 0; i < args.length; ++i) {
            aList.add(args[i]);
        }
        System.out.println(aList);
        Collections.shuffle(aList, new Random());
        System.out.println(aList);
        System.out.println(args[2]);
        Set<String> hSet = new HashSet();
        hSet.add("OOP");
        hSet.add("GG");
        hSet.add("EZ");
        hSet.add("F");
        hSet.add("not");
        hSet.add("drop");
        hSet.add("GG");
        hSet.add("GG");
        hSet.add("GG");
        hSet.add("GG");
        hSet.remove("GG");
        System.out.println(hSet);
        SortedSet<String> sSet = new TreeSet();
        sSet.add("OOP");
        sSet.add("GG");
        sSet.add("EZ");
        sSet.add("F");
        sSet.add("not");
        sSet.add("drop");
        sSet.add("GG");
        sSet.add("ZZZ");
        sSet.add("123");
        sSet.add("ก");
        System.out.println(sSet);
        Stack<String> stacko = new Stack();
        stacko.push("a");
        stacko.push("b");
        stacko.push("c");
        System.out.println(stacko);
        System.out.println((String)stacko.pop());
        System.out.println(stacko);
        Map<String, Color> favoriteColors = new HashMap();
        favoriteColors.put("Robert", Color.BLACK);
        favoriteColors.put("Mark", Color.WHITE);
        favoriteColors.put("Pedro", Color.YELLOW);
        favoriteColors.put("Cole", Color.BLUE);

        for(String key : favoriteColors.keySet()) {
            Color value = (Color)favoriteColors.get(key);
            System.out.println(key + " : " + String.valueOf(value));
        }

        Map<String, Color> favoriteColor = new TreeMap();
        favoriteColor.put("Robert", Color.BLACK);
        favoriteColor.put("Mark", Color.WHITE);
        favoriteColor.put("Pedro", Color.YELLOW);
        favoriteColor.put("Cole", Color.BLUE);

        for(String key : favoriteColor.keySet()) {
            Color value = (Color)favoriteColor.get(key);
            System.out.println(key + " : " + String.valueOf(value));
        }
    }
}