public class TimeComplexity {
    public static void main(String[] args) {
        int n =1024;
        int count=0;
            while(n>1){
                n=n/2;
                count++;
                System.out.println("n ="+n);
            }
            System.out.println("Total divisions="+count);
    }
}
