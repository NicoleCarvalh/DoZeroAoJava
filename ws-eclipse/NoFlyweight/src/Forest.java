import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>(); // Lista de árvores

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        Tree tree = new Tree(x, y, name, color, otherTreeData); // Add árvore na lista
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) { // Método chamado automaticamente para desenhar cada árvore
        for (Tree tree : trees) { 
            tree.draw(graphics);
        }
    }
}