package Graph;

import java.util.List;

public abstract class Graph {

	private int vertices;
	private int edges;

	public Graph(int vertices, int edges) {
		this.vertices = vertices;
		this.edges = edges;
	}

	public Graph() {
		this.vertices = 0;
		this.edges = 0;
	}

	public abstract void implementAddVertex();

	public abstract List<Integer> getAllNeighbors();

	public void addVertex() {
		implementAddVertex();
		this.vertices++;
	}

	public int getVertices() {
		return vertices;
	}

	public void setVertices(int vertices) {
		this.vertices = vertices;
	}

	public int getEdges() {
		return edges;
	}

	public void setEdges(int edges) {
		this.edges = edges;
	}

}
