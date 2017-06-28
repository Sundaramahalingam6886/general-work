import java.util.*;
class RevS{
  public static void main(String[] args) {
    System.out.println("ENTER THE LIMIT: ");
    Scanner s=new Scanner(System.in);
    int limit=s.nextInt();
    for (int i=0;i<limit ;i++ ) {
      for (int j=i;j<(limit-1) ;j++ ) {
        System.out.print(" ");
      }
      for (int k=0;k<=i ;k++ ) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
