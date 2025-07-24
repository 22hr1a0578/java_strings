import java.util.*;
class Main{
    public static int[] countVowels(String s){
        int constant=0;
        int vowels=0;
        
        for(char ch:s.toCharArray()){
            if("AEIOUaeiou".indexOf(ch)!=-1){
                vowels++;
            }
            else{
                contant++;
            }
        }
       return new int[]{vowels,constant};
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] res=countVowels(s);
        System.out.print("("+res[0]+" "+res[1]+")");
    }
}
