package br.com.cotiinformatica.domain.exceptions;

public class EmailJaCadastradoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -850880539366487127L;
	
	public EmailJaCadastradoException() {
		super("O emialinformado já está cadastrado. Tente outro.");
	}

}
