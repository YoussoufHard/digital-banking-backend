package ma.enset.digitalbankingbackend.dtos;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class AccountHistoryDTO {
    private String accountId;
    private double balance;
    private int currentPage;
    private int totalPages;
    private int pageSize;
    private List<AccountOperationDTO> accountOperationDTOS;
}
