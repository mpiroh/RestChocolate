package sk.upjs.ics.RestChocolateDemo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ChocolateNotFoundException extends RuntimeException {
	
}
