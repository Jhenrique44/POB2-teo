package br.facens.jpa.example2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {
    
    public static void main(String[] args) {

        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_SAMPLES");

        EntityManager em = factory.createEntityManager();

        Pessoa p = new Pessoa();
        p.setCodigo(3l);
        p.setNome("joaquim");

        Funcionario f = new Funcionario();
        f.setCodigo(1l);
        f.setSalary(222.2);
        f.setNome("maria");

        Client c = new Client();

        c.setCodigo(2l);
        c.setNome("joj");
        c.setSaldo(1900);

        Pessoa aux1 = f;  //funcionario é uma pessoa
        Pessoa aux2 = c;  //Client é uma pessoa 

        em.persist(p);
        em.persist(f);
        em.persist(c);

        em.getTransaction().begin();
        em.getTransaction().commit();

        em.close();
        factory.close();

    }
}
