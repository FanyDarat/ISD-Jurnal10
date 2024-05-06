public class Main {
    public static void main(String[] args) {
        DFSdanBFS graph = new DFSdanBFS(9);
        graph.addEdge('A', 'D');
        graph.addEdge('A', 'E');
        graph.addEdge('A', 'B');
        graph.addEdge('D', 'G');
        graph.addEdge('B', 'E');
        graph.addEdge('E', 'H');
        graph.addEdge('E', 'F');
        graph.addEdge('G', 'H');
        graph.addEdge('F', 'H');
        graph.addEdge('H', 'I');
        graph.addEdge('I', 'F');
        graph.addEdge('F', 'C');
        graph.addEdge('C', 'B');

        System.out.println("\nBFS Traversal:");
        graph.BFS('A');
        System.out.println();
        System.out.println("\nDFS Traversal:");
        graph.DFS('A');
        System.out.println();
    }
}