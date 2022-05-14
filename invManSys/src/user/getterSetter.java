package user;

class getterSetter {

    public static void main(String[] args) {

        user1 u1 = new user1();
        System.out.println(u1.getId());
        u1.setId(2345);
        u1.setName("SOM");
        u1.setAge(35);
        u1.setAddress("A313 Ashish Green");
        u1.setMobileno(909088);


        System.out.println(u1.getId());
        System.out.println(u1.getName());
        System.out.println(u1.getAge());
        System.out.println(u1.getAddress());
        System.out.println(u1.getMobileno());


    }

}
