package template;

import com.sun.istack.internal.NotNull;
import text.Font;
import text.paragraph.AlignAtEnum;
import text.paragraph.handle.ChainHandler;

import java.util.List;

/**
 * @author traveller
 * @date 2023/12/27 21:10
 */
public class TemplateBuilder {

    private TemplateBuilder() {
    }

    public static TypeSettingTemplate build(@NotNull Font font, @NotNull AlignAtEnum alignAtType, @NotNull Float firstInterval){
        /**
         * todo 参数校验
         */
        return new CustomTypeSettingTemplate(font, alignAtType, firstInterval);
    }

    /**
     *  字体
     */
    public Font font;

    /**
     *  对齐方式
     */
    public AlignAtEnum alignAtType;

    public static TypeSettingTemplate getDefaultTemplate(){
        return new DefaultTypeSettingTemplate();
    }
}
