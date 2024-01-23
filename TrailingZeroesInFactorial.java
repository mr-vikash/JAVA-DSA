public class TrailingZeroesInFactorial {
  public static void main(String[] args) {
    long num = 30;
    long res = 0;
    for (long i = 5; i <= 89; i = i * i) {
      res = res + (num / i);
    }
    System.out.println(res);
  }

  // int unitValue(int n){
  // int v=0;
  // while(n>0){
  // v = n % 10;
  // n = n / 10;
  // }
  // if(v<10){
  // return v;
  // } else {
  // return unitValue(v);
  // }
  // }
}
