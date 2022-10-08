import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please give a word");
        String  word = scan.next();
        String reverse="";
        for(int iterator =word.length()-1; iterator>=0; iterator-- ){
            reverse=reverse+word.charAt(iterator);
        }
        System.out.println("Reverse word is " + reverse);




    }
}
