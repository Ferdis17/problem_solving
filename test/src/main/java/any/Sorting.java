package any;

import java.util.Arrays;

public class Sorting {

    public static String sortCharString(String str){

        if(str == null){
            return null;
        }

        char ch [] = str.toCharArray();
        Arrays.sort(ch);
        Arrays.toString(ch);

      StringBuilder stb = new StringBuilder();

      for(Character c : ch){
          stb.append(c);
      }

        return stb.toString();
    }

    public static void main(String args []){

        System.out.println(sortCharString("Muriyesu"));

    }
}
