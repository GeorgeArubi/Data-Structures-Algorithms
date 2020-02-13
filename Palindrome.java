import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PalindromeBonus {
 
 /*
  * Implement this method and return true if the word is the same 
  * forward and backwards
  * Do not use automatic methods for reversing the string
  */
 private boolean isPalindrome(String word) {
  
  int length = word.length();
     for (int i = 0; i < length; i++){
       word.charAt(i);
     }
     
     String reversed = "";
     for (int i = length-1; i>=0; i--){
       reversed+=word.charAt(i);
     }
    
    return word.equals(reversed);
   }
 /*
  * Open up  the file. 
  * Break into words 
  *  print out all Palindromes
  */
 private void findAllPalindromes(String fileName) {
  
 }
 public PalindromeBonus() {
  //run some tests
      BufferedReader objReader = null;
  try {
   String strCurrentLine;

   objReader = new BufferedReader(new FileReader("testing.txt"));

   while ((strCurrentLine = objReader.readLine()) != null) {

    //System.out.println(strCurrentLine);
    String[] arr = strCurrentLine.split(" ");   

         for ( String ss : arr) {
         System.out.println(ss);
          if (isPalindrome(ss)) {
            System.out.println("Pass");
          }
          else {
            System.out.println("Fail");
          }
        }
   }

  } catch (IOException e) {

   e.printStackTrace();

  } finally {

   try {
    if (objReader != null)
     objReader.close();
   } catch (IOException ex) {
    ex.printStackTrace();
   }
  }
} 

 public static void main(String[] args) {
  new PalindromeBonus();
 }

}
