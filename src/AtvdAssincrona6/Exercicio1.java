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
		System.out.println("Entre com a opção desejada: ");
		opcao = leia.nextInt();
		
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
			
		case 2:
			if(filaClientes.isEmpty()) {
				System.out.println("A fila está vazia!");
			} else {
				filaClientes.remove();
				System.out.println("Lista de clientes na fila: ");
				for(String cliente : filaClientes) {
					System.out.println(cliente);
				}
			}
			
		case 3:
			if(filaClientes.isEmpty()) {
				System.out.println("A fila está vazia!");
			} else {
				System.out.println("Lista de clientes na fila: ");
				for(String cliente : filaClientes) {
					System.out.println(cliente);
				}
			}
			
		case 0:
			System.out.println("Programa finalizado!");
			break;
		default:
			System.out.println("Opção invalidada, por favor digite outro número.");
		}
	}

}
