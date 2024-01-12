# Documentazione HashMap in Java

## 1. Introduzione agli HashMap in Java

Gli `HashMap` in Java rappresentano una struttura dati molto potente e flessibile, utilizzata per memorizzare coppie di dati chiave-valore. A differenza di altre strutture come gli array o le liste, gli `HashMap` permettono un accesso rapido ai valori attraverso le chiavi, rendendo le operazioni di ricerca e aggiornamento estremamente efficienti.

## 2. Creazione e gestione di un HashMap

Per creare un `HashMap`, si utilizza la classe `HashMap` di Java, che implementa l'interfaccia `Map`. La dichiarazione tipica di un `HashMap` è:

```java
Map<TipoChiave, TipoValore> nomeMap = new HashMap<>();
```

Dove `TipoChiave` e `TipoValore` rappresentano i tipi dei dati per le chiavi e i valori rispettivamente.

## 3. Meccanismo di funzionamento: hash, indice e memorizzazione

Quando si inserisce una nuova coppia chiave-valore in un `HashMap`, la chiave viene prima trasformata in un hash (un valore intero) tramite una funzione di hashing. Questo hash è poi utilizzato per determinare l'indice dell'array interno dove memorizzare la coppia. Questo processo garantisce un accesso rapido ai dati.

## 4. Inserimento e recupero dati da un HashMap

L'inserimento di un elemento in un `HashMap` si effettua tramite il metodo `put`, mentre il recupero si effettua tramite il metodo `get`. Ad esempio:

```java
inventory.put("Bananas", 2.99);
Double price = inventory.get("Bananas");
```

## 5. Considerazioni finali e usi pratici

Gli `HashMap` sono utili in molti scenari, soprattutto quando è necessario un accesso rapido ai dati basato su chiavi uniche. È importante notare che l'ordine degli elementi in un `HashMap` non è garantito.

