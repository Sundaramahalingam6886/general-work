import java.util.*;
class NumberPattern6{
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("ENTER NUMBER OF ROWS: ");
    int limit=s.nextInt();
    for (int i=1;i<=limit ;i++ ) {
      for (int j=1;j<=i ;j++ ) {
        System.out.print(j);
      }
      for (int k=i-1;k>0 ;k-- ) {
        System.out.print(k);
      }
      System.out.println("");
    }
  }
}
