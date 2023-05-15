package com.kenneth.helpdesk.domain.enums;

public enum Prioridade {

	ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO"), ENCERRADO(2, "ENCERRADO");

	private Integer codigo;
	private String descrição;

	private Prioridade(Integer codigo, String descrição) {
		this.codigo = codigo;
		this.descrição = descrição;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescrição() {
		return descrição;
	}
	
	public static Prioridade  toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for (Prioridade x : Prioridade.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Status inválido!");
	}

}
