
# Introduzione alle Eccezioni in Java

Le eccezioni in Java sono eventi che interrompono il normale flusso di esecuzione di un programma. Sono oggetti che vengono "lanciati" da un'area del codice e "catturati" in un'altra, permettendo al programma di gestire in modo ordinato situazioni anomale. In Java, le eccezioni si dividono in due categorie principali: eccezioni controllate e non controllate.

## Eccezioni Controllate (Checked Exceptions)

Le eccezioni controllate sono quelle che vengono verificate durante la compilazione. Sono situazioni che, sebbene non desiderate, sono prevedibili e il programmatore dovrebbe anticiparle e gestirle adeguatamente.

### Esempi Comuni di Eccezioni Controllate
- `IOException`: Questa eccezione viene lanciata per segnalare errori di input/output, come problemi nel leggere o scrivere su un file.
- `SQLException`: Lanciata da operazioni di database per segnalare problemi come query SQL non valide.
- `ClassNotFoundException`: Si verifica quando si tenta di caricare una classe tramite il suo nome, ma la classe non può essere trovata nel classpath.

Queste eccezioni richiedono una gestione esplicita nel codice, solitamente tramite un blocco `try-catch` o dichiarandole nel `throws` del metodo.

## Eccezioni Non Controllate (Unchecked Exceptions)

Le eccezioni non controllate, o eccezioni in fase di runtime, sono eccezioni che non sono verificate durante la compilazione. Sono generalmente il risultato di errori logici nel codice.

### Esempi Comuni di Eccezioni Non Controllate
- `NullPointerException`: Questa eccezione si verifica quando si tenta di utilizzare un riferimento che punta a `null`.
- `ArrayIndexOutOfBoundsException`: Lanciata quando si tenta di accedere a un indice di un array che è fuori dal suo intervallo valido.
- `ArithmeticException`: Si verifica, ad esempio, quando si tenta una divisione per zero.

A differenza delle eccezioni controllate, le eccezioni non controllate possono essere gestite, ma non è obbligatorio farlo.

## Conclusione

Questa introduzione ha delineato i concetti di base delle eccezioni controllate e non controllate in Java. La comprensione di queste due categorie è fondamentale per scrivere codice robusto e affidabile. Nei documenti successivi, esamineremo più in dettaglio ciascuna categoria, fornendo approfondimenti e esempi specifici.

