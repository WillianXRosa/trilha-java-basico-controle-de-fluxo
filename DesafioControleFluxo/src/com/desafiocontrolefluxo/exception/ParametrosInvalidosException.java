package com.desafiocontrolefluxo.exception;
import com.desafiocontrolefluxo.main.Contador;


public class ParametrosInvalidosException extends Exception{
	
	public void verificarValorParametros(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		if(parametroUm > parametroDois) {			
			throw new ParametrosInvalidosException();
		}
			
	}

}
