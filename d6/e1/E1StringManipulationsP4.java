package org.example.week7.d6.e1;

public class E1StringManipulationsP4 {
    public static void main(String[] args) {
// Step 1: Declare a String variable named `dataString`
String dataString="ID:12345-NAME:John Doe-AGE:30-CITY:New York";
String newdataString=dataString.substring(3,8);
String new2dataString=dataString.substring(14,22);
String new3dataString=dataString.substring(27,29);
String new4dataString=dataString.substring(30,43);
        System.out.println("ID: "+newdataString);
        System.out.println("Name: "+new2dataString);
        System.out.println("Age: "+new3dataString);
        System.out.println("City Info: "+new4dataString);
// Step 2: Use the substring() method to extract the ID
// Step 3: Use the substring() method to extract the full name

// Step 4: Use the substring() method to extract the age

// Step 5: Use the substring() method to extract everything from the CITY field to the end

// Step 6: Print the results of your extractions






    }
}
