public class Centered {
    public static void main(String[] args){
        System.out.println(isCenteredArray(new int[]{1,2,3,4,5}));
        System.out.println(isCenteredArray(new int[]{3,2,1,4,5}));
        System.out.println(isCenteredArray(new int[]{3,2,1,4,1}));
        System.out.println(isCenteredArray(new int[]{1,2,3,4}));
        System.out.println(isCenteredArray(new int[]{}));
        System.out.println(isCenteredArray(new int[]{10}));
    }
    static int isCenteredArray(int[] a){
        if(a.length%2 == 0) return 0;
        int centeredElement = a[a.length/2];
        for(int i=0; i<a.length; i++){
            if(i == a.length/2) continue;
            if(a[i] <= centeredElement){
                return 0;
            }
        }
        return 1;
    }
}
