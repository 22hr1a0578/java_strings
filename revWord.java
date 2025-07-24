import java.util.*;
class Main{
    public static String rev(String s){
        String rev="";
        String[] sc1=s.split("\\s");
        for(int i=sc1.length-1;i>=0;i--){
            rev+=sc1[i]+" ";
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(rev(s));
    }
}
