public class OneToOne {
    public static void main(String[] args){
        System.out.println(is121Array(new int[]{1,2,1}));
        System.out.println(is121Array(new int[]{1,1,2,2,2,1,1}));
        System.out.println(is121Array(new int[]{1,1,2,2,1,1,1}));
        System.out.println(is121Array(new int[]{1,1,2,1,2,1,1}));
        System.out.println(is121Array(new int[]{1,1,1,2,2,2,1,1,1,3}));
        System.out.println(is121Array(new int[]{1,1,1,1,1,1}));
        System.out.println(is121Array(new int[]{2,2,2,1,1,1,2,2,2,1,1}));
        System.out.println(is121Array(new int[]{1,1,1,2,2,2,1,1,2}));
    }
    static int is121Array(int[ ] a){
        if(a.length<3) return 0;
        int centerElement = a[a.length/2];
        if(centerElement != 2) return 0;
        if(a[0] != 1 || a[a.length-1] !=1) return 0;
        boolean isOddLengthArray = a.length%2 == 0 ? false: true;
        if(!isOddLengthArray && a[a.length/2+1] !=2) return 0;

        int indexWhereTwosStart = 0;
        int indexWhereTwosEnd = 0;
        int countOnesBeforeCenter = 0;
        int countOnesAfterCenter = 0;

        for(int i=0; i< a.length/2; i++){
            countOnesBeforeCenter++;
            if(a[i+1]- a[i] == 1){
                indexWhereTwosStart = i+1;
                break;
            }
        }
        for(int i=a.length-1; i> a.length/2; i--){
            countOnesAfterCenter++;
            if(a[i-1]- a[i] == 1){
                indexWhereTwosEnd = i-1;
                break;
            }
        }
        if(countOnesBeforeCenter != countOnesAfterCenter) return 0;
        for(int i=indexWhereTwosStart; i<=indexWhereTwosEnd-1; i++){
            if(a[i+1] - a[i] != 0) return 0;
        }
        return 1;
    }
}
