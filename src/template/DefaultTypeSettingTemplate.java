package template;

import text.Font;
import text.TypeSettingContext;
import text.paragraph.AlignAtEnum;
import text.paragraph.handle.ChainHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * @author traveller
 * @date 2023/12/28 11:21
 */
public class DefaultTypeSettingTemplate extends TypeSettingTemplate{
    DefaultTypeSettingTemplate() {
        this.typeSettingContext = new TypeSettingContext(
                new Font(),
                getHandler(),
                AlignAtEnum.LEFT,
                2f);
    }

    @Override
    List<ChainHandler> getHandler() {
        //todo
        return null;
    }
}
