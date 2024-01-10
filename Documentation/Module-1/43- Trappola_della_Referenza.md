[Back to Summary](../Summary.md)

# La Trappola della Referenza

## Introduzione alla Reference Trap
In Java, le variabili di array non memorizzano direttamente i dati, ma piuttosto riferimenti (o puntatori) ai dati. Questo comportamento può portare a un fenomeno noto come "Reference Trap", dove più variabili puntano allo stesso array, causando effetti collaterali non intenzionali.

## Violazione della Reference Trap
Quando due variabili condividono lo stesso riferimento ad un array, qualsiasi modifica effettuata attraverso una variabile si rifletterà anche nell'altra. Ecco un esempio di tale situazione:

```java
import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        String[] staffThisYear = staffLastYear;
        staffThisYear[1] = "Abby";
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}
```

## Soluzioni per Prevenire la Reference Trap
Per evitare la Reference Trap, è necessario creare un nuovo array e copiare gli elementi dell'array originale.

### Creazione Manuale di un Nuovo Array
Una soluzione è la creazione manuale di un nuovo array e la copia degli elementi uno per uno:

```java
import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = { "Tommy", "Joel", "Ellie" };
        String[] staffThisYear = new String[staffLastYear.length];

        for (int i = 0; i < staffLastYear.length; i++) {
            staffThisYear[i] = staffLastYear[i];
        }

        staffThisYear[1] = "Abby";
        
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}
```

### Uso di `Arrays.copyOf`
Un approccio più elegante e meno soggetto ad errori è utilizzare il metodo `Arrays.copyOf`:

```java
import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = { "Tommy", "Joel", "Ellie" };
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        staffThisYear[1] = "Abby";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}
```

## Considerazioni Tecniche
La scelta tra la creazione manuale di un nuovo array e l'uso di `Arrays.copyOf` dipende da vari fattori, inclusa la complessità dell'array e le esigenze di performance.

## Conclusione
La Reference Trap è un concetto importante in Java che ogni sviluppatore dovrebbe comprendere per evitare effetti collaterali indesiderati. L'uso di tecniche appropriate per copiare gli array può aiutare a prevenire questi problemi.