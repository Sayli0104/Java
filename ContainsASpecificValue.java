public class ContainsASpecificValue {
   public static void main(String[] args) {
      int[] value = {17, 20, 18, 14, 21, 14, 24, 12, 19, 23};
      System.out.println(contains(value, 20));
}
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
           if (item == n) {
              return true;
           }
        }
        return false;
     }
  }
  