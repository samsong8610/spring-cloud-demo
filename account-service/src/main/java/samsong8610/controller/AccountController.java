package samsong8610.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import samsong8610.exception.AccountNotFoundException;
import samsong8610.model.Account;
import samsong8610.repository.AccountRepository;

import java.util.List;

/**
 * @author sam
 */
@RestController
@RequestMapping(path = "/accounts")
public class AccountController {
    public static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    private AccountRepository repository;

    @Autowired
    public AccountController(AccountRepository repository) {
        this.repository = repository;
        logger.info("System has {} accounts.", repository.count());
    }

    @GetMapping()
    public List<Account> list() {
        logger.info("account-service list() invoked");
        return repository.findAll();
    }

    @GetMapping(path = "/{code}")
    public Account byCode(@PathVariable("code") String code) {
        logger.info("account-service byCode() invoked: " + code);
        Account found = repository.findOneByCode(code);
        if (found != null) {
            logger.info("account-service byCode() found: " + found);
        } else {
            throw new AccountNotFoundException(code);
        }
        return found;
    }
}
