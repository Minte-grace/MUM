import java.awt.*;

public class Centered15 {
    public static void main(String[] args){
        System.out.println(isCentered15(new int[]{3, 2, 10, 4, 1, 6, 9}));
        System.out.println(isCentered15(new int[]{2, 10, 4, 1, 6, 9}));
        System.out.println(isCentered15(new int[]{3, 2, 10, 4, 1, 6}));
        System.out.println(isCentered15(new int[]{1,1,8, 3, 1, 1}));
        System.out.println(isCentered15(new int[]{9, 15, 6}));
        System.out.println(isCentered15(new int[]{1, 1, 2, 2, 1, 1}));
        System.out.println(isCentered15(new int[]{1, 1, 15, -1,-1}));
    }
    static int isCentered15(int[] a){
        boolean evenLength = a.length/2 == 0 ? true : false;
        int startingIndex = 0;
        int endIndex = 0;

        if(a.length <= 1) return 0;
        if(evenLength){
            startingIndex = a.length/2-1;
            endIndex = a.length/2;
        } else {
            startingIndex = a.length/2;
            endIndex = a.length/2;
        }

        while(startingIndex>=0 && endIndex < a.length){
            int sum = 0;
            for(int i= startingIndex; i<=endIndex; i++){
                sum = sum+ a[i];
            }
            if(sum == 15 && startingIndex == a.length - 1 - endIndex){
                return 1;
           }
            startingIndex--;
            endIndex++;
        }
        return 0;
    }
}
