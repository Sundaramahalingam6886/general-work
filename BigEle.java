class BigEle{
  static int temp=0;
  public static void main(String[] args) {
    int arr[]=new int[] {1,2,4,5,6,7,5,5,8,5};
    int count=0;
    for (int i=0;i<arr.length ;i++ ) {
      for (int j=0;j<arr.length ;j++ ) {
        if (arr[i]==arr[j]) {
          count++;
        }
      }
      System.out.println("The element"+arr[i]+"has appeared"+count+"times");
      count=0;
    }
  }
}
