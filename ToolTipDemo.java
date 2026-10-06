import java.awt.*;
import java.awt.event.*;
import java.awt.Container;
import javax.swing.*;
class ToolTipDemo extends JFrame
{
	ToolTipDemo()
	{
		Font f=new Font("Times new Roman",Font.BOLD,18);
		Container ct=getContentPane();
		ct.setLayout(new FlowLayout());
		JTextField t=new JTextField(25);
		t.setFont(f);
		ct.add(t);	
		JButton b=new JButton("Sign in");
		ct.add(b);
		setVisible(true);
		setSize(400,400);
		setTitle("ToolTip Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new ToolTipDemo();
	}
}

		