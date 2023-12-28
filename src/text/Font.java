package text;
import java.awt.*;

/**
 * @author traveller
 * @date 2023/12/27 20:48
 */
public class Font {

    public Font() {
        initialize();
    }

    public Font(String fontName, Float fontSize) {
        this.fontName = fontName;
        this.fontSize = fontSize;
        this.fontColor = new Color(0, 0, 0);
        this.underline = Boolean.FALSE;
        this.changeThick = Boolean.FALSE;
        this.incline = Boolean.FALSE;
    }

    public Font(String fontName, Float fontSize, Color fontColor, boolean underline, boolean changeThick, boolean incline) {
        initialize(fontName, fontSize, fontColor, underline, changeThick, incline);
    }
    private void initialize(){
        this.fontName = "宋体(正文)";
        this.fontSize = 10.5F;
        this.fontColor = new Color(0, 0, 0);
        this.underline = Boolean.FALSE;
        this.changeThick = Boolean.FALSE;
        this.incline = Boolean.FALSE;
    }

    private void initialize(String fontName, Float fontSize, Color fontColor, boolean underline, boolean changeThick, boolean incline){
        this.fontName = fontName;
        this.fontSize = fontSize;
        this.fontColor = fontColor;
        this.underline = underline;
        this.changeThick = changeThick;
        this.incline = incline;
    }


    /**
     *  字体名称
     */
    private String fontName;

    /**
     *  子号
     */
    private Float fontSize;

    /**
     *  字体颜色
     */
    private Color fontColor;

    /**
     *  下划线
     */
    private boolean underline;

    /**
     * 加粗
     */
    private boolean changeThick;

    /**
     *  倾斜
     */
    private boolean incline;

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public Float getFontSize() {
        return fontSize;
    }

    public void setFontSize(Float fontSize) {
        this.fontSize = fontSize;
    }

    public Color getFontColor() {
        return fontColor;
    }

    public void setFontColor(Color fontColor) {
        this.fontColor = fontColor;
    }

    public boolean isUnderline() {
        return underline;
    }

    public void setUnderline(boolean underline) {
        this.underline = underline;
    }

    public boolean isChangeThick() {
        return changeThick;
    }

    public void setChangeThick(boolean changeThick) {
        this.changeThick = changeThick;
    }

    public boolean isIncline() {
        return incline;
    }

    public void setIncline(boolean incline) {
        this.incline = incline;
    }
}
