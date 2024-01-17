
# Polimorfismo in Java

## Introduzione al Polimorfismo
Il polimorfismo è un concetto chiave nella programmazione orientata agli oggetti che consente di scrivere codice meno e più riutilizzabile. Si basa sulla capacità di un oggetto di assumere molteplici forme, in particolare, permette a un oggetto figlio di essere trattato come se fosse un oggetto del suo genitore.

## Il Codice Senza Polimorfismo
Prima di introdurre il polimorfismo, potremmo considerare di scrivere metodi separati per ogni sottoclasse. Nel file `Main.java` fornito, ci sono esempi di questi metodi commentati:

```java
// Metodo specifico per gli oggetti Pants
// public static void pantStore(Pants pants) {
//     System.out.println("Thank you for purchasing " + pants.getBrand() + " Pants. Your total comes to " + pants.getPrice());
// }

// Metodo specifico per gli oggetti Shirt
// public static void shirtStore(Shirt shirt) {
//     System.out.println("Thank you for purchasing " + shirt.getBrand() + " Shirt. Your total comes to " + shirt.getPrice());
// }
```
Questi metodi sono specifici per le classi `Pants` e `Shirt` e non possono essere utilizzati per altri tipi di prodotti.

## Il Codice con Polimorfismo
Il polimorfismo ci permette di sostituire questi metodi specifici con un unico metodo più generale che può gestire diversi tipi di prodotti. Il metodo `productStore` nel codice dimostra questo concetto:

```java
public static void productStore(Product product) {
    System.out.println("Thank you for purchasing " + product.getBrand() + " " + product.getClass().getSimpleName() + ". Your total comes to " + product.getPrice());
}
```
Questo metodo utilizza il polimorfismo per trattare sia `Shirt` che `Pants` come `Product`. In questo modo, il metodo può essere riutilizzato per qualsiasi sottoclasse di `Product`, riducendo significativamente la quantità di codice necessario.

## Utilità del Polimorfismo
Il polimorfismo rende il codice più flessibile e riutilizzabile, riducendo la necessità di scrivere metodi separati per ogni sottotipo. Questo non solo riduce la ridondanza, ma rende anche il codice più facile da mantenere e da estendere in futuro.

## Conclusione
Grazie al polimorfismo, possiamo scrivere un codice più pulito e generale che può facilmente adattarsi a nuovi tipi di prodotti senza la necessità di modifiche sostanziali. Questo approccio non solo semplifica la scrittura del codice, ma rende anche il sistema complessivamente più robusto e flessibile.
