package br.com.cotiinformatica.domain.exceptions;

public class AcessoNegadoException  extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public AcessoNegadoException () {
		super ("Acesso Negado. Usuário não encontrado.");
	}

}
