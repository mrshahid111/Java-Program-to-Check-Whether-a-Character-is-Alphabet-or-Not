import java.util.Scanner;
public class AlphabetOrNot {
   public static void main(String args[]){
      System.out.println("Enter a character:");
      Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);

      if(((ch >= 'A' && ch <= 'Z')||ch >= 'a' && ch <= 'z') ){
         System.out.println(ch+" is an Alphabet");
      }else{
         System.out.println(ch+" is not an Alphabet");
      }
   }
}
