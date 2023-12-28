package text.paragraph.handle;

import text.TypeSettingContext;

import java.util.LinkedList;
import java.util.List;

/**
 *  处理段落格式所会面临的问题
 * @author traveller
 * @date 2023/12/28 10:49
 */
public abstract class ChainHandler {
    private ChainHandler handler;


    public abstract void handleRequest(TypeSettingContext typeSettingContext, String content);

    public ChainHandler getNextHandler() {
        return handler;
    }

    public void setNextHandler(ChainHandler handler) {
        this.handler = handler;
    }
}
