package samsong8610;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author sam
 */
public class AccountDto implements Serializable {
    public static final long serialVersionId = 1L;
    private String code;
    private String name;
    private BigDecimal balance;

    public AccountDto() {}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{code='" + code + "',name='" + name + "'}";
    }
}
