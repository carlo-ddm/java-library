import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import pojo.Account;
import pojo.Checking;
import pojo.Credit;
import repository.AccountRepository;
import service.AccountService;
import service.CheckingService;
import service.CreditService;

public class Main {

    public static void main(String[] args) {

        AccountRepository repository = new AccountRepository();
        CheckingService checkingService = new CheckingService(repository);
        CreditService creditService = new CreditService(repository);

        // Assume these were obtained from user input.
        List<Account> accounts = Arrays.asList(
                new Checking("A1234B", new BigDecimal("500.00")),
                new Checking("E3456F", new BigDecimal("300.50")),
                new Checking("I5678J", new BigDecimal("100.25")),
                new Credit("A1534B", new BigDecimal("0.50")),
                new Credit("G4567H", new BigDecimal("200.00")));

        accounts.forEach(account -> {
            if (account instanceof Checking) {
                checkingService.createAccount((Checking) account);
            } else {
                creditService.createAccount((Credit) account);
            }
        });

        AccountService accountService = new CheckingService(repository);
        // AccountService accountService = new CreditService(repository);
        
        // Nota: a seconda che si tratti di CreditService o di CheckingService, i metodi cambiano.
        // In sostanza dipende tutto da come sono stati sovrascritti i medoti nelle due classi (Servizi) che implementano l'interfaccia
        // NOta 2. L'interfaccia è sempre una classe, quindi in questo senso si può usare AccountService per usare i metodi definiti nelle classi che implementano le interfaccie, in un senso oppure in un altro
        accountService.deposit("1", new BigDecimal("100"));
        accountService.withdraw("1", new BigDecimal("50"));



    }

}