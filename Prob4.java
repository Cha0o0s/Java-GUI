import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class Prob4 extends JFrame {
    private JTree tree;
    private DefaultMutableTreeNode root;
    private DefaultMutableTreeNode[] nodes;
    private String[] labels;

    public Prob4() {
        super("My tree window");
        root=new DefaultMutableTreeNode("Product",true);
        tree=new JTree(root);

        labels=new String[]{"Hardware Product","Video Card","Monitor","Software Product","Operating System","UtilitySystem","Game","ProgrammingLanguage"};
        nodes=new DefaultMutableTreeNode[8];

        for(int i=0;i<8;i++){
            nodes[i]=new DefaultMutableTreeNode(labels[i],true);

        }
        root.add(nodes[0]);
        root.add(nodes[3]);

        nodes[0].add(nodes[1]);
        nodes[0].add(nodes[2]);

        nodes[3].add(nodes[4]);
        nodes[3].add(nodes[5]);
        nodes[3].add(nodes[6]);
        nodes[3].add(nodes[7]);

        add(tree);
    }
    public static void main(String[] args) {
        Prob4 frame=new Prob4();
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
