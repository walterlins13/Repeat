package lista3RepetiçãoQ1;

import java.util.Scanner;

public class Salário {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
	    double sal, aumento, novosal;
	    char resp;
	    do { 
	    	System.out.println("Programa para cálculo de salário");
	    	System.out.println("");
	    	System.out.println("Informe o atual salário do funcionário em questão: ");
	    	sal = in.nextDouble(); 
	    	while(sal < 1212) {
	    		System.out.println("Salário inválido. Digite outro valor: ");
	    	    sal = in.nextDouble();
	    	}
	    	if(sal > 4000) {
	    		aumento = (5.0 / 100) * sal;
	    		novosal = sal + aumento;
	    		System.out.println("O funcionário terá um aumento de R$" + aumento + " e passará a receber R$" + novosal);
	    	}
	    	if(sal > 2500 && sal <= 4000) {
	    		aumento = (10.0 / 100) * sal;
	    		novosal = sal + aumento;
	    		System.out.println("O funcionário terá um aumento de R$" + aumento + " e passará a receber R$" + novosal);
	    	}
	    	if(sal > 1500 && sal <= 2500) {
	    		aumento = (15.0 / 100) * sal;
	    		novosal = sal + aumento;
	    		System.out.println("O funcionário terá um aumento de R$" + aumento + " e passará a receber R$" + novosal);	
	    	}
	    	if(sal <= 1500) {
	    		aumento = (20.0 / 100) * sal;
	    		novosal = sal + aumento;
	    		System.out.println("O funcionário terá um aumento de R$" + aumento + " e passará a receber R$" + novosal);
	    	}
	    	System.out.println("Deseja calcular o salário de outro funcionário?");
	    	resp = in.next().charAt(0);
	    	resp = Character.toLowerCase(resp);
	    	while(resp != 's' && resp != 'n') {
	    		System.out.println("Resposta inválida. Digite s/n (sim ou não):");
	    		resp = in.next().charAt(0);
		    	resp = Character.toLowerCase(resp);
	    	}
	    }while(resp == 's'); 
	
	
	
	
	
	
	
	
	
	
	}

}
