package livraria;

import java.util.Scanner;

public class sistema {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        livraria livraria = new Livraria();

        while (opcao != 4){
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Detalhar livro");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Adicionando livro");
                    int id; String titulo; 
                    String nomeAutor; String anopublicacao; String editora;
                    System.out.println("id: ");
                    id = sc.nextInt();
                    System.out.println("titulo: ");
                    titulo = sc.nextLine();
                    System.out.println("autor: ");
                    nomeAutor = sc.nextLine();
                    System.out.println("ano: ");
                    anopublicacao = sc.nextLine();
                    System.out.println("editora: ");
                    editora = sc.nextLine();

                   livro 1 = new Livro(id, titulo, nomeAutor, anopublicacao, editora);
                   livraria.cadastroLivro(1);
                    break;
                case 2:
                    System.out.println("Listando livro");
                    break;
                case 3:
                    System.out.println("Deletando livro");
                    break;
                case 4:
                    System.out.println("Encerrando o sistema");
                    break;
                default:
                    System.out.println("opção invalida");
                    break;
             }
        }
        sc.close();    
    }
}
