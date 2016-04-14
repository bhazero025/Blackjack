
import javax.swing.JButton;


public class FinishButton extends JButton
{
    int pressed = 0;
    
    public FinishButton()
    {
        super();
    }
    
    public void changeState()
    {
        if (pressed == 0)
        {
            pressed = 1;
        }
        else
        {
            pressed = 0;
        }
    }
    
    public void setState(int a)
    {
        if (a != 1 || a != 0)
        {
            return;
        }
        pressed = a;
    }
    
    public int getState()
    {
        return this.pressed;
    }
}
