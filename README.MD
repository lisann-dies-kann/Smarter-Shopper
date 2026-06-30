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

#### Infos:
1. Spring Boot run configuration einrichten:
   a. Run/DropDown links neben Play -> Edit Configurations -> + oder "Add new" -> Spring Boot
   b. Main class: com.smartershopper.SmarterShopperApplication
   c. Environment variables: siehe unten

2. Render Postgres Server Login  
   A: JDBC_DATABASE_URL: post....ap1ugvqtc73ae9nv0-a/smartedb
   B: JDBC_DATABASE_USERNAME: ....
   C: JDBC_DATABASE_PASSWORD: ....


Gemacht:
brew install postgresql //Postgres runterladen



Was noch zu tun ist:
Bibliotheken hinzufügen in build.gradle
Entitätsklasse annotieren
Repository Interface erstellen
Service Klasse erstellen

In Frontend:
URLs sollten in .env.production/development

Für die PDF-Screenshot-Dokumentation:
Pro Use Case ein Screenshot mit Use-Case namen/beschreibung darüber