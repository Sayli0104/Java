interface Multiplication{
    public void into (int a, int b);
   
}

public class LambdaExpressionMul {
    public static void main(String[] args) {
        Multiplication s1 = (a, b)->{
            System.out.println(a * b);
        };
        s1.into(20, 40);
        
    }

    
}