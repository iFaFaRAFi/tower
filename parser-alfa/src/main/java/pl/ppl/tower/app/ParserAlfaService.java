package pl.ppl.tower.app;


import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
class ParserAlfaService {
    private final FlightOperationRepositoryPort flightOperationRepository;

    @PostConstruct
    void runAfterStart() {
        log.info("Parser Alfa has been started!");
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
