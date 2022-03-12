package mx.fmre.afiliacionesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.fmre.afiliacionesapi.entity.Account;

public interface AccountRepository extends JpaRepository<Account, String> {

}
