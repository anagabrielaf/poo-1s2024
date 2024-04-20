package herança.empresa;

public class Gerente extends Funcionario{
    
}
    
private Integer quantidadeGerenciados; 

private Gerente(){}

public Gerente(String nome, Integer telefone, Integer cpf, Double salario, Integer quantidadeGerenciados){
    this.nome = nome; 
    this.telefone = telefone; 
    this.cpf = cpf; 
    this.salario = salario; 
    this.quantidadeGerenciados = quantidadeGerenciados;     
}



    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTelefone() {
        return this.telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public Integer getCpf() {
        return this.cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getQuantidadeGerenciados() {
        return this.quantidadeGerenciados;
    }

    public void setQuantidadeGerenciados(Integer quantidadeGerenciados) {
        this.quantidadeGerenciados = quantidadeGerenciados;
    }    
    public Double getBonificacao(){
        return this.salario * 0.25; 
    
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", salario='" + getSalario() + "'" +
            ", quantidadeGerenciados='" + getQuantidadeGerenciados() + "'" +
            ", bonificacao='" + getBonificacao() + "'" +
            "}";
    }
