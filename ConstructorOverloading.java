package OOps;

public class ConstructorOverloading {
    ConstructorOverloading(int a, int b) {
        int c = a + b;
        System.out.println(c);

    }

    ConstructorOverloading(int i, int j, String f) {
        int k = i * j;
        System.out.println(f + k);

    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading(2, 3);
        ConstructorOverloading obj2 = new ConstructorOverloading(5, 6, "Multiplication=");
      
    }
}
