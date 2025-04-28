import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate_Remove_String {
    public static void main(String[] args) {
        String s="Hello World";

        String res=dupli_ele(s);

        System.out.print(res);
      

    }

    static String dupli_ele(String s)
    {

       Set<Character> set= new LinkedHashSet<>();

       for(int i=0; i<s.length();i++){
            set.add(s.charAt(i));
       }
       
       StringBuilder sb= new StringBuilder();
       for(char ch : set){
        sb.append(ch);

       }

    
       return sb.toString();
    }
    
}
