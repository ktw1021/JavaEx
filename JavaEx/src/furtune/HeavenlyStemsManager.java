package furtune;

import java.util.HashMap;
import java.util.Map;

public class HeavenlyStemsManager {
	private static Map<String, TenthHeavenlyStems> HeavenlyStemMap = new HashMap<>();
	
	static {
		initializeHeavenlyStemsMap();
	}
	
	private static void initializeHeavenlyStemsMap() {
		
		HeavenlyStemMap.put("갑",new TenthHeavenlyStems
				("양","木","90˚(동)","청"));
		HeavenlyStemMap.put("을",new TenthHeavenlyStems
				("음","木","90˚(동)","청"));
		HeavenlyStemMap.put("병",new TenthHeavenlyStems
				("양","火","180˚(남)","적"));
		HeavenlyStemMap.put("정",new TenthHeavenlyStems
				("음","火","180˚(남)","적"));
		HeavenlyStemMap.put("무",new TenthHeavenlyStems
				("양","土","중앙","황"));
		HeavenlyStemMap.put("기",new TenthHeavenlyStems
				("음","土","중앙","황"));
		HeavenlyStemMap.put("경",new TenthHeavenlyStems
				("양","金","270˚(서)","백"));
		HeavenlyStemMap.put("신",new TenthHeavenlyStems
				("음","金","270˚(서)","백"));
		HeavenlyStemMap.put("갑",new TenthHeavenlyStems
				("양","水","0˚(북)","흑"));
		HeavenlyStemMap.put("갑",new TenthHeavenlyStems
				("음","水","0˚(북)","흑"));
	}
	
	
	
}
