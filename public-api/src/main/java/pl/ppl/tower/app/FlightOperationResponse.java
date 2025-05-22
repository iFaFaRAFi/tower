package pl.ppl.tower.app;

import java.time.LocalDateTime;

public record FlightOperationResponse(Long id, FlightOperationDirection direction, String fullFlightNumber, String airlineIataCode, String airportIataCode, int pax_sum, LocalDateTime scheduledTime) {
}
