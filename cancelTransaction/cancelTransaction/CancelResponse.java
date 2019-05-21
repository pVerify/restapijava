package cancelTransaction;

public class CancelResponse {
    private String IsCancelled;

    private String Message;

    private String CurrentStatus;

    public String getIsCancelled ()
    {
        return IsCancelled;
    }

    public void setIsCancelled (String IsCancelled)
    {
        this.IsCancelled = IsCancelled;
    }

    public String getMessage ()
    {
        return Message;
    }

    public void setMessage (String Message)
    {
        this.Message = Message;
    }

    public String getCurrentStatus ()
    {
        return CurrentStatus;
    }

    public void setCurrentStatus (String CurrentStatus)
    {
        this.CurrentStatus = CurrentStatus;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [IsCancelled = "+IsCancelled+", Message = "+Message+", CurrentStatus = "+CurrentStatus+"]";
    }
}
