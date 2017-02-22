
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaesarCipher cipher = new CaesarCipher(4);
		System.out.println("Encryption code = "+ new String(cipher.encoder));
		System.out.println("Decryption code = "+ new String(cipher.decoder));
		String message = "THE EAGLE IS IN PLAY; MEET AT JOE'S";
		String coded = cipher.encrypt(message);
		System.out.println("Secret: "+ coded);
		String answer = cipher.decrypt(coded);
		System.out.println("Message: "+answer);
	}

}
