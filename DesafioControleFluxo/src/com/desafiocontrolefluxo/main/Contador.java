package com.desafiocontrolefluxo.main;
import java.util.Scanner;

import com.desafiocontrolefluxo.exception.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (Exception exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("Primeiro parâmetro maior que o segundo parâmetro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois) {
			ParametrosInvalidosException parametros = new ParametrosInvalidosException();
			parametros.verificarValorParametros(parametroUm, parametroDois);
		}
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		for(int contar = 0; contar < contagem; contar++) {			
			System.out.println("Imprimindo o número: " + contar);
		}
	}	

	
	
	

}
