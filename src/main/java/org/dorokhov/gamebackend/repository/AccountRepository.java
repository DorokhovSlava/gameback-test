package org.dorokhov.gamebackend.repository;

import org.dorokhov.gamebackend.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface AccountRepository extends JpaRepository<Account, BigInteger> {

}
