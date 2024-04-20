package livraria;

import java.util.ArrayList;

public class livraria {

    public ArrayList<livro> livros;

    public livraria(){
        this.livros = new ArrayList<>();

    }
    public void cadastroLivro(livro livro){
        this.livros.add(livro);
    }
    public String listarLivros(){
       String listarLivros = "";

       for(livro 1: this.livros) {
           listarLivros += 1.id + " - " + 1.titulo + "\n";
       }

       return listarLivros;
    }
}

