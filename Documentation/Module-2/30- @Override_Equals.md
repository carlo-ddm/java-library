
### Sovrascrittura del Metodo `equals` in Java: Esempio con la Classe `City`

In questa documentazione, esploreremo come sovrascrivere il metodo `equals` per gli oggetti della classe `City` in Java. Questo esempio ci aiuterà a comprendere meglio le pratiche consigliate nella gestione dell'uguaglianza degli oggetti.

#### Importanza di Sovrascrivere `equals` e `hashCode`

In Java, il metodo `equals` è cruciale per confrontare se due oggetti sono considerati uguali. Il suo comportamento predefinito confronta semplicemente i riferimenti, ma spesso abbiamo bisogno di una logica più sofisticata. Quando sovrascriviamo `equals`, è una prassi standard sovrascrivere anche `hashCode`. Il contratto Java afferma che se due oggetti sono considerati uguali dal metodo `equals`, devono avere lo stesso valore hash. Non seguire questa regola può portare a comportamenti inaspettati quando si utilizzano collezioni come `HashSet` o `HashMap`.

#### Implementazione in `City.java`

Ecco un esempio di come sovrascrivere `equals` e `hashCode` nella classe `City`:

```java
import java.util.Objects;

public class City {

    private String name;
    private long population;

    // Costruttori, getter e setter sono omessi per brevità

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof City)) {
            return false;
        }
        City city = (City) o;
        return Objects.equals(name, city.name) && population == city.population;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population);
    }
}
```

#### Spiegazione del Metodo `equals`

1. **Confronto dei Riferimenti**: Inizia controllando se l'oggetto passato è lo stesso dell'oggetto corrente, usando `o == this`.

2. **Controllo del Tipo**: Controlla se l'oggetto passato è un'istanza di `City`. Se non lo è, ritorna `false`.

3. **Confronto dei Campi**: Converte l'oggetto passato in un oggetto `City` e confronta i campi rilevanti (`name` e `population`). Utilizza `Objects.equals` per il confronto dei nomi per gestire correttamente i `null`.

#### Utilizzo nel Codice

Nel seguente esempio, mostrato in `Main.java`, vediamo come il metodo `equals` sovrascritto viene utilizzato:

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        City paris = new City("Paris", 2161000);
        City copy = new City(paris);

        System.out.println(paris.equals(copy)); // Uso di equals

        ArrayList<City> cities = new ArrayList<>();
        // Aggiunta di elementi a cities
        System.out.println(cities.contains(paris)); // Uso di equals in contains
    }
}
```

In questo esempio, creiamo un oggetto `City` e una sua copia. Utilizzando `equals`, confrontiamo i due oggetti. Successivamente, aggiungiamo alcuni oggetti `City` in un `ArrayList` e utilizziamo il metodo `contains` che, a sua volta, utilizza `equals` per determinare se l'array contiene un oggetto specifico.

#### Conclusioni

Sovrascrivere il metodo `equals` e il metodo `hashCode` consente di confrontare gli oggetti in modo più significativo, basandosi sul loro stato interno anziché sui riferimenti. Questa pratica è essenziale per garantire che le classi personalizzate funzionino correttamente con le collezioni di Java.

---
