import java.awt.*;
import java.awt.event.*;
class  KeyDemo extends JFrame implements KeyListener
{
	KeyDemo ()
	{
		Container ct=getContentPane();
		ct.setLayout(new FlowLayout());
		Label l=new Label("See changed content here");
		add(l);
		add keyListener(this);
		public void keyPressed()
		{
			l.setText("Key is pressed");
		}
		public void keyReleased()
		{
			l.setText("Key is Released");
		}
		public void keyTyped()
		{
			l.setText("Key is Typed");
		}
		setVisible(true);
		setSize(400,400);
		setTitle("tree demo");
		addWindowListener(new WindowAdapter())
		{
			public void windowClosing(WindowEvent e)
			{
			dispose();
			}
		}
	}
	public static void main(String args[])
	{
		new KeyDemo ();
	}
}
		
		
		
		
		
		