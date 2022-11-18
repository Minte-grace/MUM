public class MadhavArray {
    public static void main(String[] args){
        System.out.println(isMadhavArray(new int[]{2, 1, 1}));
        System.out.println(isMadhavArray(new int[]{2, 1, 1, 4, -1, -1}));
        System.out.println(isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        System.out.println(isMadhavArray(new int[]{18, 9, 10, 6, 6, 6}));
        System.out.println(isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4}));
        System.out.println(isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}));
        System.out.println(isMadhavArray(new int[]{3, 1, 2, 3, 0}));
    }
    static int isMadhavArray(int[] a){
        int lengthOfClusters = 0;
        for(int i =1; i<=a.length; i++){
            if(i*(i+1)/2 == a.length){
                lengthOfClusters = i;
            }
        }
        if(lengthOfClusters == 0) return 0;
        int origionalSum = a[0];
        int start = 0;
        int end = 1;

        for(int i=1; i<=lengthOfClusters; i++){
            int sum = 0;
            for(int j=start; j<end; j++){
                sum+=a[j];
            }
            if(sum != origionalSum) return 0;
            start = end;
            end = end+i+1;
        }

        return 1;
    }
}
