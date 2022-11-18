public class Smallest {
    public static void main(String[] args){
        System.out.println(smallest(4));
//        System.out.println(smallest(3));
    }
    static int smallest(int n){
        int i=1;
        int maxValue = Integer.MAX_VALUE;
        int count = 0;

        while(i<maxValue){
            for(int j=1; j<=n; j++){
                int numberMultiplied = i*j;
                boolean isTwoFound = false;
                while (numberMultiplied>0){
                    int currentDigit = numberMultiplied%10;
                    if(currentDigit == 2) {
                        isTwoFound = true;
                        break;
                    }
                    numberMultiplied/=10;
                }
                if(isTwoFound){
                    count++;
//                    continue;
                } else {
                    break;
                }
            }
//            System.out.println(count);
            if(count == n) return i;
            i++;
        }
        return 0;
    }
}
