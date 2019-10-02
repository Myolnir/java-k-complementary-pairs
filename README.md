# Palindrome string

Program that checks if a given an array of integers and the K value to check the pairs the number
of pairs found in the array.

Given Array A, pair (i, j) is K- complementary if K = A[i] + A[j];

The given solution iterates through the array twice, one from the first element and
the other from the second element and checks if the sum of these elements are equal
to the given "k" number, if yes, we put this pair into a map to return the result.

We have two for loops so the complexity of the solution is a O(n^2)

## Installation

The class is situated on the package com.myolnir so to compile you execute

`javac -d <where do you want to put the class files>/KCoplementaryPairs.java`


After a couple of seconds you will have a KComplementaryPairs.class in the route you put on the above command.

To execute this class you should run:

`java com.myolnir.KComplementaryPairs`

The program should run and ask you for a string, after you enter the script the program returns if
the given string is a palindrome or not.

