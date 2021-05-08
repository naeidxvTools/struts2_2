package net.imwork.zhanlong.struts2;

import com.opensymphony.xwork2.ActionSupport;
import net.imwork.zhanlong.exception.PasswordException;
import net.imwork.zhanlong.exception.UsernameException;

import java.util.Calendar;
import java.util.Date;

/**
 * @author 展龙
 */
public class RegisterAction extends ActionSupport
{
    public final static String NAME = "zhan";
    public final static int NUM1 = 4;
    public final static int NUM2 = 6;
    public final static int NUM3 = 10;
    public final static int NUM4 = 50;
    @Override
    public String execute() throws Exception
    {
        System.out.println("execute invoked.");
        if (!NAME.equals(username))
        {
            throw new UsernameException("用户名不对.（抛出异常）");
        }
        if (!"long".equals(password))
        {
            throw new PasswordException("密码不对.（抛出异常）");
        }
        return SUCCESS;
    }

    @Override
    public void validate()
    {
        System.out.println("validate invoked.");

        if (null == username || username.length() < NUM1 || username.length() > NUM2)
        {
            this.addActionError("username invalid");
            this.addFieldError("username","username invalid in field.");
        }

        if (null == password || password.length() < NUM1 || password.length() > NUM2)
        {
            this.addActionError("password invalid.");
        } else if (null == repassword || repassword.length() < NUM1 || repassword.length() > NUM2)
        {
            this.addActionError("repassword invalid.");
        } else if (!password.equals(repassword))
        {
            this.addActionError("the passwords not the same.");
        }

        if (age > NUM4|| age < NUM3)
        {
            this.addActionError("age invalid.");
        }

        if (null == birthday)
        {
            this.addActionError("birthday invalid.");
        }
        if (null == graduation)
        {
            this.addActionError("graduation invalid");

        }

        if (null != birthday && null != graduation)
        {
            Calendar c1 = Calendar.getInstance();
            c1.setTime(birthday);

            Calendar c2 = Calendar.getInstance();
            c2.setTime(graduation);

            if (!c1.before(c2))
            {
                this.addActionError("birthday should be before graduation.");
            }
        }


    }

    private String username;
    private String password;
    private String repassword;
    private int age;
    private Date birthday;
    private Date graduation;

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

    public String getRepassword()
    {
        return repassword;
    }

    public void setRepassword(String repassword)
    {
        this.repassword = repassword;
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

    public Date getGraduation()
    {
        return graduation;
    }

    public void setGraduation(Date graduation)
    {
        this.graduation = graduation;
    }
}
