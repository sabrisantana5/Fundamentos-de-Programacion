//https://www.branah.com/unicode-converter
public class Unicode
{
 public static void main(String[] args)
 {
  String p="niño € ??"; //MATHEMATICAL SCRIPT CAPITAL P (HTML &#119979;)
  int caracter;
  int codePoint;

  System.out.println(p);

  //caracter = p.charAt(2); //ñ es 241 o 0xf1
  //System.out.print(caracter);

  for(int i=0; i<p.length(); i++)
  {
   caracter = p.charAt(i); //ñ es 241 o 0xf1
   System.out.printf("%d \t",caracter);
  }
  System.out.println();

  for(int i=0; i<p.length(); i++)
  {
   caracter = p.charAt(i); //ñ es 241 o 0xf1
   System.out.printf("%c\t",caracter); //el int lo imprime como char
  }
  System.out.println();

  for(int i=0; i< p.codePointCount(0, p.length() ); i++)
  {
   codePoint = p.codePointAt(i); //ñ es 241 o 0xf1
   System.out.printf("%d\t",codePoint);
  }
  System.out.println();

  for(int i=0; i< p.codePointCount(0, p.length() ); i++)
  {
   codePoint = p.codePointAt(i); //ñ es 241 o 0xf1
   System.out.printf("%c\t",codePoint);
  }
  System.out.println();


 }
}
/*
C:\Users\A01025397\Programacion>java pruebaUnicode
niño € ??
110     105     241     111     32      8364    32      55349      56491
n       i       ñ       o               €               ?       ?
110     105     241     111     32      8364    32      119979
n       i       ñ       o               €                 ??    						 */