import java.util.*;
class MulPat{
  public static void main(String[] args) {
    System.out.println("ENTER THE LIMIT");
    Scanner s=new Scanner(System.in);
    int limit=s.nextInt();
    int temp=1,a=0,b=0;
    for(int i=0;i<limit;i++){
      for (int space=i+1;space<limit ;space++ ) {
        System.out.print(" ");
      }
      for (int j=0;j<=i ;j++ ) {
        temp++;
        a=temp;
        System.out.print(temp+" ");
      }
      int tema=1,c=0,d=0,x=0,y=0;
      for (int l=0;l<=i ;l++ ) {
        for (int m=0;m<=l ;m++ ) {
          tema++;
          c=c+tema;
        }
        for (int n=0;n<=l ;n++ ) {
          tema++;
          d=d+tema;
        }
      System.out.print(x+(c+d)*3+" ");
      c=0;
      d=0;
      }
      for (int k=0;k<=i ;k++ ) {
        temp++;
        b=temp;
        System.out.print(" "+temp);
      }
      System.out.println();
  }
}
}
