package furtune;

import java.util.ArrayList;

public class Another_Sal {
	
	private static ArrayList<String> siju_sal = new ArrayList<>();
	private static ArrayList<String> ilju_sal = new ArrayList<>();
	private static ArrayList<String> wolju_sal = new ArrayList<>();
	private static ArrayList<String> yunju_sal = new ArrayList<>();
	
	public static ArrayList<String> getSiju_sal() {return siju_sal;}
	public static void setSiju_sal(ArrayList<String> siju_sal) {Another_Sal.siju_sal = siju_sal;}
	public static ArrayList<String> getIlju_sal() {return ilju_sal;}
	public static void setIlju_sal(ArrayList<String> ilju_sal) {Another_Sal.ilju_sal = ilju_sal;}
	public static ArrayList<String> getWolju_sal() {return wolju_sal;}
	public static void setWolju_sal(ArrayList<String> wolju_sal) {Another_Sal.wolju_sal = wolju_sal;}
	public static ArrayList<String> getYunju_sal() {return yunju_sal;}
	public static void setYunju_sal(ArrayList<String> yunju_sal) {Another_Sal.yunju_sal = yunju_sal;}
	
	public static void getSinsal() {
		System.out.println(getIlju_sal());
		System.out.println(getSiju_sal());
		System.out.println(getWolju_sal());
		System.out.println(getYunju_sal());
	}
	
