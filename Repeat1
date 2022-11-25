package lista3RepetiçãoQ2;

import java.util.Scanner;

public class Corp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
	    double pessoastotal, peso, altura, somaidades=0, mediaidade, percazul;
	    int cont=1, idade, contidade50peso60=0, qtdidade=0, contazul=0, contruivonaoazul=0;
	    char corolhos, corcabelo;
	    System.out.println("Programa de análise de dados");
	    System.out.println("");
	    System.out.println("Informe a quantidade de pessoas a serem analisadas: ");
        pessoastotal = in.nextDouble();
        while(pessoastotal < 1) {
        	System.out.println("Valor inválido. Por favor, tente novamente:");
            pessoastotal = in.nextDouble();
        }
        do {
	       	cont++;
	        System.out.println("Informe a idade do indivíduo em questão:");
	        idade = in.nextInt();
	        while(idade < 1 || idade > 120) {
	        	System.out.println("Idade inválida. Por favor, tente novamente:");
	            idade = in.nextInt();
	        }
	        System.out.println("Informe o peso do indivíduo em questão:");
	        peso = in.nextDouble();
	        while(peso < 3 || peso > 300) {
	        	System.out.println("Peso inválido. Por favor, tente novamente:");
	            peso = in.nextDouble();
	        }
	        System.out.println("Informe a altura do indivíduo em questão:");
	        altura = in.nextDouble();
	        while(altura < 0.5 || altura > 2.5) {
	        	System.out.println("Altura inválida. Por favor, tente novamente:");
	        	altura = in.nextDouble();
	        }
	        System.out.println("Informe a cor dos olhos do indivíduo em questão:");
	        corolhos = in.next().charAt(0);
	        corolhos = Character.toLowerCase(corolhos);
	        while(corolhos != 'a' && corolhos != 'p' && corolhos != 'v' && corolhos != 'c') {
	        	System.out.println("Cor inválida. Por favor, tente novamente:");
	        	corolhos = in.next().charAt(0);
		        corolhos = Character.toLowerCase(corolhos);
	        }
	        System.out.println("Informe a cor dos cabelos do indivíduo em questão:");
	        corcabelo = in.next().charAt(0);
	        corcabelo = Character.toLowerCase(corcabelo);
	        while(corcabelo != 'p' && corcabelo != 'c' && corcabelo != 'l' && corcabelo != 'r') {
	        	System.out.println("Cor inválida. Por favor, tente novamente:");
	        	corcabelo = in.next().charAt(0);
		        corcabelo = Character.toLowerCase(corcabelo);
	        }
	        if(idade > 50 && peso < 60) {
	        	contidade50peso60++;
	        }
	        if(altura < 1.50) {
	        	qtdidade++;
	        	somaidades = somaidades + idade;
	        }
	        if(corolhos == 'a') {
	        	contazul++;
	        }
	        if(corcabelo == 'r' && corolhos != 'a') {
	        	contruivonaoazul++;
	        }
	    }while(cont <= pessoastotal);
	    System.out.println("Quantidade de indivíduos com idade maior do que 50 anos e peso menor que 60kg: " + contidade50peso60);
	    if(qtdidade != 0) {
	    	mediaidade = somaidades / qtdidade;
	    	System.out.println("Média das idades de indivíduos com menos de 1,50m de altura: " + mediaidade);
	    }
	    else {
	    	System.out.println("Não há ninguém com a altura menor que 1,50m.");
	    }
	    percazul = (contazul * 100.0) / pessoastotal;
	    System.out.println("Percentual de indivíduos que têm olhos azuis: " + percazul + "%");
	    System.out.println("Quantidade de indivíduos ruivos e que não possuem olhos azuis: " + contruivonaoazul);
	}

}
