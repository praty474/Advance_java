// Overloading
// same name but different function
// compile time polymorphism error in compiling 
// different factors
// 

class Stud {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
    System.out.println(age);
    }

    public void printInfo(String name, int age) {
    System.out.println(name + " " + age);
    }

}

public class Over {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        s1.name = "prat";
        s1.age = 22;

        s1.printInfo(s1.name,s1.age);
    }
}
