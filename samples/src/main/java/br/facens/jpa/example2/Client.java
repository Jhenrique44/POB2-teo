package br.facens.jpa.example2;

import javax.persistence.Entity;

@Entity
public class Client extends Pessoa {
    
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    } 

    
    
}
