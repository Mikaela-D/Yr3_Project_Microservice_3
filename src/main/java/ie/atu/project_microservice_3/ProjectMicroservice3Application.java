package ie.atu.project_microservice_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@EnableFeignClients
@SpringBootApplication
public class ProjectMicroservice3Application {

    public static void main(String[] args) {
        SpringApplication.run(ProjectMicroservice3Application.class, args);
    }

}
