import java.util.*;
class Main {
    public static void main(String[] args) {
       String sc="there is a man who told me that an onion makes us cry so i like the fruits";
       List<String> s=Arrays.asList("a","an","the");
       String[] word=sc.split("\\s+");
       StringBuilder s1=new StringBuilder();
       for(String c:word){
           if(!s.contains(c)){
               s1.append(c).append(" ");
           }
       }
       System.out.print(s1);
    }
}
