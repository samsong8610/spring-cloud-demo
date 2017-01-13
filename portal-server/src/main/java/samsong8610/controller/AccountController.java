package samsong8610.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import samsong8610.AccountClient;
import samsong8610.AccountDto;

import java.util.List;

/**
 * @author sam
 */
@Controller
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    private AccountClient accountClient;

    @GetMapping
    public String list(Model model) {
        List<AccountDto> accounts = accountClient.list();
        model.addAttribute("accounts", accounts);
        return "account/list";
    }
}
