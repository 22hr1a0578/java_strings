import java.util.*;
class Main{
    public static String removeDuplicates(String s){
        StringBuilder sc=new StringBuilder();
        ArrayList<Character> ss=new ArrayList<>();
      for(int i=0;i<s.length();i++){
              if(!ss.contains(s.charAt(i))){
                  ss.add(s.charAt(i));
                  sc.append(s.charAt(i));
          }
          
      }
      return sc.toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
      System.out.print(removeDuplicates(s));
    }
}
