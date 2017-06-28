import java.math.*;
class test2{
public static void main(String[] args) {
  String a="xhix";
  int length=a.length();
  String sub=a.substring(0,1);
  String sub2=a.substring(length-1,length);
  System.out.print("*"+sub+"*"+sub2+length);
}
}
