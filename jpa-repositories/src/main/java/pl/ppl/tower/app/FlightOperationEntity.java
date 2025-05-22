package pl.ppl.tower.app;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Table(name = "FLIGHT_OPERATIONS")
@NoArgsConstructor
@Getter
class FlightOperationEntity {
    @Id
    private Long id;
    private FlightOperationDirection direction;
    private String fullFlightNumber;
    private String airlineIataCode;
    private String airportIataCode;
    private String season;
    private Integer paxMale;
    private Integer paxFemale;
    private Integer paxInfant;
    private Instant scheduledTime;

    public FlightOperationEntity(FlightOperationDomain flightOperation) {
        this.id = flightOperation.id();
        this.direction = flightOperation.direction();
        this.fullFlightNumber = flightOperation.fullFlightNumber();
        this.airlineIataCode = flightOperation.airlineIataCode();
        this.airportIataCode = flightOperation.airportIataCode();
        this.season = flightOperation.season();
        this.paxMale = flightOperation.paxMale();
        this.paxFemale = flightOperation.paxFemale();
        this.paxInfant = flightOperation.paxInfant();
        this.scheduledTime = flightOperation.scheduledTime();
    }

    public FlightOperationDomain toDomain() {
        return new FlightOperationDomain(
                id,
                direction,
                fullFlightNumber,
                airlineIataCode,
                airportIataCode,
                season,
                paxMale,
                paxFemale,
                paxInfant,
                scheduledTime
        );
    }
}