package user;

import java.util.Scanner;

class user1 {
    //private data member definition
    private int id;
    private String name;
    private int age;
    private String address;
    private long mobileno;
    static Scanner sc = new Scanner(System.in);
    static int noOfUsers=0;

    user1(){ //default constructor
        noOfUsers++;
        id = 0;
        name = "xyz";
        age = 1;
        address = "abc";
        mobileno = 123;
    }

    user1(int n, String xy, int x, String mn, long abc ){
        //parameterized constructor
        id = n;
        name = xy;
        age = x;
        address = mn;
        mobileno = abc;
        noOfUsers++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getMobileno() {
        return mobileno;
    }

    public void setMobileno(long mobileno) {
        this.mobileno = mobileno;
    }

    static void displayNoOfUsers(){
        System.out.println("Total No. of User Objects: "+ noOfUsers);
    }
}
