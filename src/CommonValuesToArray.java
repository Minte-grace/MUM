import java.util.Arrays;

public class CommonValuesToArray {
    public static void main(String[] args){
        System.out.println(Arrays.toString(f(new int[]{1,8,3,2},new int[]{4,2,6,1})));
        System.out.println(Arrays.toString(f(new int[]{1,8,3,2,6},new int[]{2,6,1})));
        System.out.println(Arrays.toString(f(new int[]{1,3,7,9},new int[]{7,1,9,3})));
        System.out.println(Arrays.toString(f(new int[]{1,2},new int[]{3,4})));
        System.out.println(Arrays.toString(f(new int[]{},new int[]{1,2,3})));
        System.out.println(Arrays.toString(f(new int[]{1,2},new int[]{})));
        System.out.println(Arrays.toString(f(new int[]{1,2},null)));
        System.out.println(Arrays.toString(f(null,new int[]{} )));
        System.out.println(Arrays.toString(f(null,null )));
    }
    static int[] f(int[] first, int[] second){
        if(first == null || second == null) return null;
        int tempArrayLength = first.length > second.length ? second.length : first.length;
        int[] tempArray = new int[tempArrayLength];
        int countNumberOfCommonElements = 0;

        for(int i=0; i<first.length; i++){
            for(int j=0; j<second.length; j++){
                if(first[i] == second[j]){
                    tempArray[countNumberOfCommonElements] = first[i];
                    countNumberOfCommonElements++;
                }
            }
        }
        int[] result = new int[countNumberOfCommonElements];
        for(int i=0; i<countNumberOfCommonElements; i++){
            result[i] = tempArray[i];
        }
        return result;
    }
}
