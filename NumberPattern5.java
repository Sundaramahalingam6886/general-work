class NumberPattern5{
  public static void main(String[] args) {
    int temp=7;
    for (int i=1;i<=7 ;i++ ) {
      for (int j=temp;j>=1 ;j-- ) {
        System.out.print(j);
      }
      System.out.println("");
      temp-=1;
    }
  }
}
