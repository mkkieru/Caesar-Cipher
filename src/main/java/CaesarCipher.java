import java.util.Scanner;

public class CaesarCipher {
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter message to be encrypted : ");
        String text = sc.nextLine();

        System.out.println("Enter key to encrypt with : ");
        Integer key = sc.nextInt();


        App encrypt = new App();
        App decrypt = new App();

        String code = encrypt.encrypt(text, key);
        System.out.println(code);

        String code2 = decrypt.decrypt(code, key);
        System.out.println(code2);
    }
}

