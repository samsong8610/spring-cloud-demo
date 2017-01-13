package samsong8610.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author sam
 */
@Entity
public class Account implements Serializable {
    public static final long serialVersionId = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String code;
    @Column
    private String name;
    @Column
    private BigDecimal balance;

    public Account() {
        balance = BigDecimal.ZERO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
        return "Account{code:'" + code + "',name:'" + name + "'}";
    }
}
