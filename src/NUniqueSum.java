public class NUniqueSum {
    public static void main(String[] args){
        System.out.println(isNUnique(new int[]{7,3,3,2,4}, 6));
        System.out.println(isNUnique(new int[]{7,3,3,2,4}, 10));
        System.out.println(isNUnique(new int[]{7,3,3,2,4}, 11));
        System.out.println(isNUnique(new int[]{7,3,3,2,4}, 8));
        System.out.println(isNUnique(new int[]{7,3,3,2,4}, 4));
        System.out.println(isNUnique(new int[]{1}, 6));
    }
    static int isNUnique(int[] a, int n){
        int count = 0;
        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                if(i==j) continue;
                if(a[i]+a[j] == n){
                    count++;
                }
            }
            if(count>1) return 0;
        }
        if(count == 1){
            return 1;
        }
        return 0;
    }
}
