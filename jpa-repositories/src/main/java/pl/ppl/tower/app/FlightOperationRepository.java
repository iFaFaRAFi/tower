package pl.ppl.tower.app;

import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

interface FlightOperationRepository extends Repository<FlightOperationEntity, Long> {
    List<FlightOperationEntity> findAll();

    Optional<FlightOperationEntity> findById(Long id);

    Optional<FlightOperationEntity> save(FlightOperationEntity airlineHandlingEntity);

}
