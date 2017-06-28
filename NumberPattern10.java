class NumberPattern10{
  public static void main(String[] args) {
    for (int i=0;i<8 ;i++ ) {
      for (int j=0;j<8 ;j++ ) {
        if (i==j) {
            System.out.print(i);
          }else{
            System.out.print("0");
          }
        }
        System.out.println();
      }
    }
  }
