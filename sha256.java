import java.io.*;
import java.util.*;
import java.math.*;
import java.security.*;
import java.nio.charset.StandardCharsets;

public class sha256 {
   public static String toHexString(byte[] hash) 
    { 
        BigInteger number = new BigInteger(1, hash);  
        StringBuilder hexString = new StringBuilder(number.toString(16));  

        while (hexString.length() < 64)  
        {  
            hexString.insert(0, '0');  
        }  

        return hexString.toString();  
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        try 
        { 
            MessageDigest md = MessageDigest.getInstance("SHA-256"); 
            System.out.println(toHexString(md.digest(input.getBytes(StandardCharsets.UTF_8))));
        } 
        // For specifying wrong message digest algorithms  
        catch (NoSuchAlgorithmException e) {  
              throw new RuntimeException(e);
        }  

    }
}
