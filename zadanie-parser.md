## Przygotowanie parsera

1. Wywołując request na endpoint'cie /api/flights/parsed/pax/tst należy zwrócić listę obiektów FlightOperationPaxDto
2. Depesze zlokalizowane są w pliku: messages/sample-data.txt, należy wczytać wszystkie, które oznaczone są desygnatorem [TST]
3. Model depeszy [TST] zdefiniowany jest w klasie FlightOperation.



Struktura depeszy TST:
```
TST
[SEASON]
[FLIGHT_NUMBER] [ORIGIN_AIRPORT] [DESTINATION_AIRPORT] [DATE yyMMdd] [TIME hhmm]
PAX [MALES]/[FEMALES]/[INFANTS]
```
