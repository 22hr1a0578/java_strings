
import java.util.*;
class Main {
    public static boolean isPalindrome(String s){
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(isPalindrome(s)){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}
