package calculadora;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class Tela extends JFrame implements ActionListener, WindowListener {
    static double v1 = -1;
    static double v2 = -1;
    static int op = 0;
    protected Dimension dFrame, dButton, dTextfield;
    protected Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bSoma, bSub, bMult, bDiv, bIgual, bClear,boff;
    //protected TextField visor;
    protected JTextField visor;
    private Operacao calculadora;

    public Tela() {
        //instanciar objeto caixa
        calculadora = new Operacao();
        //Aparencia da tela
        dFrame = new Dimension(320, 380);
        dButton = new Dimension(30, 30);
        dTextfield = new Dimension(250, 40);
        this.setTitle("Calculadora");
        this.setResizable(false);
        this.setSize(dFrame);
        this.setLayout(null);
        this.addWindowListener(this);
        
        //definir o primeiro label

        // definir text field
        visor = new JTextField();
        visor.setSize(dTextfield);
        visor.setLocation(30, 40);
        visor.setBackground(Color.GRAY);
        visor.setForeground(Color.white);
        visor.setEditable(false);
        visor.setHorizontalAlignment(JTextField.RIGHT);
        this.add(visor);

        //definir botoes
        b9 = new Button("9");
        b9.setSize(dButton);
        b9.setLocation(30, 110);
        b9.addActionListener(this);
        b9.setBackground(Color.DARK_GRAY);
        b9.setForeground(Color.white);
        this.add(b9);

        b8 = new Button("8");
        b8.setSize(dButton);
        b8.setLocation(70, 110);
        b8.addActionListener(this);
        b8.setBackground(Color.DARK_GRAY);
        b8.setForeground(Color.white);
        this.add(b8);

        b7 = new Button("7");
        b7.setSize(dButton);
        b7.setLocation(110, 110);
        b7.setBackground(Color.DARK_GRAY);
        b7.setForeground(Color.white);
        b7.addActionListener(this);
        this.add(b7);
        
        bDiv = new Button("/");
        bDiv.setSize(dButton);
        bDiv.setLocation(150, 110);
        bDiv.addActionListener(this);
        bDiv.setBackground(Color.white);
        this.add(bDiv);
        
        bClear = new Button("C");
        bClear.setSize(dButton);
        bClear.setLocation(190, 110);
        bClear.addActionListener(this);
        bClear.setBackground(Color.red);
        bClear.setForeground(Color.white);
        this.add(bClear);

        b6 = new Button("6");
        b6.setSize(dButton);
        b6.setLocation(30, 150);
        b6.addActionListener(this);
        b6.setBackground(Color.DARK_GRAY);
        b6.setForeground(Color.white);
        this.add(b6);

        b5 = new Button("5");
        b5.setSize(dButton);
        b5.setLocation(70, 150);
        b5.addActionListener(this);
        b5.setBackground(Color.DARK_GRAY);
        b5.setForeground(Color.white);
        this.add(b5);

        b4 = new Button("4");
        b4.setSize(dButton);
        b4.setLocation(110, 150);
        b4.addActionListener(this);
        b4.setBackground(Color.DARK_GRAY);
        b4.setForeground(Color.white);
        this.add(b4);
        
        bMult = new Button("*");
        bMult.setSize(dButton);
        bMult.setLocation(150, 150);
        bMult.addActionListener(this);
        bMult.setBackground(Color.white);
        this.add(bMult);
        
        boff = new Button("OFF");
        boff.setSize(dButton);
        boff.setLocation(190, 150);
        boff.addActionListener(this);
        boff.setBackground(Color.red);
        boff.setForeground(Color.white);
        this.add(boff);
        

        b3 = new Button("3");
        b3.setSize(dButton);
        b3.setLocation(30, 190);
        b3.addActionListener(this);
        b3.setBackground(Color.DARK_GRAY);
        b3.setForeground(Color.white);
        this.add(b3);

        b2 = new Button("2");
        b2.setSize(dButton);
        b2.setLocation(70, 190);
        b2.addActionListener(this);
        b2.setBackground(Color.DARK_GRAY);
        b2.setForeground(Color.white);
        this.add(b2);

        b1 = new Button("1");
        b1.setSize(dButton);
        b1.setLocation(110, 190);
        b1.addActionListener(this);
        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.white);
        this.add(b1);
        
        bSub = new Button("-");
        bSub.setSize(dButton);
        bSub.setLocation(150, 190);
        bSub.addActionListener(this);
        bSub.setBackground(Color.white);
        this.add(bSub);

        b0 = new Button("0");
        b0.setSize(70,30);
        b0.setLocation(30, 230);
        b0.addActionListener(this);
        b0.setBackground(Color.DARK_GRAY);
        b0.setForeground(Color.white);
        this.add(b0);

        bSoma = new Button("+");
        bSoma.setSize(dButton);
        bSoma.setLocation(150, 230);
        bSoma.addActionListener(this);
        bSoma.setBackground(Color.white);
        this.add(bSoma);

        bIgual = new Button("=");
        bIgual.setSize(dButton);
        bIgual.setLocation(110, 230);
        bIgual.addActionListener(this);
        bIgual.setBackground(Color.white);
        this.add(bIgual);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (e.getSource() == b0) {
            visor.setText(visor.getText()+"0");
        }
        if (e.getSource() == b1) {
            visor.setText(visor.getText()+"1");
        }

        if (e.getSource() == b2) {
            visor.setText(visor.getText()+"2");
        }
        if (e.getSource() == b3) {
            visor.setText(visor.getText()+"3");
        }
        if (e.getSource() == b4) {
            visor.setText(visor.getText()+"4");
        }
        if (e.getSource() == b5) {
            visor.setText(visor.getText()+"5");
        }
        if (e.getSource() == b6) {
           visor.setText(visor.getText()+"6");
        }
        if (e.getSource() == b7) {
            visor.setText(visor.getText()+"7");
        }
        if (e.getSource() == b8) {
            visor.setText(visor.getText()+"8");
        }
        if (e.getSource() == b9) {
            visor.setText(visor.getText()+"9");
        }

        if (e.getSource() == bSoma) {
            op = 1;
            visor.setText(visor.getText()+"+");
        }
        if (e.getSource() == bSub) {
            op = 2;
            visor.setText(visor.getText()+"-");
        }
        if (e.getSource() == bMult) {
            op = 3;
            visor.setText(visor.getText()+"*");
        }

        if (e.getSource() == bDiv) {
            op = 4;
            visor.setText(visor.getText()+"/");
        }

        if (e.getSource() == bIgual) {
            double resultado;
            String resp;
            boolean val=false;
            
            String visortxt = visor.getText();
            if ((visortxt.endsWith("/")) || (visortxt.endsWith("+")) || (visortxt.endsWith("-")) || (visortxt.endsWith("*")) ){
            val=true;
            }
            String[] visorsplit = visortxt.split("[\\/\\+\\-\\*]");
            String visorop = String.valueOf(visortxt.charAt(visorsplit[0].length()));
            if (visorsplit[0].equals("")){
                v1=-1;
            }else{
                v1 = Double.parseDouble(visorsplit[0]);
            }
            if (val==true ){
                v2=-1;
            }else{
                v2 = Double.parseDouble(visorsplit[1]);
            }
            
            switch(visorop){
                case "+":
                    op=1;
                    break;
                case "-":
                    op=2;
                    break;
                case "*":
                    op=3;
                    break;
                case "/":
                    op=4;
                    break;
                default: op = 0;
            }
            
            if ((v1 != -1) && (v2 != -1)) {
                if (op == 1) {
                    resultado = calculadora.soma(v1, v2);
                    resp = Double.toString(resultado);
                } else if (op == 2) {
                    resultado = calculadora.sub(v1, v2);
                    resp = Double.toString(resultado);
                } else if (op == 3) {
                    resultado = calculadora.mult(v1, v2);
                    resp = Double.toString(resultado);
                } else if (op == 4) {
                    resultado = calculadora.div(v1, v2);
                    resp = Double.toString(resultado);
                }
                else {
                resp = "ERRO";
                }
            } else {
                resp = "ERRO";
            }

            visor.setText("=  "+resp);
            op = 0;
            v1=-1;
            v2=-1;

        }        
         if (e.getSource() == bClear) {
            visor.setText(null);
            op = 0;
            v1=-1;
            v2=-1;
        }         
        if (e.getSource() == boff) {
            System.exit(0);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0); // sair e fechar
        
    }
    @Override
    public void windowClosed(WindowEvent e) {
       
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
}

   