package staticUser;

class Car {
    void drive(int gear, int speed)
    {
        System.out.println("Driving at a speed of " + speed + " in gear " +  gear);
    }
    void  drive(String mode, int speed)
    {
        //drive method overloaded using different parameter type
        System.out.println("Driving automatic at a speed of " + speed + " on the " + mode + " mode");
    }
    void  drive(String mode)
    {
        //drive method overloaded using different parameter list length
        System.out.println("Driving automatic on the " + mode + " mode");
    }
}




