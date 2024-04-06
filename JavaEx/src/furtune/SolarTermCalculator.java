package furtune;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import java.io.StringReader;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SolarTermCalculator {

    public static String calculateMonthlyGan(String xmlResponse, int month, int day) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(xmlResponse));
            Document doc = builder.parse(is);

            NodeList nodeList = doc.getElementsByTagName("item");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    int solMonth = Integer.parseInt(element.getElementsByTagName("solMonth").item(0).getTextContent());
                    int solDay = Integer.parseInt(element.getElementsByTagName("solDay").item(0).getTextContent());
                    
                    // 월간 결정 로직: 입력된 월과 절기의 시작 월이 같고, 입력된 일이 절기 시작일 이후인 경우
                    if (month == solMonth && day >= solDay) {
                        // 여기서 월간에 해당하는 천간을 결정하는 로직 필요
                        return "적절한 천간"; // 예시이므로 실제 로직에 맞게 수정
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // 정보를 찾지 못한 경우
    }
}
