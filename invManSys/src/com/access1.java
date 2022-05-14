package com;

public class access1 {
        int a = 1; //declared with default access specifier
        private int a_pri = 2; //private data member
        protected int a_pro = 3; //protected data member
        public int a_pub = 4; //public data member

        public access1() { //default constructor
            System.out.println("base constructor");
            System.out.println("a=" + this.a);
            System.out.println("a_pri=" + this.a_pri);
            System.out.println("a_pro=" + this.a_pro);
            System.out.println("a_pub=" + this.a_pub);
        }
    }


