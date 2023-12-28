package text.paragraph.handle;

import text.TypeSettingContext;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 行首数据清洗
 * @author traveller
 * @date 2023/12/28 10:53
 */
public class FirstLineConstraintHandler extends ChainHandler{
    public FirstLineConstraintHandler() {
        //todo 初始化参数，需要拦截的数据
        firstHoldContent.add("。");
    }

    private List<String> firstHoldContent = new LinkedList<>();

    @Override
    public void handleRequest(TypeSettingContext typeSettingContext, String content) {
        List<String> firstHoldFiled = firstHoldContent.stream().filter(firstHold -> content.startsWith(firstHold)).collect(Collectors.toList());
        if(firstHoldFiled.isEmpty()){
            super.getNextHandler().handleRequest(typeSettingContext, content);
        }else{
            firstLineConstraint(content, firstHoldFiled);
        }
    }

    /**
     *  首行约束
     * @param content
     * @return
     */
    private String firstLineConstraint(String content, List<String> firstHoldFiled){
        //todo: 行首不允许出现句号、逗号、顿号、叹号、问号、冒号、后括号、后引号、后书名号。
        return content;
    };
}
