package modelo;

public class UrlRedeSocial {

	private int id;
	private String url;

	public UrlRedeSocial(int id, String url) {
		super();
		this.setId(id);
		this.setUrl(url);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "UrlRedeSocial [id=" + id + ", url=" + url + "]";
	}

}
