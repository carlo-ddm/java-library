
# Metodi Astratti in Java

## Introduzione
In Java, la parola chiave `abstract` viene utilizzata per creare metodi astratti all'interno di classi astratte. Un metodo astratto è un metodo che non ha un'implementazione nella classe genitore, ma richiede che le classi figlie forniscano una loro implementazione specifica.

## Definizione di un Metodo Astratto
Un metodo astratto viene definito in una classe astratta e stabilisce un contratto che tutte le classi figlie devono soddisfare. Non ha un corpo di implementazione e serve come modello per le classi figlie.

### Esempio di Metodo Astratto in `Product`
```java
public abstract class Product {
    // Campi e costruttore...

    public abstract void wear();
}
```
Qui, `wear` è un metodo astratto nella classe astratta `Product`. Questo metodo deve essere sovrascritto nelle classi figlie.

## Implementazione dei Metodi Astratti nelle Classi Figlie
Le classi figlie sono obbligate a implementare tutti i metodi astratti della classe genitore. Questo assicura che ogni classe figlia abbia un comportamento specifico per questi metodi.

### Esempio in `Shirt` e `Pants`
```java
public class Shirt extends Product {
    @Override
    public void wear() {
        // Implementazione specifica per Shirt
    }
}

public class Pants extends Product {
    @Override
    public void wear() {
        // Implementazione specifica per Pants
    }
}
```
In `Shirt` e `Pants`, il metodo `wear` viene sovrascritto per fornire un'implementazione concreta che è specifica per ogni tipo di prodotto.

## Utilizzo dei Metodi Astratti
I metodi astratti espongono un comportamento che le classi figlie devono implementare. In questo modo, è possibile chiamare questi metodi su oggetti delle classi figlie, sapendo che ogni classe avrà la sua implementazione specifica.

### Esempio nel `Main`
Dopo la creazione di oggetti `Shirt` e `Pants`, il metodo `wear` viene chiamato su di essi, eseguendo l'implementazione specifica di ciascuna classe.

```java
Shirt shirt = new Shirt(/* parametri */);
Pants pants = new Pants(/* parametri */);

shirt.wear(); // Chiama wear di Shirt
pants.wear(); // Chiama wear di Pants
```

## Conclusione
I metodi astratti in Java sono uno strumento potente per imporre alle classi figlie di implementare comportamenti specifici, mantenendo al contempo una struttura comune nella classe genitore. Questo facilita la creazione di codice flessibile e riutilizzabile che può essere adattato alle esigenze specifiche delle classi figlie.
