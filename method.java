public class method {
    public static void fun() {
        System.out.println("Hi i am Function.");

    }

    public void cheaters() {
        String Cheater1 = "sayli";
        String Cheater2 = "kajal";
        String Cheater3 = "reshm";
        System.out.println("Chaeter's are:-" + Cheater1 + " " + Cheater2 + " " + Cheater3);
    }

   
    public void number(int a) {
        a++;
        System.out.println("Function type is :-Takes Something & returns nothing" + a);// 6
    }

    public int sum() {
        int a, b;
        a = 2;
        b = 3;
        return a + b;
    }

    public char alphabet(char z) {
        return z;
    }

    public static void main(String[] args) {

        method o1 = new method();
        fun();
        o1.cheaters();
        o1.cheaters();
        o1.cheaters();
        o1.number(10);
        int result = o1.sum();
        System.out.println("Function type is takes nothing returns something" + result);
        char store = o1.alphabet('a');
        System.out.println(store);

    }
}
