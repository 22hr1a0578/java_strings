import java.util.*;
class Main{
    public static char freq(String s){
       int maxCount=1;
       char frequent=s.charAt(0);
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
                if(maxCount<count){
                    maxCount=count;
                    frequent=s.charAt(i);
                
            }
        }
        return frequent;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print(freq(s));
    }
}
