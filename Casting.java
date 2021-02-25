public class Casting{
    public static void main(String[] args) {
       
        int num1 = 33;
        double numtodouble = num1;
        System.out.println("int to double=" + numtodouble);

        int num2 = (int) numtodouble;
        System.out.println("Double to int=" + num2);

        float var = 45;
        System.out.println("Float value=" + var);

        int var2 = (int) var;
        System.out.println("Narrowing:-Float to int=" + var2);

    }
}
