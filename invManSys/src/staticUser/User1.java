package staticUser;

import java.util.Scanner;

public class User1 {
    String name;
    int age;
    String address;
    long cellno;

    static Scanner input = new Scanner(System.in); //Static variable shared by all objects
    static int NoOfUsers = 0;

    User1() { //default constructor
        NoOfUsers++;
        name = " ";
        age = 0;
        address = "Bangalore";
        cellno = 00;
    }

    User1(String aa, int a, String qq, long ee){ // parameterized constructor
        name = aa;
        age = a;
        address = qq;
        cellno = ee;
    }

    static void displayNoUsers(){
        System.out.println("Total No of users: "+ NoOfUsers);
    }
}
