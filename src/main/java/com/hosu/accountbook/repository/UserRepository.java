package com.hosu.accountbook.repository;import com.hosu.accountbook.domain.UserAccount;import org.springframework.data.jpa.repository.JpaRepository;public interface UserRepository extends JpaRepository<UserAccount, Long> {}