package number_occurance;

import java.util.HashSet;
import java.util.Set;

public class OnceOccurance1 {

    public static void main(String argds [] ){
        int[] a = {2, 3, 5, 4, 5, 3, 4};
        System.out.println(occurOnce(a));
        int[] b = {15, 18, 16, 18, 16, 15, 89};
        System.out.println(occurOnce(b));
    }

    public static int occurOnce(int[] numbers){
        int sum1 = 0, sum2 =0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < numbers.length; i++){
            if(!set.contains(numbers[i])){
                sum1 +=numbers[i];
                set.add(numbers[i]);
            }
            sum2 += numbers[i];
        }
        return 2*sum1 - sum2;
    }
}