	public static void Ilgan_Sinsal(ArrayList <String> arr) {
		
	
		//	일간 대 지지 신살 - *시주 위치* 
	//	천을귀인, 건록, 양인, 금여록, 암록, 문창, 학당
		if (arr.get(1).equals("갑")) {
			if (arr.get(4).equals("축") || arr.get(4).equals("미")) {	siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("인")) {siju_sal.add("건록");}
			else if (arr.get(4).equals("묘")) {siju_sal.add("양인");}
			else if (arr.get(4).equals("진")) {siju_sal.add("금여록");}
			else if (arr.get(4).equals("해")) {siju_sal.add("암록");siju_sal.add("학당");}
			else if (arr.get(4).equals("사")) {siju_sal.add("문창");}
			}
		else if (arr.get(1).equals("을")) {
			if (arr.get(4).equals("자") || arr.get(4).equals("신")) {	siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("묘")) {siju_sal.add("건록");}
			else if (arr.get(4).equals("진")) {siju_sal.add("양인");}
			else if (arr.get(4).equals("사")) {siju_sal.add("금여록");}
			else if (arr.get(4).equals("술")) {siju_sal.add("암록");}
			else if (arr.get(4).equals("오")) {siju_sal.add("문창");}
			else if (arr.get(4).equals("해")) {siju_sal.add("학당");}
			}
		else if (arr.get(1).equals("병")) {
			if (arr.get(4).equals("해") || arr.get(4).equals("유")) {	siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("사")) {siju_sal.add("건록");}
			else if (arr.get(4).equals("오")) {siju_sal.add("양인");}
			else if (arr.get(4).equals("미")) {siju_sal.add("금여록");}
			else if (arr.get(4).equals("신")) {siju_sal.add("암록");}
			else if (arr.get(4).equals("신")) {siju_sal.add("문창");}
			else if (arr.get(4).equals("인")) {siju_sal.add("학당");}
			}
		else if (arr.get(1).equals("정")) {
			if (arr.get(4).equals("해") || arr.get(4).equals("유")) {	siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("오")) {siju_sal.add("건록");}
			else if (arr.get(4).equals("미")) {siju_sal.add("양인");siju_sal.add("암록");}
			else if (arr.get(4).equals("신")) {siju_sal.add("금여록");}
			else if (arr.get(4).equals("유")) {siju_sal.add("문창");}
			else if (arr.get(4).equals("인")) {siju_sal.add("학당");}
			}
		else if (arr.get(1).equals("무")) {
			if (arr.get(4).equals("축") || arr.get(4).equals("미")) {	siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("사")) {siju_sal.add("건록");}
			else if (arr.get(4).equals("오")) {siju_sal.add("양인");}
			else if (arr.get(4).equals("미")) {siju_sal.add("금여록");}
			else if (arr.get(4).equals("신")) {siju_sal.add("암록");}
			else if (arr.get(4).equals("신")) {siju_sal.add("문창");}
			else if (arr.get(4).equals("인")) {siju_sal.add("학당");}
			}
		else if (arr.get(1).equals("기")) {
			if (arr.get(4).equals("자")) {	siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("오")) {siju_sal.add("건록");}
			else if (arr.get(4).equals("미")) {siju_sal.add("양인");siju_sal.add("암록");}
			else if (arr.get(4).equals("신")) {siju_sal.add("금여록");siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("유")) {siju_sal.add("문창");}
			else if (arr.get(4).equals("인")) {siju_sal.add("학당");}
			}
		else if (arr.get(1).equals("경")) {
			if (arr.get(4).equals("축") || arr.get(4).equals("미")) {	siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("신")) {siju_sal.add("건록");}
			else if (arr.get(4).equals("유")) {siju_sal.add("양인");}
			else if (arr.get(4).equals("술")) {siju_sal.add("금여록");}
			else if (arr.get(4).equals("사")) {siju_sal.add("암록");siju_sal.add("학당");}
			else if (arr.get(4).equals("해")) {siju_sal.add("문창");}
			}
		else if (arr.get(1).equals("신")) {
			if (arr.get(4).equals("인") || arr.get(4).equals("오")) {	siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("유")) {siju_sal.add("건록");}
			else if (arr.get(4).equals("술")) {siju_sal.add("양인");}
			else if (arr.get(4).equals("해")) {siju_sal.add("금여록");}
			else if (arr.get(4).equals("진")) {siju_sal.add("암록");}
			else if (arr.get(4).equals("자")) {siju_sal.add("문창");}
			else if (arr.get(4).equals("사")) {siju_sal.add("학당");}
			}
		else if (arr.get(1).equals("임")) {
			if (arr.get(4).equals("사") || arr.get(4).equals("묘")) {	siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("해")) {siju_sal.add("건록");}
			else if (arr.get(4).equals("자")) {siju_sal.add("양인");}
			else if (arr.get(4).equals("축")) {siju_sal.add("금여록");}
			else if (arr.get(4).equals("인")) {siju_sal.add("문창");siju_sal.add("암록");}
			else if (arr.get(4).equals("신")) {siju_sal.add("학당");}
			}
		else if (arr.get(1).equals("계")) {
			if (arr.get(4).equals("사")) {	siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("자")) {siju_sal.add("건록");}
			else if (arr.get(4).equals("축")) {siju_sal.add("양인");siju_sal.add("암록");}
			else if (arr.get(4).equals("인")) {siju_sal.add("금여록");}
			else if (arr.get(4).equals("묘")) {siju_sal.add("문창");siju_sal.add("천을귀인");}
			else if (arr.get(4).equals("신")) {siju_sal.add("학당");}
			}
		//	일간 대 지지 신살 - *일주 위치* 
		//	천을귀인, 건록, 양인, 금여록, 암록, 문창, 학당
		if (arr.get(1).equals("갑")) {
			if (arr.get(5).equals("축") || arr.get(5).equals("미")) {	ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("인")) {ilju_sal.add("건록");}
			else if (arr.get(5).equals("묘")) {ilju_sal.add("양인");}
			else if (arr.get(5).equals("진")) {ilju_sal.add("금여록");}
			else if (arr.get(5).equals("해")) {ilju_sal.add("암록");ilju_sal.add("학당");}
			else if (arr.get(5).equals("사")) {ilju_sal.add("문창");}
			}
		else if (arr.get(1).equals("을")) {
			if (arr.get(5).equals("자") || arr.get(5).equals("신")) {	ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("묘")) {ilju_sal.add("건록");}
			else if (arr.get(5).equals("진")) {ilju_sal.add("양인");}
			else if (arr.get(5).equals("사")) {ilju_sal.add("금여록");}
			else if (arr.get(5).equals("술")) {ilju_sal.add("암록");}
			else if (arr.get(5).equals("오")) {ilju_sal.add("문창");}
			else if (arr.get(5).equals("해")) {ilju_sal.add("학당");}
			}
		else if (arr.get(1).equals("병")) {
			if (arr.get(5).equals("해") || arr.get(5).equals("유")) {	ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("사")) {ilju_sal.add("건록");}
			else if (arr.get(5).equals("오")) {ilju_sal.add("양인");}
			else if (arr.get(5).equals("미")) {ilju_sal.add("금여록");}
			else if (arr.get(5).equals("신")) {ilju_sal.add("암록");}
			else if (arr.get(5).equals("신")) {ilju_sal.add("문창");}
			else if (arr.get(5).equals("인")) {ilju_sal.add("학당");}
			}
		else if (arr.get(1).equals("정")) {
			if (arr.get(5).equals("해") || arr.get(5).equals("유")) {	ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("오")) {ilju_sal.add("건록");}
			else if (arr.get(5).equals("미")) {ilju_sal.add("양인");ilju_sal.add("암록");}
			else if (arr.get(5).equals("신")) {ilju_sal.add("금여록");}
			else if (arr.get(5).equals("유")) {ilju_sal.add("문창");}
			else if (arr.get(5).equals("인")) {ilju_sal.add("학당");}
			}
		else if (arr.get(1).equals("무")) {
			if (arr.get(5).equals("축") || arr.get(5).equals("미")) {	ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("사")) {ilju_sal.add("건록");}
			else if (arr.get(5).equals("오")) {ilju_sal.add("양인");}
			else if (arr.get(5).equals("미")) {ilju_sal.add("금여록");}
			else if (arr.get(5).equals("신")) {ilju_sal.add("암록");}
			else if (arr.get(5).equals("신")) {ilju_sal.add("문창");}
			else if (arr.get(5).equals("인")) {ilju_sal.add("학당");}
			}
		else if (arr.get(1).equals("기")) {
			if (arr.get(5).equals("자")) {	ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("오")) {ilju_sal.add("건록");}
			else if (arr.get(5).equals("미")) {ilju_sal.add("양인");ilju_sal.add("암록");}
			else if (arr.get(5).equals("신")) {ilju_sal.add("금여록");ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("유")) {ilju_sal.add("문창");}
			else if (arr.get(5).equals("인")) {ilju_sal.add("학당");}
			}
		else if (arr.get(1).equals("경")) {
			if (arr.get(5).equals("축") || arr.get(5).equals("미")) {	ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("신")) {ilju_sal.add("건록");}
			else if (arr.get(5).equals("유")) {ilju_sal.add("양인");}
			else if (arr.get(5).equals("술")) {ilju_sal.add("금여록");}
			else if (arr.get(5).equals("사")) {ilju_sal.add("암록");ilju_sal.add("학당");}
			else if (arr.get(5).equals("해")) {ilju_sal.add("문창");}
			}
		else if (arr.get(1).equals("신")) {
			if (arr.get(5).equals("인") || arr.get(5).equals("오")) {	ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("유")) {ilju_sal.add("건록");}
			else if (arr.get(5).equals("술")) {ilju_sal.add("양인");}
			else if (arr.get(5).equals("해")) {ilju_sal.add("금여록");}
			else if (arr.get(5).equals("진")) {ilju_sal.add("암록");}
			else if (arr.get(5).equals("자")) {ilju_sal.add("문창");}
			else if (arr.get(5).equals("사")) {ilju_sal.add("학당");}
			}
		else if (arr.get(1).equals("임")) {
			if (arr.get(5).equals("사") || arr.get(5).equals("묘")) {	ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("해")) {ilju_sal.add("건록");}
			else if (arr.get(5).equals("자")) {ilju_sal.add("양인");}
			else if (arr.get(5).equals("축")) {ilju_sal.add("금여록");}
			else if (arr.get(5).equals("인")) {ilju_sal.add("문창");ilju_sal.add("암록");}
			else if (arr.get(5).equals("신")) {ilju_sal.add("학당");}
			}
		else if (arr.get(1).equals("계")) {
			if (arr.get(5).equals("사")) {	ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("자")) {ilju_sal.add("건록");}
			else if (arr.get(5).equals("축")) {ilju_sal.add("양인");ilju_sal.add("암록");}
			else if (arr.get(5).equals("인")) {ilju_sal.add("금여록");}
			else if (arr.get(5).equals("묘")) {ilju_sal.add("문창");ilju_sal.add("천을귀인");}
			else if (arr.get(5).equals("신")) {ilju_sal.add("학당");}
			}
		//	일간 대 지지 신살 - *월주 위치* 
		//	천을귀인, 건록, 양인, 금여록, 암록, 문창, 학당
		if (arr.get(1).equals("갑")) {
			if (arr.get(6).equals("축") || arr.get(6).equals("미")) {	wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("인")) {wolju_sal.add("건록");}
			else if (arr.get(6).equals("묘")) {wolju_sal.add("양인");}
			else if (arr.get(6).equals("진")) {wolju_sal.add("금여록");}
			else if (arr.get(6).equals("해")) {wolju_sal.add("암록");wolju_sal.add("학당");}
			else if (arr.get(6).equals("사")) {wolju_sal.add("문창");}
			}
		else if (arr.get(1).equals("을")) {
			if (arr.get(6).equals("자") || arr.get(6).equals("신")) {	wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("묘")) {wolju_sal.add("건록");}
			else if (arr.get(6).equals("진")) {wolju_sal.add("양인");}
			else if (arr.get(6).equals("사")) {wolju_sal.add("금여록");}
			else if (arr.get(6).equals("술")) {wolju_sal.add("암록");}
			else if (arr.get(6).equals("오")) {wolju_sal.add("문창");}
			else if (arr.get(6).equals("해")) {wolju_sal.add("학당");}
			}
		else if (arr.get(1).equals("병")) {
			if (arr.get(6).equals("해") || arr.get(6).equals("유")) {	wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("사")) {wolju_sal.add("건록");}
			else if (arr.get(6).equals("오")) {wolju_sal.add("양인");}
			else if (arr.get(6).equals("미")) {wolju_sal.add("금여록");}
			else if (arr.get(6).equals("신")) {wolju_sal.add("암록");}
			else if (arr.get(6).equals("신")) {wolju_sal.add("문창");}
			else if (arr.get(6).equals("인")) {wolju_sal.add("학당");}
			}
		else if (arr.get(1).equals("정")) {
			if (arr.get(6).equals("해") || arr.get(6).equals("유")) {	wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("오")) {wolju_sal.add("건록");}
			else if (arr.get(6).equals("미")) {wolju_sal.add("양인");wolju_sal.add("암록");}
			else if (arr.get(6).equals("신")) {wolju_sal.add("금여록");}
			else if (arr.get(6).equals("유")) {wolju_sal.add("문창");}
			else if (arr.get(6).equals("인")) {wolju_sal.add("학당");}
			}
		else if (arr.get(1).equals("무")) {
			if (arr.get(6).equals("축") || arr.get(6).equals("미")) {	wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("사")) {wolju_sal.add("건록");}
			else if (arr.get(6).equals("오")) {wolju_sal.add("양인");}
			else if (arr.get(6).equals("미")) {wolju_sal.add("금여록");}
			else if (arr.get(6).equals("신")) {wolju_sal.add("암록");}
			else if (arr.get(6).equals("신")) {wolju_sal.add("문창");}
			else if (arr.get(6).equals("인")) {wolju_sal.add("학당");}
			}
		else if (arr.get(1).equals("기")) {
			if (arr.get(6).equals("자")) {	wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("오")) {wolju_sal.add("건록");}
			else if (arr.get(6).equals("미")) {wolju_sal.add("양인");wolju_sal.add("암록");}
			else if (arr.get(6).equals("신")) {wolju_sal.add("금여록");wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("유")) {wolju_sal.add("문창");}
			else if (arr.get(6).equals("인")) {wolju_sal.add("학당");}
			}
		else if (arr.get(1).equals("경")) {
			if (arr.get(6).equals("축") || arr.get(6).equals("미")) {	wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("신")) {wolju_sal.add("건록");}
			else if (arr.get(6).equals("유")) {wolju_sal.add("양인");}
			else if (arr.get(6).equals("술")) {wolju_sal.add("금여록");}
			else if (arr.get(6).equals("사")) {wolju_sal.add("암록");wolju_sal.add("학당");}
			else if (arr.get(6).equals("해")) {wolju_sal.add("문창");}
			}
		else if (arr.get(1).equals("신")) {
			if (arr.get(6).equals("인") || arr.get(6).equals("오")) {	wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("유")) {wolju_sal.add("건록");}
			else if (arr.get(6).equals("술")) {wolju_sal.add("양인");}
			else if (arr.get(6).equals("해")) {wolju_sal.add("금여록");}
			else if (arr.get(6).equals("진")) {wolju_sal.add("암록");}
			else if (arr.get(6).equals("자")) {wolju_sal.add("문창");}
			else if (arr.get(6).equals("사")) {wolju_sal.add("학당");}
			}
		else if (arr.get(1).equals("임")) {
			if (arr.get(6).equals("사") || arr.get(6).equals("묘")) {	wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("해")) {wolju_sal.add("건록");}
			else if (arr.get(6).equals("자")) {wolju_sal.add("양인");}
			else if (arr.get(6).equals("축")) {wolju_sal.add("금여록");}
			else if (arr.get(6).equals("인")) {wolju_sal.add("문창");wolju_sal.add("암록");}
			else if (arr.get(6).equals("신")) {wolju_sal.add("학당");}
			}
		else if (arr.get(1).equals("계")) {
			if (arr.get(6).equals("사")) {	wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("자")) {wolju_sal.add("건록");}
			else if (arr.get(6).equals("축")) {wolju_sal.add("양인");wolju_sal.add("암록");}
			else if (arr.get(6).equals("인")) {wolju_sal.add("금여록");}
			else if (arr.get(6).equals("묘")) {wolju_sal.add("문창");wolju_sal.add("천을귀인");}
			else if (arr.get(6).equals("신")) {wolju_sal.add("학당");}
			}
			//		일간 대 지지 신살 - *연주 위치* 
			//	천을귀인, 건록, 양인, 금여록, 암록, 문창, 학당
			if (arr.get(1).equals("갑")) {
				if (arr.get(7).equals("축") || arr.get(7).equals("미")) {	yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("인")) {yunju_sal.add("건록");}
				else if (arr.get(7).equals("묘")) {yunju_sal.add("양인");}
				else if (arr.get(7).equals("진")) {yunju_sal.add("금여록");}
				else if (arr.get(7).equals("해")) {yunju_sal.add("암록");yunju_sal.add("학당");}
				else if (arr.get(7).equals("사")) {yunju_sal.add("문창");}
				}
			else if (arr.get(1).equals("을")) {
				if (arr.get(7).equals("자") || arr.get(7).equals("신")) {	yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("묘")) {yunju_sal.add("건록");}
				else if (arr.get(7).equals("진")) {yunju_sal.add("양인");}
				else if (arr.get(7).equals("사")) {yunju_sal.add("금여록");}
				else if (arr.get(7).equals("술")) {yunju_sal.add("암록");}
				else if (arr.get(7).equals("오")) {yunju_sal.add("문창");}
				else if (arr.get(7).equals("해")) {yunju_sal.add("학당");}
				}
			else if (arr.get(1).equals("병")) {
				if (arr.get(7).equals("해") || arr.get(7).equals("유")) {	yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("사")) {yunju_sal.add("건록");}
				else if (arr.get(7).equals("오")) {yunju_sal.add("양인");}
				else if (arr.get(7).equals("미")) {yunju_sal.add("금여록");}
				else if (arr.get(7).equals("신")) {yunju_sal.add("암록");}
				else if (arr.get(7).equals("신")) {yunju_sal.add("문창");}
				else if (arr.get(7).equals("인")) {yunju_sal.add("학당");}
				}
			else if (arr.get(1).equals("정")) {
				if (arr.get(7).equals("해") || arr.get(7).equals("유")) {	yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("오")) {yunju_sal.add("건록");}
				else if (arr.get(7).equals("미")) {yunju_sal.add("양인");yunju_sal.add("암록");}
				else if (arr.get(7).equals("신")) {yunju_sal.add("금여록");}
				else if (arr.get(7).equals("유")) {yunju_sal.add("문창");}
				else if (arr.get(7).equals("인")) {yunju_sal.add("학당");}
				}
			else if (arr.get(1).equals("무")) {
				if (arr.get(7).equals("축") || arr.get(7).equals("미")) {	yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("사")) {yunju_sal.add("건록");}
				else if (arr.get(7).equals("오")) {yunju_sal.add("양인");}
				else if (arr.get(7).equals("미")) {yunju_sal.add("금여록");}
				else if (arr.get(7).equals("신")) {yunju_sal.add("암록");}
				else if (arr.get(7).equals("신")) {yunju_sal.add("문창");}
				else if (arr.get(7).equals("인")) {yunju_sal.add("학당");}
				}
			else if (arr.get(1).equals("기")) {
				if (arr.get(7).equals("자")) {	yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("오")) {yunju_sal.add("건록");}
				else if (arr.get(7).equals("미")) {yunju_sal.add("양인");yunju_sal.add("암록");}
				else if (arr.get(7).equals("신")) {yunju_sal.add("금여록");yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("유")) {yunju_sal.add("문창");}
				else if (arr.get(7).equals("인")) {yunju_sal.add("학당");}
				}
			else if (arr.get(1).equals("경")) {
				if (arr.get(7).equals("축") || arr.get(7).equals("미")) {	yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("신")) {yunju_sal.add("건록");}
				else if (arr.get(7).equals("유")) {yunju_sal.add("양인");}
				else if (arr.get(7).equals("술")) {yunju_sal.add("금여록");}
				else if (arr.get(7).equals("사")) {yunju_sal.add("암록");yunju_sal.add("학당");}
				else if (arr.get(7).equals("해")) {yunju_sal.add("문창");}
				}
			else if (arr.get(1).equals("신")) {
				if (arr.get(7).equals("인") || arr.get(7).equals("오")) {	yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("유")) {yunju_sal.add("건록");}
				else if (arr.get(7).equals("술")) {yunju_sal.add("양인");}
				else if (arr.get(7).equals("해")) {yunju_sal.add("금여록");}
				else if (arr.get(7).equals("진")) {yunju_sal.add("암록");}
				else if (arr.get(7).equals("자")) {yunju_sal.add("문창");}
				else if (arr.get(7).equals("사")) {yunju_sal.add("학당");}
				}
			else if (arr.get(1).equals("임")) {
				if (arr.get(7).equals("사") || arr.get(7).equals("묘")) {	yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("해")) {yunju_sal.add("건록");}
				else if (arr.get(7).equals("자")) {yunju_sal.add("양인");}
				else if (arr.get(7).equals("축")) {yunju_sal.add("금여록");}
				else if (arr.get(7).equals("인")) {yunju_sal.add("문창");yunju_sal.add("암록");}
				else if (arr.get(7).equals("신")) {yunju_sal.add("학당");}
				}
			else if (arr.get(1).equals("계")) {
				if (arr.get(7).equals("사")) {	yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("자")) {yunju_sal.add("건록");}
				else if (arr.get(7).equals("축")) {yunju_sal.add("양인");yunju_sal.add("암록");}
				else if (arr.get(7).equals("인")) {yunju_sal.add("금여록");}
				else if (arr.get(7).equals("묘")) {yunju_sal.add("문창");yunju_sal.add("천을귀인");}
				else if (arr.get(7).equals("신")) {yunju_sal.add("학당");}
				}
		setSiju_sal(siju_sal);
		setIlju_sal(ilju_sal);
		setWolju_sal(wolju_sal);
		setYunju_sal(yunju_sal);
	}
	
