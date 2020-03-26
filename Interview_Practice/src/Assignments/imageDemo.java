package Assignments;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class imageDemo
{
	public imageDemo()
	{
		SwingUtilities.invokeLater(new Runnable() 
		{	
			public void run() 
			{
				JFrame frame = new JFrame("Image Display");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(getClass().getResource("/Satyamevjayte.jpg"));
				}
				catch(IOException e) 
				{
					e.printStackTrace(); 
					System.exit(1);
				}	
				ImageIcon imgIcon = new ImageIcon(img);
				JLabel lbl = new JLabel();
				lbl.setIcon(imgIcon);
				frame.getContentPane().add(lbl, BorderLayout.CENTER);
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}		
		});
	}	
	public static void main(String[] args) throws IOException
	{	
		new imageDemo();
	}
}
