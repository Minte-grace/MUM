public class ReverseInteger {
    public static void main(String[] args){
            System.out.println(f(1234));
            System.out.println(f(12005));
            System.out.println(f(1));
            System.out.println(f(1000));
            System.out.println(f(0));
            System.out.println(f(-12345));
    }
    static int f(int n){
        int reversedNumber = 0;
        while(n!=0){
            reversedNumber = reversedNumber*10 + n%10;
            n/=10;
        }
        return reversedNumber;
    }
}
