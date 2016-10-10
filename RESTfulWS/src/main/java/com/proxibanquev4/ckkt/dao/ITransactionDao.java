package com.proxibanquev4.ckkt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proxibanquev4.ckkt.domaine.Transaction;

/**
 * Classe ITransactionDao.java Represente
 * @author CKKT
 */
@Repository
public interface ITransactionDao extends JpaRepository<Transaction, Long> {

}
