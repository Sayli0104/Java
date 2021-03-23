public class vowelpresent_inString {
    
    public static void main(String[] args) {
        int i;
        String str = new String(" Nagpur is orange city.");
        for(i=0; i<str.length(); i++) {
           if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || 
           str.charAt(i) == 'o' || str.charAt(i) == 'u')
              System.out.println("string contains "+str.charAt(i));
           }
          
        }
    }

