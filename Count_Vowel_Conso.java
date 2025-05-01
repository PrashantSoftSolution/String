public class Count_Vowel_Conso {
    public static void main(String[] args) {
        String s="Hello";
        int vowel=0;
        int cons=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o'|| s.charAt(i)=='u'){
                vowel++;
            }
            else{
                cons++;
            }
        }
        System.out.println(vowel + " " + cons);
    }
    
}
