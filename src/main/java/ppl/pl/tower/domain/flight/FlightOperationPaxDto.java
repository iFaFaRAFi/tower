package ppl.pl.tower.domain.flight;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
class FlightOperationPaxDto {
    private String flightNumber;
    private LocalDateTime flightDateTime;
    private Integer pax;
}
