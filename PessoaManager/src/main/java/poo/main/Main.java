package PessoaManager.src.main.java.poo.main;

import poo.dao.PessoaDAO;
import poo.model.Cliente;
import poo.model.Funcionario;
import poo.model.Pessoa;
import poo.util.HibernateUtil;

import java.util.Scanner;

public class Main {
    private static PessoaDAO pessoaDAO = new PessoaDAO();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            mostrarMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha
            switch (opcao) {
                case 1:
                    cadastrar(scanner);
                    break;
                case 2:
                    consultar(scanner);
                    break;
                case 3:
                    atualizar(scanner);
                    break;
                case 4:
                    excluir(scanner);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    HibernateUtil.shutdown();
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Consultar");
        System.out.println("3 - Atualizar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrar(Scanner scanner) {
        System.out.println("Tipo de Pessoa: 1-Cliente, 2-Funcionário");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha

        if (tipo == 1) {
            System.out.print("Tipo de Cliente: ");
            String tipoCliente = scanner.nextLine();
            Cliente cliente = new Cliente();
            cliente.setNome(nome);
            cliente.setIdade(idade);
            cliente.setTipo(tipoCliente);
            pessoaDAO.salvar(cliente);
        } else if (tipo == 2) {
            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();
            Funcionario funcionario = new Funcionario();
            funcionario.setNome(nome);
            funcionario.setIdade(idade);
            funcionario.setCargo(cargo);
            pessoaDAO.salvar(funcionario);
        } else {
            System.out.println("Tipo inválido");
        }
    }

    private static void consultar(Scanner scanner) {
        System.out.print("ID da Pessoa: ");
        Long id = scanner.nextLong();
        scanner.nextLine(); // Consumir nova linha

        Pessoa pessoa = pessoaDAO.consultar(id);
        if (pessoa != null) {
            System.out.println("ID: " + pessoa.getId());
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            if (pessoa instanceof Cliente) {
                System.out.println("Tipo de Cliente: " + ((Cliente) pessoa).getTipo());
            } else if (pessoa instanceof Funcionario) {
                System.out.println("Cargo: " + ((Funcionario) pessoa).getCargo());
            }
        } else {
            System.out.println("Pessoa não encontrada");
        }
    }

    private static void atualizar(Scanner scanner) {
        System.out.print("ID da Pessoa: ");
        Long id = scanner.nextLong();
        scanner.nextLine(); // Consumir nova linha

        Pessoa pessoa = pessoaDAO.consultar(id);
        if (pessoa != null) {
            System.out.print("Novo Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Nova Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            pessoa.setNome(nome);
            pessoa.setIdade(idade);

            if (pessoa instanceof Cliente) {
                System.out.print("Novo Tipo de Cliente: ");
                String tipoCliente = scanner.nextLine();
                ((Cliente) pessoa).setTipo(tipoCliente);
            } else if (pessoa instanceof Funcionario) {
                System.out.print("Novo Cargo: ");
                String cargo = scanner.nextLine();
                ((Funcionario) pessoa).setCargo(cargo);
            }

            pessoaDAO.atualizar(pessoa);
        } else {
            System.out.println("Pessoa não encontrada");
        }
    }

    private static void excluir(Scanner scanner) {
        System.out.print("ID da Pessoa: ");
        Long id = scanner.nextLong();
        scanner.nextLine(); // Consumir nova linha

        pessoaDAO.excluir(id);
    }
}


