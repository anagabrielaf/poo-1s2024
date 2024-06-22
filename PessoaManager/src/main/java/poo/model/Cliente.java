package PessoaManager.src.main.java.poo.model;

import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa {
    private String tipo;

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

