import java.util.*;
class Main{
    public static void main(String args[]){
        String str="hello";
        StringBuilder sc=new StringBuilder(str);
        int index=3;
        sc.insert(5,"Geeks");
        System.out.print(sc);
    }
}
