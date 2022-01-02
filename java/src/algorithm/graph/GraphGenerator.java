package algorithm.graph;

import java.util.Arrays;
import java.util.Collections;

public class GraphGenerator {
    public int[][] createAdjencyMatrix(int size) {
        int [][] adjMatrix = new int[size][size];
        return adjMatrix;
    }

    public int[] createAdjencyList(int size) {
        int [] adjList = new int[size];
        Collections.shuffle(Arrays.asList(adjList));
        return adjList;
    }
}
