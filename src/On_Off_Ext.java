import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class On_Off_Ext implements ActionListener{
	JFrame jf;
	JTextField txt1;
	JButton btn1,btn2,btn3;
	JLabel lbl1;

	On_Off_Ext()
	{
		jf=new JFrame("All Converter");
		txt1=new JTextField(20);
		btn1=new JButton("ON");
		btn2=new JButton("OFF");
		btn3=new JButton("EXT");
		lbl1=new JLabel();
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		jf.add(txt1);
		jf.add(btn1);
		jf.add(btn2);
		jf.add(btn3);
		jf.add(lbl1);
		jf.setLayout(new FlowLayout());
		jf.setSize(250,400);
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		new On_Off_Ext();
	}
	public void actionPerformed(ActionEvent e)
	{
		int value= Integer.parseInt(txt1.getText());
		int rem,k=1,bit=0;
		String com=e.getActionCommand();
		String res="";
		if(com.equals("ON"))
		{
		while(value>0)
			{
				rem=value|1;
				if(rem==0)
				{
				res=0+res;
				}
				else
				{
				res=1+res;

				}
				value=value>>1;
			}
			lbl1.setText("ON Value:"+res);
		}
		else if(com.equals("OFF"))
		{
			while(value>0)
			{
				rem=value&0;
				res=rem+res;
				value=value>>1;
			}
			lbl1.setText("OFF Value:"+res);
		}
		else
		{
			  int pos=Integer.parseInt(JOptionPane.showInputDialog(jf,"Enter Name")); 
			while(value>0)
			{
				rem=value&1;
				if(pos==k)
				{
					bit=rem;
				}
				value=value>>1;
				k++;
			}
			lbl1.setText("EXt Value at "+pos+" pos is:"+bit);
		}
			res="";
	}

}	