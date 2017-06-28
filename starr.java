import java.util.*;
class starr
{
  public static void main(String[] args) {
    int i,j;
    System.out.println("Enter the limit: ");
    Scanner s=new Scanner(System.in);
    int limit=s.nextInt();
    for(i=0; i<limit; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
    }
  }
}
