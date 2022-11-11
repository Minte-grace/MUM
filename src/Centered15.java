public class Centered15 {
    public static void main(String[] args){
        System.out.println(isCentered15(new int[]{3, 2, 10, 4, 1, 6, 9}));
        System.out.println(isCentered15(new int[]{3, 2, 10, 5, 6, 9}));
        System.out.println(isCentered15(new int[]{2, 10, 4, 1, 6, 9}));
        System.out.println(isCentered15(new int[]{3, 2, 10, 4, 1, 6}));
        System.out.println(isCentered15(new int[]{1,1,8, 3, 1, 1}));
        System.out.println(isCentered15(new int[]{9, 15, 6}));
        System.out.println(isCentered15(new int[]{1, 1, 2, 2, 1, 1}));
        System.out.println(isCentered15(new int[]{1, 1, 15, -1,-1}));
    }
    static int isCentered15(int[] a) {
        boolean isEven = a.length % 2 == 0 ? true : false;
        int startingIndex = isEven ? a.length / 2 - 1: a.length / 2;
        int endIndex = a.length / 2;

        while (startingIndex >= 0 && endIndex < a.length) {
            int sum = 0;
            for (int i = startingIndex; i <= endIndex; i++) {
                sum = sum + a[i];
            }
            if (sum == 15 && startingIndex == a.length - endIndex - 1 && startingIndex != 0) {
                return 1;
            }
            startingIndex--;
            endIndex++;
        }
        return 0;
    }
}
