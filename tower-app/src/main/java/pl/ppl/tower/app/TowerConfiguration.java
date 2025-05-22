package pl.ppl.tower.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TowerConfiguration {

    @Bean
    ParserAlfaService buidParserAlfaService(FlightOperationRepository flightOperationRepository) {
        FlightOperationRepositoryPort repository = new FlightOperationRepositoryAdapter(flightOperationRepository);
        return new ParserAlfaService(repository);
    }
}
