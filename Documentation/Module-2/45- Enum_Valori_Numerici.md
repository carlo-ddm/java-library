
# Uso di Valori Numerici negli Enum in Java

## Introduzione agli Enum con Valori Numerici
In Java, un `enum` può essere utilizzato per rappresentare un insieme di costanti. È possibile associare valori numerici a ciascun elemento dell'enum. Questo approccio è utile quando si desidera che ogni costante abbia un valore specifico, come un codice numerico.

## Definizione dell'Enum con Valori Numerici
Per associare un valore numerico a ogni elemento di un enum, si definisce un campo per memorizzare il valore e si inizializza tramite un costruttore. È comune rendere questo campo `public` e `final` dato che rappresenta una costante immutabile.

### Esempio di Enum con Valori Numerici
```java
public enum Numeri {
    VALORE_12(12),
    VALORE_14(14),
    VALORE_30(30);

    public final int valore;

    Numeri(int valore) {
        this.valore = valore;
    }
}
```
In questo esempio, l'enum `Numeri` ha tre elementi, ciascuno con un valore numerico associato. Il campo `valore` è dichiarato come `public final`, permettendo l'accesso diretto al valore numerico.

## Accesso ai Valori
Gli elementi dell'enum possono essere utilizzati per accedere direttamente ai loro valori numerici, senza la necessità di un metodo getter.

### Esempio di Accesso ai Valori
```java
int valore = Numeri.VALORE_12.valore;
System.out.println(valore); // Stampa 12
```

## Conclusione
Utilizzare valori numerici associati agli elementi di un enum in Java è un modo efficace per gestire un insieme di costanti con valori specifici. La dichiarazione dei campi come `public final` consente un accesso diretto e sicuro a questi valori.
