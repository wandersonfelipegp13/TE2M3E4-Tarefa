package json;

import java.util.ArrayList;
import java.util.List;

import modelo.Deputado;

public class DadosDeputado {
	
	public List<Deputado> dados;

	public String getDeputados() {
		return dados.toString();
	}

	public void addDeputados(Deputado deputados) {
		if(this.dados == null)
			this.dados = new ArrayList<Deputado>();
		this.dados.add(deputados);
	}

}
