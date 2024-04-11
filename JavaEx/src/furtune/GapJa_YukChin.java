package furtune;

import java.util.ArrayList;

public class GapJa_YukChin {
	
	//	GapJa_Chungan_YinYang 클래스에서 천간지지의 음양 정보 받기.
	//	천간지지의 enum에서 직접 각 오행 값을 추출. 
	public static void YukChin(ArrayList<String> yinYang_lst) {
		
		//	천간의 오행 추출
		ArrayList<String> element_lst = new ArrayList<>();
		element_lst.add((HeavenlyStems.valueOf(GapJa.getIlgan())).getElement()); 
		element_lst.add((HeavenlyStems.valueOf(GapJa.getSigan())).getElement());	
		element_lst.add((HeavenlyStems.valueOf(GapJa.getWolgan())).getElement());
		element_lst.add((HeavenlyStems.valueOf(GapJa.getYungan())).getElement());
		
		//	지지의 오행 추출
		element_lst.add((Zodiacs.valueOf(GapJa.getSiji())).getElement());	
		element_lst.add((Zodiacs.valueOf(GapJa.getIlji())).getElement());	
		element_lst.add((Zodiacs.valueOf(GapJa.getWolji())).getElement());	
		element_lst.add((Zodiacs.valueOf(GapJa.getYunji())).getElement()); 
		
		//	결과값을 저장할 육친 어레이
		ArrayList<String> yukchin = new ArrayList<>();
		
		// 결과값이 아신인 일간 먼저 추가
		String ilgan = "아신"; 
		yukchin.add(ilgan);
		
		//	시간부터 연지까지 차례로 루프
		for (int i = 1; i<8; i++) {
			
			// 비견 조건(일간과 음양, 오행이 같음)
			if (element_lst.get(0).equals(element_lst.get(i)) && yinYang_lst.get(0).equals(yinYang_lst.get(i))) {
				yukchin.add("비견");
			}
			// 겁재 조건(일간과 오행이 같고, 음양이 다름)
			else if (element_lst.get(0).equals(element_lst.get(i)) && yinYang_lst.get(0) != yinYang_lst.get(i)) {
				yukchin.add("겁재");
			}
			// 그 후, 음양이 같을 경우, 1- 식신(일간이 생), 2-편재(일간이 극), 3-편관(일간을 극), 4-편인(일간을 생)  
			else if (yinYang_lst.get(0).equals(yinYang_lst.get(i))) {
				// '화'의 경우,
				if (element_lst.get(0).equals("火")) {
					if (element_lst.get(0).equals("土")) {
						yukchin.add("식신");
					}
					else if (element_lst.get(0).equals("木")) {
						yukchin.add("편재");
					}
					else if (element_lst.get(0).equals("水")) {
						yukchin.add("편관");
					}
					else if (element_lst.get(0).equals("金")) {
						yukchin.add("편인");
					}
				}
				// '수'의 경우,
				else if (element_lst.get(0).equals("水")) {
					if (element_lst.get(0).equals("木")) {
						yukchin.add("식신");
					}
					else if (element_lst.get(0).equals("火")) {
						yukchin.add("편재");
					}
					else if (element_lst.get(0).equals("土")) {
						yukchin.add("편관");
					}
					else if (element_lst.get(0).equals("金")) {
						yukchin.add("편인");
					}
				}
				// '목'의 경우,
				else if (element_lst.get(0).equals("木")) {
					if (element_lst.get(0).equals("火")) {
						yukchin.add("식신");
					}
					else if (element_lst.get(0).equals("土")) {
						yukchin.add("편재");
					}
					else if (element_lst.get(0).equals("金")) {
						yukchin.add("편관");
					}
					else if (element_lst.get(0).equals("水")) {
						yukchin.add("편인");
					}
				}
				// '금'의 경우,
				else if (element_lst.get(0).equals("金")) {
					if (element_lst.get(0).equals("水")) {
						yukchin.add("식신");
					}
					else if (element_lst.get(0).equals("木")) {
						yukchin.add("편재");
					}
					else if (element_lst.get(0).equals("火")) {
						yukchin.add("편관");
					}
					else if (element_lst.get(0).equals("土")) {
						yukchin.add("편인");
					}
				}
				// '토'의 경우,
				else if (element_lst.get(0).equals("土")) {
					if (element_lst.get(0).equals("金")) {
						yukchin.add("식신");
					}
					else if (element_lst.get(0).equals("水")) {
						yukchin.add("편재");
					}
					else if (element_lst.get(0).equals("木")) {
						yukchin.add("편관");
					}
					else if (element_lst.get(0).equals("火")) {
						yukchin.add("편인");
					}
				}
			}
			//	음양이 다를 경우, 1-상관(일간이 생), 2-정재(일간이 극), 3-정관(일간을 극), 4-정인(일간을 생)
			else if (yinYang_lst.get(0)!=yinYang_lst.get(i)) {
				
			}
		}
		System.out.print(yukchin);
		
	}
	
}
