//Takrim Elahi chowdhury
//20120202025

import java.awt.Color;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import java.awt.*;



public class Calculatortakrim {

    static int num1,num2;
    static char option; 
    
    public static void main(String[] args) {
        
               //creating JFrame

               JFrame frame =new JFrame("Takrim");
               frame.setSize(300, 400);
               frame.setLayout(null);
               frame.setDefaultCloseOperation(3);
               frame.setLocationRelativeTo(null);
               frame.getContentPane().setBackground(Color.BLACK);
               

               //creating JPanel1
               
               JPanel panel1 = new JPanel();
               panel1.setBounds(10,10,260,100);
               panel1.setBackground(Color.CYAN);
               

               frame.add(panel1);


               //creating JTextfield and connect it with on panel1

                   
                final JTextField tf = new JTextField("");
		tf.setBounds(10,10,240,70);
	        tf.setBackground(Color.BLACK);
		panel1.add(tf);
                




               //*creating Jpanel2

               JPanel panel2 = new JPanel();
               panel2.setBackground(Color.GRAY);
               panel2.setBounds(10,120,260,230);
               panel2.setLayout(new GridLayout(4,3,5,5));
               frame.add(panel2);

               //JButton creating

               
               JButton btnAC= new JButton("Ac");
               btnAC.setFont(new Font("Calibri", Font.BOLD, 20));
               btnAC.setBackground(Color.orange);
               btnAC.setRolloverEnabled(false);
	       btnAC.setFocusable(false);
	       btnAC.setBorderPainted(false);
	       btnAC.setForeground(Color.BLACK);
		       
	       btnAC.addActionListener(new ActionListener(){
			      public void actionperformed(ActionEvent e){
				  String st = tf.getText();
				  st="";
			      }@Override
                          public void actionPerformed(ActionEvent e) {
                 
                      
                     String S = tf.getText();
                     if(S.equals(0));
                     S="";
                     tf.setText("");

              }
		});
            
                     JButton btn0 = new JButton("0");
                     btn0.setFont(new Font("Calibri", Font.BOLD, 20));
                     
                     btn0.setRolloverEnabled(false);
	             btn0.setFocusable(false);
	             btn0.setBorderPainted(false);
	             
		       
		       btn0.addActionListener(new ActionListener(){
			      public void actionperformed(ActionEvent e){
				  String S = tf.getText();
				  S="";
			      }@Override
                          public void actionPerformed(ActionEvent e) {
                          
                            String S = tf.getText();
                            int num = Integer.parseInt(S);
                            if(num>0)
                            {
                                  
                                 tf.setText("-"+S);

                            }
                            else if(num<0)
                            {
                                    tf.setText("-"+S);
                            }
                            else
                            {
                                    tf.setText("0");
                            }

              }
		});

               JButton btn1 = new JButton("1");
               btn1.setFont(new Font("Calibri", Font.BOLD, 20));

               btn1.setRolloverEnabled(false);
               btn1.setFocusable(false);
               btn1.setBorderPainted(false);
               
	       
               btn1.addActionListener(new ActionListener(){
               public void actionperformed(ActionEvent e){
               String S = tf.getText();
               S="";
                }@Override
               public void actionPerformed(ActionEvent e) {
            
              String S = tf.getText();
              S = tf.getText();
              if(S.equals(0))
              {
                    S = "";
             }

                tf.setText("1"+S);
             }
             });




             JButton btn2 = new JButton("2");
             btn2.setFont(new Font("Calibri", Font.BOLD, 20));
             btn2.setRolloverEnabled(false);
             btn2.setFocusable(false);
             btn2.setBorderPainted(false);
             
	     
             btn2.addActionListener(new ActionListener(){
               public void actionperformed(ActionEvent e){
               String S = tf.getText();
               S="";
                }@Override
               public void actionPerformed(ActionEvent e) {
            
              String S = tf.getText();
              S = tf.getText();
              if(S.equals(0))
              {
                    S = "";
             }

                tf.setText("2"+S);
             }
             });


             JButton btn3 = new JButton("3");
             btn3.setFont(new Font("Calibri", Font.BOLD, 20));
             btn3.setRolloverEnabled(false);
             btn3.setFocusable(false);
             btn3.setBorderPainted(false);
             
	     
             btn3.addActionListener(new ActionListener(){
               public void actionperformed(ActionEvent e){
               String S = tf.getText();
               S ="";
                }@Override
               public void actionPerformed(ActionEvent e) {
            
              String S = tf.getText();
              S = tf.getText();
              if(S.equals(0))
              {
                    S = "";
             }

                tf.setText("3"+S);
             }
             });


             JButton btn4 = new JButton("4");
             btn4.setFont(new Font("Calibri", Font.BOLD, 20));
             btn4.setRolloverEnabled(false);
             btn4.setFocusable(false);
             btn4.setBorderPainted(false);
             
	     
             btn4.addActionListener(new ActionListener(){
               public void actionperformed(ActionEvent e){
               String S = tf.getText();
               S ="";
                }@Override
               public void actionPerformed(ActionEvent e) {
            
              String S = tf.getText();
              S = tf.getText();
              if(S.equals(0))
              {
                    S = "";
             }

                tf.setText("4"+S);
             }
             });
              

             JButton btn5 = new JButton("5");
             btn5.setFont(new Font("Calibri", Font.BOLD, 20));
             btn5.setRolloverEnabled(false);
             btn5.setFocusable(false);
             btn5.setBorderPainted(false);
             
	    
             btn5.addActionListener(new ActionListener(){
               public void actionperformed(ActionEvent e){
               String S = tf.getText();
               S ="";
                }@Override
               public void actionPerformed(ActionEvent e) {
            
              String S = tf.getText();
              S = tf.getText();
              if(S.equals(0))
              {
                    S = "";
             }

                tf.setText("5"+S);
             }
             });


             JButton btn6 = new JButton("6");
             btn6.setFont(new Font("Calibri", Font.BOLD, 20));
             btn6.setRolloverEnabled(false);
             btn6.setFocusable(false);
             btn6.setBorderPainted(false);
             
	   
             btn6.addActionListener(new ActionListener(){
               public void actionperformed(ActionEvent e){
               String S = tf.getText();
               S ="";
                }@Override
               public void actionPerformed(ActionEvent e) {
            
              String S = tf.getText();
              S = tf.getText();
              if(S.equals(0))
              {
                    S = "";
             }

                tf.setText("6"+S);
             }
             });

             JButton btn7 = new JButton("7");
             btn7.setFont(new Font("Calibri", Font.BOLD, 20));
             btn7.setRolloverEnabled(false);
             btn7.setFocusable(false);
             btn7.setBorderPainted(false);
             
	    
             btn7.addActionListener(new ActionListener(){
               public void actionperformed(ActionEvent e){
               String S = tf.getText();
               S ="";
                }@Override
               public void actionPerformed(ActionEvent e) {
            
              String S = tf.getText();
              S = tf.getText();
              if(S.equals(0))
              {
                    S = "";
             }

                tf.setText("7"+S);
             }
             });

             JButton btn8 = new JButton("8");
             btn8.setFont(new Font("Calibri", Font.BOLD, 20));
             btn8.setRolloverEnabled(false);
             btn8.setFocusable(false);
             btn8.setBorderPainted(false);
             
	     
             btn8.addActionListener(new ActionListener(){
               public void actionperformed(ActionEvent e){
               String S = tf.getText();
               S ="";
                }@Override
               public void actionPerformed(ActionEvent e) {
            
              String S = tf.getText();
              S = tf.getText();
              if(S.equals(0))
              {
                    S = "";
             }

                tf.setText("8"+S);
             }
             });

             JButton btn9 = new JButton("9");
             btn9.setFont(new Font("Calibri", Font.BOLD, 20));
             btn9.setRolloverEnabled(false);
             btn9.setFocusable(false);
             btn9.setBorderPainted(false);
             
	     
             btn9.addActionListener(new ActionListener(){
               public void actionperformed(ActionEvent e){
               String S = tf.getText();
               S ="";
                }@Override
               public void actionPerformed(ActionEvent e) {
            
              String S = tf.getText();
              S = tf.getText();
              if(S.equals(0))
              {
                    S = "";
             }

                tf.setText("9"+S);
             }
             });

             JButton btnplus = new JButton("+");
             btnplus.setFont(new Font("Calibri", Font.BOLD, 20));
             btnplus.setFocusable(false);
             btnplus.setBorderPainted(false);
             btnplus.setBackground(Color.orange);
             
	     
             btnplus.addActionListener(new ActionListener(){
               public void actionperformed(ActionEvent e){
               String S = tf.getText();
               S ="";
                }@Override
               public void actionPerformed(ActionEvent e) {
            
              String S = tf.getText();
              S = tf.getText();
               

                tf.setText("+"+S);
             }
             });
             
             JButton btnminus = new JButton("-");
             btnminus.setFont(new Font("Calibri", Font.BOLD, 20));
             btnminus.setRolloverEnabled(false);
             btnminus.setFocusable(false);
             btnminus.setBorderPainted(false);
             btnminus.setBackground(Color.orange);
             
	     
             btnminus.addActionListener(new ActionListener(){
               public void actionperformed(ActionEvent e){
               String S = tf.getText();
               S ="";
                }@Override
               public void actionPerformed(ActionEvent e) {
            
              String S = tf.getText();
              S = tf.getText();
              if(S.equals(0))
              {
                    S = "";
             }

                tf.setText("-"+S);
             }
             });

             JButton btnmultiplication = new JButton("*");
             btnmultiplication.setFont(new Font("Calibri", Font.BOLD, 20));
             btnmultiplication.setRolloverEnabled(false);
             btnmultiplication.setFocusable(false);
             btnmultiplication.setBorderPainted(false);
             btnmultiplication.setBackground(Color.orange);
             
	    
             btnmultiplication.addActionListener(new ActionListener(){
               public void actionperformed(ActionEvent e){
               String S = tf.getText();
               S ="";
                }@Override
               public void actionPerformed(ActionEvent e) {
            
              String S = tf.getText();
              S = tf.getText();
              if(S.equals(0))
              {
                    S = "";
             }

                tf.setText("×"+S);
             }
             });

             JButton btndivisor = new JButton("/");
             btndivisor.setFont(new Font("Calibri", Font.BOLD, 20));
             btndivisor.setRolloverEnabled(false);
             btndivisor.setFocusable(false);
             btndivisor.setBorderPainted(false);
             btndivisor.setBackground(Color.orange);
             
	     
             btndivisor.addActionListener(new ActionListener(){
               public void actionperformed(ActionEvent e){
               String S = tf.getText();
               S ="";
                }@Override
               public void actionPerformed(ActionEvent e) {
            
              String S = tf.getText();
              S = tf.getText();
              if(S.equals(0))
              {
                    S = "";
             }

                tf.setText("÷"+S);
             }
             });


             JButton btnequal = new JButton("=");
             btnequal.setFont(new Font("Calibri", Font.BOLD, 20));
             btnequal.setRolloverEnabled(false);
             btnequal.setFocusable(false);
             btnequal.setBorderPainted(false);
             btnequal.setBackground(Color.orange);
             
             btnequal.addActionListener(new ActionListener(){
                public void actionperformed(ActionEvent e){
                        String S = tf.getText();
                        if(S.equals("0"))
                                S ="";
                        tf.setText("="+S);
                }@Override
          public void actionPerformed(ActionEvent e) {
                String S = tf.getText();
 
 
 
                if(S.length()>0 && (option == '+' || option == '-') || option == '*' || option == '/') {
                        num2 = Integer.valueOf(S);
                        int result = 0;

                        if(option == '+') {
                                result = num1+num2;
                        }

                        if(option == '-') {
                                result = num1-num2;
                        }
                        if(option == '*')
                        {
                                result = num1*num2;
                        }
                        if(option == '/')
                        {
                                result = num1/num2;
                        }

                        tf.setText(Integer.toString(result));
                        option = ' ';
                 }


              
      
                 }
            });


               panel2.add(btnAC);
               panel2.add(btn0);
               panel2.add(btn1);
               panel2.add(btnplus);
               panel2.add(btn2);
               panel2.add(btn3);
               panel2.add(btn4);
               panel2.add(btnminus);
               panel2.add(btn5);
               panel2.add(btn6);
               panel2.add(btn7);
               panel2.add(btnmultiplication);
               panel2.add(btn8);
               panel2.add(btn9);
               panel2.add(btnequal);
               panel2.add(btndivisor);
               
               

               frame.setVisible(true);



               
            


               


               
               





    }
        
    }
    









    

