package com.myolnir;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KComplementaryPairs {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements you want in array: ");
        int elements = s.nextInt();
        int arrayOfElements[] = new int[elements];
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
        complementaryPairs(arrayOfElements, k);
    }


    private static void complementaryPairs(int inputArray[], int k) {
        Map<Integer, Integer> pairs = new HashMap<>();
        int length = inputArray.length;
        int count;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(inputArray[i]+inputArray[j] == k ){
                    if(!(pairs.containsKey(inputArray[j]) && pairs.containsValue(inputArray[i])))
                        pairs.put(inputArray[i], inputArray[j]);
                }
            }
        }
        count = pairs.size();
        System.out.println("Pairs are "+ pairs +"  count  = "+ count);
    }
}
