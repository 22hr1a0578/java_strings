//checking in sentence weather there is a palindrome string or not
import java.util.*;
class Main {
    public static void main(String[] args) {
     String s="man is the:gone 212";
     String[] arr=s.split("[\\s,.:;]");
     
     for(int i=0;i<arr.length;i++){
         String words=arr[i];
         String sc=new StringBuilder(words).reverse().toString();
       if(words.equals(sc)){
           System.out.print("is palindrome "+sc);
       }
    }
    }
}
