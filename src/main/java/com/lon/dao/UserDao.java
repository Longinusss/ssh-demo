package com.lon.dao;
import com.lon.model.UserEntity;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDao extends HibernateDaoSupport {

    public UserEntity getUser(int id){
        return this.getHibernateTemplate().get(UserEntity.class,id);
    }

}