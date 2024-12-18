package com.bankuser.BankUserPrifile.repository;

import com.bankuser.BankUserPrifile.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
