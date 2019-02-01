package com.ahmedgeze.todolist.repo;

import com.ahmedgeze.todolist.model.Role;
import com.ahmedgeze.todolist.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}