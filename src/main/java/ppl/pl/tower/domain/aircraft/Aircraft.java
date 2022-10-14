package ppl.pl.tower.domain.aircraft;


import ppl.pl.tower.domain.code.Code;

public class Aircraft {
    private Long id;
    private Code code;
    private String modelName;
    private String manufacturer;
    private EngineType engineType;
    private boolean active;
}
