package es.nextdigital.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import es.nextdigital.demo.entity.Account;
import es.nextdigital.demo.entity.Transaction;
import es.nextdigital.demo.service.AccountService;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    @Autowired
    private AccountService accountServiceImpl;

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountServiceImpl.getAllAccounts();
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Long id) {
        return accountServiceImpl.getAccountById(id);
    }

    @GetMapping("/{id}/transactions")
    public List<Transaction> getAccountTransactions(@PathVariable Long id) {
        return accountServiceImpl.getAccountTransactions(id);
    }

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountServiceImpl.saveAccount(account);
    }
}

