import java.util.Arrays;

public class ZeroBased {
    public static void main(String[] args){
        System.out.println(Arrays.toString(f(new char[]{'a','b', 'c'},0,4)));
        System.out.println(Arrays.toString(f(new char[]{'a','b', 'c'},0,3)));
        System.out.println(Arrays.toString(f(new char[]{'a','b', 'c'},0,2)));
        System.out.println(Arrays.toString(f(new char[]{'a','b', 'c'},0,1)));
        System.out.println(Arrays.toString(f(new char[]{'a','b', 'c'},1,3)));
        System.out.println(Arrays.toString(f(new char[]{'a','b', 'c'},1,2)));
        System.out.println(Arrays.toString(f(new char[]{'a','b', 'c'},1,1)));
        System.out.println(Arrays.toString(f(new char[]{'a','b', 'c'},2,2)));
        System.out.println(Arrays.toString(f(new char[]{'a','b', 'c'},2,1)));
        System.out.println(Arrays.toString(f(new char[]{'a','b', 'c'},3,1)));
        System.out.println(Arrays.toString(f(new char[]{'a','b', 'c'},1,0)));
        System.out.println(Arrays.toString(f(new char[]{'a','b', 'c'},-1,1)));
        System.out.println(Arrays.toString(f(new char[]{'a','b', 'c'},-1,-2)));
        System.out.println(Arrays.toString(f(new char[]{},0,1)));
    }
    static char[] f(char[] a, int start, int len){
        int lengthOfArrayAfterStart = 0;
        for(int i=start; i<a.length; i++){
            lengthOfArrayAfterStart++;
        }
        if(len > lengthOfArrayAfterStart) return null;
        if(start<0 || len <0 || start > a.length) return null;
        char[] result = new char[len];
        int indexOfResult = 0;
        for(int i= start; i<start+len; i++){
            result[indexOfResult] = a[i];
            indexOfResult++;
        }
        return result;
    }
}
