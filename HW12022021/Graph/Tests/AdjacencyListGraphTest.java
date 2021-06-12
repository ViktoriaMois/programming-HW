package Graph.Tests;

import Graph.AdjacencyListGraph;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdjacencyListGraphTest {

    @Test
    public void insertEdges() {
        AdjacencyListGraph graph = new AdjacencyListGraph(10);

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
        AdjacencyListGraph graph = new AdjacencyListGraph(10);

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