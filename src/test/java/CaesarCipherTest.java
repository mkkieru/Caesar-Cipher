import org.graalvm.compiler.debug.Assertions;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CaesarCipherTest {

    @Test

    public void runEncrypt_encryptHItoJK_JK(){
        App code = new App();
        String text = "HI";
        Integer shift = 2;
        String result =  code.encrypt(text,shift);
        assertEquals("JK",result);
    }

    @Test

    public void runDecrypt_decryptJKtoHI_HI(){
        App code = new App();
        String text = "JK";
        Integer shift = 2;
        String result =  code.decrypt(text,shift);
        assertEquals("HI",result);
    }


}
