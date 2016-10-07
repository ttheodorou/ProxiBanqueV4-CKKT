/**
 * 
 */
package com.proxibanquev4.ckkt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proxibanquev4.ckkt.domaine.CompteBancaire;

/**
 * Classe ICompteBancaireDao.java Represente
 * @author CKKT
 */
@Repository
public interface ICompteBancaireDao extends JpaRepository<CompteBancaire, Long> {

}
