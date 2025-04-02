import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ChangeStyle extends JFrame{
    private JTextField input;
    private JRadioButton[] buttons;
    public ChangeStyle(){
        setTitle("A Font Frame");
        setSize(400,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p1=new JPanel();
        input=new JTextField("Changing the style of the font!");
        input.setEditable(false);
        buttons=new JRadioButton[4];
        ButtonGroup group=new ButtonGroup();
        String[] fonts= {"Normal","Italic","Bold","Bold&Italic"};
        var a=new ButtonActionListener();
        for(int i=0;i<4;i++){
            buttons[i]=new JRadioButton(fonts[i]);
            group.add(buttons[i]);
            buttons[i].addItemListener(a);
            p1.add(buttons[i]);
        }
        add(input,BorderLayout.NORTH);
        add(p1,BorderLayout.CENTER);
    }
    private class ButtonActionListener implements ItemListener{
        public void itemStateChanged(ItemEvent e){
            if(e.getSource() == buttons[0]){
                input.setFont(input.getFont().deriveFont(Font.PLAIN));
            }
            if(e.getSource() == buttons[1]){
                input.setFont(input.getFont().deriveFont(Font.ITALIC));
            }
            if(e.getSource() == buttons[2]){
                input.setFont(input.getFont().deriveFont(Font.BOLD));
            }
            if(e.getSource() == buttons[3]){
                input.setFont(input.getFont().deriveFont(Font.BOLD+Font.ITALIC));
            }

        }
    }
    public static void main(String[] args) {
        ChangeStyle frame= new ChangeStyle();
        frame.setSize(500,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
