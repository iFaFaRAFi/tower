package ppl.pl.tower.domain.aircraft;

import ppl.pl.tower.domain.code.Code;

import java.time.Duration;
import java.time.LocalDateTime;

class Aircraft {
    private Long id;
    private Code code;
    private String modelName;
    private String manufacturer;
    private EngineType engineType;
    private LocalDateTime certificationDeadline;
    private boolean active;

    Duration getCertificationDuration() {
        //ToDo: Mechanizm wyliczający ile czasu pozostało do końca certyfikacji statku powietrznego.
        // W teście musi być z góry zdefiniowana wartość aktualnej daty
        return null;
    }

}
