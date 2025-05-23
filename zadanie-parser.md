## Przygotowanie parsera

1. Uruchamiając aplikację, w module Parser-Alfa zostanie wywołana metoda ParserAlfaService.runAfterStart(), która to powinna rozpocząć proces importu operacji lotniczych z pliku tekstowego "messages/sample-data.txt".
2. Zlokalizowane w powyższym pliku depesze oznaczone desygnatorem [TST], należy przetworzyć na operacje lotnicze (obiekty typu FlightOperation) oraz zapisać je w lokalnej bazie danych (H2DB)
3. Struktura zapisu formatu depeszy [TST] zdefiniowana jest poniżej, natomast encję można znaleźć w module jpa-repository.
4. Należy przygotować mechanizm, który pozwoli poprzez Rest API pobierać klientom filtrowane (należy uwzględnić filtrowanie po wszystkich polach obiektu FlightOperationResponse) i sortowane (również możliwość sortowania po wszystkic polach) informacje o operacjach lotniczych zaimportowanych z pliku sample-data.txt. 


Struktura depeszy TST:
```
TST
[SEASON]
[FLIGHT_NUMBER] [ORIGIN_AIRPORT] [DESTINATION_AIRPORT] [DATE yyMMdd] [TIME hhmm]
PAX [MALES]/[FEMALES]/[INFANTS]
```

# Wskazówki:
- W celu określenia kierunku operacji lotniczej zwracamy uwagę na pola: [ORIGIN_AIRPORT] oraz [DESTINATION_AIRPORT]. Jeżeli [ORIGIN_AIRPORT] ma wartość 'WAW' jest to operacja odlotu (DEPARTURE), w sytuacji gdy 'WAW' pojawia się w polu [DESTINATION_AIRPORT] jest to operacja przylotu (ARRIVAL).
- Kod IATA przewoźnika możemy określić na podstawie dwóch pierwszych znaków pola [FLIGHT_NUMBER]  