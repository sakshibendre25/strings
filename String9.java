
//replace the particular character with other character

public class String9 {
   
    public static void main(String[] args) {
        String str = "you deleted this message";
        String new_str = str.replace('d', 'f');

       
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
}