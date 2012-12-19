package com.ebanking.ws.dao;

import com.ebanking.ws.model.account.Role;

public interface RoleDAO {
    Role getRoleByName(String name);
}
