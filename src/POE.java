public class POE {
    public static void main(String[] args){
            System.out.println(f(new int[]{1,8,3,7,10,2}));
            System.out.println(f(new int[]{1,5,3,1,1,1,1,1,1}));
            System.out.println(f(new int[]{2,1,1,1,2,1,7}));
            System.out.println(f(new int[]{1,2,3}));
            System.out.println(f(new int[]{3,4,5,10}));
            System.out.println(f(new int[]{1,2,10,3,4}));
    }
    static int f(int[] a){
        if(a.length>=3){
            for(int i=1; i<a.length-1; i++){
                int rightSum = 0;
                int leftSum = 0;
                for(int j = 0; j<i; j++){
                    leftSum+=a[j];
                }
                for(int j=i+1; j<a.length; j++){
                    rightSum+=a[j];
                }
                if(leftSum == rightSum) return i;
            }
        }
        return -1;
    }
}
