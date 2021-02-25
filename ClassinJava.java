package OOps;

public class ClassinJava {
    String name = "Nagpur";     // Data member

    public void fun(String live) {     // member function
        System.out.println(live);

    }

    public static void main(String[] args) {
        
        ClassinJava o1 = new ClassinJava();    // object creation
        System.out.println(o1.name);
        o1.fun("Nagpur is Orage city");

    }
}
