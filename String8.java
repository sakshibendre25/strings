
//get the character at particular index


public class String8 {
   
    public static void main(String[] args) {
        String str = "Java language";
        System.out.println("Original String = " + str);

        
        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        System.out.println("The character at position 0 is " + (char)index1);
             
        System.out.println("The character at position 10 is " + (char)index2);
             
    }
}