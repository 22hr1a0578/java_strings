import java.util.*;
class Main{
    public static void main(String args[]){
        String s="aaabbbbccccc";
        StringBuilder sc=new StringBuilder();
        int count=1;
        for(int i=0;i<s.length();i++){
            if(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                sc.append(s.charAt(i)).append(count);
                count=1;
            }
        }
        System.out.print(sc);
    }
}
