class NumberPattern3{
  public static void main(String[] args) {
    int count=1;
    for (int i=0;i<7 ;i++ ) {
      for (int j=0;j<=i ;j++ ) {
        System.out.print(count);
        count++;
      }
      System.out.println("");
      count=1;
    }
    for (int i=0;i<6 ;i++ ) {
      for (int j=6;j>i ;j-- ) {
        System.out.print(count);
        count++;
      }
      System.out.println("");
      count=1;
    }
  }
}
