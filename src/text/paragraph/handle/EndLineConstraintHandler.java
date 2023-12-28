package text.paragraph.handle;

import text.TypeSettingContext;
import text.paragraph.util.ParagraphUtil;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 行末数据清洗
 * @author traveller
 * @date 2023/12/28 10:53
 */
public class EndLineConstraintHandler extends ChainHandler{

    public EndLineConstraintHandler() {
        //todo 初始化参数，需要拦截的数据
        endHoldContent.add("。");
    }
    private List<String> endHoldContent = new LinkedList<>();

    @Override
    public void handleRequest(TypeSettingContext typeSettingContext, String content) {
        List<String> endHoldFiled = endHoldContent.stream().filter(firstHold -> content.startsWith(firstHold)).collect(Collectors.toList());
        if(endHoldFiled.isEmpty()){
            super.getNextHandler().handleRequest(typeSettingContext, content);
        }else{
            endLineConstraint(content, endHoldFiled);
        }
    }


    private String endLineConstraint(String content, List<String> endHoldFiled){
        //todo: 行末不允许出现前引号、前括号、前书名号。③破折号 --和省略号
        return content;
    };
}
