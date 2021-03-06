package br.facens.jpa.example01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SearchBook {
    
    public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_SAMPLES");

        EntityManager em = factory.createEntityManager();

        Book book = em.getReference(Book.class, 1l); //não vai ao banco, apenas a referencia

        System.out.println(book);

        em.close();
        factory.close();
    }
}
