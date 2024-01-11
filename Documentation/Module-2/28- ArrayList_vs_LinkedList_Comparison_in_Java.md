
# Confronto tra ArrayList e LinkedList in Java

## Introduzione
In questa lezione, ci immergeremo nel confronto tra `ArrayList` e `LinkedList` in Java, analizzando la loro efficienza in diversi scenari. Queste due strutture dati sono molto diverse tra loro e la scelta dell'una o dell'altra dipende dal contesto specifico.

## Scenari di Test e Efficienza
Esamineremo l'efficienza di `ArrayList` e `LinkedList` in diversi scenari, utilizzando una serie di test. Ogni lista è popolata con 11 milioni di interi per evidenziare le differenze in termini di performance.

### Test 1: Recupero di Elementi
- **LinkedList**: Impiega più tempo (ad esempio, 16 millisecondi) per trovare un elemento a metà della lista, poiché deve iterare da un nodo all'altro.
- **ArrayList**: Molto più veloce (potenzialmente 0 millisecondi) poiché ogni elemento ha un indice e può essere recuperato direttamente.

### Test 2: Recupero del Primo e dell'Ultimo Elemento
- Entrambi mostrano un tempo di recupero simile (0 millisecondi), poiché sia l'`ArrayList` che il `LinkedList` offrono accesso diretto agli elementi agli estremi.

### Test 3: Aggiunta di Elementi al Centro
- **LinkedList**: Molto più efficiente nell'inserimento di elementi a metà della lista.
- **ArrayList**: Richiede tempo per spostare gli elementi successivi, rendendolo meno efficiente in questo scenario.

### Test 4: Inserimento di Elementi alla Fine
- Entrambi sono efficienti nell'aggiungere elementi alla fine, con tempi simili (0 millisecondi).

### Test 5: Rimozione di Elementi dal Centro
- **LinkedList**: Vince in termini di efficienza, poiché richiede meno tempo per rimuovere un elemento a metà della lista e aggiustare i riferimenti.
- **ArrayList**: Più lento a causa della necessità di spostare gli elementi.

### Test 6: Aggiornamento di Elementi
- **LinkedList**: Più lento nel trovare e aggiornare un elemento a causa dell'iterazione necessaria.
- **ArrayList**: Molto più veloce poiché l'aggiornamento si basa sull'indice dell'elemento.

## Codice di Esempio
Di seguito è riportato un esempio di codice che esegue i test di efficienza sopra descritti su `ArrayList` e `LinkedList`:

```java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
	
	public static void main(String[] args) {

		List<Integer> linkedList = new LinkedList<>();
		List<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < 11_000_000; i++) {
			linkedList.add(i);
            arrayList.add(i);
        }

        /******************FETCHING DATA******************/

        System.out.println("\nFETCHING DATA\n");

        long start = System.currentTimeMillis();
		linkedList.get(4_500_000);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
		arrayList.get(4_500_000);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");
        

        /******************FIRST / LAST INDEX******************/

        // System.out.println("\nFIRST / LAST INDEX\n");

        // start = System.currentTimeMillis();
		// linkedList.get(0);
        // linkedList.get(linkedList.size() - 1);
        // System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        // start = System.currentTimeMillis();
		// arrayList.get(0);
        // arrayList.get(arrayList.size() - 1);
        // System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");


        /******************INSERTION FROM MIDDLE******************/

        // System.out.println("\nINSERTION FROM MIDDLE\n");

        // start = System.currentTimeMillis();
        // linkedList.add(5, 121); // insert 121 at index 5
        // System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        // start = System.currentTimeMillis();
        // arrayList.add(5, 121);  // insert 121 at index 5
        // System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");


        /******************INSERTION******************/

        // System.out.println("\nINSERTION\n");

        // start = System.currentTimeMillis();		
        // linkedList.add(121);
        // System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        // start = System.currentTimeMillis();
        // arrayList.add(121);
        // System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");

        /******************REMOVAL******************/
        
        // System.out.println("\nREMOVAL\n");

        // start = System.currentTimeMillis();			
        // linkedList.remove(400);
        // System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        // start = System.currentTimeMillis();			
        // arrayList.remove(400);
        // System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");


        /******************UPDATES******************/

        // System.out.println("\nUPDATES\n");

        // start = System.currentTimeMillis();					
		// linkedList.set(4_500_000, 5);
        // System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        // start = System.currentTimeMillis();			
		// arrayList.set(4_500_000, 5);
        // System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");

	}

}

```

## Conclusioni
In sintesi, l'`ArrayList` è molto più veloce nel recuperare i dati grazie all'accesso diretto basato sugli indici. Per le operazioni agli estremi delle liste, non si nota differenza. Invece, per l'aggiunta o la rimozione di elementi al centro, il `LinkedList` è nettamente superiore. La scelta tra `ArrayList` e `LinkedList` dovrebbe quindi essere guidata dalle specifiche esigenze di performance dell'applicazione.

