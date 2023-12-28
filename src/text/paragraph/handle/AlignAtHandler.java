package text.paragraph.handle;

import text.TypeSettingContext;
import text.paragraph.AlignAtEnum;

/**
 * 对齐处理
 * @author traveller
 * @date 2023/12/28 11:38
 */
public class AlignAtHandler extends ChainHandler{
    @Override
    public void handleRequest(TypeSettingContext typeSettingContext, String content) {
        AlignAtEnum alignAtEnum = typeSettingContext.getAlignAtEnum();
        //todo: 对齐处理操作
    }
}
