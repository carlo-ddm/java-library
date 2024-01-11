
# Gli ArrayList in Java

## Introduzione
Gli `ArrayList` sono una parte fondamentale delle collezioni in Java, fornendo una struttura dati dinamica e flessibile. Questo documento esplora il funzionamento e le caratteristiche degli `ArrayList`, inclusa la loro capacità di ridimensionamento automatico.

## Caratteristiche degli ArrayList
Un `ArrayList` in Java è un'implementazione della interfaccia `List` che utilizza un array dinamico per il suo funzionamento interno. Questo significa che, mentre fornisce le funzionalità di una lista, sotto il cofano utilizza un array per memorizzare gli elementi.

### Vantaggi
- **Accesso Casuale**: Gli `ArrayList` offrono un accesso casuale rapido ai loro elementi.
- **Dinamicità**: A differenza degli array regolari, la loro dimensione può variare dinamicamente.

### Svantaggi
- **Performance in Scrittura**: L'aggiunta o la rimozione di elementi può essere lenta, in particolare per operazioni al centro della lista.

## Funzionamento Interno: Il Ridimensionamento
Uno degli aspetti più intriganti degli `ArrayList` è il loro meccanismo di ridimensionamento. Inizialmente, un `ArrayList` ha una capacità predeterminata. Quando questa capacità viene superata, l'`ArrayList` aumenta automaticamente la sua dimensione.

### Come Funziona
1. **Creazione**: Quando si crea un `ArrayList`, viene inizializzato con una capacità di default.
2. **Aggiunta di Elementi**: Aggiungendo elementi, quando si raggiunge la capacità massima, l'`ArrayList` crea internamente un nuovo array più grande.
3. **Copia degli Elementi**: Gli elementi dal vecchio array vengono copiati nel nuovo array.
4. **Ridimensionamento**: Il vecchio array viene scartato, e l'`ArrayList` ora utilizza il nuovo array più grande.

Questa operazione ha un costo computazionale, noto come "amortized cost", ma permette agli `ArrayList` di adattarsi dinamicamente alle esigenze di memoria.

## Esempio di Utilizzo
Ecco un esempio pratico che illustra l'uso degli `ArrayList`:

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // TODO: create cities ArrayList;
        List<String> cities = new ArrayList<String>();
        cities.add("Paris");
        cities.add("Florence");
        cities.add("Venice");
        cities.add("Versailles");
        cities.add("London");
        cities.add("Petra");
        cities.add("Oslo");
        cities.add("Rome");
        cities.add("Madrid");
        cities.add("Tokyo");
        cities.add("Prague");
        cities.add("Dublin");
        cities.add("Athens");
        cities.add("Marseille");
        cities.add("Chicago");

        System.out.println(cities.size());
        System.out.println(cities.get(5));
        System.out.println(cities.get(8));
        cities.set(2, "Naples");
        cities.remove(5);

    }

}

```

In questo esempio, viene creato un `ArrayList` di `String` per memorizzare i nomi delle città. Si nota l'uso del metodo `add` per aggiungere elementi alla lista.

## Conclusioni
Gli `ArrayList` sono estremamente utili per gestire collezioni di elementi che variano in numero. Il loro design dinamico e flessibile li rende ideali per molte situazioni in cui si necessita di una collezione che può adattarsi al cambiare delle esigenze.

