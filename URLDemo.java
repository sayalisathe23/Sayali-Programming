import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
class URLDemo extends Frame implements ActionListener
{
	TextArea ta;
	TextField t;
	Button btnDetails;
        Button btnExit;
	URLDemo()
	{
		Label l=new Label("URL DEMO");
		add(l);
		t=new TextField(25);
		add(t);
		ta=new TextArea();
		add(ta);
		btnDetails=new Button("get details");
		add(btnDetails);
		btnExit=new Button("Exit");
		add(btnExit);

		btnDetails.addActionListener(this);
		btnExit.addActionListener(this);
		
		setVisible(true);
		setSize(400,400);
		setTitle("URL DEMO");
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				dispose();
			}
		});
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnExit)
		{
			System.exit(0);
		}
		else if(ae.getSource()==btnDetails)
		{
			try
			{
				ta.setText(" ");
				URL url=new URL(t.getText());
				ta.append("\n Protocol="+url.getProtocol());
				ta.append("\n Host="+url.getHost());
				ta.append("\n Port="+url.getPort());
				ta.append("\n File="+url.getFile());
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String args[])
	{
		new URLDemo();
	}
}
	