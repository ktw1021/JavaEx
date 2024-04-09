package furtune;

public enum HeavenlyStems {
    갑("양", "木", "90˚(동)", "청"),
    을("음", "木", "90˚(동)", "청"),
    병("양", "火", "180˚(남)", "적"),
    정("음", "火", "180˚(남)", "적"),
    무("양", "土", "중앙", "황"),
    기("음", "土", "중앙", "황"),
    경("양", "金", "270˚(서)", "백"),
    신("음", "金", "270˚(서)", "백"),
    임("양", "水", "0˚(북)", "흑"),
    계("음", "水", "0˚(북)", "흑");

    private final String yinYang; // 음양
    private final String element; // 원소
    private final String direction; // 방향
    private final String color; // 색상

    HeavenlyStems(String yinYang, String element, String direction, String color) {
        this.yinYang = yinYang;
        this.element = element;
        this.direction = direction;
        this.color = color;
    }
    
    public String getYinYang() {
        return yinYang;
    }

    public String getElement() {
        return element;
    }

    public String getDirection() {
        return direction;
    }

    public String getColor() {
        return color;
    }
    
}
