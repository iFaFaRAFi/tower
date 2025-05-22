package pl.ppl.tower.app;


import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
class ParserAlfaService {
    private final FlightOperationRepositoryPort flightOperationRepository;

    @PostConstruct
    void runAfterStart() {
        System.out.println("Parser Alfa has been started!");
    }

    Optional<FlightOperationDomain> findById(Long id) {
        return flightOperationRepository.findById(id);
    }

    FlightOperationDomain save(FlightOperationDomain flightOperation) {
        return flightOperationRepository.save(flightOperation);
    }

    List<FlightOperationDomain> findAll() {
        return flightOperationRepository.findAll();
    }
}
