import java.util.*;
class fib{
  public static void main(String[] args) {
    int n1=0,n2=1,n3;
    System.out.println("Enter the about of fibonacci elements to be displayed:");
    Scanner s=new Scanner(System.in);
    int limit=s.nextInt();
    System.out.println(n1+"\n"+n2);
    for (int i=0;i<limit ;i++ ) {
      n3=n1+n2;
      System.out.println(n3);
      n1=n2;
      n2=n3;
    }
  }
}
