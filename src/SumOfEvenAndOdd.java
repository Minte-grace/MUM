public class SumOfEvenAndOdd {
    public static void main(String[] args){
        System.out.println(f(new int[]{1}));
        System.out.println(f(new int[]{1,2}));
        System.out.println(f(new int[]{1,2,3}));
        System.out.println(f(new int[]{1,2,3,4}));
        System.out.println(f(new int[]{3,3,4,4}));
        System.out.println(f(new int[]{3,2,3,4}));
        System.out.println(f(new int[]{4,1,2,3}));
        System.out.println(f(new int[]{1,1}));
        System.out.println(f(new int[]{}));
    }
    static int f(int[] a){
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;

        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                sumOfEvenNumbers+=a[i];
            } else {
                sumOfOddNumbers+=a[i];
            }
        }
        return sumOfOddNumbers - sumOfEvenNumbers;
    }
}
