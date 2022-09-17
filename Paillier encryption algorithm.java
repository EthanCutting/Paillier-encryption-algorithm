import javax.swing.*;
import java.awt.event.*;
import java.math.BigInteger;

public class ModCalc extends JFrame  
{
    public Paillierencryptionalgorithm() 
    {       
    }

    public static void main (String[] args) 
    {
        //boolean chkhex = false;
        frame.add(labelA);
        frame.add(labelB);
        frame.add(labelM);
        frame.add(labelres);
        frame.add(fieldA);
        frame.add(fieldB);
        frame.add(fieldM);
        frame.add(fieldRes);
        frame.add(compute);
        frame.add(hex);

      //boolean chkhex = false;
        JFrame frame = new JFrame("Paillier encryption algorithm ");
        frame.setSize(500,640);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JLabel labelA = new JLabel("CipherText");
        JLabel labelB = new JLabel("Random Number");
        JLabel labelM = new JLabel("N2");
        JLabel labelres = new JLabel("a^b (mod m)");
        JButton compute = new JButton("a^b (mod m)");
        JCheckBox hex = new JCheckBox("HEX");  
        
        JTextField fieldA = new JTextField();
        JTextField fieldB = new JTextField();
        JTextField fieldM = new JTextField();
        JTextField fieldRes = new JTextField();

        labelA.setBounds(10, 5, 250, 30);
        labelB.setBounds(10, 135, 250, 30);
        labelM.setBounds(10, 270, 250, 30);
        labelres.setBounds(10, 450, 250, 30);
    
        fieldA.setBounds(10, 30, 470, 100);
        fieldB.setBounds(10, 160, 470, 100);
        fieldM.setBounds(10, 300, 470, 100);
        fieldRes.setBounds(10, 480, 470, 100);

        compute.setBounds(300, 420, 110, 40);
        hex.setBounds(415, 420, 110, 40);

       compute.addActionListener(new ActionListener() 
       {
            BigInteger a,b,m,res;
            public void actionPerformed(ActionEvent e) 
            {
                String ta = fieldA.getText();
                String tb = fieldB.getText();
                String tm = fieldM.getText();
                try 
                {
                    if(hex.isSelected()) 
                    {
                        a = new BigInteger(ta,16);
                        b = new BigInteger(tb,16);
                        m = new BigInteger(tm,16);
    
                        res = a.modPow(b, m);
                        fieldRes.setText(res.toString(16));    
                    } else {
                        a = new BigInteger(ta);
                        b = new BigInteger(tb);
                        m = new BigInteger(tm);
                        res = a.modPow(b, m);
                        fieldRes.setText(res.toString());                                 
                    }    
                } catch (Exception ez) 
                {
                    fieldRes.setText("Their is a ERROR");
                }
            }  
        });  
    }

    
}
