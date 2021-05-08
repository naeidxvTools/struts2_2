package net.imwork.zhanlong.converter;

import net.imwork.zhanlong.bean.User;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author 展龙
 */
public class UserConverter3 extends StrutsTypeConverter
{
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass)
    {
        List<User> users = new ArrayList<>();

        for (String s : strings)
        {
            StringTokenizer st = new StringTokenizer(s, ";");
            String username = st.nextToken();
            String password = st.nextToken();
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            users.add(user);
        }

        return users;
    }

    @Override
    public String convertToString(Map map, Object o)
    {
        List<User> users = (List<User>)o;
        StringBuilder sb = new StringBuilder();
        sb.append("结果是：");
        for (User user : users)
        {
            String username = user.getUsername();
            String password = user.getPassword();
            sb.append("username = " + username).append(", password = " + password + ";");
        }

        return sb.toString();
    }
}
