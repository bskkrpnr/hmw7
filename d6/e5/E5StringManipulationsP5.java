package org.example.week7.d6.e5;

public class E5StringManipulationsP5 {
    public static void main(String[] args) {
        String csvLine = "John Doe,22,Computer Science,3.8,2025";
        String[] line=csvLine.split(",");
        String fullName=line[0];
        String age=line[1];
        String major=line[2];
        String gpa=line[3];
        String graduationYear=line[4];

        int nameWordCount=fullName.split(" ").length;
        int majorLength=major.length();
        System.out.println("Name: "+fullName);
        System.out.println("Age: "+age);
        System.out.println("Major: "+major);
        System.out.println("GPA: "+gpa);
        System.out.println("Graduation Year: "+graduationYear);
        System.out.println("Name Word Count: "+nameWordCount);
        System.out.println("Major Length: "+majorLength);

        // Declare the CSV line string

        // Split the string into an array using the comma delimiter

        // Extract student's full name, age, major, GPA, and graduation year

        // Calculate the number of words in the full name

        // Calculate the length of the student's major

        // Print the extracted and calculated information

        // Split the string into an array of fields


    }
}
