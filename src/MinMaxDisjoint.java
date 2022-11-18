public class MinMaxDisjoint {
    public static void main(String[] args){
        System.out.println(isMinMaxDisjoint(new int[]{5, 4, 1, 3, 2}));
        System.out.println(isMinMaxDisjoint(new int[]{18, -1, 3, 4, 0}));
        System.out.println(isMinMaxDisjoint(new int[]{9, 0, 5, 9}));
        System.out.println(isMinMaxDisjoint(new int[]{0, 5, 18, 0, 9}));
        System.out.println(isMinMaxDisjoint(new int[]{7, 7, 7, 7}));
        System.out.println(isMinMaxDisjoint(new int[]{}));
        System.out.println(isMinMaxDisjoint(new int[]{1,2}));

    }
    static int isMinMaxDisjoint(int[] a){
        if(a.length < 2) return 0;

        int maximum = a[0];
        int minimum = a[1];
        int maximumIndex = 0;
        int minimumIndex = 1;
        int countMax = 0;
        int countMin = 0;


        for(int i=0; i<a.length; i++){
            if(a[i]> maximum){
                maximum = a[i];
                maximumIndex = i;
            };
            if(a[i]< minimum){
                minimum = a[i];
                minimumIndex = i;
            }
        }

        if(maximum == minimum) return 0;

        for (int i=0; i<a.length; i++){
            if(a[i] == maximum){
                countMax++;
            }
            if(a[i] == minimum){
                countMin++;
            }
        }
        if(countMax !=1 || countMin !=1) return 0;

        if(Math.abs(minimumIndex - maximumIndex) ==1) return 0;

        return 1;
    }
}
