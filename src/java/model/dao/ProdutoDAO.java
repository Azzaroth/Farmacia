/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import model.entidades.Produto;

/**
 *
 * @author gusta
 */
public class ProdutoDAO {
    
    EntityManagerFactory factory;
    EntityManager manager;
    
    public ProdutoDAO() {
        this.factory = ConnectionFactory.getEntityManagerFactory();
    }
    
    public void fechaFactory() {
        factory.close();
    }
    
    public void adicionarProduto(Produto p) {
        manager = factory.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(p);
        manager.getTransaction().commit();
        manager.close();
    }
    
}
