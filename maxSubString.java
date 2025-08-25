
import java.util.*;
class Main {
    public static void main(String[] args) {
       String s="abcabcd";
      int j=0;
      int max=0;
       HashSet<Character> set=new HashSet<>();
       for(int i=0;i<s.length();i++){
           while(set.contains(s.charAt(i))){
               set.remove(s.charAt(j));
               j++;
           }
           set.add(s.charAt(i));
           max=Math.max(max,i-j+1);
       }
         System.out.print(max);
    }
}
