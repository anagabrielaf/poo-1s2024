package herança.empresa;

public class Engenheiro {
    
    private String crea;
    private String projeto; 

    
    private Engenheiro(){}

    public Engenheiro(String nome, Integer cpf, Integer telefone, String crea, String projeto){
     this.nome = nome; 
     this.cpf = cpf;
     this.telefone = telefone; 
     this.crea = crea;
     this.projeto = projeto;
     
    }


    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", crea='" + getCrea() + "'" +
            ", projeto='" + getProjeto() + "'" +
            ", salario='" + getSalario() + "'" +
            ", bonificacao='" + getbonificacao() + "'" +
            "}";
    }
