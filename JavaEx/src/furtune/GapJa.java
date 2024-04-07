package furtune;

public class GapJa {
	String ilju;
	static String ilgan;
	static String ilji;
	
	static String yungan;
	static String yunji;
	static String wolgan;
	static String wolji;
	static String sigan;
	static String siji;
	
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
	public String getWolgan() {
		return wolgan;
	}
	public void setWolgan(String wolgan) {
		this.wolgan = wolgan;
	}
	public String getWolji() {
		return wolji;
	}
	public void setWolji(String wolji) {
		this.wolji = wolji;
	}
	public String getSigan() {
		return sigan;
	}
	public void setSigan(String sigan) {
		this.sigan = sigan;
	}
	
    public String getIlju() {
		return ilju;
	}
	public void setIlju(String ilju) {
		this.ilju = ilju;
	}
	public String getIlgan() {
		return ilgan;
	}
	public void setIlgan(String ilgan) {
		this.ilgan = ilgan;
	}
	public String getIlji() {
		return ilji;
	}
	public void setIlji(String ilji) {
		this.ilji = ilji;
	}
	
	public GapJa() {
		
	}
	
	
	
	public GapJa(String ilju) {
		super();
		this.ilju = ilju;
	}
	public static void transformer(String lunYear, String lunMonth, String lunDay, int hour) {

    //	연간
    int chungan1 = Integer.parseInt(lunYear)%10;
	yungan="";
	switch (chungan1) {
	case 4:	yungan="갑"; break;	case 5:	yungan="을"; break;	case 6:	yungan="병"; break;	case 7:	yungan="정"; break;
	case 8:	yungan="무"; break;	case 9:	yungan="기"; break;	case 0:	yungan="경"; break;	case 1:	yungan="신"; break;
	case 2:	yungan="임"; break;	case 3:	yungan="계"; break;
	}	
	
    //	월간	
	int chungan2 = Integer.parseInt(lunMonth);
	if (yungan.equals("갑") || yungan.equals("기")) { 
	switch(chungan2) { 
	case 1:	wolgan = "병"; break; case 2: wolgan = "정"; break; case 3: wolgan = "무"; break;
	case 4: wolgan = "기"; break; case 5: wolgan = "경"; break; case 6: wolgan = "신"; break;
	case 7:	wolgan = "임"; break; case 8: wolgan = "계"; break; case 9: wolgan = "갑"; break;
	case 10: wolgan = "을"; break; case 11: wolgan = "병"; break; case 12: wolgan = "정"; break;}
	}
	else if (yungan.equals("을") || yungan.equals("경")) {
		switch (chungan2) {
		case 1:	wolgan = "무"; break; case 2: wolgan = "기"; break; case 3: wolgan = "경"; break;
		case 4: wolgan = "신"; break; case 5: wolgan = "임"; break; case 6: wolgan = "계"; break;
		case 7:	wolgan = "갑"; break; case 8: wolgan = "을"; break; case 9: wolgan = "병"; break;
		case 10: wolgan = "정"; break; case 11: wolgan = "무"; break; case 12: wolgan = "기"; break;}
		}
	else if (yungan.equals("병") || yungan.equals("신")) {
		switch(chungan2) {
		case 1: wolgan = "경"; break; case 2: wolgan = "신"; break; case 3: wolgan = "임"; break;
		case 4: wolgan = "계"; break; case 5: wolgan = "갑"; break; case 6: wolgan = "을"; break;
		case 7:	wolgan = "병"; break; case 8: wolgan = "정"; break; case 9: wolgan = "무"; break;
		case 10: wolgan = "기"; break; case 11: wolgan = "경"; break; case 12: wolgan = "신"; break;}
		}
	else if (yungan.equals("정") || yungan.equals("임")) {
		switch(chungan2) {
		case 1: wolgan = "임"; break; case 2: wolgan = "계"; break; case 3: wolgan = "갑"; break;
		case 4: wolgan = "을"; break; case 5: wolgan = "병"; break; case 6: wolgan = "정"; break;
		case 7:	wolgan = "무"; break; case 8: wolgan = "기"; break; case 9: wolgan = "경"; break;
		case 10: wolgan = "신"; break; case 11: wolgan = "임"; break; case 12: wolgan = "계"; break;}
		}
	else if (yungan.equals("무") || yungan.equals("계")) {
		switch(chungan2) {
		case 1: wolgan = "갑"; break; case 2: wolgan = "을"; break; case 3: wolgan = "병"; break;
		case 4: wolgan = "정"; break; case 5: wolgan = "무"; break; case 6: wolgan = "기"; break;
		case 7:	wolgan = "경"; break; case 8: wolgan = "신"; break; case 9: wolgan = "임"; break;
		case 10: wolgan = "계"; break; case 11: wolgan = "갑"; break; case 12: wolgan = "을"; break;}	
		}
	
	//	연지
	int jiji = Integer.parseInt(lunYear)%12;
	yunji = "";
	switch (jiji) {
	case 4:	yunji="자"; break;	case 5: yunji="축"; break;	case 6: yunji="인"; break;	case 7: yunji="묘"; break;
	case 8: yunji="진"; break;	case 9: yunji="사"; break;	case 10: yunji="오"; break;	case 11: yunji="미"; break;
	case 0: yunji="신"; break;	case 1: yunji="유"; break;	case 2: yunji="술"; break;	case 3: yunji="해"; break;
	}	
	
    //	월지
	int wol = Integer.parseInt(lunMonth);
	wolji = ""; 
	switch(wol) {
	case 11: wolji="자"; break; case 12: wolji="축"; break; case 1: wolji="인"; break;
	case 2: wolji="묘"; break; case 3: wolji="진"; break; case 4: wolji="사"; break;
	case 5: wolji="오"; break; case 6: wolji="미"; break; case 7: wolji="신"; break;
	case 8: wolji="유"; break; case 9: wolji="술"; break; case 10: wolji="해"; break;
	}
	//	API적시된 대로 일간-일지 도출
	StringBuilder sb = new StringBuilder(lunDay);
	ilgan = String.valueOf(sb.charAt(0));
	ilji = String.valueOf(sb.charAt(1));
	
	//	시지
	int si=10;
	siji = "";
	if (si>=23 || si<1) {siji="자";}	else if (si>=1 && si<3) {siji="축";}	else if (si>=3 && si<5) {siji="인";}
	else if (si>=5 && si<7) {siji="묘";}	else if (si>=7 && si<9) {siji="진";}	else if (si>=9 && si<11) {siji="사";}
	else if (si>=11 && si<13) {siji="오";}	else if (si>=13 && si<15) {siji="미";}	else if (si>=15 && si<17) {siji="신";}
	else if (si>=17 && si<19) {siji="유";}	else if (si>=19 && si<21) {siji="술";}	else if (si>=21 && si<23) {siji="해";}
	
//	시간
	if (ilgan.equals("갑") || ilgan.equals("기")) {
		if (si>=23 || si<1) {sigan="갑";}	else if (si>=1 && si<3) {sigan="을";}	else if (si>=3 && si<5) {sigan="병";}
		else if (si>=5 && si<7) {sigan="정";}	else if (si>=7 && si<9) {sigan="무";}	else if (si>=9 && si<11) {sigan="기";}
		else if (si>=11 && si<13) {sigan="경";}	else if (si>=13 && si<15) {sigan="신";}	else if (si>=15 && si<17) {sigan="임";}
		else if (si>=17 && si<19) {sigan="계";}	else if (si>=19 && si<21) {sigan="갑";}	else if (si>=21 && si<23) {sigan="을";}
		}
	else if (ilgan.equals("을") || ilgan.equals("경")) {
		if (si>=23 || si<1) {sigan="병";}	else if (si>=1 && si<3) {sigan="정";}	else if (si>=3 && si<5) {sigan="무";}
		else if (si>=5 && si<7) {sigan="기";}	else if (si>=7 && si<9) {sigan="경";}	else if (si>=9 && si<11) {sigan="신";}
		else if (si>=11 && si<13) {sigan="임";}	else if (si>=13 && si<15) {sigan="계";}	else if (si>=15 && si<17) {sigan="갑";}
		else if (si>=17 && si<19) {sigan="을";}	else if (si>=19 && si<21) {sigan="병";}	else if (si>=21 && si<23) {sigan="정";}
		}
	else if (ilgan.equals("병") || ilgan.equals("신")) {
		if (si>=23 || si<1) {sigan="무";}	else if (si>=1 && si<3) {sigan="기";}	else if (si>=3 && si<5) {sigan="경";}
		else if (si>=5 && si<7) {sigan="신";}	else if (si>=7 && si<9) {sigan="임";}	else if (si>=9 && si<11) {sigan="계";}
		else if (si>=11 && si<13) {sigan="갑";}	else if (si>=13 && si<15) {sigan="을";}	else if (si>=15 && si<17) {sigan="병";}
		else if (si>=17 && si<19) {sigan="정";}	else if (si>=19 && si<21) {sigan="무";}	else if (si>=21 && si<23) {sigan="기";}
		}
	else if (ilgan.equals("정") || ilgan.equals("임")) {
		if (si>=23 || si<1) {sigan="경";}	else if (si>=1 && si<3) {sigan="신";}	else if (si>=3 && si<5) {sigan="임";}
		else if (si>=5 && si<7) {sigan="계";}	else if (si>=7 && si<9) {sigan="갑";}	else if (si>=9 && si<11) {sigan="을";}
		else if (si>=11 && si<13) {sigan="병";}	else if (si>=13 && si<15) {sigan="정";}	else if (si>=15 && si<17) {sigan="무";}
		else if (si>=17 && si<19) {sigan="기";}	else if (si>=19 && si<21) {sigan="경";}	else if (si>=21 && si<23) {sigan="신";}
		}
	else if (ilgan.equals("무") || ilgan.equals("계")) {
		if (si>=23 || si<1) {sigan="임";}	else if (si>=1 && si<3) {sigan="계";}	else if (si>=3 && si<5) {sigan="갑";}
		else if (si>=5 && si<7) {sigan="을";}	else if (si>=7 && si<9) {sigan="병";}	else if (si>=9 && si<11) {sigan="정";}
		else if (si>=11 && si<13) {sigan="무";}	else if (si>=13 && si<15) {sigan="기";}	else if (si>=15 && si<17) {sigan="경";}
		else if (si>=17 && si<19) {sigan="신";}	else if (si>=19 && si<21) {sigan="임";}	else if (si>=21 && si<23) {sigan="계";}
		}
	
	System.out.printf("시주\t일주\t월주\t연주%n"
					+ "%s \t %s \t %s \t %s%n"
					+ "%s \t %s \t %s \t %s",
					sigan,ilgan, wolgan,yungan,
					siji,ilji,wolji,yunji);
	}
	
}
