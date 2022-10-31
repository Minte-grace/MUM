public class NUpcount {
    public static void main(String[] args){
        System.out.println(nUpCount(new int[]{2,3,1,-6,8,-3,-1,2},5));
        System.out.println(nUpCount(new int[]{6,3,1},1));
        System.out.println(nUpCount(new int[]{2,2,-1,5,3,2,-3},20));
    }
    static int nUpCount(int[] a, int n){
        int previousValue = 0;
        int upCount = 0;
        int partialSum = 0;

        for(int i=0; i<a.length; i++){
            partialSum = partialSum+a[i];
            if(previousValue<n &&  partialSum>=n){
                upCount++;
            }
            previousValue =  partialSum;
        }
        return upCount;
    }
}
