package org.example.week7.d5.e6;

public class E6StringManipulationsP3 {
    public static void main(String[] args) {
// Hint 1: Think about a string containing all these words - what's a famous sentence with 'fox' and 'dog'?
String sentence="The quick brown fox jumps over the lazy dog.";
int positionOfZAfter20 = sentence.indexOf('z', 20);
// Hint 2: Remember indexOf() finds single characters using '' quotes, not ""
        System.out.println("Position of first 'o': "+sentence.indexOf('o'));
        System.out.println("Position of \"jumps\": "+sentence.indexOf("jumps"));
        System.out.println("Position of 'z' after index 20: "+positionOfZAfter20);
        System.out.println("Position of \"cat\": "+sentence.indexOf("cat"));
// Hint 3: For finding words like "jumps", use "" quotes with indexOf()

// Hint 4: To start searching from a specific position, indexOf() can take two arguments

// Hint 5: When searching for something that doesn't exist, what special value should you expect?
    }
}
