package number_occurance;

import java.util.HashMap;
import java.util.Map;

public class OddOccuranceHash {

    public static int getOddOccurance(int arr[]){

        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        //put all elements in the map
        for(int i = 0; i < arr.length; i++ ){
            if(map.containsKey(arr[i])){
                int val = map.get(arr[i]);
                map.put(arr[i], val++);
            }else{
                map.put(arr[i], 1);
            }

        }
        //checking for odd occurance
        for(Integer in : map.keySet()){
            if(map.get(in) % 2 != 0)
                result =  in;
        }

        return result;
    }

    public static void main(String[] args)
    {
        int arr[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        int n = arr.length;
        System.out.println(getOddOccurance(arr));
    }


}
