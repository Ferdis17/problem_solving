package number_occurance;
//Given an array of positive integers. All numbers occur even number of times except one number which occurs odd number of times.
public class OddOccurrenceBruteForce {

    public static int getOddOccurance(int arr[]){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count % 2 != 0){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
        int n = arr.length;
        System.out.println(getOddOccurance(arr));
    }

}
