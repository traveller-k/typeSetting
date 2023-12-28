import template.TemplateBuilder;
import template.TypeSettingTemplate;
import text.Font;
import text.paragraph.AlignAtEnum;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        TypeSettingTemplate defaultTemplate = TemplateBuilder.getDefaultTemplate();
        String composeTypeContent1 = defaultTemplate.getComposeTypeContent("世界是不是很小，我也不知道");
        System.out.println(composeTypeContent1);


        TypeSettingTemplate typeSettingTemplate = TemplateBuilder.build(
                new Font("微软雅黑", 10f, new Color(0f, 0f, 0f), Boolean.FALSE, Boolean.FALSE, Boolean.FALSE),
                AlignAtEnum.LEFT,
                2f);
        String composeTypeContent2 = typeSettingTemplate.getComposeTypeContent("世界是不是很小，我也不知道");
         System.out.println(composeTypeContent2);
    }
}