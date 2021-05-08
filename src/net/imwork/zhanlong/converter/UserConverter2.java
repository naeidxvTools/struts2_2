package net.imwork.zhanlong.converter;

import net.imwork.zhanlong.bean.User;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author 展龙
 */
public class UserConverter2 extends StrutsTypeConverter
{
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass)
    {
        StringTokenizer st = new StringTokenizer(strings[0], ";");
        String username = st.nextToken();
        String password = st.nextToken();
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return user;
    }

    @Override
    public String convertToString(Map map, Object o)
    {
        User user = (User)o;
        String username = user.getUsername();
        String password = user.getPassword();
        String user_info = "User Converter2 :::: username = " + username + ", password = " + password;

        return user_info;
    }
}
