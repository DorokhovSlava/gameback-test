package org.dorokhov.gamebackend.services;

import org.dorokhov.gamebackend.entities.Account;
import java.math.BigInteger;
import java.util.List;

public interface AccountService {

    Account addAccount(Account account);
    void deleteAccountById(BigInteger id);
    void updateAccountByLogin(Account account, String login);
    Account getAccountByLogin(String login);
    List<Account> getAllAccount();
}
