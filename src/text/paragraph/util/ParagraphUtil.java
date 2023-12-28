package text.paragraph.util;

import java.util.LinkedList;
import java.util.List;

/**
 * @author traveller
 * @date 2023/12/28 12:10
 */
public class ParagraphUtil {


    /**
     * todo: 将内容根据 回车进行分离，变成一个个段落
     * @param content
     * @return
     */
    public static List<String> paragraphSplit(String content){
        LinkedList<String> paragraphList = new LinkedList<>();
        //todo
        return paragraphList;
    }

    /**
     * todo: 将内容根据 回车进行连接，变成一个string
     * @param paragraphList
     * @return
     */
    public static String paragraphMerge(List<String> paragraphList){
        StringBuffer stringBuffer = new StringBuffer();
        //todo
        return stringBuffer.toString();
    }
}
