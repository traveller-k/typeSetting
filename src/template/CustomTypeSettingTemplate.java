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
public class CustomTypeSettingTemplate extends TypeSettingTemplate{

     CustomTypeSettingTemplate(Font font, AlignAtEnum alignAtType, Float firstInterval) {
         this.typeSettingContext = new TypeSettingContext(
                 font,
                 getHandler(),
                 alignAtType,
                 firstInterval);
    }


    @Override
    List<ChainHandler> getHandler() {
         //todo
        return null;
    }
}
