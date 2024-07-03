
class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
   
    // Student(){
    // System.out.println("constructor called");
    // } non parameterized

    Student(String name, int age) {
        this.name = name;
        this.age = age;

    }
// parameterized

}

public class Oops {

    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.name = "Pratyush";
        // s1.age = 23;

        Student s1 = new Student("Pratyush", 24);

        s1.printInfo();
    }

}

// constructor are special type of function that help to build object
// does not return any thing
// no return type
// constructor can be called once

// non parameterized
// parameterized
//copy constructor

//function over loading means function of same name but different function