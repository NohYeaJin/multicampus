package dto;

public class AddressVo {

	private String zipNum;
	private String sido;
	private String gugun;
	private String dong;
	private String zipCode;
	private String bunji;
	private String Ri;
	
	public String getRi() {
		return Ri;
	}

	public void setRi(String ri) {
		Ri = ri;
	}

	public String getBldg() {
		return Bldg;
	}

	public void setBldg(String bldg) {
		Bldg = bldg;
	}

	private String Bldg;

	public String getZipNum() {
		return zipNum;
	}

	public void setZipNum(String zipNum) {
		this.zipNum = zipNum;
	}

	public String getSido() {
		return sido;
	}

	public void setSido(String sido) {
		this.sido = sido;
	}

	public String getGugun() {
		return gugun;
	}

	public void setGugun(String gugun) {
		this.gugun = gugun;
	}

	public String getDong() {
		return dong;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getBunji() {
		return bunji;
	}

	public void setBunji(String bunji) {
		this.bunji = bunji;
	}

}
