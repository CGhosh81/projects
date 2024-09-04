import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
// import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class mycalculator implements ActionListener {

    JFrame jf;
    JTextField jtf;
    //////////declear button
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bsub, bmul, bdiv, beq, bdel, bdec, bclr, blog, bsin, bcos,
            btan, bx2, bxy, bn, b1x, bsinh, bcosh, btanh, bex, br, bp,be,bx3,bplus,bpi;
     double f=0,s=0,r=0;
     String operator="";

    mycalculator() {
        jf = new JFrame("Scientific Calculator");
        jf.setVisible(true);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        jf.setBounds(20, 200, 370, 500);
        

        jtf = new JTextField();
        jtf.setBackground(Color.LIGHT_GRAY);
        jtf.setForeground(Color.blue);
        jtf.setBounds(18, 10, 300, 50);

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        badd = new JButton("+");
        bsub = new JButton("-");
        bdiv = new JButton("/");
        bmul = new JButton("*");
        bdec = new JButton(".");
        bdel = new JButton("Del");
        bclr = new JButton("AC");
        beq = new JButton("=");
        blog = new JButton("Log");
        bsin = new JButton("Sin");
        bcos = new JButton("Cos");
        btan = new JButton("Tan");
        bx2 = new JButton("X^2");

        bxy = new JButton("X^y");
        bn = new JButton("!");
        b1x = new JButton("1/X");
        bsinh = new JButton("Sin^-1");
        bcosh = new JButton("cos^-1");
        btanh = new JButton("Tan^-1");
        bex = new JButton("e^x");
        br = new JButton("√");
        bp = new JButton("%");
        bpi = new JButton("π");
        bx3 = new JButton("x^3");
        be = new JButton("e");
        bplus = new JButton("+/-");
        /// ROW 1
        br.setBounds(20, 65, 70, 40);
        bsin.setBounds(95, 65, 70, 40);
        bcos.setBounds(170, 65, 70, 40);
        btan.setBounds(245, 65, 70, 40);
        /// ROW 2
        bex.setBounds(20, 110, 70, 40);
        b1x.setBounds(95, 110, 70, 40);
        bxy.setBounds(170, 110, 70, 40);
        bx2.setBounds(245, 110, 70, 40);
        /// ROW 3
        blog.setBounds(18, 155, 70, 40);
        bsinh.setBounds(93, 155, 70, 40);
        bcosh.setBounds(169, 155, 72, 40);
        btanh.setBounds(243, 155, 73, 40);
        /// ROW 4
        bp.setBounds(20, 200, 70, 40);
        bdel.setBounds(95, 200, 70, 40);
        bclr.setBounds(170, 200, 70, 40);
        badd.setBounds(245, 200, 70, 40);
        /// ROW 5
        b7.setBounds(20, 245, 70, 40);
        b8.setBounds(95, 245, 70, 40);
        b9.setBounds(170, 245, 70, 40);
        bsub.setBounds(245, 245, 70, 40);
        /// ROW 6
        b4.setBounds(20, 290, 70, 40);
        b5.setBounds(95, 290, 70, 40);
        b6.setBounds(170, 290, 70, 40);
        bmul.setBounds(245, 290, 70, 40);
        /// ROW 7
        b1.setBounds(20, 335, 70, 40);
        b2.setBounds(95, 335, 70, 40);
        b3.setBounds(170, 335, 70, 40);
        bdiv.setBounds(245, 335, 70, 40);
        /// ROW 8
        bn.setBounds(20, 380, 70, 40);
        b0.setBounds(95, 380, 70, 40);
        bdec.setBounds(170, 380, 70, 40);
        bpi.setBounds(245, 380, 70, 40);
            /// ROW 9
            bplus.setBounds(20, 425, 70, 40);
            be.setBounds(95, 425, 70, 40);
            bx3.setBounds(170, 425, 70, 40);
            beq.setBounds(245, 425, 70, 40);

        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
        jf.add(b5);
        jf.add(b6);
        jf.add(b7);
        jf.add(b8);
        jf.add(b9);
        jf.add(b0);
        jf.add(badd);
        jf.add(bsub);
        jf.add(bmul);
        jf.add(bdiv);
        jf.add(bdec);
        jf.add(bdel);
        jf.add(bclr);
        jf.add(blog);
        jf.add(bsin);
        jf.add(bcos);
        jf.add(btan);
        jf.add(bx2);

        jf.add(bxy);
        jf.add(beq);
        jf.add(bn);
        jf.add(bex);
        jf.add(bsinh);
        jf.add(bcosh);
        jf.add(btanh);
        jf.add(b1x);
        jf.add(br);
        jf.add(bp);
        jf.add(be);
        jf.add(bx3);
        jf.add(bplus);
        jf.add(bpi);
        jf.add(jtf);
     

        jf.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent event){
        int a = JOptionPane.showConfirmDialog(jf,"are you want to exit");
        if(a==JOptionPane.YES_OPTION)
        {
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        }

        }
        });
       /////////////////////////////////////////////////////////////// ActionListener
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);
       b5.addActionListener(this);
       b6.addActionListener(this);
       b7.addActionListener(this);
       b8.addActionListener(this);
       b9.addActionListener(this);
       b0.addActionListener(this);
       badd.addActionListener(this);
       bsub.addActionListener(this);
       bmul.addActionListener(this);
       bdiv.addActionListener(this);
       bdec.addActionListener(this);
       bdel.addActionListener(this);
       beq.addActionListener(this);
       bclr.addActionListener(this);
       bsin.addActionListener(this);
       bcos.addActionListener(this);
       btan.addActionListener(this);
       btanh.addActionListener(this);
       bsinh.addActionListener(this);
       bcosh.addActionListener(this);
       b1x.addActionListener(this);
       blog.addActionListener(this);
       bn.addActionListener(this);
       bx2.addActionListener(this);
       br.addActionListener(this);
       bex.addActionListener(this);
       bxy.addActionListener(this);
       bp.addActionListener(this);
       be.addActionListener(this);
       bpi.addActionListener(this);
       bplus.addActionListener(this);
       
       bx3.addActionListener(this);
     

    }
 
        @Override
        public void actionPerformed( ActionEvent e){
        if(e.getSource()==b1)
        {
            jtf.setText(jtf.getText()+"1");
        }
        if(e.getSource()==b2)
        {
            jtf.setText(jtf.getText()+"2");
        }
        if(e.getSource()==b3)
        {
            jtf.setText(jtf.getText()+"3");
        }
        if(e.getSource()==b4)
        {
            jtf.setText(jtf.getText()+"4");
        }
        if(e.getSource()==b5)
        {
            jtf.setText(jtf.getText()+"5");
        }
        if(e.getSource()==b6)
        {
            jtf.setText(jtf.getText()+"6");
        }
        if(e.getSource()==b7)
        {
            jtf.setText(jtf.getText()+"7");
        }
        if(e.getSource()==b8)
        {
            jtf.setText(jtf.getText()+"8");
        }
        if(e.getSource()==b9)
        {
            jtf.setText(jtf.getText()+"9");
        }
        if(e.getSource()==b0)
        {
            jtf.setText(jtf.getText()+"0");
        }
        if(e.getSource()==be)
        {
            jtf.setText(jtf.getText()+"2.7182818284590");
        }
        if(e.getSource()==bpi)
        {
            
            jtf.setText(jtf.getText()+"3.14159265359");
        }
            if(e.getSource()==bdec)
        {
            jtf.setText(jtf.getText()+".");
        }
        if(e.getSource()==bplus)
        {   Double a= (Double.parseDouble(jtf.getText()));
            double d=0;
            d=a*(-1);
            
            String str=new Double(d).toString();
           jtf.setText("");
            jtf.setText(jtf.getText()+str);
        }
        if(e.getSource()==bn)
        {
            int a= Integer.parseInt(jtf.getText());
                jtf.setText("");
                int n=1;
                while(a!=0)
                {
                 n=n*a;
                 a--;
                }
                jtf.setText(jtf.getText()+n);
        }
        if(e.getSource()==bsin)
        {
            Double a= Math.sin(Double.parseDouble(jtf.getText()));
            jtf.setText("");
            jtf.setText(jtf.getText()+a);
        }
        // if(e.getSource()==bln)
        // {
        //     Double a= Math.ln(Double.parseDouble(jtf.getText()));
        //     jtf.setText("");
        //     jtf.setText(jtf.getText()+a);
        // }
        if(e.getSource()==br)
        {
            Double a= Math.sqrt(Double.parseDouble(jtf.getText()));
            jtf.setText("");
            jtf.setText(jtf.getText()+a);
        }
        if(e.getSource()==bex)
        {
            Double a= Math.exp(Double.parseDouble(jtf.getText()));
            jtf.setText("");
            jtf.setText(jtf.getText()+a);
        }
        if(e.getSource()==bcos)
        {
            
            Double a= Math.cos(Double.parseDouble(jtf.getText()));
            jtf.setText("");
            jtf.setText(jtf.getText()+a);
        }
        if(e.getSource()==btan)
        {
            Double a= Math.tan(Double.parseDouble(jtf.getText()));
            jtf.setText("");
            jtf.setText(jtf.getText()+a);
        }
        if(e.getSource()==bsinh)
        {
            Double a= 1/(Math.sin(Double.parseDouble(jtf.getText())));
            jtf.setText("");
            jtf.setText(jtf.getText()+a);
        }
        if(e.getSource()==bcosh)
        {
            Double a=1/( Math.cos(Double.parseDouble(jtf.getText())));
            jtf.setText("");
            jtf.setText(jtf.getText()+a);
        }
        if(e.getSource()==btanh)
        {
            Double a=1/( Math.tan(Double.parseDouble(jtf.getText())));
            jtf.setText("");
            jtf.setText(jtf.getText()+a);
        }
        if(e.getSource()==b1x)
        {
            Double a= 1/(Double.parseDouble(jtf.getText()));
            jtf.setText("");
            jtf.setText(jtf.getText()+a);
        }
        if(e.getSource()==blog)
        {
            Double a= Math.log(Double.parseDouble(jtf.getText()));
            jtf.setText("");
            jtf.setText(jtf.getText()+a);
        }
        if(e.getSource()==bx2)
        {
            double a= Double.parseDouble(jtf.getText());
            double r =Math.pow(a, 2);
            jtf.setText("");
            jtf.setText(jtf.getText()+r);
        }
        if(e.getSource()==bx3)
        {
            double a= Double.parseDouble(jtf.getText());
            double r =Math.pow(a, 3);
            jtf.setText("");
            jtf.setText(jtf.getText()+r);
        }
        if(e.getSource()==bclr)
        {
            jtf.setText(" ");
        }
        if(e.getSource()==bdel)
        {
            String s=jtf.getText();
            jtf.setText("");
            for(int i=0;i<s.length()-1;i++)
            jtf.setText(jtf.getText()+s.charAt(i));
        }
        
        if(e.getSource()==badd)
        {
            f=Double.parseDouble(jtf.getText());
            jtf.setText("");
            operator="+";
        }
        if(e.getSource()==bsub)
        {
            f=Double.parseDouble(jtf.getText());
            jtf.setText("");
            operator="-";
        }
        if(e.getSource()==bmul)
        {
            f=Double.parseDouble(jtf.getText());
            jtf.setText("");
            operator="*";
        }
        if(e.getSource()==bdiv)
        {
            f=Double.parseDouble(jtf.getText());
            jtf.setText("");
            operator="/";
        }
        if(e.getSource()==badd)
        {
            f=Double.parseDouble(jtf.getText());
            jtf.setText("");
            operator="+";
        }
        if(e.getSource()==bp)
        {
            f=Double.parseDouble(jtf.getText());
            jtf.setText("");
            operator="%";
        }
        if(e.getSource()==bxy)
        {
            f=Double.parseDouble(jtf.getText());
            jtf.setText("");
            operator="x^y";
        }
        if(e.getSource()==beq)
        {
            s=Double.parseDouble(jtf.getText());
            switch (operator) {
                case "+":
                    r=(f+s);
            
                    break;
                case "-":
                    r=f-s;
                    break;    
                case "*":
                    r=f*s;
                    break; 
                case "/":
                    r=f/s;
                    break;    
                case "%":
                    r=f%s;
                    break; 
                case "x^y":
                    r=Math.pow(f, s);
                    break;    
    
                   
            }
            jtf.setText(""+r);
        }
    
        }
        
    public static void main(String[] args) {
        new mycalculator();
    }

}
