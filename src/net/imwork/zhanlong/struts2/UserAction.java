package net.imwork.zhanlong.struts2;

import com.opensymphony.xwork2.ActionSupport;
import net.imwork.zhanlong.bean.User;

/**
 * @author 展龙
 */
public class UserAction extends ActionSupport
{
    private User user;

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    @Override
    public String execute() throws Exception
    {
        System.out.println("execute invoked.");
        return SUCCESS;
    }

    public String myExecute() throws Exception
    {
        System.out.println("myExecute invoked.");

        return SUCCESS;
    }
}
