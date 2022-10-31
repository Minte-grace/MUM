public class PrimeCount {
    public static void main(String[] args){
        System.out.println(primeCount(10,30));
        System.out.println(primeCount(11,29));
        System.out.println(primeCount(20,22));
        System.out.println(primeCount(1,1));
        System.out.println(primeCount(5,5));
        System.out.println(primeCount(6,2));
        System.out.println(primeCount(-10,6));
    }
    static int primeCount(int start, int end){
        if(start>end) return 0;
        if(start<=1){
            start = 2;
        }
        int count = 0;
        for(int i=start; i<=end; i++){
            boolean isNonPrime = false;
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    isNonPrime = true;
                }
            }
            if(!isNonPrime){
                count++;
            }
        }
        return count;
    }
}
