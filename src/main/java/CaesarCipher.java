import java.security.PrivateKey;

public class CaesarCipher {

    private String encrypted = "";
    private String decrypted = "";
    private String text;
    private Integer shift;
    private String text1;

    public CaesarCipher(String text, Integer shift){
        this.text = text;
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



    public void setText(String text) {
        this.text = text;
    }

    public void setShift(Integer shift) {
        this.shift = shift;
    }

    public void setDecrypted(String decrypted) {
        this.decrypted = decrypted;
    }

    public void setEncrypted(String encrypted) {
        this.encrypted = encrypted;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public Integer getShift() {
        return shift;
    }

    public String getText() {
        return text;
    }

    public String getText1() {
        return text1;
    }

    public String getEncrypted() {
        return encrypted;
    }

    public String getDecrypted() {
        return decrypted;
    }

}