import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.*; 
import java.lang.*; 
import java.util.Enumeration;
import java.util.Hashtable;
//import java.util.Arrays;

public class HashFunction{ 
  
  static long ASCIIWordSum(String str, long sumArr[]) { 
        int l = str.length(); 
        int pos = 0; 
        long sum = 0; 
        long bigSum = 0; 
        for (int i = 0; i < l; i++) { 
  
            // Separate each word by 
            // a space and store values 
            // corresponding to each word 
            if (str.charAt(i) == ' ') { 
  
                bigSum += sum; 
                sumArr[pos++] = sum; 
                sum = 0; 
            } 
            else
  
                // Implicit type casting 
                sum += str.charAt(i);             
        } 
  
        // Storing the sum of last word 
        sumArr[pos] = sum; 
        bigSum += sum; 
        return bigSum; 
    } 
  
  public static void main(String args[]) throws ParseException {
    
     BufferedReader objReader = null;
     try {
       
       String strCurrentLine;
       objReader = new BufferedReader(new FileReader("google-1000-english.txt"));

     while ((strCurrentLine = objReader.readLine()) != null) {
       String[] arr = strCurrentLine.split(" ");   

         for ( String ss : arr) {
          try {
            String text = ss;
            byte[] bytes = text.getBytes("US-ASCII");
            
              int ctr = 0; 
           for (int i = 0; i < text.length(); i++)  
            if (text.charAt(i) == ' ') 
                ctr++; 
          
        long sumArr[] = new long[ctr + 1]; 
   
        long sum = ASCIIWordSum(text, sumArr); 
       
        Hashtable<String, String> ht = new Hashtable<String, String>();
        ht.put("Index " + sum, " '" + text + "'");
        
        Enumeration<String> values = ht.keys();
        while (values.hasMoreElements()) {
          String index = (String) values.nextElement();
          System.out.println(index + ":" + ht.get(index));
            //System.out.println(text); 
            //System.out.println(Arrays.toString(bytes));
         }
        } 
          
         catch (java.io.UnsupportedEncodingException e){ 
            e.printStackTrace(); 
         } 
        }
      }
    } 
     
    catch (IOException e) {
      e.printStackTrace();
    } 
    
    finally {

      try {
        if (objReader != null)
          objReader.close();
      } 
      catch (IOException ex) {
        ex.printStackTrace();
      }
  }
 } 
}
