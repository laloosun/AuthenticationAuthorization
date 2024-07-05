package com.ironhack.demosecurityjwt.services.interfaces;

import com.ironhack.demosecurityjwt.models.Role;

public interface RoleServiceInterface {
    Role saveRole(Role role);
    void updateRole(Long id, Role role);
    void patchRole(Long id, Role role);
    void deleteRole(Long id);
    void addRoleToUser(String username, String roleName);
}
