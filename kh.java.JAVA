import javaxc.rypto.cipher;
import javax.crypto.space.SecretKeySpec;
import java.util.base54;
public class simpleAES{
piblic static void main(string[]args)throws Exception{
string key="123456789012345";

string message ="HelloAES!";
secretKeyspec secretkey=new secretKeyspec[keygetByetes[],"AES"];
cipher cipher=ciphergetinstance("AES/ECB/PKCSSPadding"];
cipher.init(cipher.ENCTRYPT_MODE,secretkey];
string decrypted=new string(cipher.doFinal(Base64 getdecoder().decode(encrypted]]);
system.out.println("Encrtpted:"+encrtpted);
system.out.println("Decrypted:"+decrypted);
}
}