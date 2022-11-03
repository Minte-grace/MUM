public class SquarePair {
    public static void main(String[] args){
        System.out.println(countSquarePairs(new int[]{9,0,2,-5,7}));
        System.out.println(countSquarePairs(new int[]{9}));
        System.out.println(countSquarePairs(new int[]{11,5,4,20}));
    }
    static int countSquarePairs(int[] a){
        int count = 0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(a[i]==a[j]) continue;
                if(a[i]>0 && a[j]>0 && a[i]>a[j] && isPerfectSquare(a[i]+a[j])==1){
                    count++;
                }
            }
        }
        return count;
    }
    static int isPerfectSquare(int n){
        double decimalValue = Math.sqrt(n);
        int fixedValue = (int) decimalValue;
        return fixedValue == decimalValue ? 1 :0;
    }
}
