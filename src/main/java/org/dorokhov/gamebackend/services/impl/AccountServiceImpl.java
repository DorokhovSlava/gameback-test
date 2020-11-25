package org.dorokhov.gamebackend.services.impl;

import org.dorokhov.gamebackend.entities.Account;
import org.dorokhov.gamebackend.repository.AccountRepository;
import org.dorokhov.gamebackend.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
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
        // insert if not exist account
        Account addAccount = accountRepository.saveAndFlush(account);
        return addAccount;
    }

    @Override
    public void deleteAccountById(BigInteger id) {
        accountRepository.deleteById(id);
    }



    @Override
    public void updateAccount(Account account) {
        accountRepository.saveAndFlush(account);
    }

    @Override
    public Account getAccountByLogin(String account_login) {

        return getAccountByLogin(account_login);
    }

    @Override
    public List<Account> getAllAccount() {

        return accountRepository.findAll();
    }
}
