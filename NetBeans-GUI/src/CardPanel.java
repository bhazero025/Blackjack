
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class CardPanel extends JPanel
{
    private Image image;
    
    public CardPanel()
    {
        super();
        //this.setVisible(false);
        //this.setFirstImage("C:\\Users\\bruno\\Documents\\NetBeansProjects\\GUI\\test_image.jpg");
    }
    
    private void setFirstImage(String path)
    {
        try
        {
            image = ImageIO.read(new File(path));
        }
        catch (Exception e)
        {
            System.out.println("Could not load image...");
        }
    }
    
    public void setImage(String path)
    {
        this.setVisible(true); // Only be visible after we draw an image
        try
        {
            image = ImageIO.read(new File(path));
        }
        catch (Exception e)
        {
            System.out.println("Could not load image...");
        }
        paintComponent(this.getGraphics());
    }
    
     public void setImage(Card card)
    {
        this.setVisible(true); // Only be visible after we draw an image
        try
        {
            //System.out.println(card.getImageString());
            image = ImageIO.read(new File(card.getImageString()));
            
        }
        catch (Exception e)
        {
            System.out.println("Could not load image...");
        }
        paintComponent(this.getGraphics());
    }
    
    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);

        // Draw the background image.
        g.drawImage(image, 0, 0, this);
    }
    
}
