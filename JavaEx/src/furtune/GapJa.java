package furtune;

import java.util.HashMap;
import java.util.Map;

public class GapJa {
	
	private String ilju;
	private static String ilgan;
	private static String ilji;
	private static String yungan;
	private static String yunji;
	private static String wolgan;
	private static String wolji;
	private static String sigan;
	private static String siji;
	
	public static String getYungan() {
		return yungan;
	}
	public static void setYungan(String newYungan) {
		yungan = newYungan;
	}
	public String getYunji() {
		return yunji;
	}
	public static void setYunji(String newYunji) {
		yunji = newYunji;
	}
	public String getSiji() {
		return siji;
	}
	public static void setSiji(String newSiji) {
		siji = newSiji;
	}
	public String getWolgan() {
		return wolgan;
	}
	public static void setWolgan(String newWolgan) {
		wolgan = newWolgan;
	}
	public String getWolji() {
		return wolji;
	}
	public static void setWolji(String newWolji) {
		wolji = newWolji;
	}
	public String getSigan() {
		return sigan;
	}
	public static void setSigan(String newSigan) {
		sigan = newSigan;
	}
	
    public String getIlju() {
		return ilju;
	}
	public void setIlju(String ilju) {
		this.ilju = ilju;
	}
	public static String getIlgan() {
		return ilgan;
	}
	public static void setIlgan(String newIlgan) {
		ilgan = newIlgan;
	}
	public String getIlji() {
		return ilji;
	}
	public static void setIlji(String newIlji) {
		ilji = newIlji;
	}
	
	private static Map<String, GapJa> EightKeyMap = new HashMap<>();
	

