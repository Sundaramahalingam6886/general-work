import java.util.*;
class armsloop
{
  public static void main(String[] args) {
    System.out.println("Enter the range limit");
    Scanner s=new Scanner(System.in);
    int limit=s.nextInt();
    List<Integer> armlist = new ArrayList<Integer>();
    for (int i=1;i<=limit ;i++ ) {
      int temp=i,temp1=i,sum=0;
      while(temp>0){
        temp=temp%10;
        sum=sum+(temp*temp*temp);
        temp1=temp1/10;
        temp=temp1;
      }
      if (sum==i) {
        armlist.add(i);
      }
    }
    System.out.println("armstrong number with in limit are: ");
    armlist.forEach(System.out::println);
  }
}
