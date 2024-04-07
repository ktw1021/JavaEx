package furtune;

import java.util.HashMap;
import java.util.Map;

public class TwelfthZodiac {
    private static final Map<String, ZodiacInfo> zodiacMap = new HashMap<>();

    static {
        // 모든 지지에 대한 정보 초기화
        zodiacMap.put("자", new ZodiacInfo
        		("쥐", "양", "水", "겨울", "11월", "대설, 동지", "23~01", "0˚(북)", "황종", "壬(임·10), 癸(계·20)"));
        zodiacMap.put("축", new ZodiacInfo
        		("소", "음", "土", "겨울", "12월", "소한, 대한", "01~03", "30˚(북동북)", "대려", "癸(계·9), 辛(신·3), 己(기·18)"));
        zodiacMap.put("인", new ZodiacInfo
        		("호랑이", "양", "木", "봄", "1월", "입춘, 우수", "03~05", "60˚(동북동)", "태주", "戊(무·7), 丙(병·7), 甲(갑·16)"));
        zodiacMap.put("묘", new ZodiacInfo
        		("토끼", "음", "木", "봄", "2월", "경칩, 춘분", "05~07", "90˚(동)", "협종", "甲(갑·10), 乙(을·20)"));
        zodiacMap.put("진", new ZodiacInfo
        		("용", "양", "土", "봄", "3월", "청명, 곡우", "07~09", "120˚(동남동)", "고선", "乙(을·9), 癸(계·3), 戊(무·18)"));
        zodiacMap.put("사", new ZodiacInfo
        		("뱀", "음", "火", "여름", "4월", "입하, 소만", "09~11", "150˚(남남동)", "중려", "戊(무·7), 庚(경·7), 丙(병·16)"));
        zodiacMap.put("오", new ZodiacInfo
        		("말", "양", "火", "여름", "5월", "망종, 하지", "11~13", "180˚(남)", "유빈", "丙(병·10), 己(기·9), 丁(정·11)"));
        zodiacMap.put("미", new ZodiacInfo
        		("양", "음", "土", "여름", "6월", "소서, 대서", "13~15", "210˚(남남서)", "임종", "丁(정·9), 乙(을·3), 己(기·18)"));
        zodiacMap.put("신", new ZodiacInfo
        		("원숭이", "양", "金", "가을", "7월", "입추, 처서", "15~17", "240˚(서남서)", "이칙", "戊(무·7), 壬(임·7), 庚(경·16)"));
        zodiacMap.put("유", new ZodiacInfo
        		("닭", "음", "金", "가을", "8월", "백로, 추분", "17~19", "270˚(서)", "남려", "庚(경·10), 辛(신·20)"));
        zodiacMap.put("술", new ZodiacInfo
        		("개", "양", "土", "가을", "9월", "한로, 상강", "19~21", "300˚(서북서)", "무역", "辛(신·9), 丁(정·3), 戊(무·18)"));
        zodiacMap.put("해", new ZodiacInfo
        		("돼지", "음", "水", "겨울", "10월", "입동, 소설", "21~23", "330˚(북북서)", "응종", "戊(무·7), 甲(갑·7), 壬(임·16)"));
    }

    public static ZodiacInfo getZodiacInfo(String zodiac) {
        return zodiacMap.get(zodiac);
    }

    public static class ZodiacInfo {
        String animal;
        String yinYang;
        String element;
        String season;
        String lunarMonth;
        String solarTerms;
        String time;
        String direction;
        String musicalNote;
        String heavenlyStems;

        public ZodiacInfo() {
			super();
		}

		public ZodiacInfo(String animal, String yinYang, String element, String season, String lunarMonth,
                          String solarTerms, String time, String direction, String musicalNote, String heavenlyStems) {
            this.animal = animal;
            this.yinYang = yinYang;
            this.element = element;
            this.season = season;
            this.lunarMonth = lunarMonth;
            this.solarTerms = solarTerms;
            this.time = time;
            this.direction = direction;
            this.musicalNote = musicalNote;
            this.heavenlyStems = heavenlyStems;
        }

        @Override
        public String toString() {
            return "Zodiac " + animal + " - YinYang: " + yinYang + ", Element: " + element + ", Season: " + season +
                   ", Lunar Month: " + lunarMonth + ", Solar Terms: " + solarTerms + ", Time: " + time +
                   ", Direction: " + direction + ", Musical Note: " + musicalNote + ", Heavenly Stems: " + heavenlyStems;
        }
    }
}
