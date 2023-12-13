package AtvdAssincrona6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> filaClientes = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		String nome;
		
		System.out.println("          *****");
		System.out.println("1 - Adicionar cliente na fila");
		System.out.println("2 - Listar todos os clientes");
		System.out.println("3 - Retirar cliente da fila");
		System.out.println("0 - Sair");
		System.out.println("          *****");
		
		do {
			System.out.println("\nEntre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine(); // para limpar o buffer e ele parar de ignorar todas as linhas do case 1
			
			switch(opcao) {
			case 1:
				System.out.println("Digite o nome: " );
				nome = leia.nextLine();
				filaClientes.add(nome);
				
				System.out.println("Fila: ");
				for(String cliente : filaClientes) {
					System.out.println(cliente);
				}
				
				System.out.println("CLiente adicionado!");
				break;
				
			case 2:
				if(filaClientes.isEmpty()) {
					System.out.println("A fila está vazia!");
					break;
				} else {
					filaClientes.remove();
					System.out.println("Lista de clientes na fila: ");
					for(String cliente : filaClientes) {
						System.out.println(cliente);
					}
					break;
				}
				
			case 3:
				if(filaClientes.isEmpty()) {
					System.out.println("A fila está vazia!");
					break;
				} else {
					System.out.println("Lista de clientes na fila: ");
					for(String cliente : filaClientes) {
						System.out.println(cliente);
					}
					break;
				}
				
			case 0:
				System.out.println("Programa finalizado!");
				break;
			default:
				System.out.println("Opção invalidada, por favor digite outro número.");
			}
		} while (opcao != 0);
		
	}

}
