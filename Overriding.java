public class Overriding{

public static void main(String[] args) {
   Student obj = new Student();
    obj.info();

}

}

class Lect {

public void info() {
    System.out.println("I am Lect");

}
}

class Student extends Lect {
public void info() {
    String name = "ABC";
    int age = 20;
    int rollno=10;
    System.out.println("Roll No=" + rollno);
    System.out.println("Age=" + age);
    System.out.println("Name=" + name);
    

}
}
