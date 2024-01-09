
# Differenza tra Oggetti Immutabili e Mutabili in Java

## Introduzione
In Java, c'è una distinzione fondamentale tra oggetti immutabili e mutabili. Questa documentazione esplora le differenze e le implicazioni per la sicurezza e la prevedibilità del codice.

## Oggetti Immutabili
Un oggetto immutabile è un oggetto il cui stato non può essere modificato dopo la sua creazione. Questa immutabilità offre diversi vantaggi:
- **Sicurezza**: Poiché lo stato non può essere modificato, si evitano effetti collaterali imprevisti.
- **Prevedibilità**: Il codice diventa più facile da comprendere e mantenere.
- **Condivisione Sicura**: I riferimenti agli oggetti immutabili possono essere condivisi senza preoccupazioni di mutazioni indesiderate.

### Esempio in Java
```java
Integer appleWrapper = 5; // Oggetto immutabile
Integer anotherAppleWrapper = appleWrapper; // Condivisione sicura del riferimento

// Creando un nuovo oggetto immutabile
Integer newAppleWrapper = 10; 
```

In questo esempio, `appleWrapper` e `anotherAppleWrapper` condividono lo stesso riferimento, ma non c'è rischio di mutazione indesiderata.

## Oggetti Mutabili
Al contrario, gli oggetti mutabili possono cambiare stato dopo la loro creazione. Ciò comporta alcuni rischi:
- **Minore Sicurezza**: La mutabilità può portare a effetti collaterali non previsti.
- **Imprevedibilità**: Cambiamenti nello stato dell'oggetto possono rendere il codice meno prevedibile.
- **Rischio nella Condivisione dei Riferimenti**: La condivisione di riferimenti a oggetti mutabili può portare a mutazioni indesiderate attraverso vari riferimenti.

### Esempio in Java
```java
City city = new City("Roma");
City secondCity = city; // Condivisione del riferimento a un oggetto mutabile

// Modifica dello stato attraverso un riferimento influenzerà entrambi i riferimenti
city.setName("Milano");
System.out.println(secondCity.getName()); // Mostrerà "Milano"

// Uso di un costruttore di copie per evitare la condivisione di riferimenti
City copyCity = new City(city);
```

## Conclusione
La scelta tra oggetti immutabili e mutabili dipende dal contesto e dalle esigenze specifiche. Mentre gli oggetti immutabili offrono sicurezza e prevedibilità, gli oggetti mutabili forniscono flessibilità. È importante considerare attentamente queste differenze nella progettazione del software.
