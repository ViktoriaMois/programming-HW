package Graph.Tests;

import Graph.AdjacencyMatrixGraph;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdjacencyMatrixGraphTest {

    @Test
    public void insertEdges() {
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(10);

        graph.insertEdge(1, 2);
        graph.insertEdge(2, 3);
        graph.insertEdge(3, 4);
        graph.insertEdge(4, 5);

        assertTrue(graph.existEdge(1,2));
        assertTrue(graph.existEdge(2,3));
        assertTrue(graph.existEdge(3, 4));
        assertTrue(graph.existEdge(4, 5));
    }

    @Test
    public void deleteEdges() {
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(10);

        graph.insertEdge(1, 2);
        graph.insertEdge(2, 3);
        graph.insertEdge(3, 4);
        graph.insertEdge(4, 5);

        assertTrue(graph.existEdge(1, 2));
        assertTrue(graph.existEdge(2, 3));
        assertTrue(graph.existEdge(3, 4));
        assertTrue(graph.existEdge(4, 5));

        graph.deleteEdge(1, 2);
        graph.deleteEdge(2, 3);
        graph.deleteEdge(3, 4);

        assertTrue(graph.existEdge(4, 5));
        assertFalse(graph.existEdge(1, 2));
        assertFalse(graph.existEdge(2, 3));
        assertFalse(graph.existEdge(3, 4));


    }
}
//Task Task_280521 complete