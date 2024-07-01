// concatenate 2 strings


public class String5 {
    
    public static void main(String[] args) {
       
        String str1 = "Java language and";
        String str2 = "Python language";
        
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2); 
      
        String str3 = str1.concat(str2);
        System.out.println("The concatenated string: " + str3);
    }
}