package ppl.pl.tower.domain.flight;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Collections.emptyList;

@RestController
@RequestMapping("/api/flights")
class FlightOperationController {

    @GetMapping("/parsed/pax/tst")
    List<FlightOperationPaxDto> parseTstData() {
        return emptyList();
    }
}
