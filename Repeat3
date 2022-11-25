package banco;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        double valor, rentab;
	    char resposta;

	    do { // COMANDOS
	    	System.out.println("Informe o valor a ser investido:");
	        valor = in.nextDouble();
		    while(valor <= 0) {
		    	System.out.println("Valor inválido. insira um valor maior que zero: ");
		        valor = in.nextDouble();
		    } 
		    if(valor >= 100) {
	        	System.out.println("Poderá investir em poupança.");
	        	rentab = (0.5 / 100) * valor; 
	        	System.out.println("Seu lucro será de R$" + rentab);
	        }
	        if(valor >= 1000) {
	        	System.out.println("Poderá investir em Fundos de Renda Fixa.");
	        	rentab = (1.0 / 100) * valor;
	        	System.out.println("Seu lucro será de R$" + rentab);
	        }
	        if(valor >= 2500) {
	        	System.out.println("Poderá investir em CDBs.");
	        	rentab = (1.5/100) * valor;
	        	System.out.println("Seu lucro será de R$" + rentab);
	        }
	        System.out.println("Gostaria de analisar outro cliente? (s/n)");
	        resposta = in.next().charAt(0);
	        resposta = Character.toLowerCase(resposta);
	        while(resposta != 's' && resposta != 'n') {
	        	System.out.println("Resposta inválida. Insira s ou n:");
	        	resposta = in.next().charAt(0);
		        resposta = Character.toLowerCase(resposta);
	        }
	    }while(resposta == 's'); // CONDIÇÃO
	}

}
