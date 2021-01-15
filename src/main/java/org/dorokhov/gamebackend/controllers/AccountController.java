package org.dorokhov.gamebackend.controllers;


import org.dorokhov.gamebackend.entities.Account;
import org.dorokhov.gamebackend.services.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.math.BigInteger;
import java.util.List;


@RestController
public class AccountController {


    private final AccountServiceImpl accountService;

    @Autowired
    public AccountController(AccountServiceImpl accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(value = "/all/account", method = RequestMethod.GET)
    public List<Account> getAllAccount(){
        return accountService.getAllAccount();
    }

    @RequestMapping(value =  "/add/account", method = RequestMethod.POST)
    public Account addAccount (@RequestBody Account account){
        return  accountService.addAccount(account);
    }

    @RequestMapping(value = "/delete/account/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable(value = "id") BigInteger id){accountService.deleteAccountById(id);}


    @RequestMapping(value = "/update/account/{login}", method = RequestMethod.PUT)
    public void updateAccount(@PathVariable(value = "login")Account account, String login){ accountService.updateAccountByLogin(account, login); }

    @RequestMapping(value = "/get/account/{login}", method = RequestMethod.GET)
    public void getAccountByLogin(@PathVariable(value = "login") String login){
        accountService.getAccountByLogin(login);
    }
}
