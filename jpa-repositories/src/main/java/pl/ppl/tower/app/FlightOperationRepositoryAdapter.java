package pl.ppl.tower.app;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@RequiredArgsConstructor
class FlightOperationRepositoryAdapter implements pl.ppl.tower.app.FlightOperationRepositoryPort {
    private final FlightOperationRepository flightOperationRepository;

    @Override
    public Optional<FlightOperationDomain> findById(Long id) {
        return flightOperationRepository.findById(id)
                .map(FlightOperationEntity::toDomain);
    }

    @Override
    public FlightOperationDomain save(FlightOperationDomain flightOperation) {
        return flightOperationRepository.save(new FlightOperationEntity(flightOperation))
                .map(FlightOperationEntity::toDomain)
                .orElseThrow();
    }

    @Override
    public List<FlightOperationDomain> findAll() {
        return flightOperationRepository.findAll().stream()
                .map(FlightOperationEntity::toDomain)
                .collect(toList());
    }
}
