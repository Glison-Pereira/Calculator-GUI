// Create a GUI Calculator

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;

class Calculation extends JFrame
{
      Container c;
      JLabel Num1;
      JLabel Num2;
      JTextField Get1;
      JTextField Get2;
      JButton add,sub,mul,div, power,squareroot,square,loga,absolute,tane,sine,cose,inverse,exponential,factorial,tanearc,sinearc,cosearc,tanhe,sinhe,coshe;
      Calculation()
      {
            c=getContentPane();
            c.setLayout(new FlowLayout(FlowLayout.CENTER,50,40));
            c.setBackground(Color.GRAY);
            Font f=new Font("Ariel",Font.BOLD,30);
            Font f1=new Font("Impact",Font.ITALIC,30);
            Num1=new JLabel("Enter your Number1: ");
            Get1=new JTextField(30);
            Num1.setFont(f);
            Num1.setForeground(Color.WHITE);
            Num2=new JLabel("Enter your Number2: ");
            Get2=new JTextField(30);
            Num2.setFont(f);
            Num2.setForeground(Color.WHITE);
            add=new JButton("+");
            sub=new JButton("-");
	    mul=new JButton("x");
	    div=new JButton("/");
	    power=new JButton("x*y");
	    squareroot=new JButton("sqrt");
	    square=new JButton("x*2");
	    loga=new JButton("log");
	    absolute=new JButton("abs");
	    tane=new JButton("tan");
	    sine=new JButton("sin");
	    cose=new JButton("cos");
	    inverse=new JButton("1/x");
	    exponential=new JButton("e*x");
	    factorial=new JButton("x!");
	    tanearc=new JButton("tan*-1");
	    sinearc=new JButton("sin*-1");
	    cosearc=new JButton("cos*-1");
	    tanhe=new JButton("tanh");
	    sinhe=new JButton("sinh");
	    coshe=new JButton("cosh");
            c.add(Num1);
            c.add(Get1);
            c.add(Num2);
            c.add(Get2);
            c.add(add);
            c.add(sub);
            c.add(mul);
            c.add(div);
            c.add(power);
            c.add(squareroot);
            c.add(square);
            c.add(loga);
            c.add(absolute);
            c.add(tane);
            c.add(sine);
            c.add(cose);
            c.add(exponential);
            c.add(factorial);
            c.add(tanearc);
            c.add(sinearc);
            c.add(cosearc);
            c.add(tanhe);
            c.add(sinhe);
            c.add(coshe);
            c.add(inverse);
            add.setFont(f1);
            sub.setFont(f1);
            mul.setFont(f1);
            div.setFont(f1);
            power.setFont(f1);
            squareroot.setFont(f1);
            square.setFont(f1);
            loga.setFont(f1);
            absolute.setFont(f1);
            tane.setFont(f1);
            sine.setFont(f1);
            cose.setFont(f1);
            exponential.setFont(f1);
            factorial.setFont(f1);
            tanearc.setFont(f1);
            sinearc.setFont(f1);
            cosearc.setFont(f1);
            tanhe.setFont(f1);
            sinhe.setFont(f1);
            coshe.setFont(f1);
            inverse.setFont(f1);
            ActionListener a=(ae)->{
                 try{
                      double n1=Double.parseDouble(Get1.getText());
                      double n2=Double.parseDouble(Get2.getText());
                      if(ae.getSource()==add) JOptionPane.showMessageDialog(c,n1+n2);
                      else if(ae.getSource()==sub) JOptionPane.showMessageDialog(c,n1-n2);
                      else if(ae.getSource()==mul) JOptionPane.showMessageDialog(c,n1*n2);
                      else if(ae.getSource()==div) JOptionPane.showMessageDialog(c,n1/n2);
                      else if(ae.getSource()==power) JOptionPane.showMessageDialog(c,Math.pow(n1,n2));
                      else if(ae.getSource()==squareroot) JOptionPane.showMessageDialog(c,Math.sqrt(n1)+" and "+Math.sqrt(n2));
                      else if(ae.getSource()==square) JOptionPane.showMessageDialog(c,Math.pow(n1,2)+" and "+Math.pow(n2,2));
                      else if(ae.getSource()==loga) JOptionPane.showMessageDialog(c,Math.log(n1)+" and "+Math.log(n2));
                      else if(ae.getSource()==absolute) JOptionPane.showMessageDialog(c,Math.abs(n1)+" and "+Math.abs(n2));
                      else if(ae.getSource()==exponential) JOptionPane.showMessageDialog(c,Math.exp(n1)+" and "+Math.exp(n2));
                      else if(ae.getSource()==tane) JOptionPane.showMessageDialog(c,Math.tan(Math.toRadians(n1))+" and "+Math.tan(Math.toRadians(n2)));
                      else if(ae.getSource()==sine) JOptionPane.showMessageDialog(c,Math.sin(Math.toRadians(n1))+" and "+Math.sin(Math.toRadians(n2)));
 		      else if(ae.getSource()==cose) JOptionPane.showMessageDialog(c,Math.cos(Math.toRadians(n1))+" and "+Math.cos(Math.toRadians(n2)));
 		      else if(ae.getSource()==tanhe) JOptionPane.showMessageDialog(c,Math.tanh(n1)+" and "+Math.tanh(n2));
 		      else if(ae.getSource()==sinhe) JOptionPane.showMessageDialog(c,Math.sinh(n1)+" and "+Math.sinh(n2));
 		      else if(ae.getSource()==coshe) JOptionPane.showMessageDialog(c,Math.cosh(n1)+" and "+Math.cosh(n2));
		      else if(ae.getSource()==inverse) JOptionPane.showMessageDialog(c,1/n1+" and "+1/n2);
 		      else if(ae.getSource()==tanearc) JOptionPane.showMessageDialog(c,Math.atan(n1)+" and "+Math.atan(n2));
                      else if(ae.getSource()==sinearc) JOptionPane.showMessageDialog(c,Math.asin(n1)+" and "+Math.asin(n2)+" Values should lie between -1 to 1");
                      else if(ae.getSource()==cosearc) JOptionPane.showMessageDialog(c,Math.acos(n1)+" and "+Math.acos(n2)+" Values should lie between -1 to 1");
                      else if(ae.getSource()==factorial) 
                      {
                              int ans1=1,ans2=1;
                              int e=(int)n1;
                              int g=(int)n2;
                              for(int i=e;i>=1;i--)
                              {
                                  ans1=ans1*i;
                              }
                              for(int i=g;i>=1;i--)
                              {
                                  ans2=ans2*i;
                              }
                              JOptionPane.showMessageDialog(c,ans1+" and "+ans2);
                      }
                      
                 }catch(Exception e){
                       JOptionPane.showMessageDialog(c,e.getMessage());
                       Get1.setText("");
                       Get1.requestFocus();
                 }  
            };
            add.addActionListener(a);
            sub.addActionListener(a);
	    mul.addActionListener(a);
            div.addActionListener(a);
	    power.addActionListener(a);
            squareroot.addActionListener(a);
	    square.addActionListener(a);
            loga.addActionListener(a);
	    absolute.addActionListener(a);
            tane.addActionListener(a);
	    sine.addActionListener(a);
            cose.addActionListener(a);
	    exponential.addActionListener(a);
            factorial.addActionListener(a);
	    tanearc.addActionListener(a);
            sinearc.addActionListener(a);
	    cosearc.addActionListener(a);
            tanhe.addActionListener(a);
	    sinhe.addActionListener(a);
            coshe.addActionListener(a);
	    inverse.addActionListener(a);
            setTitle("Java GUI Calculator");
            setSize(800,600);
            setLocationRelativeTo(null);
            setResizable(false); 
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
      }
}

class Calculator
{
public static void main(String args[])
{
    Calculation ca=new Calculation();
}
}