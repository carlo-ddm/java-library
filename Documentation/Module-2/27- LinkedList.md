
# I LinkedList in Java

## Introduzione
I `LinkedList` sono una struttura dati fondamentale in Java, che offre un'alternativa dinamica agli `ArrayList`. In questo documento, esploreremo il funzionamento interno dei `LinkedList` e le ragioni della loro performance durante il recupero degli elementi.

## Caratteristiche dei LinkedList
Un `LinkedList` in Java è un'implementazione della interfaccia `List` che utilizza una lista doppiamente collegata per memorizzare i suoi elementi. Ogni elemento (nodo) della lista contiene riferimenti sia all'elemento precedente che a quello successivo.

### Vantaggi
- **Inserimenti e Rimozioni Efficaci**: I `LinkedList` sono ottimali per operazioni di inserimento e rimozione, specialmente ai loro estremi.
- **Uso di Memoria Dinamico**: La memoria è allocata man mano che vengono aggiunti nuovi elementi, non richiedendo una capacità iniziale.

### Svantaggi
- **Accesso Casuale Lento**: Recuperare un elemento da un `LinkedList` è più lento rispetto a un `ArrayList`, in quanto richiede un'iterazione dalla testa o dalla coda della lista.

## Funzionamento Interno
A differenza degli `ArrayList`, i `LinkedList` non utilizzano un array interno. Invece, ogni elemento è un nodo che tiene traccia del nodo successivo e precedente. Questa struttura consente inserimenti e rimozioni efficienti, in quanto non richiede il ridimensionamento o il riallocamento degli elementi.

### Il Recupero degli Elementi
Il recupero degli elementi in un `LinkedList` è più lento perché non supporta l'accesso casuale. Per trovare un elemento, il `LinkedList` deve iterare partendo dall'inizio (o dalla fine, se è più vicino) fino a raggiungere l'elemento desiderato. Questo processo è noto come "iterazione lineare" ed è meno efficiente rispetto all'accesso diretto offerto dagli `ArrayList`.

## Esempio di Utilizzo
Di seguito un esempio di utilizzo di un `LinkedList` in Java:

```java
import java.util.LinkedList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // TODO: create cities LinkedList;
        LinkedList<String> cities = new LinkedList<String>();
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

In questo esempio, viene creato un `LinkedList` di `String` per memorizzare i nomi delle città. Si osserva l'uso del metodo `add` per aggiungere elementi alla lista.

## Conclusioni
I `LinkedList` offrono vantaggi significativi per determinate operazioni, come inserimenti e rimozioni frequenti. Tuttavia, la loro struttura li rende meno adatti per operazioni di accesso casuale rispetto agli `ArrayList`. La scelta tra `LinkedList` e `ArrayList` dovrebbe basarsi sulle specifiche esigenze di performance dell'applicazione.

