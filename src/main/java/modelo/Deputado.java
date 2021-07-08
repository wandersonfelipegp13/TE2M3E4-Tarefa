package modelo;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "livro")
public class Deputado {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "uri")
	private String uri;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "idlegislaturainicial")
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idLegislaturaInicial", nullable = false)
	private Legislatura idLegislaturaInicial;
	
	@Column(name = "idlegislaturafinal")
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idLegislaturaFinal", nullable = false)
	private Legislatura idLegislaturaFinal;
	
	@Column(name = "nomecivil")
	private String nomeCivil;
	
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "siglasexo")
	private String siglaSexo;
	
	@Column(name = "datanascimento")
	private Date dataNascimento;
	
	@Column(name = "datafalecimento")
	private String dataFalecimento;
	
	@Column(name = "ufnascimento")
	private String ufNascimento;
	
	@Column(name = "municipionascimento")
	private String municipioNascimento;

	public Deputado() {
		super();
	}

	public Deputado(int id, String uri, String nome, Legislatura idLegislaturaInicial, Legislatura idLegislaturaFinal,
			String nomeCivil, String cpf, String siglaSexo, Date dataNascimento, String dataFalecimento,
			String ufNascimento, String municipioNascimento) {
		super();
		this.setId(id);
		this.setUri(uri);
		this.setNome(nome);
		this.setIdLegislaturaInicial(idLegislaturaInicial);
		this.setIdLegislaturaFinal(idLegislaturaFinal);
		this.setNomeCivil(nomeCivil);
		this.setCpf(cpf);
		this.setSiglaSexo(siglaSexo);
		this.setDataNascimento(dataNascimento);
		this.setDataFalecimento(dataFalecimento);
		this.setUfNascimento(ufNascimento);
		this.setMunicipioNascimento(municipioNascimento);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Legislatura getIdLegislaturaInicial() {
		return idLegislaturaInicial;
	}

	public void setIdLegislaturaInicial(Legislatura idLegislaturaInicial) {
		this.idLegislaturaInicial = idLegislaturaInicial;
	}

	public Legislatura getIdLegislaturaFinal() {
		return idLegislaturaFinal;
	}

	public void setIdLegislaturaFinal(Legislatura idLegislaturaFinal) {
		this.idLegislaturaFinal = idLegislaturaFinal;
	}

	public String getNomeCivil() {
		return nomeCivil;
	}

	public void setNomeCivil(String nomeCivil) {
		this.nomeCivil = nomeCivil;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSiglaSexo() {
		return siglaSexo;
	}

	public void setSiglaSexo(String siglaSexo) {
		this.siglaSexo = siglaSexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getDataFalecimento() {
		return dataFalecimento;
	}

	public void setDataFalecimento(String dataFalecimento) {
		this.dataFalecimento = dataFalecimento;
	}

	public String getUfNascimento() {
		return ufNascimento;
	}

	public void setUfNascimento(String ufNascimento) {
		this.ufNascimento = ufNascimento;
	}

	public String getMunicipioNascimento() {
		return municipioNascimento;
	}

	public void setMunicipioNascimento(String municipioNascimento) {
		this.municipioNascimento = municipioNascimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((dataFalecimento == null) ? 0 : dataFalecimento.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + id;
		result = prime * result + ((idLegislaturaFinal == null) ? 0 : idLegislaturaFinal.hashCode());
		result = prime * result + ((idLegislaturaInicial == null) ? 0 : idLegislaturaInicial.hashCode());
		result = prime * result + ((municipioNascimento == null) ? 0 : municipioNascimento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((nomeCivil == null) ? 0 : nomeCivil.hashCode());
		result = prime * result + ((siglaSexo == null) ? 0 : siglaSexo.hashCode());
		result = prime * result + ((ufNascimento == null) ? 0 : ufNascimento.hashCode());
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
		Deputado other = (Deputado) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (dataFalecimento == null) {
			if (other.dataFalecimento != null)
				return false;
		} else if (!dataFalecimento.equals(other.dataFalecimento))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (id != other.id)
			return false;
		if (idLegislaturaFinal == null) {
			if (other.idLegislaturaFinal != null)
				return false;
		} else if (!idLegislaturaFinal.equals(other.idLegislaturaFinal))
			return false;
		if (idLegislaturaInicial == null) {
			if (other.idLegislaturaInicial != null)
				return false;
		} else if (!idLegislaturaInicial.equals(other.idLegislaturaInicial))
			return false;
		if (municipioNascimento == null) {
			if (other.municipioNascimento != null)
				return false;
		} else if (!municipioNascimento.equals(other.municipioNascimento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nomeCivil == null) {
			if (other.nomeCivil != null)
				return false;
		} else if (!nomeCivil.equals(other.nomeCivil))
			return false;
		if (siglaSexo == null) {
			if (other.siglaSexo != null)
				return false;
		} else if (!siglaSexo.equals(other.siglaSexo))
			return false;
		if (ufNascimento == null) {
			if (other.ufNascimento != null)
				return false;
		} else if (!ufNascimento.equals(other.ufNascimento))
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
		return "id=" + id + ", uri=" + uri + ", nome=" + nome + ", idLegislaturaInicial="
				+ idLegislaturaInicial + ", idLegislaturaFinal=" + idLegislaturaFinal + ", nomeCivil=" + nomeCivil
				+ ", cpf=" + cpf + ", siglaSexo=" + siglaSexo + ", dataNascimento=" + dataNascimento
				+ ", dataFalecimento=" + dataFalecimento + ", ufNascimento=" + ufNascimento + ", municipioNascimento="
				+ municipioNascimento + "]";
	}

}
