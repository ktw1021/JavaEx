package furtune;

import java.util.Scanner;

public class FortuneApp {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        InputDate gapja = new InputDate();
        
        System.out.print("연도를 입력하세요: ");
        gapja.inputYear = scanner.next();
        System.out.print("월을 입력하세요: ");
        gapja.inputMonth = scanner.next();
        System.out.print("일을 입력하세요: ");
        gapja.inputDay = scanner.next();
        System.out.print("시를 입력하세요: ");
        gapja.inputHour = scanner.nextInt();
        
        ApiCaller apiCaller = new ApiCaller();
        try {
            // API 호출을 통해 결과를 받아옵니다.
            String result = apiCaller.callApi
            		(gapja.inputYear, gapja.inputMonth, gapja.inputDay);
            
            // 결과를 XmlParser 객체에 전달하여 파싱하고 출력합니다.
            XmlParser parser = new XmlParser();
            parser.parseXmlString(result, gapja.inputHour); // parseXmlString 호출.
        } catch (Exception e) {
            e.printStackTrace();
        }
        scanner.close();
    }
		

}
