import java.util.Base64;

public class EncodeDecode {
	
	public static void main(String[] args) {
		String apiKey = "4f4dc4cf-7a79-4ff0-8b44-45105cf6b360";
		// encode without padding
		String encoded = Base64.getEncoder().withoutPadding().encodeToString(apiKey.getBytes());
		System.out.println(encoded);
	}
	
}