import java.awt.*;
import java.awt.event.*;
class TextEventDemo extends Frame implements TextListener
{
	TextField t1,t2;
	TextEventDemo()
	{
		Font f=new Font("Times new Roman",Font.BOLD,18);
		Label lb=new Label("Text Listener");
		lb.setFont(f);
		add(lb);

		t1=new TextField(25);
		t1.setFont(f);
		add(t1);

		t2=new TextField(25);
		t2.setFont(f);
		add(t2);
		
		t1.addTextListener(this);

		setSize(400,400);
		setVisible(true);
		setTitle("Text Demo");

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});
	}

	public void textValueChanged(TextEvent ae)
	{
		t2.setText(t1.getText());
	}
	public static void main(String args[])
	{
		new TextEventDemo();
	}
}