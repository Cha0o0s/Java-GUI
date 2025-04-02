import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
public class DiaryFrame1 extends JFrame{
    private JTextArea ta;
    private JButton b1,b2;
    private FileWriter fw;
    public DiaryFrame1(){
        setTitle("My diary");
        ta=new JTextArea(200,100);
        add(ta);
        var p=new JPanel(new GridLayout(1,2,15,0));
        b1=new JButton("Save");
        b2=new JButton("Cancel");

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                   try{
                        fw=new FileWriter("myDiary.txt",true);
                        fw.write(ta.getText());
                        fw.close();
                        JOptionPane.showMessageDialog(DiaryFrame1.this,"Verifica Fisierul");
                    }catch(IOException ex){
                        ex.printStackTrace();
                    }
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ta.setText("");
            }
        });
        p.add(b1);
        p.add(b2);
        add(p,BorderLayout.SOUTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        DiaryFrame1 df=new DiaryFrame1();
        df.setSize(400,500);
        df.setVisible(true);
    }
}

