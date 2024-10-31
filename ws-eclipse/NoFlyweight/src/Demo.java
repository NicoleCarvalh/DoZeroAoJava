import java.awt.*;

public class Demo {
    static int CANVAS_SIZE = 500; // Tamanho do canvas
    static int TREES_TO_DRAW = 1000000;
    static int TREE_TYPES = 2;

    public static void main(String[] args) {
        Forest forest = new Forest(); // Cria a floresta
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE); // Define o tamanho do canvas
        forest.setVisible(true); // Torna a janela visível

        // Informações do uso da memória
        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (38 bytes) * " + TREES_TO_DRAW);
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB");
    }

    // Geração de valor aleatório para as coordenadas
    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}