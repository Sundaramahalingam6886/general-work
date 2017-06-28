class LJP1{
  public static void main(String[] args) {
    String init="",ccat="";int temp=10;
    System.out.println("0");
    for (int i=0;i<5 ;i++ ) {
      temp--;
      init=Integer.toString(temp);
      ccat=init.concat(ccat);
      System.out.println(ccat +"0");
    }
  }
}
