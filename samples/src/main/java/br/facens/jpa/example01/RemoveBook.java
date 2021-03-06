package br.facens.jpa.example01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoveBook {
    
    public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_SAMPLES");

        EntityManager em = factory.createEntityManager();
        
        Book book = em.find(Book.class, 3l);

        if (book != null) {

            em.remove(book);
        } else {

            System.out.println("Book não encontrado");
        }

        em.getTransaction().begin();
        em.getTransaction().commit();

        em.close();
        factory.close();
    }
}
