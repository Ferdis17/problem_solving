package stringStuffs;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Pelendrome {

    // use of stringbuilder
    public static boolean isPalendrome1(String s){
        if(s == null){
            return false;

        }        StringBuilder stringBuilder = new StringBuilder(s);
       if(s.equals(stringBuilder.reverse().toString()))
        return true;
       return false;
    }

    // without using string builder
    public static  boolean isPalendrome2(String str){

        if(str == null)
            return false;
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() - i -1))
                return  false;
        }
        return true;
    }
    public static void main(String args []){
        System.out.println(isPalendrome1("mom"));
        System.out.println(isPalendrome1("Ferdis"));
        System.out.println(isPalendrome2("Ferdis"));
        System.out.println(isPalendrome2("mom"));

        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        myList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        map.entrySet().forEach( n -> {System.out.println("Key is : " + n.getKey());
            System.out.println("Value is : " + n.getValue());});
//        map.values().forEach(System.out::println);

    }
}
