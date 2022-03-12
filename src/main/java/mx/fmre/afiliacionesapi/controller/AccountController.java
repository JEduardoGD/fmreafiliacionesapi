package mx.fmre.afiliacionesapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.fmre.afiliacionesapi.entity.Account;
import mx.fmre.afiliacionesapi.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	AccountService accountService;

	@GetMapping
	public List<Account> findAll() {
		return accountService.findAll();
	}

	@DeleteMapping("/{idu}")
	void deleteEmployee(@PathVariable String idu) {
		accountService.deleteByIdu(idu);
	}

	@PutMapping
	public Account Account(@RequestBody Account account) {
		return accountService.save(account);
	}
}
