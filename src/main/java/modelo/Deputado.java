package modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "deputado")
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
	private int idLegislaturaInicial;
	
	@Column(name = "idlegislaturafinal")
	private int idLegislaturaFinal;
	
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

	public Deputado(int id, String uri, String nome, int idLegislaturaInicial, int idLegislaturaFinal,
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

	public int getIdLegislaturaInicial() {
		return idLegislaturaInicial;
	}

	public void setIdLegislaturaInicial(int idLegislaturaInicial) {
		this.idLegislaturaInicial = idLegislaturaInicial;
	}

	public int getIdLegislaturaFinal() {
		return idLegislaturaFinal;
	}

	public void setIdLegislaturaFinal(int idLegislaturaFinal) {
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
	public String toString() {
		return "id=" + id + ", uri=" + uri + ", nome=" + nome + ", idLegislaturaInicial="
				+ idLegislaturaInicial + ", idLegislaturaFinal=" + idLegislaturaFinal + ", nomeCivil=" + nomeCivil
				+ ", cpf=" + cpf + ", siglaSexo=" + siglaSexo + ", dataNascimento=" + dataNascimento
				+ ", dataFalecimento=" + dataFalecimento + ", ufNascimento=" + ufNascimento + ", municipioNascimento="
				+ municipioNascimento + "]";
	}

}
