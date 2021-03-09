public class Question1 {
    public static void main(String[] args) {
        int rollNumberArr[] = new int[5];
        rollNumberArr[0] = 100;
        rollNumberArr[1] = 101;
        rollNumberArr[2] = 102;
        rollNumberArr[3] = 103;
        rollNumberArr[4] = 104;
        // Traversing the Array
        for(int i = 0; i<rollNumberArr.length; i++){
            System.out.println(rollNumberArr[i]);
        }
        //length of array
        int count = 0;
        for(int i = 0; i<rollNumberArr.length; i++){
            count =i + 1;
        }
        System.out.println(count);
           
       }
       
   }