package text.paragraph.handle;

import text.TypeSettingContext;
import text.paragraph.AlignAtEnum;

/**
 * 首行缩进处理
 * @author traveller
 * @date 2023/12/28 11:38
 */
public class FirstIntervalHandler extends ChainHandler{
    @Override
    public void handleRequest(TypeSettingContext typeSettingContext, String content) {
        Float firstInterval = typeSettingContext.getFirstInterval();
        //todo: 缩进处理操作

    }
}
