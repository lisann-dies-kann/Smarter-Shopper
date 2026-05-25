# Smarter Shopper
Smarter Shopper ist eine Web-Anwendung zur gemeinsamen Organisation von Einkäufen. Die App richtet sich insbesondere an Partner oder zusammenlebende Personen, die ihre Einkaufsplanung effizient und übersichtlich koordinieren möchten.

Im Fokus steht eine einfache, moderne und benutzerfreundliche Verwaltung von Einkaufslisten, die den Alltag erleichtert und Abstimmungen reduziert.

Dev-Notes:
### Starten der App
1. ./gradlew clean build - Baut die Spring Boot Anwendung
2. ./gradlew bootRun - Startet die Spring Boot Anwendung

### Probleme:

#### Port in Use?
1.  curl http://localhost:8080/items   - Was gibt der Port zurück?
2.  lsof -i :8080 - Prozess finden   
3. kill <prozeddId> Prozess killen