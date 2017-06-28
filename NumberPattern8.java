class NumberPattern8{
  public static void main(String[] args) {
    int temp=1,space;
    for (int i=0;i<7 ;i++ ) {
      for (space=0;space<i ;space++ ) {
        System.out.print(" ");
      }
      for (int j=temp;j<=7 ;j++ ) {
        System.out.print(j+" ");
      }
      temp++;
      System.out.println();
    }
    temp=7;
    for (int i=0;i<7 ;i++ ) {
      for (space=6;space>i ;space-- ) {
        System.out.print(" ");
      }
      for (int j=7;j>=temp ;j-- ) {
        System.out.print(j+" ");
      }
      System.out.println();
      temp--;
    }
  }
}
