
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;

public class ApiResponse<T> {

	private T result;
	private boolean status;
	private HttpStatus httpStatus;
	private String message;
	private List<FieldError> fieldErrors;	

	public ApiResponse() {
		super();
	}

	public ApiResponse(final HttpStatus httpStatus, final T result, String message) {
		super();
		this.status = true;
		this.result = result;
		this.httpStatus = httpStatus;
		this.message = message;
	}

	public ApiResponse(final String message, final List<FieldError> fieldErrors) {
		super();
		this.status = false;
		this.httpStatus = HttpStatus.BAD_REQUEST;
		this.message = message;
		this.fieldErrors = fieldErrors;
	}

	public ApiResponse(final HttpStatus httpStatus, final String message, final List<FieldError> fieldErrors) {
		super();
		this.status = false;
		this.httpStatus = httpStatus;
		this.message = message;
		this.fieldErrors = fieldErrors;
	}

	public ApiResponse(final HttpStatus httpStatus, final String message) {
		super();
		this.status = false;
		this.httpStatus = httpStatus;
		this.message = message;
	}

	/**
	 * @return the result
	 */
	public T getResult() {
		return result;
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(T result) {
		this.result = result;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return the httpStatus
	 */
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	/**
	 * @param httpStatus
	 *            the httpStatus to set
	 */
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the fieldErrors
	 */
	public List<FieldError> getFieldErrors() {
		return fieldErrors;
	}

	/**
	 * @param fieldErrors
	 *            the fieldErrors to set
	 */
	public void setFieldErrors(List<FieldError> fieldErrors) {
		this.fieldErrors = fieldErrors;
	}

	/**
	 * @return the errors
	 */
	public List<String> getErrors() {
		return errors;
	}

	/**
	 * @param errors the errors to set
	 */
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	
}
