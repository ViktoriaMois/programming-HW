package Graph;

public class AdjacencyMatrixGraph {
    private boolean adjMatrix[][];
    private int numVertices;

    private String outOfBorders = "Edge is out of borders";

    private void throwsOutOfBordersExc() {
        throw new RuntimeException(outOfBorders);
    }

    public AdjacencyMatrixGraph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }

    public void insertEdge(int i, int j) {
        if (i > numVertices || j > numVertices) {
            throwsOutOfBordersExc();
        }
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }

    public void deleteEdge(int i, int j) {
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }

    public boolean existEdge(int i, int j) {
        return adjMatrix[i][j];
    }
}
