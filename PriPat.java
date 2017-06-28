import java.util.*;
class PriPat{
  public static void main(String[] args) {
  System.out.println("ENTER THE LIMIT: ");
  Scanner s=new Scanner(System.in);
  int limit=s.nextInt();
  int count=0,i,space,j,k,pc=0,p=1,p1=1;
  for (i=0;i<limit ;i++ ) {
    for (space=i;space<limit-1 ;space++ ) {
      System.out.print("");
    }
    for (j=0;j<=i ;j++ ) {
      for(k=2;k<=(i/2);k++){
        if(i%k==0){
          count++;
          break;
        }
      }
      if(count==0){
        System.out.print(i+" ");
        pc++;
      }
      count=0;
      break;
    }
    if(pc==p){
      System.out.println("");
      p1++;
      p=p+p1;
    }
  }
}
}
