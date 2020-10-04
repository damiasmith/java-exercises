package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(10);

        numbers.add(123);
        numbers.add(83);
        numbers.add(409);
        numbers.add(93);
        numbers.add(107);
        numbers.add(39);
        numbers.add(278);
        numbers.add(292);
        numbers.add(430);
        numbers.add(21);

    Integer sum = getEven(numbers);
        System.out.println(sum);
    }

    public static Integer getEven(ArrayList<Integer> numbers) {
        Integer sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                sum += numbers.get(i);
            }
        }
        return sum;
    }
}
