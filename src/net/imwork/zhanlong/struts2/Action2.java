package net.imwork.zhanlong.struts2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 展龙
 */
public class Action2 extends ActionSupport
{
    private String username;
    private String password;
    private String usernameAndPassword;

    @Override
    public String execute() throws Exception
    {
        return SUCCESS;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getUsernameAndPassword()
    {
        return usernameAndPassword;
    }

    public void setUsernameAndPassword(String usernameAndPassword)
    {
        this.usernameAndPassword = usernameAndPassword;
    }
}
