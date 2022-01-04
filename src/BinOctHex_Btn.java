import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class BinOctHex_Btn implements ActionListener{
	JFrame jf;
	JTextField txt1;
	JButton btn1,btn2,btn3;
	JLabel lbl1;

	BinOctHex_Btn()
	{
		jf=new JFrame("All Converter");
		txt1=new JTextField(20);
		btn1=new JButton("BIN");
		btn2=new JButton("OCT");
		btn3=new JButton("HEX");
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
		new BinOctHex_Btn();
	}
	public void actionPerformed(ActionEvent e)
	{
		int value= Integer.parseInt(txt1.getText());
		int rem;
		char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String com=e.getActionCommand();
		String res="";
		if(com.equals("HEX"))
		{
		while(value>0)
			{
				rem=value%16;
				res=hex[rem]+res;
				value=value/16;
			}
			lbl1.setText("Hex Value:"+res);
		}
		else if(com.equals("BIN"))
		{
			while(value>0)
			{
				rem=value%2;
				res=rem+res;
				value=value/2;
			}
			lbl1.setText("Bin Value:"+res);
		}
		else
		{
			while(value>0)
			{
				rem=value%8;
				res=rem+res;
				value=value/8;
			}
			lbl1.setText("Oct Value:"+res);
		}

	}

}