import java.util.Scanner;

public class VowelConsonant{

public static void main(String args[]){
    char c;
 Scanner s=new Scanner(System.in); 
    
    
System.out.println("Enter the Charecter: ");
c=s.next().charAt(0);;

switch(c){
    
    case 'a':
    System.out.println(c+" is a vowel");
    break;
    
    case 'e':
    System.out.println(c+" is a vowel");
    break;
    
    case 'i':
    System.out.println(c+" is a vowel");
    break;
    
    case 'o':
    System.out.println(c+" is a vowel");
    break;
    
    case 'u':
    System.out.println(c+" is a vowel");
    break;
    
    default:
    System.out.println(c+" is a consonant");
    break;   
}
}
    
}