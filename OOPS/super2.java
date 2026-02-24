package OOPS;


class animal {
    String type;

    animal(String type) {
        this.type = type;
    }

    void display() {
        System.out.println(type);
    }


}


class Cat extends animal {


    Cat() {


        super("Mammal");

        display();


        System.out.println("Constructing Cat");
    }
}

class super2 {
    public static void main(String[] args) {

        // create an object of Cat named cat1
        Cat cat1 = new Cat();
    }
}
