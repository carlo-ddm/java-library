
# Il Metodo `equals` Predefinito in Java

## Introduzione
Il metodo `equals` è un meccanismo cruciale in Java per determinare se due oggetti sono considerati uguali. L'implementazione predefinita di `equals` verifica se due riferimenti puntano allo stesso oggetto.

## Comportamento Predefinito di `equals`
Per default, il metodo `equals` confronta i riferimenti per verificare se due variabili si riferiscono allo stesso oggetto in memoria, usando l'operatore `==`.

## Esempio di Codice
Consideriamo due variabili che si riferiscono allo stesso oggetto `City`:

```java
City paris = new City("Paris", 2161000);
City copy = paris; // copy punta allo stesso oggetto di paris
System.out.println(paris.equals(copy)); // Restituirà true
```

In questo caso, `paris.equals(copy)` restituirà `true` perché entrambe le variabili puntano allo stesso oggetto.

## Uguaglianza di Riferimento e Oggetti Istantiati Separatamente
Se istanziamo due oggetti `City` separatamente, anche se con lo stesso stato, `equals` predefinito restituirà `false`:

```java
City paris = new City("Paris", 2161000);
City copy = new City(paris); // copy è un nuovo oggetto con lo stesso stato di paris
System.out.println(paris.equals(copy)); // Restituirà false
```

Qui, `paris.equals(copy)` restituirà `false` perché `copy` è un nuovo oggetto, nonostante `paris` e `copy` abbiano lo stesso stato interno.

## Conclusioni
Il metodo `equals` predefinito confronta i riferimenti, il che può essere fuorviante quando si lavora con oggetti che hanno lo stesso stato interno ma sono istanze separate. Ciò evidenzia la necessità di fare override di `equals` per fornire un confronto basato sullo stato interno piuttosto che sui riferimenti.

Nella documentazione successiva, esploreremo come eseguire l'override di `equals` nella classe `City` per un confronto più significativo basato sul contenuto dell'oggetto.
