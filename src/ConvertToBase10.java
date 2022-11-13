public class ConvertToBase10 {
    public static void main(String[] args){
        System.out.println(convertToBase10(new int[]{1, 0, 1, 1}, 2));
        System.out.println(convertToBase10(new int[]{1, 1, 2}, 3));
        System.out.println(convertToBase10(new int[]{3, 2, 5}, 8));
        System.out.println(convertToBase10(new int[]{3, 7, 1}, 6));
    }
    static int convertToBase10(int[] a, int base){
        if(IsLegalNumber.isLegalNumber(a, base)==0) return 0;
        int result = 0;
        int binaryIndex = a.length-1;
        for(int i= 0; i<a.length; i++){
            int powValue = (int) Math.pow(base,binaryIndex);
            result = result + a[i] * powValue;
            binaryIndex--;
        }
        return result;
    }
}
