package samsong8610.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import samsong8610.model.Account;

/**
 * @author sam
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findOneByCode(String code);
}
