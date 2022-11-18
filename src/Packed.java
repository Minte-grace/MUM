public class Packed {
    public static void main(String[] args){
        System.out.println(isPacked(new int[]{2, 2, 1}));
        System.out.println(isPacked(new int[]{2, 2, 1, 2, 2}));
        System.out.println(isPacked(new int[]{4, 4, 4, 4, 1, 2, 2, 3, 3, 3}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7, 1}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 1, 7, 7, 7}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7}));
        System.out.println(isPacked(new int[]{}));

    }
    static int isPacked(int[] a){
        for(int i = 0; i<a.length; i++){
            int count = 0;
            for(int j = 0; j<a.length; j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            if(count != a[i]) return 0;
            for(int j=i; j<a[i]-1; j++){
                if(a[i+1]- a[i] != 0){
                    return 0;
                }
            }
        }
        return 1;
    }
}
