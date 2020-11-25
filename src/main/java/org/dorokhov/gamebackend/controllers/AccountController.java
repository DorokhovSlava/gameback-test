package org.dorokhov.gamebackend.controllers;


import org.dorokhov.gamebackend.entities.Account;
import org.dorokhov.gamebackend.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.math.BigInteger;
import java.util.List;


@RestController
public class AccountController {


    @Autowired
    private AccountRepository accountRepository;

    @RequestMapping(value = "/all/account", method = RequestMethod.GET)
    public List<Account> getAllAccount(){
        return accountRepository.findAll();
    }

    @RequestMapping(value =  "/add/account", method = RequestMethod.POST)
    public Account addAccount (@RequestBody Account account){
        return  accountRepository.saveAndFlush(account);
    }

    @RequestMapping(value = "/delete/account/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable(value = "id") BigInteger id){ accountRepository.deleteById(id);}

    @RequestMapping(value = "/update/account", method = RequestMethod.PUT)
    public Account updateAccount(@RequestBody Account account){ return accountRepository.saveAndFlush(account); }



}
