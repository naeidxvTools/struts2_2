package net.imwork.zhanlong.converter;

import net.imwork.zhanlong.bean.User;
import ognl.DefaultTypeConverter;

import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author 展龙
 */
public class UserConverter extends DefaultTypeConverter
{
    @Override
    public Object convertValue(Map context, Object value, Class toType)
    {
        if (User.class == toType)
        {
            String[] strings = (String[]) value;
            String firstValue = strings[0];
            StringTokenizer st = new StringTokenizer(firstValue, ";");
            String username = st.nextToken();
            String password = st.nextToken();
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);

            return user;
        } else if (String.class == toType)
        {
            User user = (User) value;
            String username = user.getUsername();
            String password = user.getPassword();
            String user_info = "username = " + username + ", password = " + password;
            return user_info;
        }
        return null;
    }
}
