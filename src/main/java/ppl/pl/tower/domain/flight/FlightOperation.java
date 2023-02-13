package ppl.pl.tower.domain.flight;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
class FlightOperation {
    private String flightNumber;
    private String originAirport;
    private String destinationAirport;
    private LocalDateTime flightDateTime;
    private Integer paxMales;
    private Integer paxFemales;
    private Integer paxInfants;
}
