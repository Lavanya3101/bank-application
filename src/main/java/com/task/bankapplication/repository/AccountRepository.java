package com.task.bankapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.bankapplication.entity.Account;
@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

}
