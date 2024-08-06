package es.nextdigital.demo.service;

import java.util.List;

import es.nextdigital.demo.entity.Account;
import es.nextdigital.demo.entity.Transaction;

public interface AccountService {

	List<Account> getAllAccounts();

	Account getAccountById(Long id);

	List<Transaction> getAccountTransactions(Long accountId);

	Account saveAccount(Account account);

}