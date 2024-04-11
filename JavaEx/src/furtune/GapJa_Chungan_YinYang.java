package furtune;

import java.util.ArrayList;

//	사주의 음양 추출(+오행도 함께 추출하여 육친 클래스에 제공)
public class GapJa_Chungan_YinYang {

	private GapJa gapJa;
	private HeavenlyStems stem;
	
	public GapJa_Chungan_YinYang(GapJa gapJa) {
		this.gapJa=gapJa;
	}
	
	public GapJa_Chungan_YinYang(HeavenlyStems stem) {
		this.stem=stem;
	}
	
	public static void Chungan_YinYang() {

		// 천간의 음양 추출
		String yungan_YinYang = (HeavenlyStems.valueOf(GapJa.getYungan())).getYinYang();
		String wolgan_YinYang = (HeavenlyStems.valueOf(GapJa.getWolgan())).getYinYang();
		String ilgan_YinYang = (HeavenlyStems.valueOf(GapJa.getIlgan())).getYinYang();
		String siganYinYang = (HeavenlyStems.valueOf(GapJa.getSigan())).getYinYang();
		
		// 지지의 음양 추출
		String yunji_YinYang = (Zodiacs.valueOf(GapJa.getYunji())).getYinYang();
		String wolji_YinYang = (Zodiacs.valueOf(GapJa.getWolji())).getYinYang();
		String ilji_YinYang = (Zodiacs.valueOf(GapJa.getIlji())).getYinYang();
		String sijiYinYang = (Zodiacs.valueOf(GapJa.getSiji())).getYinYang();
		
		// 천간지지의 음양 리스트화(일간 기준으로 순서대로 정렬)
		ArrayList<String> yinYang_lst = new ArrayList<>();
		yinYang_lst.add(ilgan_YinYang);	yinYang_lst.add(siganYinYang);	yinYang_lst.add(wolgan_YinYang);yinYang_lst.add(yungan_YinYang); 
		yinYang_lst.add(sijiYinYang);	yinYang_lst.add(ilji_YinYang);	yinYang_lst.add(wolji_YinYang);	yinYang_lst.add(yunji_YinYang); 
		

		// 추출된 천간지지의 음양오행을, 육친 클래스에서 처리하여 반환
		GapJa_YukChin.YukChin_jiji(yinYang_lst);
		

		int yin = 0;
		int yang = 0;
		
		for (int i = 0; i<yinYang_lst.size(); i++) {
			if (yinYang_lst.get(i).equals("양")) {
				yang+=1;
			}
			else if (yinYang_lst.get(i).equals("음")) {
				yin+=1;
			}
		}
//		System.out.println("양: "+yang+", 음: "+yin);
//		System.out.println(yinYang_lst);
	}
}
