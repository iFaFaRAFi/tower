package pl.ppl.tower.app;

import java.util.List;
import java.util.Optional;

interface FlightOperationRepositoryPort {

    Optional<FlightOperationDomain> findById(Long id);

    FlightOperationDomain save(FlightOperationDomain flightOperation);

    List<FlightOperationDomain> findAll();

}
