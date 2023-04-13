package CRUD;

import java.util.Scanner;

public class CRUD_PESSOA {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CRUD c = new CRUD();
		boolean verificaMenu =false;
		do {
			menu();
			int menu = scanner.nextInt();
			switch(menu) {
			case 1:
				System.out.println("Digite o nome, idade e data de nascimento");
				Pessoa p = new Pessoa(scanner.next(), scanner.nextInt(), scanner.next());
				c.add(p);
				break;
			case 2:
				System.out.println("Digite o index da pessoa que deseja excluir");
				int index = scanner.nextInt();
				c.excluir(index);
				break;
			case 3:
				System.out.println("Digite o index da pessoa que deseja editar");
				index = scanner.nextInt();
				System.out.println("Digite o nome, idade e data de nascimento");
				p = new Pessoa(scanner.next(), scanner.nextInt(), scanner.next());
				c.editar(index, p);
				break;
			case 4:
				c.exibir();
				break;
			case 0:
				System.out.println("...");
				verificaMenu =true;
				break;
			default:
				System.out.println("Invalido");
			}
			
		}while(verificaMenu != true);
		
		
	}
	public static void menu() {
		System.out.println("1 - add");
		System.out.println("2 - excluir");
		System.out.println("3 - editar");
		System.out.println("4 - exibir");
		System.out.println("0 - sair");
	}
}
