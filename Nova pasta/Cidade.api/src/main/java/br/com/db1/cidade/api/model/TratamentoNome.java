package br.com.db1.cidade.api.model;

public enum TratamentoNome {

	UPPERCASE {
		@Override
		public String trataNome(String nome) {
		return nome.toUpperCase();
		}
	},
	LOWERCASE {

		@Override
		public String trataNome(String nome) {
			return nome.toLowerCase();
		}
	},
	QUATRO_PRIMEIRAS_LETRAS {
		@Override
		public String trataNome(String nome) {

			return nome.substring(0, 4);
		}

	};
	public abstract String trataNome(String nome);

}
