package codechallenges.graph;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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

    @Test
    void BusinessTrip_Returns_Null() throws Exception {
        Graph<String> sut = new Graph<>();

        assertNull(Graph.businessTrip(sut, new String[2]));
        assertNull(Graph.businessTrip(null, new String[2]));

        Vertex<String> aNode = sut.addVertex("A");

        assertNull(Graph.businessTrip(sut, new String[2]));

        Vertex<String> bNode = sut.addVertex("B");

        assertNull(Graph.businessTrip(sut, null));
        assertNull(Graph.businessTrip(sut, new String[1]));
    }

    @Test
    void BusinessTrip_Returns_Zero() throws Exception {
        Graph<String> sut = new Graph<>();

        Vertex<String> aNode = sut.addVertex("A");
        Vertex<String> bNode = sut.addVertex("B");
        Vertex<String> cNode = sut.addVertex("C");

        sut.addEdge(aNode, bNode, 45);
        sut.addEdge(aNode, cNode, 34);
        sut.addEdge(bNode, aNode, 66);
        sut.addEdge(bNode, cNode, 12);
        sut.addEdge(cNode, aNode, 60);

        String[] sutArray = {"X", "Y", "Z"};
        assertEquals(0 , Graph.businessTrip(sut, sutArray));
        String[] sutArray2 = {"A", "b", "C", "hello"};
        assertEquals(0 , Graph.businessTrip(sut, sutArray2));

        assertEquals(0, Graph.businessTrip(sut, new String[2]));

    }

    @Test
    void BusinessTrip_Method() throws Exception {
        Graph<String> sut = new Graph<>();

        Vertex<String> aNode = sut.addVertex("A");
        Vertex<String> bNode = sut.addVertex("B");
        Vertex<String> cNode = sut.addVertex("C");

        sut.addEdge(aNode, bNode, 45);
        sut.addEdge(aNode, cNode, 34);
        sut.addEdge(bNode, aNode, 66);
        sut.addEdge(bNode, cNode, 12);
        sut.addEdge(cNode, aNode, 60);

        String[] sutArray = new String[sut.getVertices().size()];

        int counter = 0;
        for(Vertex<String> vertex : sut.getVertices()) {
            sutArray[counter] = vertex.value;
            counter++;
        }

        Integer integer = Graph.businessTrip(sut, sutArray);
        assertEquals(57, integer);

    }
}
