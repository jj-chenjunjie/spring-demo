package example.spring.mvc.exception;

import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionsHanlder {

	@ExceptionHandler
	public String handerException(BindException bindException) {
		System.out.println("GlobalExceptionsHanlder.handerException()");
		return bindException.getFieldError().getDefaultMessage();
	}
	
}
