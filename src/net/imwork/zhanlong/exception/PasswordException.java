package net.imwork.zhanlong.exception;

/**
 * @author 展龙
 */
public class PasswordException extends Exception
{
    private String message;

    public PasswordException(String message)
    {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}
