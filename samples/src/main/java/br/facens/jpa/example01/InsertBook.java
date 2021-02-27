package br.facens.jpa.example01;

public class InsertBook {
    

    public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_SAMP");

        EntityManager em = factory.createEntityManager();

        Book b1 = new Book();
        b1.setId(1l);
        b1.setTitle("O Hobbit");
        b1.setPrice(100.00);
        b1.setAuthor("J.R.R.Tolkien");
        

        em.persist(b1);

        em.getTransaction().begin();
        em.getTransaction().commit();

        em.close();

        factory.close();
    }
}
