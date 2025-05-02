import java.util.*;

public class Reverse_String {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the string ");

    String s=sc.nextLine();

    char n;

    for(int i=s.length()-1; i>=0; i--){
        n=s.charAt(i);
        System.out.print(n);


    }

    }
    
    
}
