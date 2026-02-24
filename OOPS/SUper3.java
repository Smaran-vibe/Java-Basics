package OOPS;
class person {
    String info = "Person";
}

class student extends person {
    String info = "Student";

    String getSuperInfo() {
        return super.info;
    }
}

class SUper3 {
    public static void main(String[] args) {
        student student1 = new student();


        System.out.println(student1.info);


        System.out.println(student1.getSuperInfo());
    }
}
