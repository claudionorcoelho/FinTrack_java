package com.fintrack.dao;

import com.fintrack.model.Transaction;
import java.util.List;

/**
 * Interface de Acesso a Dados (DAO) para Transação
 * Define os métodos para operações de banco de dados relacionadas a transações
 */
public interface TransactionDAO {
    /**
     * Insere uma nova transação no banco de dados
     * @param transaction Objeto da transação a ser inserida
     */
    void insert(Transaction transaction);
    
    /**
     * Atualiza uma transação existente no banco de dados
     * @param transaction Objeto da transação com dados atualizados
     */
    void update(Transaction transaction);
    
    /**
     * Deleta uma transação do banco de dados pelo ID
     * @param id Identificador único da transação a ser deletada
     */
    void delete(int id);
    
    /**
     * Recupera uma transação específica do banco de dados pelo ID
     * @param id Identificador único da transação
     * @return Objeto Transaction encontrado, ou null se não existir
     */
    Transaction getById(int id);
    
    /**
     * Recupera todas as transações do banco de dados
     * @return Lista contendo todas as transações armazenadas
     */
    List<Transaction> getAll();
}
