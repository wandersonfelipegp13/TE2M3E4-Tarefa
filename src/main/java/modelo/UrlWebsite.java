package modelo;

public class UrlWebsite {
	private int id;
	private String url;

	public UrlWebsite(int id, String url) {
		super();
		this.setId(id);
		this.setUrl(url);
	}

	public UrlWebsite(String url) {
		super();
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
		return "UrlWebsite [id=" + id + ", url=" + url + "]";
	}

}
