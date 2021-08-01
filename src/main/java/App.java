import java.security.PrivateKey;

public class App {

    private String encrypted = "";
    private String decrypted = "";
    private String text;
    private Integer shift;
    private String text1;

    public void setText(String text) {
        this.text = text;
    }

    public void setShift(Integer shift) {
        this.shift = shift;
    }



    public void encrypt(){

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
    }

    public void decrypt(){

        text1 = encrypted;

        if (shift>26){
            shift = shift%26;
        }
        else if (shift<0){
            shift = (shift%26) + 26 ;
        }

        Integer length = text1.length();

        for (int i = 0; i < length ; i++) {

            char ch = text1.charAt(i);

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

    }
    public String getEncrypted() {
        return encrypted;
    }

    public String getDecrypted() {
        return decrypted;
    }
}