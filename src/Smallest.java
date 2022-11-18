public class Smallest {
    public static void main(String[] args){
        System.out.println(smallest(4));
        System.out.println(smallest(5));
        System.out.println(smallest(6));
        System.out.println(smallest(7));
        System.out.println(smallest(3));

    }
    static int smallest(int n){
        int maxValue = Integer.MAX_VALUE;

        for(int i=1; i<maxValue; i++){
            int countOccurence = 0;
            for(int j=1; j<=n; j++){
                int testedNumber = i*j;
                boolean isTwoExist = false;
                while (testedNumber>0){
                    if(testedNumber%10 ==2){
                        isTwoExist = true;
                        break;
                    }
                    testedNumber/=10;
                }
                if(isTwoExist){
                    countOccurence++;
                    continue;
                } else {
                    break;
                }
            }
            if(countOccurence == n) return i;
        }
        return 0;
    }
}
