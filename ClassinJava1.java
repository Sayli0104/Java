public class ClassinJava1 {
    /*
    oops id a way of programming; 1) Encapulation 2) Inheritance 3) Polumorsim  
    4) Abstraction/:- hiding Complexity; 5) Class 6) object
 */
String name = "Sayli"; // data member
public void fun(String live){  // member function
    System.out.println(live );
}
    public static void main(String[] args) {
        /* 
        Class:- Data member:- Variable  functionfunction:- Method/Function to access the class
        we have to create object of class .
        Classname Objective = new ClassConstructor()
        */
        ClassinJava1 Obj = new ClassinJava1();// this process is object creation
        System.out.println(Obj.name);
        Obj.fun("lives In Nagpur");
    }
}