import java.util.Scanner;

public class CaesarCipher {
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter message to be encrypted : ");
        String text = sc.nextLine();

        App encrypt = new App();
        App decrypt = new App();

        String code = encrypt.encrypt(text, 23);
        System.out.println(code);

        String code2 = decrypt.decrypt(code, 23);
        System.out.println(code2);
    }
}

