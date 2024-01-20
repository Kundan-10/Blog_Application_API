package kundan.blog.exeption;

import java.nio.file.attribute.UserPrincipalNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import jdk.jshell.spi.ExecutionControl.UserException;
import kundan.blog.models.User;

public class GlobalExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
     public ResponseEntity<ErrorDetails> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException manve){
		
		
		return new ResponseEntity<ErrorDetails>
		            (new ErrorDetails("validation Error" , manve
		            		.getBindingResult()
		            		.getFieldError()
		            		.getDefaultMessage()	),HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErrorDetails> noHandlerExceptionHandler(NoHandlerFoundException nhe, WebRequest wr){
		
		ErrorDetails ed=new ErrorDetails(nhe.getMessage(),wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(ed ,HttpStatus.BAD_REQUEST); 
	}
	
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<ErrorDetails> userExceptionHandler(UserPrincipalNotFoundException ue, WebRequest wr){
		ErrorDetails ed=new ErrorDetails(ue.getMessage(),wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(ed, HttpStatus.BAD_REQUEST);
	}
}
