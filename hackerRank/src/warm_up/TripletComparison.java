package warm_up;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class TripletComparison {

    // Complete the compareTriplets function below.
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int scoreA = 0;
        int scoreB = 0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (i == j && a.get(i) > b.get(j)) {
                    scoreA++;
                }
                if (i == j && a.get(i) < b.get(j)) {
                    scoreB++;
                }
            }
        }
        return new ArrayList<Integer>(Arrays.asList(scoreA, scoreB));
    }

    public static void main(String[] args) throws IOException {

        System.out.println(compareTriplets(new ArrayList<>(Arrays.asList(2,5,0)), new ArrayList<>(Arrays.asList(5,1,3))));

    }
}
