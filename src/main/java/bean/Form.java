package bean;

public class Form implements java.io.Serializable{
	
	private String name;
	private String company;
	private String mail;
	private String content;
	private String[] magazines;
	private String information;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String[] getMagazines() {
		return magazines;
	}
	public void setMagazines(String[] magazines) {
		this.magazines = magazines;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	
	
}
