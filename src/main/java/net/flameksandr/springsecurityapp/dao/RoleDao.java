package net.flameksandr.springsecurityapp.dao;

import net.flameksandr.springsecurityapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
