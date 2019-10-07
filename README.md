# Palindrome string

Program that checks if a given an array of integers and the K value to check the pairs the number
of pairs found in the array.

Given Array A, pair (i, j) is K- complementary if K = A[i] + A[j];

The given solution iterates through the array twice, one from the first element and
the other from the second element and checks if the sum of these elements are equal
to the given "k" number, if yes, we put this pair into a map to return the result.

We have two for loops so the complexity of the solution is a O(n^2)

## Installation

1. Download/Clone this repository.
2. Import the downloaded Java Project into some IDE (e.g., IntelliJ, Eclipse, etc.)
3. Run the [KComplementaryPairs.java](src/com/myolnir/KComplementaryPairs.java) file for Palindrome Logic.
4. Run the [KComplementaryPairsTest.java](test/com/myolnir/KComplementaryPairsTest.java) file for JUnit Test Cases.


The program should run and ask you for a string, after you enter the script the program returns if
the given string is a palindrome or not.

