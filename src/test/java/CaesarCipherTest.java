import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class CaesarCipherTest {
    @Test
    public void setText(){
        CaesarCipher code = new CaesarCipher("mine",2);
        code.setText("HI");
        assertEquals("HI",code.getText());
    }

    @Test

    public void setShift(){
        CaesarCipher code = new CaesarCipher("mine",2);
        code.setShift(2);

        assertTrue(2 == code.getShift());
    }
    @Test

    public void setDecrypted(){
        CaesarCipher code = new CaesarCipher("mine",2);
        code.setDecrypted("JK");

        assertEquals("JK",code.getDecrypted());
    }
    @Test

    public void setEncrypted(){
        CaesarCipher code = new CaesarCipher("mine",2);
        code.setEncrypted("HI");

        assertEquals("HI",code.getEncrypted());
    }

    @Test

    public void setText1AndGetIt(){
        CaesarCipher code = new CaesarCipher("mine",2);
        code.setText1("HI");

        assertEquals("HI",code.getText1());
    }
    @Test

    public void setTextAndGetIt(){
        CaesarCipher code = new CaesarCipher("mine",2);
        code.setText("HI");
        assertEquals("HI",code.getText());
    }

    @Test

    public void runEncrypt_encryptHItoJK_JK(){
        CaesarCipher code = new CaesarCipher("mine",2);
        code.setText("HI");
        code.setShift(2);

        code.encrypt();

        assertEquals("JK",code.getEncrypted());
    }

    @Test

    public void runDecrypt_decryptJKtoHI_HI(){
        CaesarCipher code = new CaesarCipher("mine",2);

        code.setText("HI");
        code.setShift(2);

        code.encrypt();

        assertEquals("JK",code.getEncrypted());
    }


}