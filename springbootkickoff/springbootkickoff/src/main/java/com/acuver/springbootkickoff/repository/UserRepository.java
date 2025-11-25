package com.acuver.springbootkickoff.repository;

import com.acuver.springbootkickoff.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDto,Long> {
}
