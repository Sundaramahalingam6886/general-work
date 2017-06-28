import java.util.*;
class NP{
  public static void main(String[] args) {
    System.out.println("ENTER THE NUMBER OF ROWS: ");
    Scanner s=new Scanner(System.in);
    int limit=s.nextInt();
    for (int i=1;i<=limit ;i++ ) {
      for (int space=i;space<=(limit-1) ;space++ ) {
        System.out.print(" ");
      }
      for (int j=1;j<=i ;j++ ) {
        System.out.print(j);
      }
      for (int k=(i-1);k>0 ;k-- ) {
        System.out.print(k);
      }
      System.out.println("");
    }
  }
}
