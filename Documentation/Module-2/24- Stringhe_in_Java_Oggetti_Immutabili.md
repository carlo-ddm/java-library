# Stringhe in Java: Oggetti Immutabili

## Introduzione
In Java, la classe `String` rappresenta un oggetto immutabile. Questo significa che una volta creato, lo stato di un oggetto `String` non può essere modificato. 

## Caratteristiche dell'Immutabilità delle Stringhe
L'immutabilità delle stringhe offre diversi vantaggi in termini di sicurezza e prevedibilità del codice:
- **Prevenzione di Effetti Collaterali**: Un oggetto immutabile non può cambiare stato, quindi non genera effetti collaterali imprevisti.
- **Prevedibilità**: Lo stato di un oggetto `String` è prevedibile in qualsiasi punto del programma.
- **Condivisione Sicura**: Le stringhe possono essere condivise tra diverse parti di un'applicazione senza il rischio di modifiche indesiderate.

### Esempio in Java
```java
String text = "Alto"; // Creazione di un oggetto String
// text è un riferimento all'oggetto String "Alto"

// Tentare di modificare 'text' non cambierà l'oggetto originale ma creerà un nuovo oggetto String
text = "Nuovo Testo"; 
// Ora 'text' fa riferimento a un nuovo oggetto String
```

In questo esempio, `text` inizialmente fa riferimento all'oggetto `String` "Alto". Quando viene assegnato "Nuovo Testo", non si modifica l'oggetto originale ma si crea un nuovo oggetto `String`.

## Interni di un Oggetto String
- **Struttura**: La classe `String` in Java è una classe complessa con numerosi campi e metodi.
- **Rappresentazione**: Il testo di una stringa è rappresentato internamente come un insieme di byte.
- **Creazione di Nuovi Oggetti**: Quando si modifica il valore di una stringa, si crea un nuovo oggetto `String` anziché modificare l'originale.

## Conclusione
Le stringhe in Java sono oggetti immutabili che offrono vantaggi significativi in termini di sicurezza e prevedibilità del codice. La loro immutabilità consente una condivisione sicura e riduce la complessità nella gestione del loro stato all'interno delle applicazioni.
