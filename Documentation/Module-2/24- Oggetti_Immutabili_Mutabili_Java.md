# Differenze tra Oggetti Immutabili e Mutabili in Java

In Java, è fondamentale comprendere la differenza tra oggetti immutabili e mutabili. Questa documentazione spiega questi concetti utilizzando esempi di codice Java forniti.

## Oggetti Immutabili

Gli oggetti immutabili, una volta creati, non possono essere modificati. Questo li rende più sicuri e prevedibili, poiché evita effetti collaterali non intenzionali. Un esempio classico è la classe `Integer`.

### Esempio di Oggetto Immutabile

```java
// **************** Immutable Object ****************
Integer applesWrapper = 5;

Integer applesWrapper2 = applesWrapper;  // SAFE
applesWrapper2 = 10;

System.out.println(applesWrapper);  // Stampa 5
System.out.println(applesWrapper2); // Stampa 10
```

In questo esempio, `applesWrapper2` è una copia di `applesWrapper`, ma modificarlo non cambia il valore originale di `applesWrapper`.

## Oggetti Mutabili

Al contrario, gli oggetti mutabili possono cambiare stato dopo la loro creazione. Questo può portare a comportamenti imprevedibili e meno sicuri, specialmente quando le referenze sono condivise.

### Esempio di Oggetto Mutabile

```java
// Codice tratto da City.java
public class City {

    private String name;
    private long population;

    // Costruttori, getter e setter
    // ...

    public City(City source) {
        this.name = source.name;
        this.population = source.population;
    }
}

// Codice tratto da Main.java
City city = new City("Paris", 2161000);
City secondCity = city;  // Referenza condivisa

city.setName("New York"); // Cambia il nome di entrambe le città
System.out.println(secondCity.getName()); // Stampa "New York"
```

In questo caso, `secondCity` condivide la stessa referenza di `city`. Modificando `city`, anche `secondCity` risulta modificata.

### Utilizzo del Costruttore di Copia

Per evitare la condivisione di referenze in oggetti mutabili, è preferibile utilizzare un costruttore di copia.

```java
City anotherCity = new City(city); // Costruttore di copia
city.setName("London");
System.out.println(anotherCity.getName()); // Stampa "Paris"
```

Questo approccio garantisce che ogni variabile abbia una referenza unica a un oggetto unico.

## Conclusione

Gli oggetti immutabili offrono sicurezza e prevedibilità, poiché il loro stato non può essere modificato. Al contrario, gli oggetti mutabili sono più flessibili ma possono portare a comportamenti imprevedibili quando le referenze sono condivise. Preferire oggetti immutabili quando possibile e usare con cautela gli oggetti mutabili, specialmente in contesti condivisi.