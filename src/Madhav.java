public class Madhav {
    public static void main(String[] args){
       isMadhav(new int[]{2,1,1,4,-1,-1});
    }
    static void isMadhav(int[] a){
        int sum = a[0];
        int lengthToBeAdded = 1;
        int startingIndex = 0;
        int endIndex = 1;
        int calculatedSum = 0;

        for(int i=startingIndex; i<endIndex; i++){
            calculatedSum += a[i];
            System.out.print(startingIndex);
            System.out.print(endIndex);
            System.out.println("gh");
//            if(calculatedSum != sum){
////                return 0;
//                break;
//            }
            lengthToBeAdded++;
            startingIndex = endIndex;
            endIndex = endIndex+ lengthToBeAdded;
            System.out.print(startingIndex);
            System.out.print(endIndex);
            System.out.println("");
        }

    }
}
