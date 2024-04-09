package furtune;

import java.util.ArrayList;

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

		
		String yungan_YinYang = (HeavenlyStems.valueOf(GapJa.getYungan())).getYinYang();
		String wolgan_YinYang = (HeavenlyStems.valueOf(GapJa.getWolgan())).getYinYang();
		String ilgan_YinYang = (HeavenlyStems.valueOf(GapJa.getIlgan())).getYinYang();
		String siganYinYang = (HeavenlyStems.valueOf(GapJa.getSigan())).getYinYang();
		
		String yunji_YinYang = (Zodiacs.valueOf(GapJa.getYunji())).getYinYang();
		String wolji_YinYang = (Zodiacs.valueOf(GapJa.getWolji())).getYinYang();
		String ilji_YinYang = (Zodiacs.valueOf(GapJa.getIlji())).getYinYang();
		String sijiYinYang = (Zodiacs.valueOf(GapJa.getSiji())).getYinYang();
		
		ArrayList<String> yinYang_lst = new ArrayList<>();
		yinYang_lst.add(ilgan_YinYang);	yinYang_lst.add(siganYinYang);	yinYang_lst.add(wolgan_YinYang);yinYang_lst.add(yungan_YinYang); 
		yinYang_lst.add(sijiYinYang);	yinYang_lst.add(ilji_YinYang);	yinYang_lst.add(wolji_YinYang);	yinYang_lst.add(yunji_YinYang); 
		

		ArrayList<String> element_lst = new ArrayList<>();
		element_lst.add((HeavenlyStems.valueOf(GapJa.getIlgan())).getElement()); 
		element_lst.add((HeavenlyStems.valueOf(GapJa.getSigan())).getElement());	
		element_lst.add((HeavenlyStems.valueOf(GapJa.getWolgan())).getElement());
		element_lst.add((HeavenlyStems.valueOf(GapJa.getYungan())).getElement()); 
		element_lst.add((Zodiacs.valueOf(GapJa.getSiji())).getElement());	
		element_lst.add((Zodiacs.valueOf(GapJa.getIlji())).getElement());	
		element_lst.add((Zodiacs.valueOf(GapJa.getWolji())).getElement());	
		element_lst.add((Zodiacs.valueOf(GapJa.getYunji())).getElement()); 
		
		
		
		ArrayList<String> gapja = new ArrayList<>();
		gapja.add(GapJa.getIlgan());	gapja.add(GapJa.getSigan());	gapja.add(GapJa.getWolgan());gapja.add(GapJa.getYungan()); 
		gapja.add(GapJa.getSiji());	gapja.add(GapJa.getIlji());	gapja.add(GapJa.getWolji());	gapja.add(GapJa.getYunji()); 
		
		for (int i = 1; i<gapja.size(); i++) {
		System.out.print(gapja.get(i)+"\t");
		}
		System.out.println();
		
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
		System.out.println("양: "+yang+", 음: "+yin);
		System.out.println(yinYang_lst);
		System.out.println(element_lst);
	}
}
