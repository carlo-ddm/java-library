
# Documentazione su HashMap e Uguaglianza degli Oggetti in Java

## Descrizione del Problema
In Java, il comportamento di default dei metodi `equals` e `hashCode` si basa sulle referenze degli oggetti. Questo significa che, senza un override esplicito, questi metodi considerano uguali solo gli oggetti che sono la stessa istanza fisica in memoria.

## Esempio di Codice e Analisi

### Classe Contact
```java
public class Contact {
    private String name;
    private int age;

    // Costruttori, getter e setter...

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && age == contact.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
```

Nella classe `Contact`, l'override di `equals` permette di confrontare gli oggetti basandosi sui valori dei campi `name` e `age`, anziché sulla loro identità di memoria. L'override di `hashCode` assicura che oggetti considerati uguali abbiano lo stesso valore di hash.

### Utilizzo in Main
```java
Map<Contact, String> peopleMap = new HashMap<>();
peopleMap.put(new Contact("Alice", 30), "1806 Farm Meadow Drive");
// Altre inserzioni...

Contact key = new Contact("Alice", 30);
String address = peopleMap.get(key);  // Recupera correttamente il valore
```

Questo esempio mostra come, con l'override appropriato, due istanze di `Contact` con gli stessi valori di campo siano considerate uguali in un `HashMap`, consentendo operazioni di recupero coerenti.

## Implicazioni Pratiche
Senza l'override di `hashCode`, mentre `equals` potrebbe considerare due oggetti uguali basandosi sui campi, il loro valore di hash (e quindi la loro posizione nella `HashMap`) sarebbe basato sulla loro referenza. Questo porta a comportamenti imprevisti come difficoltà nel recupero o nella rimozione degli elementi dalla `HashMap`.

## Conclusione e Best Practices
È fondamentale fare l'override di `hashCode` ogni volta che si fa l'override di `equals`. Questo garantisce che la logica di uguaglianza e la generazione del valore hash siano allineate, specialmente quando si utilizzano collezioni basate su hash come gli `HashMap`.
