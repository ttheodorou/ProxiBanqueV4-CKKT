/**
 * 
 */
package com.proxibanquev4.ckkt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proxibanquev4.ckkt.domaine.User;

/**
 * Classe IUserDao.java Represente
 * @author CKKT
 */
@Repository
public interface IUserDao extends JpaRepository<User, Long> {

}
