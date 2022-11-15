import java.util.Arrays;

public class ComputeDepth {
    public static void main(String[] args){
System.out.println(computeDepth(42));
    }
    public static int computeDepth(int n){
       int digitLength = 0;
       int occurence = 0;
       int origionalNumber = n;
       while (n>0){
           digitLength++;
           n = n/10;
       }
        int[] arrayOfDigits = new int[digitLength];
        int index = digitLength-1;
        n = origionalNumber;
        while (n>0){
            arrayOfDigits[index] = n%10;
            n = n/10;
            index--;
        }
       //[4,2]
        n =origionalNumber;
        int i=1;

//        System.out.println(digitLength);
//        System.out.println(Arrays.toString(arrayOfDigits));

        while(n>0) {
            int nextNumber = n*i;
            int countOccurence = 0;
            while(nextNumber>0){
                int digitToBeChecked = nextNumber%10;
                for(int j=0; j<arrayOfDigits.length; j++){
                        if(arrayOfDigits[j] == digitToBeChecked){
                            countOccurence++;
                        }
                }
                nextNumber/=10;
                System.out.println(nextNumber);
            }
            i++;
            if(countOccurence == 0){
                break;
            }
//            if(digitOccurs){
//                i++;
//            }
        }
        return i;
    }
}
