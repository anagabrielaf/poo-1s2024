package Atividade4;

public class Coordenador extends Aluno {
    
    private Double salario;
    private String area;
    
    private Coordenador(){}

    public Coordenador(Double salario, String nome, Integer matricula, Integer telefone, String turno, String area) {
        
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = telefone;
        this.turno = turno;
        this.salario = salario;
        this.area = area;
    }   


    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Double getBonificacao(){
        return this.salario * 0.2;
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
            ", area='" + getArea() + "'" +
            ", bonificacao='" + getBonificacao() + "'" +
            "}";
    }  




































}
