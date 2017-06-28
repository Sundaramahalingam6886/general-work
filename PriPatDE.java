import java.util.*;
class PriPatDE{
  public static void main(String[] args) {
  System.out.println("ENTER THE LIMIT: ");
  Scanner s=new Scanner(System.in);
  int limit=s.nextInt();
  int count=0,i,space,j,k,pc=0,p=1,p1=1,sc=0,n1=0,n=0;
  for (i=0;i<limit ;i++ ) {
    for (space=i;space<limit-1 ;space++ ) {
      if(sc==n)
      System.out.print(sc);
    }
    for (j=0;j<=i ;j++ ) {
      for(k=2;k<=(i/2);k++){
        if(i%k==0){
          count++;
          break;
        }
      }
      if(count==0){
        System.out.print(" "+i);
        pc++;
        sc++;
      }
      count=0;
      break;
    }
    if(pc==p){
      System.out.println("");
      p1++;
      p=p+p1;
      n1++;
      n=n+n1;
    }
  }
}
}
