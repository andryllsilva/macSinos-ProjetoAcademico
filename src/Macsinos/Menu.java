package Macsinos;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private String[] hamburguer = { "Uni Cheddar", "Chicken sinos", "Big Sinos", "Mega Vale" };
	private String[] bebidas = { "Coca-cola", "Pepsi", "Fanta", "Fruki Guaraná" };
	ArrayList <Pedido> pedidos = new ArrayList<>();
	private int choice;
	Scanner scanner = new Scanner(System.in);

	public void panel() {
		do {
			System.out.println("==== Menu ====");
			System.out.println("1. Fazer pedido");
			System.out.println("2. Cancelar pedido");
			System.out.println("3. Mostrar pedidos");
			System.out.println("4. Sair");
			System.out.print("Escolha uma opção: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				fazerPedido();
				break;
			case 2:
				removePedido();
				break;
			case 3:
				mostraPedidos();
				break;
			case 4:
				System.out.println("Saindo do menu...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

			System.out.println();
		} while (choice != 4);
	}
	
	public void fazerPedido() {
		System.out.println(" -=- Hamburguers MacSinos -=- ");
		System.out.println();
		for(int i=0; i<hamburguer.length; i++) {
			System.out.println(i+1 + ". " +hamburguer[i]);
		}
		System.out.println();
		System.out.println("Escolha um hamburguer: ");
		int hamburguerOption = scanner.nextInt();
		
		System.out.println();
		System.out.println("Deseja uma bebida ?");
		System.out.println("  (1) SIM (2) NÃO");
		int SNsoda = scanner.nextInt();
		if(SNsoda == 1) {
			System.out.println();
			System.out.println(" -=- Bebidas MacSinos -=-");
			System.out.println();
			for(int i=0; i<bebidas.length; i++) {
				System.out.println(i+1 + ". " + bebidas[i]);
			}
			System.out.println();
			System.out.println("Escolha uma bebida: ");
			int sodaOption = scanner.nextInt();
			Pedido pedido = new Pedido(hamburguer[hamburguerOption-1], bebidas[sodaOption-1]);
			adicionaPedido(pedido);
		}else {
			Pedido pedido = new Pedido(hamburguer[hamburguerOption-1]);
			adicionaPedido(pedido);
		}
	}
	
	public void adicionaPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public void removePedido() {
		pedidos.remove(0);
	}
	
	public void mostraPedidos() {
		int count = 1;
		System.out.println("Pedidos: ");
		for(Pedido i : pedidos ) {
			System.out.println("Pedido #"+ count++ + ": "+i);
		}
	}
	

}
