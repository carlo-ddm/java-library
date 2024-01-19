
# Espressioni Lambda: Comparator

Nella programmazione, un compito comune è organizzare i dati, in particolare ordinare, il che può diventare abbastanza intricato e spesso richiede passaggi ripetitivi. Fortunatamente, in Java esistono funzioni di ordine superiore per astrarsi da queste complessità, permettendoci di dettare semplicemente i nostri criteri di ordinamento. Una di queste funzioni è il metodo `sort`, che sfrutta un `Comparator` per guidare la sua logica di ordinamento.

## Interfacce Funzionali e Espressioni Lambda

**[Inserire qui la tabella delle interfacce funzionali e delle espressioni lambda fornita nel primo prompt]**

## Esempio di Lista di Numeri e Ordinamento Tradizionale

Considera una semplice lista di numeri:
```java
ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 1, 9, 3, 7));
```

L'ordinamento di questa lista usando l'approccio tradizionale del bubble sort sarebbe così:
```java
for (int i = 0; i < numbers.size() - 1; i++) {
    for (int j = 0; j < numbers.size() - i - 1; j++) {
        if (numbers.get(j) > numbers.get(j + 1)) {
            // Scambio numbers.get(j) e numbers.get(j+1)
            int temp = numbers.get(j);
            numbers.set(j, numbers.get(j + 1));
            numbers.set(j + 1, temp);
        }
    }
}
```

Questa è solo una semplice implementazione del bubble sort, un ordinamento binario sarebbe ancora più complicato!

## Metodo sort e Comparator

Java fornisce una funzione di ordine superiore con logica di ordinamento già incorporata. Ecco il metodo `sort`.
```java
void sort(Comparator<? super E> c) {
    // Logica di ordinamento all'interno della funzione
}
```

Il metodo `sort` richiede un `Comparator`, un'interfaccia funzionale che guida il processo di ordinamento. Esprimi i tuoi criteri di ordinamento usando un'espressione lambda. Ecco come ordinare la lista in ordine crescente usando il metodo `sort`:
```java
numbers.sort((a, b) -> a.compareTo(b));
```

In questo esempio, l'espressione lambda `(a, b) -> a.compareTo(b)` è il nostro `Comparator`. Questa espressione indica la nostra intenzione: per due numeri qualsiasi a e b nella lista, se a è minore di b, restituire un valore negativo; se a è uguale a b, restituire 0; se a è maggiore di b, restituire un valore positivo.

Importante, l'ordine dei parametri nella tua espressione lambda `Comparator` determina l'ordine di ordinamento. Se desideri ordinare in ordine decrescente, cambieresti i parametri così:
```java
numbers.sort((a, b) -> b.compareTo(a));
```
