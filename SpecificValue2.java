public class SpecificValue2 {
    public static void main(String[] args) {
        int[] input= {17, 20, 18, 14, 21, 14, 24, 12, 19, 23}; //User Input
        int specificvalue=20;                         //Specific value
        SpecificValue2.getSpecificValue(input, specificvalue);
    }
    public  static void getSpecificValue(int[] input, int specificvalue) {
        int[] Input=input;
        int value=specificvalue;
        for(int i=0; i<Input.length;i++){
            if(Input[i]== value ){
                System.out.println(""+Input[i]);
               System.out.println("yes");
            }
        }
    }
 }
    

