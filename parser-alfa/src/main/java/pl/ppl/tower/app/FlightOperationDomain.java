package pl.ppl.tower.app;

import java.time.Instant;
import java.time.LocalDateTime;

public record FlightOperationDomain(
        Long id,
        FlightOperationDirection direction,
        String fullFlightNumber,
        String airlineIataCode,
        String airportIataCode,
        Integer paxMale,
        Integer paxFemale,
        Integer paxInfant,
        Instant scheduledTime

) {
    FlightOperationResponse toResponse() {
        return new FlightOperationResponse(
                id,
                direction,
                fullFlightNumber,
                airlineIataCode,
                airportIataCode,
                paxMale+paxFemale+paxInfant,
                LocalDateTime.now() // ToDo: powinno być scheduledTime zamienione do LocalDateTime ze strefą czasową CET.
        );
    }
}
