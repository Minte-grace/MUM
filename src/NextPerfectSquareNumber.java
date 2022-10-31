public class NextPerfectSquareNumber {
    public static void main(String[] args){
        System.out.println(isPerfectSquare(6));
        System.out.println(isPerfectSquare(36));
        System.out.println(isPerfectSquare(0));
        System.out.println(isPerfectSquare(-5));
    }
    static int isPerfectSquare(int n){
        int sqrtOfNumber = (int) Math.sqrt(n);
        int nextNumber = sqrtOfNumber + 1;
        return n>=0 ? nextNumber*nextNumber:0;
    }
}
