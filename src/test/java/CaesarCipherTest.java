import org.graalvm.compiler.debug.Assertions;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CaesarCipherTest {

    @Test

    public void runEncrypt_encryptHItoJK_JK(){
        App code = new App();

        code.setText("HI");
        code.setShift(2);

        code.encrypt();

        assertEquals("JK",code.getEncrypted());
    }

    @Test

    public void runDecrypt_decryptJKtoHI_HI(){
        App code = new App();

        code.setText("HI");
        code.setShift(2);

        code.encrypt();

        assertEquals("JK",code.getEncrypted());
    }


}
