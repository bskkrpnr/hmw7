package org.example.week7.d6.e2;

public class E2StringManipulationsP4 {
    public static void main(String[] args) {
        String logEntry = "2023-03-15 09:42:17 INFO [UserService] User 'jsmith' logged in from IP 192.168.1.101";

        // Step 1: Declare a String variable named `logEntry`
    String date=logEntry.substring(0,10);
    String time=logEntry.substring(11,19);
    String logLevel=logEntry.substring(20,24);
    String serviceName=logEntry.substring(26,37);
    String user=logEntry.substring(45,51);
    String ipAdress=logEntry.substring(71,84);
// Step 2: Extract the date from the log entry using the substring() method
        System.out.println("Date: "+date);
        System.out.println("Time: "+time);
        System.out.println("Log Level: "+logLevel);
        System.out.println("Service: "+serviceName);
        System.out.println("User: "+user);
        System.out.println("IP Address: "+ipAdress);
// Step 3: Extract the time from the log entry

// Step 4: Extract the log level from the log entry

// Step 5: Extract the service name from the log entry (enclosed in square brackets)

// Step 6: Extract the username from the log entry (enclosed in single quotes)

// Step 7: Extract the IP address from the log entry

// Step 8: Print the extracted information




    }
}
