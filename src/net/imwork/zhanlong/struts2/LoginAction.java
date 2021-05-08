package net.imwork.zhanlong.struts2;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

/**
 * @author 展龙
 */
public class LoginAction extends ActionSupport
{
    private String username;
    private String password;
    private int age;
    private Date birthday;


    @Override
    public String execute()
    {
        System.out.println("execute invoked!");
        return "success";
    }

    public String myExecute()
    {
        System.out.println("myExecute invoked!");
        return "success";
    }

    @Override
    public void validate()
    {
        System.out.println("validate invoked!");
    }

    public void validateMyExecute()
    {
        System.out.println("validateExecute invoked!");
        if (null == birthday)
        {
            this.addActionError("birthday not null");
            this.addFieldError("birthday","生日不能为空！<-- 在LoginAction.java中的validateMyExecute方法里");
        }
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

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }
}
