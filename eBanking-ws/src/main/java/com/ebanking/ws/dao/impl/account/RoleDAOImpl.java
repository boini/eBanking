package com.ebanking.ws.dao.impl.account;

import com.ebanking.ws.dao.RoleDAO;
import com.ebanking.ws.dao.impl.CommonDAOImpl;
import com.ebanking.ws.model.account.Role;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class RoleDAOImpl extends CommonDAOImpl implements RoleDAO {
    @Override
    public Role getRoleByName(String name) {
        List roles = currentSession().createQuery("from Role as r where r.roleName = ?")
                .setString(0, name)
                .list();
        if (roles != null && roles.size() > 0) {
            return (Role) roles.get(0);
        }
        return null;
    }
}
