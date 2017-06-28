import java.util.*;
class NumberPattern9{
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int limit=s.nextInt();
    for (int loop=1;loop<=limit ;loop++ ) {
      for (int i=1;i<=loop ;i++ ) {
        if(i%2==0){
          System.out.print("0");
        }else{
          System.out.print("1");
        }
      }
      System.out.println();
    }
  }
}