	public static void transformer(String lunYear, String lunMonth, String lunDay,int inputHour) {

    //	연간
    int chungan1 = Integer.parseInt(lunYear)%10;
	
	switch (chungan1) {
	case 4:	setYungan("갑"); break;	case 5:	setYungan("을"); break;	case 6:	setYungan("병"); break;	case 7:	setYungan("정"); break;
	case 8:	setYungan("무"); break;	case 9:	setYungan("기"); break;	case 0:	setYungan("경"); break;	case 1:	setYungan("신"); break;
	case 2:	setYungan("임"); break;	case 3:	setYungan("계"); break;
	}	
	
    //	월간	
	int chungan2 = Integer.parseInt(lunMonth);
	if (yungan.equals("갑") || yungan.equals("기")) { 
	switch(chungan2) { 
	case 1:	setWolgan("병"); break; case 2: setWolgan("정"); break; case 3: setWolgan("무"); break;
	case 4: setWolgan("기"); break; case 5: setWolgan("경"); break; case 6: setWolgan("신"); break;
	case 7:	setWolgan("임"); break; case 8: setWolgan("계"); break; case 9: setWolgan("갑"); break;
	case 10: setWolgan("을"); break; case 11: setWolgan("병"); break; case 12: setWolgan("정"); break;}
	}
	else if (yungan.equals("을") || yungan.equals("경")) {
		switch (chungan2) {
		case 1:	setWolgan("무"); break; case 2: setWolgan("기"); break; case 3: setWolgan("경"); break;
		case 4: setWolgan("신"); break; case 5: setWolgan("임"); break; case 6: setWolgan("계"); break;
		case 7:	setWolgan("갑"); break; case 8: setWolgan("을"); break; case 9: setWolgan("병"); break;
		case 10: setWolgan("정"); break; case 11: setWolgan("무"); break; case 12: setWolgan("기"); break;}
		}
	else if (yungan.equals("병") || yungan.equals("신")) {
		switch(chungan2) {
		case 1: setWolgan("경"); break; case 2: setWolgan("신"); break; case 3: setWolgan("임"); break;
		case 4: setWolgan("계"); break; case 5: setWolgan("갑"); break; case 6: setWolgan("을"); break;
		case 7:	setWolgan("병"); break; case 8: setWolgan("정"); break; case 9: setWolgan("무"); break;
		case 10: setWolgan("기"); break; case 11: setWolgan("경"); break; case 12: setWolgan("신"); break;}
		}
	else if (yungan.equals("정") || yungan.equals("임")) {
		switch(chungan2) {
		case 1: setWolgan("임"); break; case 2: setWolgan("계"); break; case 3: setWolgan("갑"); break;
		case 4: setWolgan("을"); break; case 5: setWolgan("병"); break; case 6: setWolgan("정"); break;
		case 7:	setWolgan("무"); break; case 8: setWolgan("기"); break; case 9: setWolgan("경"); break;
		case 10: setWolgan("신"); break; case 11: setWolgan("임"); break; case 12: setWolgan("계"); break;}
		}
	else if (yungan.equals("무") || yungan.equals("계")) {
		switch(chungan2) {
		case 1: setWolgan("갑"); break; case 2: setWolgan("을"); break; case 3: setWolgan("병"); break;
		case 4: setWolgan("정"); break; case 5: setWolgan("무"); break; case 6: setWolgan("기"); break;
		case 7:	setWolgan("경"); break; case 8: setWolgan("신"); break; case 9: setWolgan("임"); break;
		case 10: setWolgan("계"); break; case 11: setWolgan("갑"); break; case 12: setWolgan("을"); break;}	
		}
	
	//	연지
	int jiji = Integer.parseInt(lunYear)%12;
	switch (jiji) {
	case 4:	setYunji("자"); break;	case 5: setYunji("축"); break;	case 6: setYunji("인"); break;	case 7: setYunji("묘"); break;
	case 8: setYunji("진"); break;	case 9: setYunji("사"); break;	case 10: setYunji("오"); break;	case 11: setYunji("미"); break;
	case 0: setYunji("신"); break;	case 1: setYunji("유"); break;	case 2: setYunji("술"); break;	case 3: setYunji("해"); break;
	}	
	
    //	월지
	int wol = Integer.parseInt(lunMonth);
	switch(wol) {
	case 11: setWolji("자"); break; case 12: setWolji("축"); break; case 1: setWolji("인"); break;
	case 2: setWolji("묘"); break; case 3: setWolji("진"); break; case 4: setWolji("사"); break;
	case 5: setWolji("오"); break; case 6: setWolji("미"); break; case 7: setWolji("신"); break;
	case 8: setWolji("유"); break; case 9: setWolji("술"); break; case 10: setWolji("해"); break;
	}
	//	API적시된 대로 일간-일지 도출
	StringBuilder sb = new StringBuilder(lunDay);
	ilgan = String.valueOf(sb.charAt(0));
	ilji = String.valueOf(sb.charAt(1));
	
	//	시지
	int si=inputHour;
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
	
	String siganElement = HeavenlyStemsManager.getElementByStem(sigan);
	String ilganElement = HeavenlyStemsManager.getElementByStem(ilgan);
	String wolganElement = HeavenlyStemsManager.getElementByStem(wolgan);
	String yunganElement = HeavenlyStemsManager.getElementByStem(yungan);
	
	String sijiElement = ZodiacManager.getElementByZodiac(siji);
	String iljiElement = ZodiacManager.getElementByZodiac(ilji);
	String woljiElement = ZodiacManager.getElementByZodiac(wolji);
	String yunjiElement = ZodiacManager.getElementByZodiac(yunji);
	
	System.out.printf("시주\t일주\t월주\t연주%n"
					+ "%s(%s) \t %s(%s) \t %s(%s) \t %s(%s)%n"
					+ "%s(%s) \t %s(%s) \t %s(%s) \t %s(%s)",
					sigan,siganElement,ilgan,ilganElement,wolgan,wolganElement,yungan,yunganElement,
					siji,sijiElement,ilji,iljiElement,wolji,woljiElement,yunji,yunjiElement);
	
	EightKeyMap.put(sigan, new GapJa());
	EightKeyMap.put(ilgan, new GapJa());
	EightKeyMap.put(wolgan, new GapJa());
	EightKeyMap.put(yungan, new GapJa());
	EightKeyMap.put(siji, new GapJa());
	EightKeyMap.put(ilji, new GapJa());
	EightKeyMap.put(wolji, new GapJa());
	EightKeyMap.put(yunji, new GapJa());
	
	}
	
    public static String getSiganByKey(String name) {
        EightKeyMap.get(name);
		return EightKeyMap.containsKey(name) ? 
        		GapJa.sigan : "해당하는 십간이 없습니다.";
    }
	
    public static String getIlganByKey(String name) {
        EightKeyMap.get(name);
		return EightKeyMap.containsKey(name) ? 
        		GapJa.ilgan : "해당하는 십간이 없습니다.";
    }
    
    public static String getWolganByKey(String name) {
        EightKeyMap.get(name);
		return EightKeyMap.containsKey(name) ? 
        		GapJa.wolgan : "해당하는 십간이 없습니다.";
    }
    
    public static String getYunganByKey(String name) {
        EightKeyMap.get(name);
		return EightKeyMap.containsKey(name) ? 
        		GapJa.yungan : "해당하는 십간이 없습니다.";
    }
    
    
    
    
}

