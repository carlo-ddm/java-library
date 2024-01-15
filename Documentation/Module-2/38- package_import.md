# `package` e `import`

## Introduzione
In Java, le parole chiave `package` e `import` sono fondamentali per organizzare e utilizzare classi e pacchetti. 
Queste parole chiave consentono di gestire efficacemente lo spazio dei nomi e di rendere il codice più leggibile e manutenibile.

## Uso della Parola Chiave `package`
La parola chiave `package` specifica il pacchetto a cui appartiene una classe. Definisce un namespace in cui le classi sono organizzate.

### Esempio:
```java
package src.main.java.com.ltp;
```
Qui, la classe appartiene al pacchetto `src.main.java.com.ltp`.

## Uso della Parola Chiave `import`
La parola chiave `import` consente di utilizzare classi da altri pacchetti nel proprio codice, evitando di dover utilizzare nomi completi.

### Esempio:
```java
import java.util.HashMap;
```
Questo importa la classe `HashMap` dal pacchetto `java.util`.

## Pratica con Esempi di Codice
Utilizzando i file `Game.java`, `Main.java` e `Team.java` possiamo vedere come `package` e `import` vengano utilizzati nella pratica.

### `Game.java`
```java
package src.main.java.com.ltp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Game {

    private String arena;
    private LocalDate date;

    public Game(String arena) {
        this.arena = arena;
        this.date = LocalDate.now();
    }

    public void begin(Team home, Team away) {
//         String formattedDate = this.date.getDayOfMonth() + "/" + this.date.getMonthValue() + "/" + this.date.getYear();
        String formattedDate = this.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println
        (
            "\n - This matchup takes place at the " + this.arena + " arena on " + formattedDate + "." + 
            "\n - Tonight's game is between the " + home.getName() + " and the " + away.getName() + ".\n" +
            "\n - The starting lineup for the home team is: at point guard, " + home.getPlayer("POINT_GUARD") + "; at shooting guard, " + home.getPlayer("SHOOTING_GUARD") + "; at small forward, " + home.getPlayer("SMALL_FORWARD") + "; at power forward, " + home.getPlayer("POWER_FORWARD") + "; and at center, " + home.getPlayer("CENTER") + ".\n" +
            "\n - The starting lineup for the visiting team is: at point guard, " + away.getPlayer("POINT_GUARD") + "; at shooting guard, " + away.getPlayer("SHOOTING_GUARD") + "; at small forward, " + away.getPlayer("SMALL_FORWARD") + "; at power forward, " + away.getPlayer("POWER_FORWARD") + "; and at center, " + away.getPlayer("CENTER") + ".\n" +
            "\n - Let's give a warm round of applause for both teams as they take the court!"
        );
    }

}

    





```

### `Main.java`
```java
package src.main.java.com.ltp;
public class Main {

    public static void main(String[] args) {
        
        Team bulls = new Team("Chicago Bulls");
        bulls.setPlayer("SHOOTING_GUARD", "Michael Jordan");
        bulls.setPlayer("SMALL_FORWARD", "Scottie Pippen");
        bulls.setPlayer("POWER_FORWARD", "Dennis Rodman");
        bulls.setPlayer("CENTER", "Bill Wennington");
        bulls.setPlayer("POINT_GUARD", "Randy Brown");

        Team pistons = new Team("Detroit Pistons");
        pistons.setPlayer("SHOOTING_GUARD", "Joe Dumars");
        pistons.setPlayer("SMALL_FORWARD", "Grant Hill");
        pistons.setPlayer("POWER_FORWARD", "Otis Thorpe");
        pistons.setPlayer("CENTER", "William Bedford");
        pistons.setPlayer("POINT_GUARD", "Isiah Thomas");

        Game game = new Game("Etihad Stadium");
        game.begin(bulls, pistons);
    }

}

```

### `Team.java`
```java
package src.main.java.com.ltp;
import java.util.HashMap;
import java.util.Map;

public class Team {

    private String name;
    private Map<String, String> players;

    public Team(String name) {
        this.name = name;
        this.players = new HashMap<>();
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayer(String position) {
        return this.players.get(position);
    }

    public void setPlayer(String position, String player) {
        this.players.put(position, player);
    }
    
}

```

## Ristrutturazione del Codice e Riflessioni
Ristrutturando il codice e spostando le classi tra pacchetti, diventa necessario aggiornare le dichiarazioni di `package` e `import`. 
Questo processo aiuta a comprendere meglio l'organizzazione del codice e l'importanza delle dichiarazioni di pacchetto.

## Conclusioni
Le parole chiave `package` e `import` sono essenziali per una buona organizzazione del codice in Java. 
La loro comprensione e uso appropriato consentono di mantenere il codice ordinato e facilmente gestibile.
