package org.example.week7.d5.e4;

public class E4StringManipulationsP3 {
    public static void main(String[] args) {
        // Step 1: Declare and Assign a String Variable
String productCode="KX125";
char firstChar=productCode.charAt(0);
char lastChar=productCode.charAt(productCode.length()-1);
        System.out.println("Product code starts with 'K': "+(firstChar=='K'));
        System.out.println("Product code ends with '5': "+ (lastChar=='5'));
// Step 2: Use the `charAt()` Method to Analyze the Product Code

// Extract the first character of `productCode`
// Check if the first character is the letter 'K'
// Extract the last character of `productCode`
// Check if the last character is a digit '5'


    }
}
