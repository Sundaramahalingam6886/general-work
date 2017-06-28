import java.io.FileWriter;
class FWE{
  public static void main(String[] args) {
    try{
      FileWriter fw=new FileWriter("E:\\Programmig workspace\\Java programs\\FWE.txt");
      String con=System.console().readLine();
      fw.write(con);
      fw.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
