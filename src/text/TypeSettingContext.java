package text;

import text.paragraph.AlignAtEnum;
import text.paragraph.handle.ChainHandler;

import java.util.List;

/**
 *
 * @author traveller
 * @date 2023/12/28 12:51
 */
public class TypeSettingContext {

    private TypeSettingContext() {
    }

    public TypeSettingContext(Font font, List<ChainHandler> chainHandlerList, AlignAtEnum alignAtEnum, Float firstInterval) {
        this.font = font;
        this.chainHandlerList = chainHandlerList;
        this.alignAtEnum = alignAtEnum;
        this.firstInterval = firstInterval;
    }

    /**
     *  字体
     */
    private Font font;

    /**
     *  段落处理器
     */
    private List<ChainHandler> chainHandlerList;

    /**
     *  对齐方式
     */
    private AlignAtEnum alignAtEnum;

    /**
     *  首行缩进字符
     */
    private Float firstInterval;

    public Font getFont() {
        return font;
    }

    public List<ChainHandler> getChainHandlerList() {
        return chainHandlerList;
    }

    public AlignAtEnum getAlignAtEnum() {
        return alignAtEnum;
    }

    public Float getFirstInterval() {
        return firstInterval;
    }
}
