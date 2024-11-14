package org.example.week7.d6.e4;

public class E4StringManipulationsP5 {
    public static void main(String[] args) {

        // Declare the array of phone numbers
    String [] phoneNumbers={"(123) 456-7890", "987-654-3210", "555.444.3333", "444 333 2222", "12345678901"};
    for(String phoneNumber:phoneNumbers){
        String digitsOnly=phoneNumber.replaceAll("\\D","");
        String formattedNumber;
        if(digitsOnly.length()==10){
            formattedNumber=String.format("(%s) %s-%s",
                    digitsOnly.substring(0, 3),
                    digitsOnly.substring(3, 6),
                    digitsOnly.substring(6));
        } else {
            formattedNumber=digitsOnly;
        }
        System.out.println("Original: "+phoneNumber+", Formatted: "+formattedNumber);
    }

        // Loop through each phone number in the array

        // Remove all non-digit characters using replaceAll()

        // If the number has 10 digits, format it as (XXX) XXX-XXXX

        // If the number doesn't have 10 digits, leave it as is

        // Print the original and formatted phone numbers


    }
}
