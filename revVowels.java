class Main{
    public static String Vowels(String s){
        char[] ch=s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j){
            while(i<j && "AEIOUaeiou".indexOf(ch[i])==-1)
            {i++;}
            while(i<j && "AEIOUaeiou".indexOf(ch[j])==-1)j--;
            char c=ch[i];
            ch[i]=ch[j];
            ch[j]=c;
            i++;
            j--;
        }
        return new String(ch);
    }
    public static void main(String args[]){
        String s="lethai";
        System.out.print(Vowels(s));
    }
}
