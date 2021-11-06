package codechallenges.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GraphTest
{
    @Test
    void Test_a_small_graph(){
        Graph<String> sut = new Graph<>();

        Vertex<String> aNode = sut.addVertex("A");
        Vertex<String> bNode = sut.addVertex("B");
        Vertex<String> cNode = sut.addVertex("C");

        sut.addEdge(aNode, bNode, 1);
        sut.addEdge(aNode, cNode, 2);
        sut.addEdge(bNode, aNode, 3);
        sut.addEdge(cNode, aNode, 4);

        int actual = sut.size();
        assertEquals("A: B(weight: 1) -> C(weight: 2) -> NULL\n" +
                "B: A(weight: 3) -> NULL\n" +
                "C: A(weight: 4) -> NULL\n", sut.toString());
        assertEquals(3, actual);
    }

    @Test
    void Test_Getting_Neighbors() throws Exception {
        Graph<String> sut = new Graph<>();

        Vertex<String> aNode = sut.addVertex("A");
        Vertex<String> bNode = sut.addVertex("B");
        Vertex<String> cNode = sut.addVertex("C");

        sut.addEdge(aNode, bNode, 1);
        sut.addEdge(aNode, cNode, 2);
        sut.addEdge(bNode, aNode, 3);
        sut.addEdge(cNode, aNode, 4);

        String actual = "";

        for(Edge edge : sut.getNeighbors(aNode)){
            actual += edge.toString() + "\n";
        }

        assertEquals("Destination: B\n" +
                "Weight: 1\n" +
                "\n" +
                "Destination: C\n" +
                "Weight: 2\n\n", actual);
    }
}
