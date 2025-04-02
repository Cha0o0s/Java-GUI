import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Prob5 extends JFrame {
    private JComboBox combo;
    private JLabel label;
    private JPanel p1;
    private String element;
    public Prob5(){
        super("Semnele zodiilor");
        label=new JLabel("Alegeti denumirea unei zodii");

        p1=new JPanel();
        p1.add(label);

        combo=new JComboBox(new String[]{"Berbec","Taur","Gemeni","Rac","Leu","Fecioara","Balanta","Scorpion","Sagetator","Capricorn","Varsator","Pesti"});

        combo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                element=e.getItem().toString();
                repaint();
            }
        });
        element="Berbec";
        p1.add(combo);
        add(p1);
    }
    public void paint(Graphics g){
        super.paint(g);
        Toolkit t=Toolkit.getDefaultToolkit();
        Image image=null;
        switch(element){
            case "Berbec"-> image=t.getImage(System.getProperty("user.dir")+"/src/Lab3/aries.jpg");
            case "Taur"-> image=t.getImage(System.getProperty("user.dir")+"/src/Lab3/taurus.jpg");
            case "Gemeni"-> image=t.getImage(System.getProperty("user.dir")+"/src/Lab3/gemini.jpg");
            case "Rac"-> image=t.getImage(System.getProperty("user.dir")+"/src/Lab3/cancer.jpg");
            case "Leu"-> image=t.getImage(System.getProperty("user.dir")+"/src/Lab3/leo.jpg");
            case "Fecioara"-> image=t.getImage(System.getProperty("user.dir")+"/src/Lab3/virgo.jpg");
            case "Balanta" -> image=t.getImage(System.getProperty("user.dir")+"/src/Lab3/libra.jpg");
            case "Scorpion" -> image=t.getImage(System.getProperty("user.dir")+"/src/Lab3/scorpio.jpg");
            case "Sagetator" -> image=t.getImage(System.getProperty("user.dir")+"/src/Lab3/sagittarius.jpg");
            case "Capricorn" -> image=t.getImage(System.getProperty("user.dir")+"/src/Lab3/capricorn.jpg");
            case "Varsator" -> image=t.getImage(System.getProperty("user.dir")+"/src/Lab3/aquarius.jpg");
            case "Pesti" -> image=t.getImage(System.getProperty("user.dir")+"/src/lab3/pisces.jpg");
        }
        if(image!=null)
            g.drawImage(image,100,100,null);
        else
            g.drawString("Image not found!",100,100);
    }
    public static void main(String[] args){
/*
        JFrame im=new JFrame("Test image");
        im.setSize(500,500);
        im.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String path=System.getProperty("user.dir")+"/src/Lab3/aquarius.jpg";
        ImageIcon icon=new ImageIcon(path);

        if(icon.getIconWidth()>0) {
            JLabel label = new JLabel(icon);
            im.add(label);
        }
        else{
            JLabel label=new JLabel("Image failed to load! The path: "+path);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            im.add(label);
        }
        im.setVisible(true);
*/
        Prob5 frame=new Prob5();
        frame.setSize(500,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
