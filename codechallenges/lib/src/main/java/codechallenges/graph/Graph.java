package codechallenges.graph;

import java.util.*;
//import java.util.

public class Graph<T extends Comparable<? super T>> {

    private int size = 0;
    private LinkedHashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyListsMap;

    public Graph() {
        this.adjacencyListsMap = new LinkedHashMap<>();
    }

    Vertex<T> addVertex(T value){
        Vertex<T> newVertex = new Vertex<>(value);
        LinkedList<Edge<T>> newAdjacencyList = new LinkedList<>();
        adjacencyListsMap.put(newVertex, new LinkedList<Edge<T>>());
        size++;
        return newVertex;
    }

    void addEdge(Vertex<T> sourceVertex, Vertex<T> destinationVertex, int weight){
        Edge<T> newEdge = new Edge<>(destinationVertex, weight);
        LinkedList<Edge<T>> adjacencyList = adjacencyListsMap.get(sourceVertex);
        adjacencyList.add(newEdge);
    }

    Set<Vertex<T>> getVertices(){
        return adjacencyListsMap.keySet();
    }

    List<Edge<T>> getNeighbors(Vertex<T> sourceVertex) throws Exception {
        LinkedList<Edge<T>> neighbors = adjacencyListsMap.get(sourceVertex);
        if(neighbors.isEmpty()){
            throw new Exception();
        }
        return new ArrayList<>(neighbors);
    }

    int size(){
        return this.size;
    }

    @Override
    public String toString()
    {
        Set<Vertex<T>> vertices = adjacencyListsMap.keySet();
        String graphString = "";

        for (Vertex<T> vertex : vertices)
        {
            LinkedList<Edge<T>> adjacencyList = adjacencyListsMap.get(vertex);
            graphString += vertex + ": ";
            for (Edge<T> edge : adjacencyList)
            {
                graphString += edge.destination.value + "(weight: " + edge.weight + ") -> ";
            }
            graphString += "NULL\n";
        }

        return graphString;
    }
}
