package Atividade4;

public class Diretor extends Aluno {
    private Double salario;
    private String setor;
    
    private Diretor(){}

    public Diretor(String nome, Integer matricula, Integer telefone, String turno, Double salario, String setor) {
        
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = telefone;
        this.turno = turno;
        this.salario = salario;
        this.setor = setor;
    }
    

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    
    public Double getBonificacao(){
        return this.salario * 0.3;
    }
    
    @Override
    public String toString() {
        return "{" +
            " salario='" + getSalario() + "'" +
            ", nome='" + getNome() + "'" +
            ", matricula='" + getMatricula() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", turma='" + getTurma() + "'" +
            ", turno='" + getTurno() + "'" +
            ", setor='" + getSetor() + "'" +
            ", bonificacao='" + getBonificacao() + "'" +
            "}";
    }




































    
}
