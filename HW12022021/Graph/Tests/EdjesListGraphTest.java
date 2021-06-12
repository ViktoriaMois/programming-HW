package Graph.Tests;

import Graph.EdgesListGraph;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EdjesListGraphTest {
    @Test
    public void insertEdges() {
        EdgesListGraph.Graph graph = new EdgesListGraph.Graph();

        EdgesListGraph.Node a = new EdgesListGraph.Node(0);
        EdgesListGraph.Node b = new EdgesListGraph.Node(1);

        graph.insertVertex(a);
        graph.insertVertex(b);

        assertTrue(graph.insertEdge(a, b, 2));
    }

    @Test
    public void deleteEdges() {
        EdgesListGraph.Graph graph = new EdgesListGraph.Graph();

        EdgesListGraph.Node a = new EdgesListGraph.Node(0);
        EdgesListGraph.Node b = new EdgesListGraph.Node(1);

        graph.insertVertex(a);
        graph.insertVertex(b);

        assertFalse(graph.deleteEdge(a, b, 2));
    }

}
