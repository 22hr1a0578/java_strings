import java.util.*;
class Main {
    public static void main(String[] args) {
        String s="hih";
        String sb="";
        for(int i=s.length()-1;i>=0;i--){
            sb+=s.charAt(i);
        }
        System.out.println(sb);
        if(sb.equals(s)){
            System.out.println("1");
        }
        else{
            System.out.println("2");
        }
    }
}
