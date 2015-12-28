package graph;

import java.util.List;

public class AdjMatrixGraph extends Graph {

	private int adjacencyMat[][];

	public AdjMatrixGraph(int vertices) {
		this.setAdjacencyMat(new int[vertices][vertices]);
	}

	public AdjMatrixGraph() {
		int vertices = super.getVertices();
		this.setAdjacencyMat(new int[vertices][vertices]);
	}

	@Override
	public void implementAddVertex() {
		int vertices = super.getVertices();
		if (vertices >= adjacencyMat.length) {
			/*
			 * increase the size of the adjMatrix by a factor of 2. Also, do a
			 * deep copy of the old values to the new values.
			 */

		}
		for (int i = 0; i < adjacencyMat[vertices].length; i++) {
			adjacencyMat[i][vertices] = 0;
			adjacencyMat[vertices][i] = 0;
		}

	}

	@Override
	public List<Integer> getAllNeighbors() {
		return null;
	}

	public int[][] getAdjacencyMat() {
		return adjacencyMat;
	}

	public void setAdjacencyMat(int adjacencyMat[][]) {
		this.adjacencyMat = adjacencyMat;
	}

}
