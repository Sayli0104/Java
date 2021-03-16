public class IndexOfAraay {
    public static void main(String[] args) {
        int[] arr = {4, 9, 7, 3, 2, 8}; 
        int element = 2;
        int index = -1;
         int i;
        for(i=0; i < arr.length; i++)
        
            if(arr[i] == element) {
                index = i;
            }
           System.out.println("Index is: "+index);
        }
        
        
    }
