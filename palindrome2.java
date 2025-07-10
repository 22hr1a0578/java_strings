import java.util.*;
class Main {
    public static void main(String[] args) {
        String s="hih";
        //String sb="";
        StringBuilder sc=new StringBuilder(s);
        sc.reverse();
        if(sc.toString().equals(s)){
            System.out.println("1");
        }
        else{
            System.out.println("2");
        }
    }
}
