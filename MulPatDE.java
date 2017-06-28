class MulPatDE{
  public static void main(String[] args) {
    int tema=1,a=0,b=0;
    for (int l=0;l<=5 ;l++ ) {
      for (int m=0;m<=l ;m++ ) {
        tema++;
        a=a+tema;
      }
      for (int n=0;n<=l ;n++ ) {
        tema++;
        b=b+tema;
      }
    System.out.print((a+b)*3+" ");
    a=0;
    b=0;
    }
  }
}
