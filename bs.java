import java.util.*;
class bs{
  public static void main(String[] args) {
    System.out.println("Enter the size of the array: ");
    Scanner s=new Scanner(System.in);
    int limit=s.nextInt();
    int [] arr=new int[limit];
    for (int i=0;i<limit ;i++ ) {
      arr[i]=s.nextInt();
    }
    System.out.println("The array before sorting:");
    for (int i=0;i<limit ;i++ ) {
      System.out.println(arr[i]);
    }
    for(int i = 0; i < limit; i++) {
         for(int j=1; j < (limit-i); j++) {
            if(arr[j-1] > arr[j]) {
               int temp = arr[j-1];
               arr[j-1] = arr[j];
               arr[j] = temp;
        }
      }
    }
    System.out.println("The array after sorting:");
    for (int i=0;i<limit ;i++ ) {
      System.out.println(arr[i]);
  }
}
}
