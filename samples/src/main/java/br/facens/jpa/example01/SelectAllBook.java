package br.facens.jpa.example01;

import java.util.List;


public class SelectAllBook {
    


    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_SAMPLES");
        EntityManager em = factory.createEntityManager();
        List<Book> list = em.createQuery("SELECT o FROM Book o",Book.class).getResultList();

        for(Book b : list){
            System.out.println(b);
        }
        
        em.close();
        factory.close();
    }
}
