package com.higgsup.demo.ldap.repository;


import org.springframework.ldap.core.support.BaseLdapNameAware;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends BaseLdapNameAware  {
	

}
