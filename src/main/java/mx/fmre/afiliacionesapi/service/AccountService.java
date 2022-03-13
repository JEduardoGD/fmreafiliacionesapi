package mx.fmre.afiliacionesapi.service;

import java.util.List;

import mx.fmre.afiliacionesapi.entity.Account;

public interface AccountService {

	List<Account> findAll();

	boolean deleteByIdu(String idu);

	Account save(Account account);


}
