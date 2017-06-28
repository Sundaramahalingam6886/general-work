class ascS{
  public static void main(String[] args) {
    String s="this 1234567890 and !@#$%^&*()_+";
    char[] ch=s.toCharArray();
    int text=0,numbers=0,sc=0;
    for (int i=0;i<s.length() ;i++ ) {
      int ascii=ch[i];
      if (ascii>64 && ascii<91 || ascii>96 && ascii<123 ) {
        text++;
      }
      else if (ascii>47 && ascii<58) {
        numbers++;
      }
      else {
        sc++;
      }
    }
    System.out.println("NUMER OF ALPHABETS IN INPUT: "+text);
    System.out.println("NUMER OF NUMBERS IN INPUT: "+numbers);
    System.out.println("NUMER OF SPECIAL CHAR. IN INPUT: "+sc);
  }
}
