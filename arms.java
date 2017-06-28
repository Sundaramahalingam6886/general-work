import java.util.*;
class arms
{
public static void main(String ar[])
{
System.out.println("Enter your number! ");
Scanner s=new Scanner(System.in);
int arm=s.nextInt();
int temp=arm,temp1=arm,sum=0;
while(temp>0)
{
temp=temp%10;
sum=sum+(temp*temp*temp);
temp1=temp1/10;
temp=temp1;
}
if(arm==sum)
{
System.out.println("Shits an armstrong!");
}
else
{
System.out.println("Shits not an armstrong!");
}
}
}
