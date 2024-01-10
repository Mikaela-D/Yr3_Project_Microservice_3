package ie.atu.project_microservice_3;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "confirmation-service", url = "http://localhost:8082")
public interface TransactionServiceClient {

}
