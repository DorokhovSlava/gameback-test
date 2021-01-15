package org.dorokhov.gamebackend.services.impl;

import org.dorokhov.gamebackend.entities.Account;
import org.dorokhov.gamebackend.repository.AccountRepository;
import org.dorokhov.gamebackend.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import java.util.List;


@Service
public class AccountServiceImpl implements AccountService {


    private final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account addAccount(Account account) {
        Account addAccount = accountRepository.saveAndFlush(account);
        return addAccount;
    }

    @Override
    public void deleteAccountById(BigInteger id) {
        accountRepository.deleteById(id);
    }

    @Override
    public void updateAccountByLogin(Account account, String login) {
        accountRepository.save(account);
    }

    @Override
    public Account getAccountByLogin(String login) {
        return accountRepository.getAccountByLogin(login);
    }

    @Override
    public List<Account> getAllAccount() {
        return accountRepository.findAll();
    }
}
