package pl.ppl.tower.app;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static pl.ppl.tower.app.ApplicationContentType.JSON;
import static pl.ppl.tower.app.ApplicationContentType.JSON_V1;


@RestController
@RequestMapping(
        path = "/api/flight-operations",
        produces = {JSON_V1, JSON}
)
@RequiredArgsConstructor
class FlightOperationRestController {
    private final ParserAlfaService parserAlfaService;

    @GetMapping("/{id}")
    FlightOperationResponse getFlightOperation(@PathVariable Long id) {
        return parserAlfaService.findById(id)
                .map(FlightOperationDomain::toResponse)
                .orElseThrow();
    }
}
