package bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repositories.Database;

@Component
public class Bank {

    @Autowired
    private BankClientsApp bankClientsApp;

    @Autowired
    private TransferByPhoneApp transferByPhoneApp;

    @Autowired
    private Database database;

    public Bank() {}

    public void run(int sourceUserId, int destinationUserId, int amount) {
        if (!bankClientsApp.isUserExist(sourceUserId)) {
            return;
        }

        if (!bankClientsApp.isUserExist(destinationUserId)) {
            return;
        }

        transferByPhoneApp.transfer(sourceUserId, destinationUserId, amount);
        database.transferMoney(sourceUserId, destinationUserId, amount);
    }

}
