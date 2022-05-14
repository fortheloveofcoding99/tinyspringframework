package com;

class access2 extends access1{ // extend the class from the same package

        access2() { // derived from class constructor
            System.out.println("In derived constructor");
            System.out.println("a=" + this.a);
            //System.out.println("a_pri=" + this.a_pri);// private members are not visible outside the class
            System.out.println("a_pro=" + this.a_pro);
            System.out.println("a_pub=" + this.a_pub);
        }
}
