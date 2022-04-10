package application;

import java.util.Scanner;
            // importanto a classe "ValidaCPF" do pacote "meuPacote"

        public class ValidaCpf {

          public static void main(String[] args) {
        	do {
	            Scanner ler = new Scanner(System.in);
	
	            String CPF;
	
	            System.out.printf("Informe um CPF: ");
	            CPF = ler.next();
	
	            System.out.printf("\nResultado: ");
	                
	            if (Main.isCPF(CPF) == true) {
	            	System.out.printf("\nCPF valido! \n");
	                System.out.printf("%s\n", Main.imprimeCPF(CPF));
	            }else {
	            	System.out.printf("Erro, CPF invalido !!!\n");
	            }
	            System.out.printf("\n\n");
        	}while(true);
        }
       }