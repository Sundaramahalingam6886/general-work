import java.util.*;
import java.math.*;
class od
{
	public static void main(String ar[])
	{
System.out.println("Enter the number");
Scanner n= new Scanner(System.in);
int a=n.nextInt();
int length = (int) Math.log10(a) + 1;
int sep=0;
List<Integer> ev = new ArrayList<Integer>();
List<Integer> od = new ArrayList<Integer>();
for (int i=0; i<length; i++)
{
 sep=sep%10;
 if(sep%2==0)
 {
	 ev.add(sep);
 }
 else
 {
     od.add(sep);
 }
 a=a/10;
 sep=a;
}
ev.forEach(System.out::println);
od.forEach(System.out::println);
}
}