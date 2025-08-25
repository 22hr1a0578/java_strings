class Main {
    public static void main(String[] args) {
       String s="acd";
       String s1="cda";
       if(s1.length()==s.length() && (s+s).contains(s1)){
           System.out.print("true");
       }
       else{
           System.out.print("False");
       }
    }
}
