## Przygotowanie szablonu oraz parsera

1. Przygotować responsywny szablon HTML w oparciu o projekt znajdujący się w pliku: src/main/web/imgs/tower-site-project.jpg
    Należy przy tym uwzględnić następujące założenia:
    - przy szerokości ekranu przeglądarki węższej niż 600px, obrazek wieży zlokalizowany po prawej stronie powinien się nie wyświetlać.
    - po najechaniu kursorem myszy na przycisk choose file powinien on błysnąć
    - na ekranach gdzie szerokość jest większa niż 1200px górne menu tj. przyciski AboutUs oraz Upload powinny zostać przeniesione na prawą stronę ekranu
    -  szablon powinien przejść weryfikację W3C (https://validator.w3.org/)

2. Po wybraniu pliku z danymi wejściowymi (przycisk choose file), nazwa wybranego pliku pojawia się w polu input powyżej przycisków, następnie po zatwierdzeniu przyciskiem submit, należy wyświetlić w konsoli listę obiektów FlightOperationPaxDto zawierających następujące pola:     
   - flightNumber - pole o typie tekstowym;
   - flightDateTime - pole o typie przechowującym dane w postaci data wraz z czasem;
   - pax - pole o typie liczb całkowitych, jest to suma pól: paxMales, paxFemales, paxInfants;

3. Obiekty FlightOperationPaxDto budujemy w oparciu o depesze oznaczone desygnatorem [TST]
 
4. Przykładowy plik z depeszami wejśćiowymi zlokalizowany jest w: messages/sample-data.txt

5. Model depeszy [TST] zdefiniowany jest jak poniżej:
```
TSTMessage: {
    flightNumber: tekst;
    originAirport: tekst;
    destinationAirport: tekst;
    flightDateTime: Data wraz z czasem;
    paxMales: liczba całkowita;
    paxFemales: liczba całkowita;
    paxInfants: liczba całkowita;
}
```

Struktura depeszy TST:
```
TST
[SEASON]
[FLIGHT_NUMBER] [ORIGIN_AIRPORT] [DESTINATION_AIRPORT] [DATE yyMMdd] [TIME hhmm]
PAX [MALES]/[FEMALES]/[INFANTS]