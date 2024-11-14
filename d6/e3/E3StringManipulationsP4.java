package org.example.week7.d6.e3;

public class E3StringManipulationsP4 {
    public static void main(String[] args) {
        // Declare the original text message
    String textMessage="Hey! R u free 2day? Wanna grab lunch b4 class? LMK ASAP. THX!";
         // Replace abbreviations with full forms
    String text1=textMessage.replace("R u","Are you");
        String text2=text1.replace("2day","today");
        String text3=text2.replace("Wanna","Want to");
        String text4=text3.replace("b4","before");
        String text5=text4.replace("LMK","Let me know");
        String text6=text5.replace("ASAP","as soon as possible");
        String text7=text6.replace("THX","Thanks");
        System.out.println("Original Message: "+ textMessage);
        System.out.println("Expanded Message: "+text7);
        // Print the original message and the expanded version




    }
}
