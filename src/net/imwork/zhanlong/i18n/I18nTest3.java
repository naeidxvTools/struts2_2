package net.imwork.zhanlong.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author 展龙
 */
public class I18nTest3
{
    public static void main(String[] args)
    {
        Locale locale = new Locale("en","US");
        ResourceBundle bundle = ResourceBundle.getBundle("zhanlong", locale);

        String value = bundle.getString("hello");

        String result = MessageFormat.format(value, new Object[]{"我是占位符的文字"});

        System.out.println(result);
    }
}
