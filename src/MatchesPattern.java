import java.awt.*;

public class MatchesPattern {
    public static void main(String[] args){
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{3, -2, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{2, 1, -1, -1, 2, 1}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{1, 2, -1, -1, 1, 2}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{2, 1, -2, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{1, 1, 1, -1, -1, 1, 1, 1}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{4, -1, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{2, -3, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{8}));
    }
    static int matches(int[] a, int[] p){
        int startingIndex = 0;
        int endIndex = 0;
        for(int i = 0; i < p.length; i++){
            int count = 0;
            startingIndex = endIndex;
            endIndex = endIndex + Math.abs(p[i]);
            for(int j = startingIndex; j<endIndex; j++){
                if(p[i] > 0 && a[j] < 0) return 0;
                if(p[i] < 0 && a[j] > 0) return 0;
                count++;
            }
            if(count != Math.abs(p[i])) return 0;

        }
        return 1;
    }
}
