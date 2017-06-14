package org.cap.dao;

import java.util.List;

import org.cap.dto.Account;

public interface AccountDao {

	public boolean createAccount(Account account);

	public Account findAccountById(int accountNo);

	public List<Account> listAccount();
}
