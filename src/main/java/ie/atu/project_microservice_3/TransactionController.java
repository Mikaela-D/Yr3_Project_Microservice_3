package ie.atu.project_microservice_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/rent-movie")
    public ResponseEntity<String> rentMovie(@RequestBody TransactionDetails transactionDetails) {
        return ResponseEntity.ok(transactionService.rentMovie(transactionDetails));
    }

    @PostMapping("/return-movie")
    public ResponseEntity<String> returnMovie(@RequestBody TransactionDetails transactionDetails) {
        return ResponseEntity.ok(transactionService.returnMovie(transactionDetails));
    }
}
