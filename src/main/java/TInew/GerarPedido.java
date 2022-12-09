package TInew;

import java.util.Scanner;

public class GerarPedido {
	public static void main (String[]args) {
	 
		Scanner in = new Scanner (System.in); //SCANNER IN
		
		Cliente cliente; // INSTANCIANDO A CLASSE CLIENTE
		Produtos produtos; //INSTANCIANDO  A CLASSE PRODUTOS
		
		
		int quantidadeDeSucos;
		int ValorTotal; // ATRIBUTO PARA VALOR TOTAL
		String dados; // ATRIBUTO PARA DADOS
		
		Cliente clientes = new Cliente(); //OBJETO CLIENTES//
		Produtos Produto = new Produtos(); //OBJETO PRODUTO
		
		String ListaDeProdutos []= new String [] {"-Suco de Uva 600ml (unid) = R$ 5,00",	//ARRAY DE PRODUTOS DISPONIVES PARA COMPRA
												  "-Suco de Laranja 600ml (unid) = R$ 6,00",
												  "-Suco de Goiaba 600ml (unid) = R$ 4,00",
												  "-Suco de Limão 600ml (unid) = R$ 4,00"};
		
		System.out.println("*Produtos Disponives para compra no atual momento:");
		
		//LOOP PARA VARRER A ARRAY lISTADEPRODUTOS
		for(int y = 0; y< ListaDeProdutos.length; y++ ) {
			System.out.println(ListaDeProdutos[y]);
		}
		
		System.out.println();
		
		System.out.println("Deseja Realizar uma compra? (s) Não? (n)"); // DECIDIR SE O CLIENTE QUE REALIZAR UMA COMPRA OU NÃO
		dados = in.nextLine();
		clientes.setEscolhaDeCompra(dados);
		
		if(clientes.getEscolhaDeCompra().equals("s")) { // SE A RESPOSTA FOR "s" ELE VAI ENTRAR NA CONDIÇÃO E EXECUTAR AS LINHAS DE CODIGO ABAIXO
			
			for(int x = 0; x < 1; x++) {	//LOOP PARA REALIZAR O CADASTRO DE CLIENTES				
				System.out.println("Cadastre os dados do cliente para realizar o pedido de compra:"); 
				
				System.out.print("Digite o nome do cliente: ");
				dados = in.nextLine();
				clientes.setNome(dados);
				
				System.out.print("Digite o CPF do cliente:");
				dados = in.nextLine();
				clientes.setCpf(dados);
						
				System.out.print("Digite o Telefone do cliente:");
				dados = in.nextLine();
				clientes.setTelefone(dados);
				System.out.println();
				
				System.out.println("Quais produtos o cliente quer??");
				dados = in.nextLine();
				clientes.setEscolhaDeCompra(dados);
				
				if(clientes.getEscolhaDeCompra().equals("todos os sucos")) { //LOOP PARA SABER QUANTIDADE DE PRODUTOS E QUAIS PRODUTOS O CLIENTE QUER
					for(int a = 0; a < ListaDeProdutos.length; a++) {
						System.out.println("Quantas unidade(s) de suco de Uva?");
						quantidadeDeSucos = in.nextInt();
						Produto.setQuantidadeSucoDeUva(quantidadeDeSucos);
						
						System.out.println("Quantas unidade(s) de suco de Laranja?");
						quantidadeDeSucos = in.nextInt();
						Produto.setQuantidadeSucoDeLaranja(quantidadeDeSucos);
						
						System.out.println("Quantas unidade(s) de suco de Goiaba");
						quantidadeDeSucos = in.nextInt();
						Produto.setQuantidadeSucoDeGoiaba(quantidadeDeSucos);
						
						System.out.println("Quantas unidade(s) de suco de Limão?");
						quantidadeDeSucos = in.nextInt();
						Produto.setQuantidadeSucoDeLimao(quantidadeDeSucos);
						
						break;
					}
				}
				
				
			}
		}else {
			System.out.println("!Execução de compra encerrada!");
		}
		
		for(int x = 0; x <1; x++) { //LOOP PARA IMPRESSÃO DE RELATORIO DE COMPRA REALIZADA
			System.out.println();
			System.out.println("-------RELATORIO DE COMPRA------");
			System.out.println("Nome Do Cliente: " + clientes.getNome());
			System.out.println("Telefone: " + clientes.getTelefone());
			System.out.println("CPF: " + clientes.getCpf());
			System.out.println("Pedido Feito:");
			System.out.println("Quantidade de sucos de uva: " + Produto.getQuantidadeSucoDeUva() + " Valor: " + (Produto.getQuantidadeSucoDeUva()*Produto.getSucoDeGoiaba600ml()));
			System.out.println("Quantidade de sucos de laranja: " + Produto.getQuantidadeSucoDeLaranja() + " Valor: " + (Produto.getQuantidadeSucoDeLaranja()*Produto.getSucoDeLaranja600ml()));
			System.out.println("Quantidade de sucos de goiaba: " + Produto.getQuantidadeSucoDeGoiaba() +" Valor: " + (Produto.getQuantidadeSucoDeGoiaba()*Produto.getSucoDeGoiaba600ml()));
			System.out.println("Quantidade de sucos de limão: " + Produto.getQuantidadeSucoDeLimao()+" Valor: " + (Produto.getQuantidadeSucoDeLimao()*Produto.getSucoDeLimão600ml()));
			System.out.println("Valor total da compra = " + (Produto.getQuantidadeSucoDeUva() +  Produto.getQuantidadeSucoDeUva()*Produto.getSucoDeGoiaba600ml()+Produto.getQuantidadeSucoDeLaranja() +  Produto.getQuantidadeSucoDeLaranja()*Produto.getSucoDeLaranja600ml()+Produto.getQuantidadeSucoDeGoiaba()*Produto.getSucoDeGoiaba600ml()+Produto.getQuantidadeSucoDeLimao()+ Produto.getQuantidadeSucoDeLimao()*Produto.getSucoDeLimão600ml()));
			System.out.println("Desconto adquirido e novo valor: " + (Produto.getQuantidadeSucoDeUva() + Produto.getQuantidadeSucoDeUva()*Produto.getSucoDeGoiaba600ml()+Produto.getQuantidadeSucoDeLaranja() + Produto.getQuantidadeSucoDeLaranja()*Produto.getSucoDeLaranja600ml()+Produto.getQuantidadeSucoDeGoiaba()*Produto.getSucoDeGoiaba600ml()+Produto.getQuantidadeSucoDeLimao()+ Produto.getQuantidadeSucoDeLimao()*Produto.getSucoDeLimão600ml()*6/100));
			
		}
		
		
	}
}
