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
			int newAdjMatrix[][] = new int[vertices*2][vertices*2];
			for(int i =0;i<adjacencyMat.length;i++)
			{
				for(int j =0;j<adjacencyMat[i].length;j++)
				{
					newAdjMatrix[i][j] = adjacencyMat[i][j];
				}
			}
			adjacencyMat = newAdjMatrix;
		}
		/*
		 * The rows and columns of 2D array added should be 0 as the new vertex has no edge.
		 */
		for (int i = 0; i < adjacencyMat[vertices].length; i++) {
			adjacencyMat[i][vertices] = 0;
			adjacencyMat[vertices][i] = 0;
		}

	}
	
	@Override
	public void implementAddEdge(int v, int u) {
		if(v < adjacencyMat.length && u < adjacencyMat.length)
			this.adjacencyMat[v][u] = 1;
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
