public class IsSquare {
    public static void main(String[] arg){
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(8));
        System.out.println(isSquare(0));
    }
    static int isSquare(int n){
        for (int i=0; i<=n; i++){
            if(i*i == n){
                return 1;
            }
        }
        return 0;
    }
}
