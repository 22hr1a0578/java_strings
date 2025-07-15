class Main {
    static int count(int n){
        int count =0;
        while(n>0){
            count+=(n & 1);
            n>>=1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=9;
        System.out.println(count(n));
        String binary=Integer.toBinaryString(n);
        System.out.println(binary);
    }
}
