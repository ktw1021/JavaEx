package fourju;

public class GapJa extends BirthDay {
	
	String yungan;
	String yunji;
	String wolgan;
	String wolji;
	String siji;
	

	public String getYungan() {
		return yungan;
	}
	public void setYungan(String yungan) {
		this.yungan = yungan;
	}
	public String getYunji() {
		return yunji;
	}
	public void setYunji(String yunji) {
		this.yunji = yunji;
	}
	public String getSiji() {
		return siji;
	}
	public void setSiji(String siji) {
		this.siji = siji;
	}
	
	public GapJa(int year, int month, int hour) {
	
	int chungan = year%10;
	yungan="";
	switch (chungan) {
	case 4:	yungan="갑"; break;	case 5:	yungan="을"; break;	case 6:	yungan="병"; break;	case 7:	yungan="정"; break;
	case 8:	yungan="무"; break;	case 9:	yungan="기"; break;	case 0:	yungan="경"; break;	case 1:	yungan="신"; break;
	case 2:	yungan="임"; break;	case 3:	yungan="계"; break;
	}	setYungan(yungan);
	
	if (yungan=="갑" || yungan=="기") {
		wolgan = "병";
	}
	else if (yungan=="을" || yungan=="경") {
		wolgan = "무";
	}
	else if (yungan=="병" || yungan=="신") {
		wolgan = "경";
	}
	else if (yungan=="정" || yungan=="임") {
		wolgan = "임";
	}
	if (yungan=="무" || yungan=="계") {
		wolgan = "갑";
	}
	
	int jiji = year%12;
	yunji = "";
	switch (jiji) {
	case 4:	yunji="자"; break;	case 5: yunji="축"; break;	case 6: yunji="인"; break;	case 7: yunji="묘"; break;
	case 8: yunji="진"; break;	case 9: yunji="사"; break;	case 10: yunji="오"; break;	case 11: yunji="미"; break;
	case 0: yunji="신"; break;	case 1: yunji="유"; break;	case 2: yunji="술"; break;	case 3: yunji="해"; break;
	}	setYunji(yunji);
	
	int wol = month;
	wolji = ""; 
	switch(wol) {
	case 11: wolji="자"; break; case 12: wolji="축"; break; case 1: wolji="인"; break;
	case 2: wolji="묘"; break; case 3: wolji="진"; break; case 4: wolji="사"; break;
	case 5: wolji="오"; break; case 6: wolji="미"; break; case 7: wolji="신"; break;
	case 8: wolji="유"; break; case 9: wolji="술"; break; case 10: wolji="해"; break;
	}
	
	
	int si = hour;
	siji = "";
	if (si>=23 || si<1) {siji="자";}	else if (si>=1 && si<3) {siji="축";}	else if (si>=3 && si<5) {siji="인";}
	else if (si>=5 && si<7) {siji="묘";}	else if (si>=7 && si<9) {siji="진";}	else if (si>=9 && si<11) {siji="사";}
	else if (si>=11 && si<13) {siji="오";}	else if (si>=13 && si<15) {siji="미";}	else if (si>=15 && si<17) {siji="신";}
	else if (si>=17 && si<19) {siji="유";}	else if (si>=19 && si<21) {siji="술";}	else if (si>=21 && si<23) {siji="해";}
	setSiji(siji);
	System.out.printf("%s%s\t%s",getYungan(),getYunji(), getSiji());
}
	
}
