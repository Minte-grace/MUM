public class Inertial {
    public static void main(String[] args){
        System.out.println(isInertia(new int[]{1}));
        System.out.println(isInertia(new int[]{2}));
        System.out.println(isInertia(new int[]{1,2,3,4}));
        System.out.println(isInertia(new int[]{1,1,1,1,1,1,2}));
        System.out.println(isInertia(new int[]{2,12,4,6,8,11}));
        System.out.println(isInertia(new int[]{2,12,12,4,6,8,11}));
        System.out.println(isInertia(new int[]{-2,-4,-6,-8,-11}));
        System.out.println(isInertia(new int[]{2,3,5,7}));
        System.out.println(isInertia(new int[]{2,4,6,8,10}));
    }
    static int isInertia(int[] a){
        int maximumNumber = a[0];
        boolean isOddNumberFound = false;

        for(int i=0; i<a.length; i++){
            if(a[i]>maximumNumber){
                maximumNumber = a[i];
            }
            if(a[i]%2 != 0){
                isOddNumberFound = true;
            }
        }
        if(maximumNumber%2 != 0) return 0;
        if(!isOddNumberFound){
            return 0;
        }
        for(int i=0; i<a.length; i++){
            if(a[i]%2 != 0){
                for(int j=0; j<a.length; j++){
                    if(a[j]%2 == 0 && a[j] != maximumNumber){
                        if(a[i]< a[j]) return 0;
                    }
                }
            }

        }
        return 1;
    }
}
