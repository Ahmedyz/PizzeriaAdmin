package fi.omapizzeria.admin.bean;

public class Pizza {

	private int id;
	private String nimi;
	private double hinta;

	public Pizza() {

	}

	public Pizza(int id, String nimi, double hinta) {

		this.id = id;
		this.nimi = nimi;
		this.hinta = hinta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}

	@Override
	public String toString() {
		return "Pizza [id=" + id + ", nimi=" + nimi + ", hinta=" + hinta + "]";
	}

}
