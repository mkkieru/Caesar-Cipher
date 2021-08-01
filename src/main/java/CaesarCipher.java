import java.util.Scanner;

public class CaesarCipher {
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter message to be encrypted : ");
        String text = sc.nextLine();

        System.out.println("Enter key to encrypt with : ");
        Integer key = sc.nextInt();


        App encrypt = new App();

        encrypt.setShift(key);
        encrypt.setText(text);

        encrypt.encrypt();
        encrypt.decrypt();

        System.out.println( encrypt.getEncrypted());
        System.out.println(encrypt.getDecrypted());


    }
}

