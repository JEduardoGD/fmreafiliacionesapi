package mx.fmre.afiliacionesapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.fmre.afiliacionesapi.entity.Account;
import mx.fmre.afiliacionesapi.repository.AccountRepository;
import mx.fmre.afiliacionesapi.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountRepository accountRepository;

	@Override
	public List<Account> findAll() {
		return accountRepository.findAll();
	}

	@Override
	public void deleteByIdu(String idu) {
		accountRepository.deleteById(idu);
	}

	@Override
	public Account save(Account account) {
		return accountRepository.save(account);
	}
}
