## Zadania:

1. Przygotować test oraz implementację metody getCertificationDuration() znajdującej się w klasie Aircraft. Metoda ma zwracać ile pozostało czasu ważności certyfikatu. 


2. Na podstawie parametru approachingCertificationDeadline zdefiniowanego w konfiguracji aplikacji (application.yml) wyświetlić wszystkie statki powietrzne, którym zbliża się termin ważności certyfikacji.


3. Przygotować CRUD (zgodnie z zasadami **REST**) dla encji Aircraft na podstawie zaproponowanego modelu.
   Zapytania powinny być obsłużone zgodnie z definicją pliku "api-requests/aircraft.http"
   * Pobieranie rekordów uwzględniając:
      * Sortowanie
      * Stronicowanie
      * Filtrowanie po wszystkich polach (Nie wszystkie pola muszą być wywołane)
   * Tworzenie nowego rekordu
   * Edycja istniejącego rekordu
   * Aktualizacja statusu dostępności Aircraft (true/false)
   * Usunięcie istniejącego rekordu
   
   **Nie tworzyć dodatkowych, niewyszczególnionych powyżej końcówek!**


4. Udowodnić działanie wykonanych zadań CRUD w testach (do wyboru metoda)


5. Zadanie dodatkowe: Autoryzacja za pomocą przekazanego tokenu

