//Removing duplicates of the string


import java.util.*;

public class String4{

    public static void main(String[] args) {
      
        String str1 = "HelloWorld";
        
        System.out.println("The given string is: " + str1);
        
        // after removing duplicate characters.
        System.out.println("After removing duplicates characters the new string is: " + removeDuplicateChars(str1));
    }
    
    
    private static String removeDuplicateChars(String WorldStr) {
        char[] arr1 = WorldStr.toCharArray();
        
        
        String targetStr = "";
      
        for (char value: arr1) {
        
            if (targetStr.indexOf(value) == -1) {
             
                targetStr += value;
            }
        }
        
       
        return targetStr;
    }
}