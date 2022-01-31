package com.yash.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.ems.model.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
