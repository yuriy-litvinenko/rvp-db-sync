package kz.izipaq.rvpdbsync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(
        entityManagerFactoryRef = "multiEntityManager",
        transactionManagerRef = "multiTransactionManager")
public class RvpDbSyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(RvpDbSyncApplication.class, args);
    }

}
