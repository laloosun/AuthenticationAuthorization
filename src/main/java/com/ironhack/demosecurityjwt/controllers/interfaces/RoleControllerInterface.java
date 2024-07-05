package com.ironhack.demosecurityjwt.controllers.interfaces;

import com.ironhack.demosecurityjwt.dtos.RoleToUserDTO;
import com.ironhack.demosecurityjwt.models.Role;

public interface RoleControllerInterface {
    void saveRole(Role role);
    void updateRole(Long id, Role role);
    void patchRole(Long id, Role role);
    void deleteRole(Long id);
    void addRoleToUser(RoleToUserDTO roleToUserDTO);
}
