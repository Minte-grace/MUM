import java.util.Arrays;

public class SolveTen {
    public static void main(String[] args){
        System.out.println(Arrays.toString(solve10()));
    }
    static int[] solve10(){
        int factorialOfTen = 1;
        int i=1;
        int result[] = new int[2];
        while(i<=10){
            factorialOfTen = factorialOfTen*i;
            i++;
        }

        for(int x=0; x<10; x++){
            int indexOfX = 1;
            int factorialOfX = 1;
            while(indexOfX<=x){
                factorialOfX = factorialOfX* indexOfX;
                indexOfX++;
            }
            for(int y=0; y<10; y++){
                int indexOfY = 1;
                int factorialOfY = 1;
                while(indexOfY<=y){
                    factorialOfY = factorialOfY* indexOfY;
                    indexOfY++;
                }
                if(factorialOfY+factorialOfX == factorialOfTen){
                    result[0] = x;
                    result[1] = y;
                }
            }
        }
        return result;
    }
}
