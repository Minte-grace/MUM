public class Henry {
    public static void main(String[] args){
        System.out.println(henry(1,3));
    }
    static int henry (int i, int j){
       int maximumValue = Integer.MAX_VALUE;
       int arrayLength = i>j? i:j;
       int[] arrayOfPerfectNumbers = new int[arrayLength];
       int index = 0;
       int y = 1;
       while (y<maximumValue){
           int sum = 0;
           for(int x = 1; x<y; x++){
               if(y%x == 0){
                   sum = sum+ x;
               }
           }
           if(sum == y){
               arrayOfPerfectNumbers[index] = y;
               index++;
           }
           if(index==arrayLength){
               break;
           }
           y++;
       }
       return arrayOfPerfectNumbers[i-1]+arrayOfPerfectNumbers[j-1];
    }
}