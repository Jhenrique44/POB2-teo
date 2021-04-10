package br.facens.jpa.example2;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // cria uma unica tabela 
@Inheritance(strategy = InheritanceType.JOINED) //Cria as tabelas/classe e cria uma relação
//entre elas com chaves estrangeiras / herança
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)  //cada classe vira uma classe
public class Pessoa implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    private Long codigo;
    
    private String nome;


    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    

}
