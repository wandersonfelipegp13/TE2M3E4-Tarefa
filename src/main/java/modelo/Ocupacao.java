package modelo;

public class Ocupacao {

	private int id;
	private int idDeputado;
	private String uri;
	private String titulo;
	private String entidade;
	private String entidadeUF;
	private String entidadePais;
	private int anoInicio;
	private int anoFim;

	public Ocupacao() {
		super();
	}

	public Ocupacao(int id, int idDeputado, String uri, String titulo, String entidade, String entidadeUF,
			String entidadePais, int anoInicio, int anoFim) {
		super();
		this.setId(id);
		this.setIdDeputado(idDeputado);
		this.setUri(uri);
		this.setTitulo(titulo);
		this.setEntidade(entidade);
		this.setEntidadeUF(entidadeUF);
		this.setEntidadePais(entidadePais);
		this.setAnoInicio(anoInicio);
		this.setAnoFim(anoFim);
	}

	public Ocupacao(int idDeputado, String uri, String titulo, String entidade, String entidadeUF, String entidadePais,
			int anoInicio, int anoFim) {
		super();
		this.setIdDeputado(idDeputado);
		this.setUri(uri);
		this.setTitulo(titulo);
		this.setEntidade(entidade);
		this.setEntidadeUF(entidadeUF);
		this.setEntidadePais(entidadePais);
		this.setAnoInicio(anoInicio);
		this.setAnoFim(anoFim);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdDeputado() {
		return idDeputado;
	}

	public void setIdDeputado(int idDeputado) {
		this.idDeputado = idDeputado;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEntidade() {
		return entidade;
	}

	public void setEntidade(String entidade) {
		this.entidade = entidade;
	}

	public String getEntidadeUF() {
		return entidadeUF;
	}

	public void setEntidadeUF(String entidadeUF) {
		this.entidadeUF = entidadeUF;
	}

	public String getEntidadePais() {
		return entidadePais;
	}

	public void setEntidadePais(String entidadePais) {
		this.entidadePais = entidadePais;
	}

	public int getAnoInicio() {
		return anoInicio;
	}

	public void setAnoInicio(int anoInicio) {
		this.anoInicio = anoInicio;
	}

	public int getAnoFim() {
		return anoFim;
	}

	public void setAnoFim(int anoFim) {
		this.anoFim = anoFim;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anoFim;
		result = prime * result + anoInicio;
		result = prime * result + ((entidade == null) ? 0 : entidade.hashCode());
		result = prime * result + ((entidadePais == null) ? 0 : entidadePais.hashCode());
		result = prime * result + ((entidadeUF == null) ? 0 : entidadeUF.hashCode());
		result = prime * result + id;
		result = prime * result + idDeputado;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result + ((uri == null) ? 0 : uri.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ocupacao other = (Ocupacao) obj;
		if (anoFim != other.anoFim)
			return false;
		if (anoInicio != other.anoInicio)
			return false;
		if (entidade == null) {
			if (other.entidade != null)
				return false;
		} else if (!entidade.equals(other.entidade))
			return false;
		if (entidadePais == null) {
			if (other.entidadePais != null)
				return false;
		} else if (!entidadePais.equals(other.entidadePais))
			return false;
		if (entidadeUF == null) {
			if (other.entidadeUF != null)
				return false;
		} else if (!entidadeUF.equals(other.entidadeUF))
			return false;
		if (id != other.id)
			return false;
		if (idDeputado != other.idDeputado)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		if (uri == null) {
			if (other.uri != null)
				return false;
		} else if (!uri.equals(other.uri))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ocupacao [id=" + id + ", idDeputado=" + idDeputado + ", uri=" + uri + ", titulo=" + titulo
				+ ", entidade=" + entidade + ", entidadeUF=" + entidadeUF + ", entidadePais=" + entidadePais
				+ ", anoInicio=" + anoInicio + ", anoFim=" + anoFim + "]";
	}

}
