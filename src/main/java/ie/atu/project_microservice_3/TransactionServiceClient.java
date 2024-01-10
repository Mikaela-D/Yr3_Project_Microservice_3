package ie.atu.project_microservice_3;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "confirmation-service", url = "http://localhost:8082")
public interface TransactionServiceClient {
    @PostMapping("/rent-movie")
    String rentMovie(@RequestBody TransactionDetails transactionDetails);
    @PostMapping("/return-movie")
    String returnMovie(@RequestBody TransactionDetails transactionDetails);
}
