package number_occurance;

public class OnceOccurance2 {

    public static void main(String[] args) {
        System.out.println(appearOnce(new int[]{7,3,5,4,5,3,4}));
    }

    public static int appearOnce(int[] numbers) {

        int oneTimeAppearance = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            oneTimeAppearance = oneTimeAppearance ^ numbers[i];
        }

        return oneTimeAppearance;
    }
}
