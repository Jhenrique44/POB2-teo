package br.facens.jpa.example2;

import javax.persistence.Entity;

@Entity
public class Funcionario extends Pessoa{
    
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
}
