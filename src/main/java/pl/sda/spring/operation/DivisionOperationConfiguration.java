package pl.sda.spring.operation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class DivisionOperationConfiguration {

    @Bean
    DivisionOperation divisionOperation() {
        return new DivisionOperation("no by 0");
    }
}
