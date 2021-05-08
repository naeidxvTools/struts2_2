package net.imwork.zhanlong.struts2;

import com.opensymphony.xwork2.ActionSupport;
import net.imwork.zhanlong.bean.User;

import java.util.List;

/**
 * @author 展龙
 */
public class UserAction2 extends ActionSupport
{
    private List<User> user;

    @Override
    public String execute() throws Exception
    {
        return SUCCESS;
    }

    public List<User> getUser()
    {
        return user;
    }

    public void setUser(List<User> user)
    {
        this.user = user;
    }
}
