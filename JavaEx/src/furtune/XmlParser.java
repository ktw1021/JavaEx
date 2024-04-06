package furtune;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import java.io.StringReader;

public class XmlParser {
    public void parseXmlString(String xmlStr) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputSource is = new InputSource(new StringReader(xmlStr));
        Document doc = builder.parse(is);

        NodeList nodeList = doc.getElementsByTagName("item");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println("음력 날짜: " 
                + element.getElementsByTagName("lunDay").item(0).getTextContent());
                System.out.println("간지(일진): " 
                + element.getElementsByTagName("lunIljin").item(0).getTextContent());
                System.out.println("윤달 여부: " 
                + element.getElementsByTagName("lunLeapmonth").item(0).getTextContent());
                System.out.println("음력 월: " 
                + element.getElementsByTagName("lunMonth").item(0).getTextContent());
                System.out.println("음력 연도: " 
                + element.getElementsByTagName("lunYear").item(0).getTextContent());
                System.out.println("양력 날짜: " 
                + element.getElementsByTagName("solDay").item(0).getTextContent());
                System.out.println("양력 월: " 
                + element.getElementsByTagName("solMonth").item(0).getTextContent());
                System.out.println("양력 연도: " 
                + element.getElementsByTagName("solYear").item(0).getTextContent());
                System.out.println("요일: " 
                + element.getElementsByTagName("solWeek").item(0).getTextContent());
                System.out.println("-------------------------------------------------");
            }
        }
    }
}
