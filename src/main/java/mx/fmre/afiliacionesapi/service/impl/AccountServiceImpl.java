package mx.fmre.afiliacionesapi.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import mx.fmre.afiliacionesapi.entity.Account;
import mx.fmre.afiliacionesapi.repository.AccountRepository;
import mx.fmre.afiliacionesapi.service.AccountService;

@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountRepository accountRepository;

	@Override
	public List<Account> findAll() {
		return accountRepository.findAll();
	}

	@Override
	public boolean deleteByIdu(String idu) {
		try {
			accountRepository.deleteById(idu);
			if (this.findByIdu(idu).isPresent()) {
				return false;
			}
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
		}
		return true;
	}

	@Override
	public Account save(Account account) {
		return accountRepository.save(account);
	}

	public Optional<Account> findByIdu(String idu) {
		return accountRepository.findById(idu);
	}
}
