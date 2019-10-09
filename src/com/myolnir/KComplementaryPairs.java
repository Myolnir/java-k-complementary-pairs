package com.myolnir;

import java.util.*;

public class KComplementaryPairs {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements you want in array: ");
        int elements = s.nextInt();
        int[] arrayOfElements = new int[elements];
        System.out.println("Enter the elements one by one:");
        for(int i = 0; i < elements; i++)
        {
            if (s.hasNextInt()) {
                arrayOfElements[i] = s.nextInt();
            } else {
                s.next();
                System.out.println("Please enter only integer numbers (positive or negative): ");
                arrayOfElements[i] = s.nextInt();
            }

        }
        System.out.print("Enter the K value you want to check: ");
        int k = s.nextInt();
        int count = complementaryPairs(arrayOfElements, k);
        System.out.println(count);
    }


    static int complementaryPairs(int[] inputArray, int k) {
        Set<Integer> numbers = new HashSet<>();
        for (int n : inputArray) {
            numbers.add(n);
        }
        return Math.toIntExact(numbers.stream()
                .filter(i -> numbers.contains(i - k))
                .count());
    }
}
