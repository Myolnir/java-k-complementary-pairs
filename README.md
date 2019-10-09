# K-Complementary Pairs

Program that checks if a given an array of integers and the K value to check the pairs the number
of pairs found in the array.

Given Array A, pair (i, j) is K- complementary if K = A[i] + A[j];

The given solution iterates through the input array and add it to a HashSet after that we check if the created set
contains the difference between the current element and the given one (*k*)

We have one loop for creating the Set so O(n) and another to check it O(n), contanis method for set is O(1) so the
final complexity is O(n)

## Installation

1. Download/Clone this repository.
2. Import the downloaded Java Project into some IDE (e.g., IntelliJ, Eclipse, etc.)
3. Run the [KComplementaryPairs.java](src/com/myolnir/KComplementaryPairs.java) file for Palindrome Logic.
4. Run the [KComplementaryPairsTest.java](test/com/myolnir/KComplementaryPairsTest.java) file for JUnit Test Cases.


The program should run and ask you for a string, after you enter the script the program returns if
the given string is a palindrome or not.

