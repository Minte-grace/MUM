public class IsPorcupineNumber {
    public static void main(String[] args){
        System.out.println(findPorcupineNumber(0));
        System.out.println(findPorcupineNumber(139));
    }
    static int isPrime(int n){
        int count = 0;
        for(int i=2; i<n; i++){
            if(n%i == 0){
                count++;
            }
        }
        return count>0 ? 0:1;
    }
    static int findPorcupineNumber(int n){
      int maxValue = Integer.MAX_VALUE;
      for(int i=n+1; i<maxValue; i++){
          if(isPrime(i) == 1 && i%10 == 9){
              for(int j = i+1; j<maxValue; j++){
                  if(isPrime(j) == 1 ){
                      if(j%10 !=9){
                          break;
                      } else {
                          return i;
                      }
                  }
              }
          }
      }
      return 0;
    }
}
