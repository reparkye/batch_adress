package batch_adress;

public class AddrListInfo {

	private int alNum;
	private String alZip;
	private String alCity;
	private String alCityEn;
	private String alState;
	private String alStateEn;
	private String alVil;
	private String alVilEn;
	private String alLoadCode;
	private String alLoadName;
	private String alLoadNameEn;
	private String alBuilOrg;
	private String alBuilSub;
	
	public AddrListInfo() {}
	
	public AddrListInfo(int alNum, String alZip, String alCity, String alCityEn, String alState, String alStateEn,
			String alVil, String alVilEn, String alLoadCode, String alLoadName, String alLoadNameEn, String alBuilOrg,
			String alBuilSub) {
		super();
		this.alNum = alNum;
		this.alZip = alZip;
		this.alCity = alCity;
		this.alCityEn = alCityEn;
		this.alState = alState;
		this.alStateEn = alStateEn;
		this.alVil = alVil;
		this.alVilEn = alVilEn;
		this.alLoadCode = alLoadCode;
		this.alLoadName = alLoadName;
		this.alLoadNameEn = alLoadNameEn;
		this.alBuilOrg = alBuilOrg;
		this.alBuilSub = alBuilSub;
	}

	@Override
	public String toString() {
		return "AddrListInfo [alNum=" + alNum + ", alZip=" + alZip + ", alCity=" + alCity + ", alCityEn=" + alCityEn
				+ ", alState=" + alState + ", alStateEn=" + alStateEn + ", alVil=" + alVil + ", alVilEn=" + alVilEn
				+ ", alLoadCode=" + alLoadCode + ", alLoadName=" + alLoadName + ", alLoadNameEn=" + alLoadNameEn
				+ ", alBuilOrg=" + alBuilOrg + ", alBuilSub=" + alBuilSub + "]";
	}



	public int getAlNum() {
		return alNum;
	}
	public void setAlNum(int alNum) {
		this.alNum = alNum;
	}
	public String getAlZip() {
		return alZip;
	}
	public void setAlZip(String alZip) {
		this.alZip = alZip;
	}
	public String getAlCity() {
		return alCity;
	}
	public void setAlCity(String alCity) {
		this.alCity = alCity;
	}
	public String getAlCityEn() {
		return alCityEn;
	}
	public void setAlCityEn(String alCityEn) {
		this.alCityEn = alCityEn;
	}
	public String getAlState() {
		return alState;
	}
	public void setAlState(String alState) {
		this.alState = alState;
	}
	public String getAlStateEn() {
		return alStateEn;
	}
	public void setAlStateEn(String alStateEn) {
		this.alStateEn = alStateEn;
	}
	public String getAlVil() {
		return alVil;
	}
	public void setAlVil(String alVil) {
		this.alVil = alVil;
	}
	public String getAlVilEn() {
		return alVilEn;
	}
	public void setAlVilEn(String alVilEn) {
		this.alVilEn = alVilEn;
	}
	public String getAlLoadCode() {
		return alLoadCode;
	}
	public void setAlLoadCode(String alLoadCode) {
		this.alLoadCode = alLoadCode;
	}
	public String getAlLoadName() {
		return alLoadName;
	}
	public void setAlLoadName(String alLoadName) {
		this.alLoadName = alLoadName;
	}
	public String getAlLoadNameEn() {
		return alLoadNameEn;
	}
	public void setAlLoadNameEn(String alLoadNameEn) {
		this.alLoadNameEn = alLoadNameEn;
	}
	public String getAlBuilOrg() {
		return alBuilOrg;
	}
	public void setAlBuilOrg(String alBuilOrg) {
		this.alBuilOrg = alBuilOrg;
	}
	public String getAlBuilSub() {
		return alBuilSub;
	}
	public void setAlBuilSub(String alBuilSub) {
		this.alBuilSub = alBuilSub;
	}
	 
	
}
