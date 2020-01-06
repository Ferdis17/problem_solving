package stringStuffs;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

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
    }
}
