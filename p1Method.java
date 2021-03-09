public class p1Method{

    public static void main(String[]args){
        p1Method obj = new p1Method();
        obj.func1(10, 15);
        obj.func1(10,12.5);
         }
    public void func1(int x, int y){
        int z = x * y; 
        System.out.println("Your Multiplication is = " + z);
    
    }
    public void func1(int x, double f){
        double p = f + x;
        System.out.println(p);
    }
}