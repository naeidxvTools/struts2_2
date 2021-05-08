package net.imwork.zhanlong.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author 展龙
 */
public class I18nTest2
{
    public static void main(String[] args)
    {
        Locale locale = new Locale("en","US");

        ResourceBundle bundle = ResourceBundle.getBundle("zhanlong",locale);
        System.out.println(bundle.getString("hello"));




    }
}
