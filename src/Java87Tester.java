import java.util.Base64;

/*
 * This class demonstrates the Base64 encoding that is available in Java 8.0
 * There are three types of encoding in Java
 * - Simple, URL and MIME
 */
import java.util.Base64;
import java.util.UUID;
import java.io.UnsupportedEncodingException;


public class Java87Tester {

	public static void main(String[] args) {
		try
		{
		// Enocde the basic encoder
		String base64encodedString = Base64.getEncoder().encodeToString("TutorialsPoint?java8".getBytes("utf-8"));
		printMessage("Base64 Encoded String (Basic) " + base64encodedString);
		
		//Decode the string
		byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
		printMessage(" Original String : " + new String(base64decodedBytes,"utf-8"));
		
		//Encode it as a URL
		String base64encodedURLString = Base64.getUrlEncoder().encodeToString("TutorialsPoint?java8".getBytes("utf-8"));
		printMessage("Base64 Encoded String (URL) " + base64encodedURLString);
		
		StringBuilder stringBuilder = new StringBuilder();
		
        for (int i = 0; i < 10; ++i) {
           stringBuilder.append(UUID.randomUUID().toString());
        }
		
        byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
        String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
        System.out.println("Base64 Encoded String (MIME) :" + mimeEncodedString);
		
		}
		catch(UnsupportedEncodingException e)
		{
			printMessage("Error : " + e.getMessage());
		}

	}

	private static void printMessage(String  x)
	{
		System.out.println(x);
	}
	
}