	public static void wolji_Sinsal(ArrayList <String> arr) {
		
			//월지-시간
			if (arr.get(6).equals("자")) {
				if (arr.get(0).equals("사")) {siju_sal.add("천덕");}
				else if (arr.get(0).equals("임")) {siju_sal.add("월덕");}
				else if (arr.get(0).equals("술")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("축") || arr.get(0).equals("진")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("축")) {
				if (arr.get(0).equals("경")) {siju_sal.add("천덕");siju_sal.add("월덕");}
				else if (arr.get(0).equals("자")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("축") || arr.get(0).equals("진")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("인")) {
				if (arr.get(0).equals("정")) {siju_sal.add("천덕");}
				else if (arr.get(0).equals("병")) {siju_sal.add("월덕");}
				else if (arr.get(0).equals("축")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("해") || arr.get(0).equals("자")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("묘")) {
				if (arr.get(0).equals("신")) {siju_sal.add("천덕");}
				else if (arr.get(0).equals("갑")) {siju_sal.add("월덕");}
				else if (arr.get(0).equals("인")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("해") || arr.get(0).equals("자")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("진")) {
				if (arr.get(0).equals("미")) {siju_sal.add("천덕");}
				else if (arr.get(0).equals("임")) {siju_sal.add("월덕");}
				else if (arr.get(0).equals("묘")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("해") || arr.get(0).equals("자")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("사")) {
				if (arr.get(0).equals("신")) {siju_sal.add("천덕");}
				else if (arr.get(0).equals("경")) {siju_sal.add("월덕");}
				else if (arr.get(0).equals("진")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("묘") || arr.get(0).equals("미")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("오")) {
				if (arr.get(0).equals("해")) {siju_sal.add("천덕");}
				else if (arr.get(0).equals("병")) {siju_sal.add("월덕");}
				else if (arr.get(0).equals("사")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("묘") || arr.get(0).equals("미")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("미")) {
				if (arr.get(0).equals("갑")) {siju_sal.add("천덕");}
				else if (arr.get(0).equals("갑")) {siju_sal.add("월덕");}
				else if (arr.get(0).equals("오")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("묘") || arr.get(0).equals("미")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("신")) {
				if (arr.get(0).equals("계")) {siju_sal.add("천덕");}
				else if (arr.get(0).equals("임")) {siju_sal.add("월덕");}
				else if (arr.get(0).equals("미")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("인") || arr.get(0).equals("술")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("유")) {
				if (arr.get(0).equals("인")) {siju_sal.add("천덕"); siju_sal.add("급각살");}
				else if (arr.get(0).equals("경")) {siju_sal.add("월덕");}
				else if (arr.get(0).equals("신")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("술")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("술")) {
				if (arr.get(0).equals("병")) {siju_sal.add("천덕");siju_sal.add("월덕");}
				else if (arr.get(0).equals("유")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("인") || arr.get(0).equals("술")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("해")) {
				if (arr.get(0).equals("을")) {siju_sal.add("천덕");}
				else if (arr.get(0).equals("갑")) {siju_sal.add("월덕");}
				else if (arr.get(0).equals("술")) {siju_sal.add("천의성");}
				else if (arr.get(0).equals("진") || arr.get(0).equals("축")) {siju_sal.add("급각살");}
			}
			//월지-시지
			if (arr.get(6).equals("자")) {
				if (arr.get(4).equals("사")) {siju_sal.add("천덕");}
				else if (arr.get(4).equals("임")) {siju_sal.add("월덕");}
				else if (arr.get(4).equals("술")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("축") || arr.get(4).equals("진")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("축")) {
				if (arr.get(4).equals("경")) {siju_sal.add("천덕");siju_sal.add("월덕");}
				else if (arr.get(4).equals("자")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("축") || arr.get(4).equals("진")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("인")) {
					if (arr.get(4).equals("정")) {siju_sal.add("천덕");}
					else if (arr.get(4).equals("병")) {siju_sal.add("월덕");}
					else if (arr.get(4).equals("축")) {siju_sal.add("천의성");}
					else if (arr.get(4).equals("해") || arr.get(4).equals("자")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("묘")) {
				if (arr.get(4).equals("신")) {siju_sal.add("천덕");}
				else if (arr.get(4).equals("갑")) {siju_sal.add("월덕");}
				else if (arr.get(4).equals("인")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("해") || arr.get(4).equals("자")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("진")) {
				if (arr.get(4).equals("미")) {siju_sal.add("천덕");}
				else if (arr.get(4).equals("임")) {siju_sal.add("월덕");}
				else if (arr.get(4).equals("묘")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("해") || arr.get(4).equals("자")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("사")) {
				if (arr.get(4).equals("신")) {siju_sal.add("천덕");}
				else if (arr.get(4).equals("경")) {siju_sal.add("월덕");}
				else if (arr.get(4).equals("진")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("묘") || arr.get(4).equals("미")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("오")) {
				if (arr.get(4).equals("해")) {siju_sal.add("천덕");}
				else if (arr.get(4).equals("병")) {siju_sal.add("월덕");}
				else if (arr.get(4).equals("사")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("묘") || arr.get(4).equals("미")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("미")) {
				if (arr.get(4).equals("갑")) {siju_sal.add("천덕");}
				else if (arr.get(4).equals("갑")) {siju_sal.add("월덕");}
				else if (arr.get(4).equals("오")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("묘") || arr.get(4).equals("미")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("신")) {
				if (arr.get(4).equals("계")) {siju_sal.add("천덕");}
				else if (arr.get(4).equals("임")) {siju_sal.add("월덕");}
				else if (arr.get(4).equals("미")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("인") || arr.get(4).equals("술")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("유")) {
				if (arr.get(4).equals("인")) {siju_sal.add("천덕"); siju_sal.add("급각살");}
				else if (arr.get(4).equals("경")) {siju_sal.add("월덕");}
				else if (arr.get(4).equals("신")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("술")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("술")) {
				if (arr.get(4).equals("병")) {siju_sal.add("천덕");siju_sal.add("월덕");}
				else if (arr.get(4).equals("유")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("인") || arr.get(4).equals("술")) {siju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("해")) {
				if (arr.get(4).equals("을")) {siju_sal.add("천덕");}
				else if (arr.get(4).equals("갑")) {siju_sal.add("월덕");}
				else if (arr.get(4).equals("술")) {siju_sal.add("천의성");}
				else if (arr.get(4).equals("진") || arr.get(4).equals("축")) {siju_sal.add("급각살");}
			}
			//월지-일간
			if (arr.get(6).equals("자")) {
				if (arr.get(1).equals("사")) {ilju_sal.add("천덕");}
				else if (arr.get(1).equals("임")) {ilju_sal.add("월덕");}
				else if (arr.get(1).equals("술")) {ilju_sal.add("천의성");}
				else if (arr.get(1).equals("축") || arr.get(1).equals("진")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("축")) {
				if (arr.get(1).equals("경")) {ilju_sal.add("천덕");ilju_sal.add("월덕");}
				else if (arr.get(1).equals("자")) {ilju_sal.add("천의성");}
				else if (arr.get(1).equals("축") || arr.get(1).equals("진")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("인")) {
					if (arr.get(1).equals("정")) {ilju_sal.add("천덕");}
					else if (arr.get(1).equals("병")) {ilju_sal.add("월덕");}
					else if (arr.get(1).equals("축")) {ilju_sal.add("천의성");}
					else if (arr.get(1).equals("해") || arr.get(1).equals("자")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("묘")) {
				if (arr.get(1).equals("신")) {ilju_sal.add("천덕");}
				else if (arr.get(1).equals("갑")) {ilju_sal.add("월덕");}
				else if (arr.get(1).equals("인")) {ilju_sal.add("천의성");}
				else if (arr.get(1).equals("해") || arr.get(1).equals("자")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("진")) {
				if (arr.get(1).equals("미")) {ilju_sal.add("천덕");}
				else if (arr.get(1).equals("임")) {ilju_sal.add("월덕");}
				else if (arr.get(1).equals("묘")) {ilju_sal.add("천의성");}
				else if (arr.get(1).equals("해") || arr.get(1).equals("자")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("사")) {
				if (arr.get(1).equals("신")) {ilju_sal.add("천덕");}
				else if (arr.get(1).equals("경")) {ilju_sal.add("월덕");}
				else if (arr.get(1).equals("진")) {ilju_sal.add("천의성");}
				else if (arr.get(1).equals("묘") || arr.get(1).equals("미")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("오")) {
				if (arr.get(1).equals("해")) {ilju_sal.add("천덕");}
				else if (arr.get(1).equals("병")) {ilju_sal.add("월덕");}
				else if (arr.get(1).equals("사")) {ilju_sal.add("천의성");}
				else if (arr.get(1).equals("묘") || arr.get(1).equals("미")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("미")) {
				if (arr.get(1).equals("갑")) {ilju_sal.add("천덕");}
				else if (arr.get(1).equals("갑")) {ilju_sal.add("월덕");}
				else if (arr.get(1).equals("오")) {ilju_sal.add("천의성");}
				else if (arr.get(1).equals("묘") || arr.get(1).equals("미")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("신")) {
				if (arr.get(1).equals("계")) {ilju_sal.add("천덕");}
				else if (arr.get(1).equals("임")) {ilju_sal.add("월덕");}
				else if (arr.get(1).equals("미")) {ilju_sal.add("천의성");}
				else if (arr.get(1).equals("인") || arr.get(1).equals("술")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("유")) {
				if (arr.get(1).equals("인")) {ilju_sal.add("천덕"); ilju_sal.add("급각살");}
				else if (arr.get(1).equals("경")) {ilju_sal.add("월덕");}
				else if (arr.get(1).equals("신")) {ilju_sal.add("천의성");}
				else if (arr.get(1).equals("술")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("술")) {
				if (arr.get(1).equals("병")) {ilju_sal.add("천덕");ilju_sal.add("월덕");}
				else if (arr.get(1).equals("유")) {ilju_sal.add("천의성");}
				else if (arr.get(1).equals("인") || arr.get(1).equals("술")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("해")) {
				if (arr.get(1).equals("을")) {ilju_sal.add("천덕");}
				else if (arr.get(1).equals("갑")) {ilju_sal.add("월덕");}
				else if (arr.get(1).equals("술")) {ilju_sal.add("천의성");}
				else if (arr.get(1).equals("진") || arr.get(1).equals("축")) {ilju_sal.add("급각살");}
			}
			//월지-일지
			if (arr.get(6).equals("자")) {
				if (arr.get(5).equals("사")) {ilju_sal.add("천덕");}
				else if (arr.get(5).equals("임")) {ilju_sal.add("월덕");}
				else if (arr.get(5).equals("술")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("축") || arr.get(5).equals("진")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("축")) {
				if (arr.get(5).equals("경")) {ilju_sal.add("천덕");ilju_sal.add("월덕");}
				else if (arr.get(5).equals("자")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("축") || arr.get(5).equals("진")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("인")) {
					if (arr.get(5).equals("정")) {ilju_sal.add("천덕");}
					else if (arr.get(5).equals("병")) {ilju_sal.add("월덕");}
					else if (arr.get(5).equals("축")) {ilju_sal.add("천의성");}
					else if (arr.get(5).equals("해") || arr.get(5).equals("자")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("묘")) {
				if (arr.get(5).equals("신")) {ilju_sal.add("천덕");}
				else if (arr.get(5).equals("갑")) {ilju_sal.add("월덕");}
				else if (arr.get(5).equals("인")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("해") || arr.get(5).equals("자")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("진")) {
				if (arr.get(5).equals("미")) {ilju_sal.add("천덕");}
				else if (arr.get(5).equals("임")) {ilju_sal.add("월덕");}
				else if (arr.get(5).equals("묘")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("해") || arr.get(5).equals("자")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("사")) {
				if (arr.get(5).equals("신")) {ilju_sal.add("천덕");}
				else if (arr.get(5).equals("경")) {ilju_sal.add("월덕");}
				else if (arr.get(5).equals("진")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("묘") || arr.get(5).equals("미")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("오")) {
				if (arr.get(5).equals("해")) {ilju_sal.add("천덕");}
				else if (arr.get(5).equals("병")) {ilju_sal.add("월덕");}
				else if (arr.get(5).equals("사")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("묘") || arr.get(5).equals("미")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("미")) {
				if (arr.get(5).equals("갑")) {ilju_sal.add("천덕");}
				else if (arr.get(5).equals("갑")) {ilju_sal.add("월덕");}
				else if (arr.get(5).equals("오")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("묘") || arr.get(5).equals("미")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("신")) {
				if (arr.get(5).equals("계")) {ilju_sal.add("천덕");}
				else if (arr.get(5).equals("임")) {ilju_sal.add("월덕");}
				else if (arr.get(5).equals("미")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("인") || arr.get(5).equals("술")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("유")) {
				if (arr.get(5).equals("인")) {ilju_sal.add("천덕"); ilju_sal.add("급각살");}
				else if (arr.get(5).equals("경")) {ilju_sal.add("월덕");}
				else if (arr.get(5).equals("신")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("술")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("술")) {
				if (arr.get(5).equals("병")) {ilju_sal.add("천덕");ilju_sal.add("월덕");}
				else if (arr.get(5).equals("유")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("인") || arr.get(5).equals("술")) {ilju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("해")) {
				if (arr.get(5).equals("을")) {ilju_sal.add("천덕");}
				else if (arr.get(5).equals("갑")) {ilju_sal.add("월덕");}
				else if (arr.get(5).equals("술")) {ilju_sal.add("천의성");}
				else if (arr.get(5).equals("진") || arr.get(5).equals("축")) {ilju_sal.add("급각살");}
			}
			//월지-월간
			if (arr.get(6).equals("자")) {
				if (arr.get(2).equals("사")) {wolju_sal.add("천덕");}
				else if (arr.get(2).equals("임")) {wolju_sal.add("월덕");}
				else if (arr.get(2).equals("술")) {wolju_sal.add("천의성");}
				else if (arr.get(2).equals("축") || arr.get(2).equals("진")) {wolju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("축")) {
				if (arr.get(2).equals("경")) {wolju_sal.add("천덕");wolju_sal.add("월덕");}
				else if (arr.get(2).equals("자")) {wolju_sal.add("천의성");}
				else if (arr.get(2).equals("축") || arr.get(2).equals("진")) {wolju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("인")) {
					if (arr.get(2).equals("정")) {wolju_sal.add("천덕");}
					else if (arr.get(2).equals("병")) {wolju_sal.add("월덕");}
					else if (arr.get(2).equals("축")) {wolju_sal.add("천의성");}
					else if (arr.get(2).equals("해") || arr.get(2).equals("자")) {wolju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("묘")) {
				if (arr.get(2).equals("신")) {wolju_sal.add("천덕");}
				else if (arr.get(2).equals("갑")) {wolju_sal.add("월덕");}
				else if (arr.get(2).equals("인")) {wolju_sal.add("천의성");}
				else if (arr.get(2).equals("해") || arr.get(2).equals("자")) {wolju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("진")) {
				if (arr.get(2).equals("미")) {wolju_sal.add("천덕");}
				else if (arr.get(2).equals("임")) {wolju_sal.add("월덕");}
				else if (arr.get(2).equals("묘")) {wolju_sal.add("천의성");}
				else if (arr.get(2).equals("해") || arr.get(2).equals("자")) {wolju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("사")) {
				if (arr.get(2).equals("신")) {wolju_sal.add("천덕");}
				else if (arr.get(2).equals("경")) {wolju_sal.add("월덕");}
				else if (arr.get(2).equals("진")) {wolju_sal.add("천의성");}
				else if (arr.get(2).equals("묘") || arr.get(2).equals("미")) {wolju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("오")) {
				if (arr.get(2).equals("해")) {wolju_sal.add("천덕");}
				else if (arr.get(2).equals("병")) {wolju_sal.add("월덕");}
				else if (arr.get(2).equals("사")) {wolju_sal.add("천의성");}
				else if (arr.get(2).equals("묘") || arr.get(2).equals("미")) {wolju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("미")) {
				if (arr.get(2).equals("갑")) {wolju_sal.add("천덕");}
				else if (arr.get(2).equals("갑")) {wolju_sal.add("월덕");}
				else if (arr.get(2).equals("오")) {wolju_sal.add("천의성");}
				else if (arr.get(2).equals("묘") || arr.get(2).equals("미")) {wolju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("신")) {
				if (arr.get(2).equals("계")) {wolju_sal.add("천덕");}
				else if (arr.get(2).equals("임")) {wolju_sal.add("월덕");}
				else if (arr.get(2).equals("미")) {wolju_sal.add("천의성");}
				else if (arr.get(2).equals("인") || arr.get(2).equals("술")) {wolju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("유")) {
				if (arr.get(2).equals("인")) {wolju_sal.add("천덕"); wolju_sal.add("급각살");}
				else if (arr.get(2).equals("경")) {wolju_sal.add("월덕");}
				else if (arr.get(2).equals("신")) {wolju_sal.add("천의성");}
				else if (arr.get(2).equals("술")) {wolju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("술")) {
				if (arr.get(2).equals("병")) {wolju_sal.add("천덕");wolju_sal.add("월덕");}
				else if (arr.get(2).equals("유")) {wolju_sal.add("천의성");}
				else if (arr.get(2).equals("인") || arr.get(2).equals("술")) {wolju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("해")) {
				if (arr.get(2).equals("을")) {wolju_sal.add("천덕");}
				else if (arr.get(2).equals("갑")) {wolju_sal.add("월덕");}
				else if (arr.get(2).equals("술")) {wolju_sal.add("천의성");}
				else if (arr.get(2).equals("진") || arr.get(2).equals("축")) {wolju_sal.add("급각살");}
			}
			//월지-연간
			if (arr.get(6).equals("자")) {
				if (arr.get(3).equals("사")) {yunju_sal.add("천덕");}
				else if (arr.get(3).equals("임")) {yunju_sal.add("월덕");}
				else if (arr.get(3).equals("술")) {yunju_sal.add("천의성");}
				else if (arr.get(3).equals("축") || arr.get(3).equals("진")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("축")) {
				if (arr.get(3).equals("경")) {yunju_sal.add("천덕");yunju_sal.add("월덕");}
				else if (arr.get(3).equals("자")) {yunju_sal.add("천의성");}
				else if (arr.get(3).equals("축") || arr.get(3).equals("진")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("인")) {
					if (arr.get(3).equals("정")) {yunju_sal.add("천덕");}
					else if (arr.get(3).equals("병")) {yunju_sal.add("월덕");}
					else if (arr.get(3).equals("축")) {yunju_sal.add("천의성");}
					else if (arr.get(3).equals("해") || arr.get(3).equals("자")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("묘")) {
				if (arr.get(3).equals("신")) {yunju_sal.add("천덕");}
				else if (arr.get(3).equals("갑")) {yunju_sal.add("월덕");}
				else if (arr.get(3).equals("인")) {yunju_sal.add("천의성");}
				else if (arr.get(3).equals("해") || arr.get(3).equals("자")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("진")) {
				if (arr.get(3).equals("미")) {yunju_sal.add("천덕");}
				else if (arr.get(3).equals("임")) {yunju_sal.add("월덕");}
				else if (arr.get(3).equals("묘")) {yunju_sal.add("천의성");}
				else if (arr.get(3).equals("해") || arr.get(3).equals("자")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("사")) {
				if (arr.get(3).equals("신")) {yunju_sal.add("천덕");}
				else if (arr.get(3).equals("경")) {yunju_sal.add("월덕");}
				else if (arr.get(3).equals("진")) {yunju_sal.add("천의성");}
				else if (arr.get(3).equals("묘") || arr.get(3).equals("미")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("오")) {
				if (arr.get(3).equals("해")) {yunju_sal.add("천덕");}
				else if (arr.get(3).equals("병")) {yunju_sal.add("월덕");}
				else if (arr.get(3).equals("사")) {yunju_sal.add("천의성");}
				else if (arr.get(3).equals("묘") || arr.get(3).equals("미")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("미")) {
				if (arr.get(3).equals("갑")) {yunju_sal.add("천덕");}
				else if (arr.get(3).equals("갑")) {yunju_sal.add("월덕");}
				else if (arr.get(3).equals("오")) {yunju_sal.add("천의성");}
				else if (arr.get(3).equals("묘") || arr.get(3).equals("미")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("신")) {
				if (arr.get(3).equals("계")) {yunju_sal.add("천덕");}
				else if (arr.get(3).equals("임")) {yunju_sal.add("월덕");}
				else if (arr.get(3).equals("미")) {yunju_sal.add("천의성");}
				else if (arr.get(3).equals("인") || arr.get(3).equals("술")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("유")) {
				if (arr.get(3).equals("인")) {yunju_sal.add("천덕"); yunju_sal.add("급각살");}
				else if (arr.get(3).equals("경")) {yunju_sal.add("월덕");}
				else if (arr.get(3).equals("신")) {yunju_sal.add("천의성");}
				else if (arr.get(3).equals("술")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("술")) {
				if (arr.get(3).equals("병")) {yunju_sal.add("천덕");yunju_sal.add("월덕");}
				else if (arr.get(3).equals("유")) {yunju_sal.add("천의성");}
				else if (arr.get(3).equals("인") || arr.get(3).equals("술")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("해")) {
				if (arr.get(3).equals("을")) {yunju_sal.add("천덕");}
				else if (arr.get(3).equals("갑")) {yunju_sal.add("월덕");}
				else if (arr.get(3).equals("술")) {yunju_sal.add("천의성");}
				else if (arr.get(3).equals("진") || arr.get(3).equals("축")) {yunju_sal.add("급각살");}
			}
			//월지-연지
			if (arr.get(6).equals("자")) {
				if (arr.get(7).equals("사")) {yunju_sal.add("천덕");}
				else if (arr.get(7).equals("임")) {yunju_sal.add("월덕");}
				else if (arr.get(7).equals("술")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("축") || arr.get(7).equals("진")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("축")) {
				if (arr.get(7).equals("경")) {yunju_sal.add("천덕");yunju_sal.add("월덕");}
				else if (arr.get(7).equals("자")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("축") || arr.get(7).equals("진")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("인")) {
					if (arr.get(7).equals("정")) {yunju_sal.add("천덕");}
					else if (arr.get(7).equals("병")) {yunju_sal.add("월덕");}
					else if (arr.get(7).equals("축")) {yunju_sal.add("천의성");}
					else if (arr.get(7).equals("해") || arr.get(7).equals("자")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("묘")) {
				if (arr.get(7).equals("신")) {yunju_sal.add("천덕");}
				else if (arr.get(7).equals("갑")) {yunju_sal.add("월덕");}
				else if (arr.get(7).equals("인")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("해") || arr.get(7).equals("자")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("진")) {
				if (arr.get(7).equals("미")) {yunju_sal.add("천덕");}
				else if (arr.get(7).equals("임")) {yunju_sal.add("월덕");}
				else if (arr.get(7).equals("묘")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("해") || arr.get(7).equals("자")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("사")) {
				if (arr.get(7).equals("신")) {yunju_sal.add("천덕");}
				else if (arr.get(7).equals("경")) {yunju_sal.add("월덕");}
				else if (arr.get(7).equals("진")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("묘") || arr.get(7).equals("미")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("오")) {
				if (arr.get(7).equals("해")) {yunju_sal.add("천덕");}
				else if (arr.get(7).equals("병")) {yunju_sal.add("월덕");}
				else if (arr.get(7).equals("사")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("묘") || arr.get(7).equals("미")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("미")) {
				if (arr.get(7).equals("갑")) {yunju_sal.add("천덕");}
				else if (arr.get(7).equals("갑")) {yunju_sal.add("월덕");}
				else if (arr.get(7).equals("오")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("묘") || arr.get(7).equals("미")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("신")) {
				if (arr.get(7).equals("계")) {yunju_sal.add("천덕");}
				else if (arr.get(7).equals("임")) {yunju_sal.add("월덕");}
				else if (arr.get(7).equals("미")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("인") || arr.get(7).equals("술")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("유")) {
				if (arr.get(7).equals("인")) {yunju_sal.add("천덕"); yunju_sal.add("급각살");}
				else if (arr.get(7).equals("경")) {yunju_sal.add("월덕");}
				else if (arr.get(7).equals("신")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("술")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("술")) {
				if (arr.get(7).equals("병")) {yunju_sal.add("천덕");yunju_sal.add("월덕");}
				else if (arr.get(7).equals("유")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("인") || arr.get(7).equals("술")) {yunju_sal.add("급각살");}
			}
			else if (arr.get(6).equals("해")) {
				if (arr.get(7).equals("을")) {yunju_sal.add("천덕");}
				else if (arr.get(7).equals("갑")) {yunju_sal.add("월덕");}
				else if (arr.get(7).equals("술")) {yunju_sal.add("천의성");}
				else if (arr.get(7).equals("진") || arr.get(7).equals("축")) {yunju_sal.add("급각살");}
			}
			setSiju_sal(siju_sal);
			setIlju_sal(ilju_sal);
			setWolju_sal(wolju_sal);
			setYunju_sal(yunju_sal);
		}
	
	public static void ilji_Sinsal(ArrayList <String> arr) {
		
		// 일지-시간
		if (arr.get(5).equals("자")) {
			if (arr.get(0).equals("유")) {siju_sal.add("귀문관살");}
			else if (arr.get(0).equals("인")) {siju_sal.add("격각살");}
			else if (arr.get(0).equals("사")) {siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("축")) {
			if (arr.get(0).equals("오")) {siju_sal.add("귀문관살");}
			else if (arr.get(0).equals("묘")) {siju_sal.add("격각살");}
			else if (arr.get(0).equals("유")) {siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("인")) {
			if (arr.get(0).equals("미")) {siju_sal.add("귀문관살");}
			else if (arr.get(0).equals("진")) {siju_sal.add("격각살");}
			else if (arr.get(0).equals("축")) {siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("묘")) {
			if (arr.get(0).equals("신")) {siju_sal.add("귀문관살");}
			else if (arr.get(0).equals("사")) {siju_sal.add("격각살");siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("진")) {
			if (arr.get(0).equals("해")) {siju_sal.add("귀문관살");}
			else if (arr.get(0).equals("오")) {siju_sal.add("격각살");}
			else if (arr.get(0).equals("유")) {siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("사")) {
			if (arr.get(0).equals("술")) {siju_sal.add("귀문관살");}
			else if (arr.get(0).equals("미")) {siju_sal.add("격각살");}
			else if (arr.get(0).equals("축")) {siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("오")) {
			if (arr.get(0).equals("축")) {siju_sal.add("귀문관살");}
			else if (arr.get(0).equals("신")) {siju_sal.add("격각살");}
			else if (arr.get(0).equals("사")) {siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("미")) {
			if (arr.get(0).equals("인")) {siju_sal.add("귀문관살");}
			else if (arr.get(0).equals("유")) {siju_sal.add("격각살");siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("신")) {
			if (arr.get(0).equals("묘")) {siju_sal.add("귀문관살");}
			else if (arr.get(0).equals("술")) {siju_sal.add("격각살");}
			else if (arr.get(0).equals("축")) {siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("유")) {
			if (arr.get(0).equals("자")) {siju_sal.add("귀문관살");}
			else if (arr.get(0).equals("해")) {siju_sal.add("격각살");}
			else if (arr.get(0).equals("사")) {siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("술")) {
			if (arr.get(0).equals("사")) {siju_sal.add("귀문관살");}
			else if (arr.get(0).equals("자")) {siju_sal.add("격각살");}
			else if (arr.get(0).equals("유")) {siju_sal.add("암금적살");}
		}
		else if (arr.get(5).equals("해")) {
			if (arr.get(0).equals("진")) {siju_sal.add("귀문관살");}
			else if (arr.get(0).equals("축")) {siju_sal.add("격각살");}
			else if (arr.get(0).equals("축")) {siju_sal.add("암금적살");}
		}
		
		// 일지-시지
				if (arr.get(5).equals("자")) {
					if (arr.get(4).equals("유")) {siju_sal.add("귀문관살");}
					else if (arr.get(4).equals("인")) {siju_sal.add("격각살");}
					else if (arr.get(4).equals("사")) {siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("축")) {
					if (arr.get(4).equals("오")) {siju_sal.add("귀문관살");}
					else if (arr.get(4).equals("묘")) {siju_sal.add("격각살");}
					else if (arr.get(4).equals("유")) {siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("인")) {
					if (arr.get(4).equals("미")) {siju_sal.add("귀문관살");}
					else if (arr.get(4).equals("진")) {siju_sal.add("격각살");}
					else if (arr.get(4).equals("축")) {siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("묘")) {
					if (arr.get(4).equals("신")) {siju_sal.add("귀문관살");}
					else if (arr.get(4).equals("사")) {siju_sal.add("격각살");siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("진")) {
					if (arr.get(4).equals("해")) {siju_sal.add("귀문관살");}
					else if (arr.get(4).equals("오")) {siju_sal.add("격각살");}
					else if (arr.get(4).equals("유")) {siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("사")) {
					if (arr.get(4).equals("술")) {siju_sal.add("귀문관살");}
					else if (arr.get(4).equals("미")) {siju_sal.add("격각살");}
					else if (arr.get(4).equals("축")) {siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("오")) {
					if (arr.get(4).equals("축")) {siju_sal.add("귀문관살");}
					else if (arr.get(4).equals("신")) {siju_sal.add("격각살");}
					else if (arr.get(4).equals("사")) {siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("미")) {
					if (arr.get(4).equals("인")) {siju_sal.add("귀문관살");}
					else if (arr.get(4).equals("유")) {siju_sal.add("격각살");siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("신")) {
					if (arr.get(4).equals("묘")) {siju_sal.add("귀문관살");}
					else if (arr.get(4).equals("술")) {siju_sal.add("격각살");}
					else if (arr.get(4).equals("축")) {siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("유")) {
					if (arr.get(4).equals("자")) {siju_sal.add("귀문관살");}
					else if (arr.get(4).equals("해")) {siju_sal.add("격각살");}
					else if (arr.get(4).equals("사")) {siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("술")) {
					if (arr.get(4).equals("사")) {siju_sal.add("귀문관살");}
					else if (arr.get(4).equals("자")) {siju_sal.add("격각살");}
					else if (arr.get(4).equals("유")) {siju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("해")) {
					if (arr.get(4).equals("진")) {siju_sal.add("귀문관살");}
					else if (arr.get(4).equals("축")) {siju_sal.add("격각살");}
					else if (arr.get(4).equals("축")) {siju_sal.add("암금적살");}
				}
				// 일지-일간
				if (arr.get(5).equals("자")) {
					if (arr.get(1).equals("유")) {ilju_sal.add("귀문관살");}
					else if (arr.get(1).equals("인")) {ilju_sal.add("격각살");}
					else if (arr.get(1).equals("사")) {ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("축")) {
					if (arr.get(1).equals("오")) {ilju_sal.add("귀문관살");}
					else if (arr.get(1).equals("묘")) {ilju_sal.add("격각살");}
					else if (arr.get(1).equals("유")) {ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("인")) {
					if (arr.get(1).equals("미")) {ilju_sal.add("귀문관살");}
					else if (arr.get(1).equals("진")) {ilju_sal.add("격각살");}
					else if (arr.get(1).equals("축")) {ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("묘")) {
					if (arr.get(1).equals("신")) {ilju_sal.add("귀문관살");}
					else if (arr.get(1).equals("사")) {ilju_sal.add("격각살");ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("진")) {
					if (arr.get(1).equals("해")) {ilju_sal.add("귀문관살");}
					else if (arr.get(1).equals("오")) {ilju_sal.add("격각살");}
					else if (arr.get(1).equals("유")) {ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("사")) {
					if (arr.get(1).equals("술")) {ilju_sal.add("귀문관살");}
					else if (arr.get(1).equals("미")) {ilju_sal.add("격각살");}
					else if (arr.get(1).equals("축")) {ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("오")) {
					if (arr.get(1).equals("축")) {ilju_sal.add("귀문관살");}
					else if (arr.get(1).equals("신")) {ilju_sal.add("격각살");}
					else if (arr.get(1).equals("사")) {ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("미")) {
					if (arr.get(1).equals("인")) {ilju_sal.add("귀문관살");}
					else if (arr.get(1).equals("유")) {ilju_sal.add("격각살");ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("신")) {
					if (arr.get(1).equals("묘")) {ilju_sal.add("귀문관살");}
					else if (arr.get(1).equals("술")) {ilju_sal.add("격각살");}
					else if (arr.get(1).equals("축")) {ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("유")) {
					if (arr.get(1).equals("자")) {ilju_sal.add("귀문관살");}
					else if (arr.get(1).equals("해")) {ilju_sal.add("격각살");}
					else if (arr.get(1).equals("사")) {ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("술")) {
					if (arr.get(1).equals("사")) {ilju_sal.add("귀문관살");}
					else if (arr.get(1).equals("자")) {ilju_sal.add("격각살");}
					else if (arr.get(1).equals("유")) {ilju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("해")) {
					if (arr.get(1).equals("진")) {ilju_sal.add("귀문관살");}
					else if (arr.get(1).equals("축")) {ilju_sal.add("격각살");}
					else if (arr.get(1).equals("축")) {ilju_sal.add("암금적살");}
				}
				// 일지-월간
				if (arr.get(5).equals("자")) {
					if (arr.get(2).equals("유")) {wolju_sal.add("귀문관살");}
					else if (arr.get(2).equals("인")) {wolju_sal.add("격각살");}
					else if (arr.get(2).equals("사")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("축")) {
					if (arr.get(2).equals("오")) {wolju_sal.add("귀문관살");}
					else if (arr.get(2).equals("묘")) {wolju_sal.add("격각살");}
					else if (arr.get(2).equals("유")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("인")) {
					if (arr.get(2).equals("미")) {wolju_sal.add("귀문관살");}
					else if (arr.get(2).equals("진")) {wolju_sal.add("격각살");}
					else if (arr.get(2).equals("축")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("묘")) {
					if (arr.get(2).equals("신")) {wolju_sal.add("귀문관살");}
					else if (arr.get(2).equals("사")) {wolju_sal.add("격각살");wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("진")) {
					if (arr.get(2).equals("해")) {wolju_sal.add("귀문관살");}
					else if (arr.get(2).equals("오")) {wolju_sal.add("격각살");}
					else if (arr.get(2).equals("유")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("사")) {
					if (arr.get(2).equals("술")) {wolju_sal.add("귀문관살");}
					else if (arr.get(2).equals("미")) {wolju_sal.add("격각살");}
					else if (arr.get(2).equals("축")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("오")) {
					if (arr.get(2).equals("축")) {wolju_sal.add("귀문관살");}
					else if (arr.get(2).equals("신")) {wolju_sal.add("격각살");}
					else if (arr.get(2).equals("사")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("미")) {
					if (arr.get(2).equals("인")) {wolju_sal.add("귀문관살");}
					else if (arr.get(2).equals("유")) {wolju_sal.add("격각살");wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("신")) {
					if (arr.get(2).equals("묘")) {wolju_sal.add("귀문관살");}
					else if (arr.get(2).equals("술")) {wolju_sal.add("격각살");}
					else if (arr.get(2).equals("축")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("유")) {
					if (arr.get(2).equals("자")) {wolju_sal.add("귀문관살");}
					else if (arr.get(2).equals("해")) {wolju_sal.add("격각살");}
					else if (arr.get(2).equals("사")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("술")) {
					if (arr.get(2).equals("사")) {wolju_sal.add("귀문관살");}
					else if (arr.get(2).equals("자")) {wolju_sal.add("격각살");}
					else if (arr.get(2).equals("유")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("해")) {
					if (arr.get(2).equals("진")) {wolju_sal.add("귀문관살");}
					else if (arr.get(2).equals("축")) {wolju_sal.add("격각살");}
					else if (arr.get(2).equals("축")) {wolju_sal.add("암금적살");}
				}
				// 일지-월지
				if (arr.get(5).equals("자")) {
					if (arr.get(6).equals("유")) {wolju_sal.add("귀문관살");}
					else if (arr.get(6).equals("인")) {wolju_sal.add("격각살");}
					else if (arr.get(6).equals("사")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("축")) {
					if (arr.get(6).equals("오")) {wolju_sal.add("귀문관살");}
					else if (arr.get(6).equals("묘")) {wolju_sal.add("격각살");}
					else if (arr.get(6).equals("유")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("인")) {
					if (arr.get(6).equals("미")) {wolju_sal.add("귀문관살");}
					else if (arr.get(6).equals("진")) {wolju_sal.add("격각살");}
					else if (arr.get(6).equals("축")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("묘")) {
					if (arr.get(6).equals("신")) {wolju_sal.add("귀문관살");}
					else if (arr.get(6).equals("사")) {wolju_sal.add("격각살");wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("진")) {
					if (arr.get(6).equals("해")) {wolju_sal.add("귀문관살");}
					else if (arr.get(6).equals("오")) {wolju_sal.add("격각살");}
					else if (arr.get(6).equals("유")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("사")) {
					if (arr.get(6).equals("술")) {wolju_sal.add("귀문관살");}
					else if (arr.get(6).equals("미")) {wolju_sal.add("격각살");}
					else if (arr.get(6).equals("축")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("오")) {
					if (arr.get(6).equals("축")) {wolju_sal.add("귀문관살");}
					else if (arr.get(6).equals("신")) {wolju_sal.add("격각살");}
					else if (arr.get(6).equals("사")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("미")) {
					if (arr.get(6).equals("인")) {wolju_sal.add("귀문관살");}
					else if (arr.get(6).equals("유")) {wolju_sal.add("격각살");wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("신")) {
					if (arr.get(6).equals("묘")) {wolju_sal.add("귀문관살");}
					else if (arr.get(6).equals("술")) {wolju_sal.add("격각살");}
					else if (arr.get(6).equals("축")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("유")) {
					if (arr.get(6).equals("자")) {wolju_sal.add("귀문관살");}
					else if (arr.get(6).equals("해")) {wolju_sal.add("격각살");}
					else if (arr.get(6).equals("사")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("술")) {
					if (arr.get(6).equals("사")) {wolju_sal.add("귀문관살");}
					else if (arr.get(6).equals("자")) {wolju_sal.add("격각살");}
					else if (arr.get(6).equals("유")) {wolju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("해")) {
					if (arr.get(6).equals("진")) {wolju_sal.add("귀문관살");}
					else if (arr.get(6).equals("축")) {wolju_sal.add("격각살");}
					else if (arr.get(6).equals("축")) {wolju_sal.add("암금적살");}
				}
				// 일지-연간
				if (arr.get(5).equals("자")) {
					if (arr.get(3).equals("유")) {yunju_sal.add("귀문관살");}
					else if (arr.get(3).equals("인")) {yunju_sal.add("격각살");}
					else if (arr.get(3).equals("사")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("축")) {
					if (arr.get(3).equals("오")) {yunju_sal.add("귀문관살");}
					else if (arr.get(3).equals("묘")) {yunju_sal.add("격각살");}
					else if (arr.get(3).equals("유")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("인")) {
					if (arr.get(3).equals("미")) {yunju_sal.add("귀문관살");}
					else if (arr.get(3).equals("진")) {yunju_sal.add("격각살");}
					else if (arr.get(3).equals("축")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("묘")) {
					if (arr.get(3).equals("신")) {yunju_sal.add("귀문관살");}
					else if (arr.get(3).equals("사")) {yunju_sal.add("격각살");yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("진")) {
					if (arr.get(3).equals("해")) {yunju_sal.add("귀문관살");}
					else if (arr.get(3).equals("오")) {yunju_sal.add("격각살");}
					else if (arr.get(3).equals("유")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("사")) {
					if (arr.get(3).equals("술")) {yunju_sal.add("귀문관살");}
					else if (arr.get(3).equals("미")) {yunju_sal.add("격각살");}
					else if (arr.get(3).equals("축")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("오")) {
					if (arr.get(3).equals("축")) {yunju_sal.add("귀문관살");}
					else if (arr.get(3).equals("신")) {yunju_sal.add("격각살");}
					else if (arr.get(3).equals("사")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("미")) {
					if (arr.get(3).equals("인")) {yunju_sal.add("귀문관살");}
					else if (arr.get(3).equals("유")) {yunju_sal.add("격각살");yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("신")) {
					if (arr.get(3).equals("묘")) {yunju_sal.add("귀문관살");}
					else if (arr.get(3).equals("술")) {yunju_sal.add("격각살");}
					else if (arr.get(3).equals("축")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("유")) {
					if (arr.get(3).equals("자")) {yunju_sal.add("귀문관살");}
					else if (arr.get(3).equals("해")) {yunju_sal.add("격각살");}
					else if (arr.get(3).equals("사")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("술")) {
					if (arr.get(3).equals("사")) {yunju_sal.add("귀문관살");}
					else if (arr.get(3).equals("자")) {yunju_sal.add("격각살");}
					else if (arr.get(3).equals("유")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("해")) {
					if (arr.get(3).equals("진")) {yunju_sal.add("귀문관살");}
					else if (arr.get(3).equals("축")) {yunju_sal.add("격각살");}
					else if (arr.get(3).equals("축")) {yunju_sal.add("암금적살");}
				}
				// 일지-연지
				if (arr.get(5).equals("자")) {
					if (arr.get(7).equals("유")) {yunju_sal.add("귀문관살");}
					else if (arr.get(7).equals("인")) {yunju_sal.add("격각살");}
					else if (arr.get(7).equals("사")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("축")) {
					if (arr.get(7).equals("오")) {yunju_sal.add("귀문관살");}
					else if (arr.get(7).equals("묘")) {yunju_sal.add("격각살");}
					else if (arr.get(7).equals("유")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("인")) {
					if (arr.get(7).equals("미")) {yunju_sal.add("귀문관살");}
					else if (arr.get(7).equals("진")) {yunju_sal.add("격각살");}
					else if (arr.get(7).equals("축")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("묘")) {
					if (arr.get(7).equals("신")) {yunju_sal.add("귀문관살");}
					else if (arr.get(7).equals("사")) {yunju_sal.add("격각살");yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("진")) {
					if (arr.get(7).equals("해")) {yunju_sal.add("귀문관살");}
					else if (arr.get(7).equals("오")) {yunju_sal.add("격각살");}
					else if (arr.get(7).equals("유")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("사")) {
					if (arr.get(7).equals("술")) {yunju_sal.add("귀문관살");}
					else if (arr.get(7).equals("미")) {yunju_sal.add("격각살");}
					else if (arr.get(7).equals("축")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("오")) {
					if (arr.get(7).equals("축")) {yunju_sal.add("귀문관살");}
					else if (arr.get(7).equals("신")) {yunju_sal.add("격각살");}
					else if (arr.get(7).equals("사")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("미")) {
					if (arr.get(7).equals("인")) {yunju_sal.add("귀문관살");}
					else if (arr.get(7).equals("유")) {yunju_sal.add("격각살");yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("신")) {
					if (arr.get(7).equals("묘")) {yunju_sal.add("귀문관살");}
					else if (arr.get(7).equals("술")) {yunju_sal.add("격각살");}
					else if (arr.get(7).equals("축")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("유")) {
					if (arr.get(7).equals("자")) {yunju_sal.add("귀문관살");}
					else if (arr.get(7).equals("해")) {yunju_sal.add("격각살");}
					else if (arr.get(7).equals("사")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("술")) {
					if (arr.get(7).equals("사")) {yunju_sal.add("귀문관살");}
					else if (arr.get(7).equals("자")) {yunju_sal.add("격각살");}
					else if (arr.get(7).equals("유")) {yunju_sal.add("암금적살");}
				}
				else if (arr.get(5).equals("해")) {
					if (arr.get(7).equals("진")) {yunju_sal.add("귀문관살");}
					else if (arr.get(7).equals("축")) {yunju_sal.add("격각살");}
					else if (arr.get(7).equals("축")) {yunju_sal.add("암금적살");}
				}
				setSiju_sal(siju_sal);
				setIlju_sal(ilju_sal);
				setWolju_sal(wolju_sal);
				setYunju_sal(yunju_sal);
	}
}
		

	
