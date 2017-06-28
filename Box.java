class Box{
  public static void main(String[] args) {
    for(int i=1;i<=7;i++){
      if(i==1 || i==7){
        for(int j=0;j<7;j++){
          System.out.print("*");
        }
      }else{
        System.out.println();
          for(int k=1;k<=7;k++){
            if(k==1 || k==7 || i==k){
              System.out.print("*");
            }else{
              System.out.print(" ");
            }
          }System.out.println();
        }
    }
  }
}
