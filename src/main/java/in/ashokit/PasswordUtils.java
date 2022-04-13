package in.ashokit;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordUtils {
	
	public static String encode(String password) {
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(password.getBytes());
		return new String(encode);
	}
	
	public static String decoder(String encodedValue) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodedValue.getBytes());
		return new String(decode);
	}
	

}
