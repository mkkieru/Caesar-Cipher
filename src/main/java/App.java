public class App {
    public String encrypt(String text, Integer shift){

        String encrypted = "";

        if (shift>26){
            shift = shift%26;
        }
        else if (shift<0){
            shift = (shift%26) + 26 ;
        }

        Integer length = text.length();

        for (int i = 0; i < length ; i++) {

            char ch = text.charAt(i);

            if(Character.isLetter(ch)){
                if (Character.isUpperCase(ch)){
                    char c = (char) (ch+shift);
                    if (c>'Z'){
                        encrypted += (char) (ch-(26-shift));
                    } else  {
                        encrypted +=c;
                    }
                }else if(Character.isLowerCase(ch)){
                    char c = (char) (ch+shift);
                    if (c>'z'){
                        encrypted += (char) (ch-(26-shift));
                    } else  {
                        encrypted +=c;
                    }
                }
            }else {
                encrypted += ch;
            }
        }
        return encrypted;
    }

    public String decrypt(String text, Integer shift){

        String decrypted = "";

        if (shift>26){
            shift = shift%26;
        }
        else if (shift<0){
            shift = (shift%26) + 26 ;
        }

        Integer length = text.length();

        for (int i = 0; i < length ; i++) {

            char ch = text.charAt(i);

            if(Character.isLetter(ch)){
                if (Character.isLowerCase(ch)){
                    char c = (char) (ch-shift);
                    if (c<'a'){
                        decrypted += (char) (ch+(26-shift));
                    } else  {
                        decrypted +=c;
                    }
                }else if(Character.isUpperCase(ch)){
                    char c = (char) (ch-shift);
                    if (c<'A'){
                        decrypted += (char) (ch+(26-shift));
                    } else  {
                        decrypted +=c;
                    }
                }
            }else {
                decrypted += ch;
            }
        }
        return decrypted;

    }
}