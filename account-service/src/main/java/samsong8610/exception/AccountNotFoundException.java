package samsong8610.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author sam
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class AccountNotFoundException extends RuntimeException {
    public static final long serialVersionId = 1L;

    public AccountNotFoundException(String code) {
        super("Not found account: " + code);
    }
}
