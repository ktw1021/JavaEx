package furtune;

public class GanJi {
	
	private String gan;
	private String ji;
	private String day;
	private Boolean yinYang;
	
	public GanJi() {
		
	}
	
	public GanJi(String gan, String ji, String day, Boolean yinYang) {
		this.gan = gan;
		this.ji = ji;
		this.day = day;
		this.yinYang = yinYang;
	}
	
	public String getGan() {
		return gan;
	}
	public void setGan(String gan) {
		this.gan = gan;
	}
	public String getJi() {
		return ji;
	}
	public void setJi(String ji) {
		this.ji = ji;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public Boolean getYinYang() {
		return yinYang;
	}
	public void setYinYang(Boolean yinYang) {
		this.yinYang = yinYang;
	}
	
	
	
	
}
