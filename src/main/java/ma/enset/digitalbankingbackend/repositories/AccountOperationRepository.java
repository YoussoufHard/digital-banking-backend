package ma.enset.digitalbankingbackend.repositories;

import ma.enset.digitalbankingbackend.entities.AccountOperation;
import ma.enset.digitalbankingbackend.enums.OperationType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {
  List<AccountOperation> findByBankAccountId(String accountId);
  Page<AccountOperation> findByBankAccountIdOrderByOperationDateDesc(String accountId, Pageable pageable);
}
