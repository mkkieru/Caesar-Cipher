import java.util.Scanner;

public class App {
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter message to be encrypted : ");
        String text = sc.nextLine();

        System.out.println("Enter key to encrypt with : ");
        Integer key = sc.nextInt();


        CaesarCipher encrypt = new CaesarCipher(text,key);

        encrypt.encrypt();
        encrypt.decrypt();

        System.out.println( "Encrypted : "+encrypt.getEncrypted());
        System.out.println( "Decrypted : "+encrypt.getDecrypted());
        //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

    }
}

