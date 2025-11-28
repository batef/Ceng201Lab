package InOrderBST;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        int[] valuesToAdd = {64, 32, 128, 48,72,87, 16, 4, 150, 36, 66, 10, 114};

        System.out.println("Adding nodes");
        for (int value : valuesToAdd) {
            System.out.println("Adding node " + value);
            bt.addNode(value);
        }
        System.out.println();

        System.out.println("\nSearch tests:");
        System.out.println("searchNode(6)  -> " + bt.searchNode(66));
        System.out.println("searchNode(100)-> " + bt.searchNode(100));

        // Remove test
        System.out.println("\nRemoving 4...");
        bt.removeNode(4);
        //tree.printInOrder();

        System.out.println("Removing 64 (root)...");
        bt.removeNode(64);
    }
}
