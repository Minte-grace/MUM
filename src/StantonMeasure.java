public class StantonMeasure {
    public static void main(String[] args){
        System.out.println(stantonMeasure(new int[]{1}));
        System.out.println(stantonMeasure(new int[]{0}));
        System.out.println(stantonMeasure(new int[]{3,1,1,4}));
        System.out.println(stantonMeasure(new int[]{1,4,3,2,1,2,3,2}));
    }
    static int stantonMeasure(int[] a){
        int countOfOnes = 0;
        int countOfNumber = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]==1){
                countOfOnes++;
            }
        }
        for(int i=0; i<a.length; i++){
            if(a[i]== countOfOnes){
                countOfNumber++;
            }
        }
        return countOfNumber;
    }
}
