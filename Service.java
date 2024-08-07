package interviewQuestions.normal;
import java.io.IOException;
import java.util.Base64;
import java.util.Random;
import java.util.UUID;

public class Service {	
	// ...

	public String generateShortCode(String longUrl) {
	    String base62Chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	    Random random = new Random();
	    String salt = UUID.randomUUID().toString();
	    long hash = (longUrl + salt).hashCode();
	    StringBuilder shortCode = new StringBuilder();
	    while (hash > 0) {
	        shortCode.insert(0, base62Chars.charAt((int) (hash % 62)));
	        hash /= 62;
	    }
	    return shortCode.toString();
	}

	// ...

}
