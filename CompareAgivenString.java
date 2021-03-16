public class CompareAgivenString {
    
    public static void main(String[] args) {
        String str1 = "Nagpur", str2 = "nagpur";
        CharSequence cs = "Nagpur";
         System.out.println("Comparing "+str1+" and "+cs+": " + str1.contentEquals(cs));
          System.out.println("Comparing "+str2+" and "+cs+": " + str2.contentEquals(cs));
              }
    }