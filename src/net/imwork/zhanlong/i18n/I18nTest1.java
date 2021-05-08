package net.imwork.zhanlong.i18n;

import java.util.Locale;

/**
 * @author 展龙
 */
public class I18nTest1
{
    public static void main(String[] args)
    {
        Locale[] locales = Locale.getAvailableLocales();

        for (Locale locale : locales)
        {
            System.out.println(locale.getDisplayCountry() + " : " + locale.getCountry());
        }
        for (Locale locale : locales)
        {
            System.out.println(locale.getDisplayLanguage() + " : " + locale.getLanguage());
        }
    }
}
