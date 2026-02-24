package OOPS;

class Person {

    void display() {
        System.out.println("I am a person");
    }
}

class Student extends Person {

    void display() {

        // call
        super.display();
        System.out.println("I am a student");
    }
}

class Super {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.display();
    }
}

