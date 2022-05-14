package com;

class access3 { // class in the same package

    access3() {
        access1 anObject = new access1(); // create an object/instance of class access1
        System.out.println("same package");
        System.out.println("a=" + anObject.a);
        //System.out.println("a_pri=" + anObject.a_pri);//no access to private data members
        System.out.println("a_pro=" + anObject.a_pro);
        System.out.println("a_pub=" + anObject.a_pub);
    }
}
