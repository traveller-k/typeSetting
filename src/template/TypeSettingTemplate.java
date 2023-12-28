package template;

import text.Font;
import text.TypeSettingContext;
import text.paragraph.AlignAtEnum;
import text.paragraph.handle.ChainHandler;
import text.paragraph.util.ParagraphUtil;

import java.util.List;
import java.util.stream.Collectors;

/**
 *  排版的模板， 默认全量的一个排版，正常来说免费的排版应该 缺少部分处理方式，vip才给全量排版
 * @author traveller
 * @date 2023/12/28 11:48
 */
public abstract class TypeSettingTemplate {


    TypeSettingContext typeSettingContext;

    /**
     *  给出排版内容
     * @return
     */
    public String getComposeTypeContent(String content){
        List<String> paragraphSplit = ParagraphUtil.paragraphSplit(content);
        paragraphSplit.stream().forEach(paragraphContent -> {
             handler(paragraphContent);
        });
       return ParagraphUtil.paragraphMerge(paragraphSplit);
    }


    String handler(String content){
        typeSettingContext.getChainHandlerList().forEach(chainHandler -> chainHandler.handleRequest(typeSettingContext, content));
        return content;
    }

    /**
     *  获取所需要的处理器
     * @return
     */
     abstract List<ChainHandler> getHandler();

}
