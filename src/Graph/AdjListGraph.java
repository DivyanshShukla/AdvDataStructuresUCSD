package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AdjListGraph extends Graph {

	private Map<Integer, List<Integer>> adjListGraph;

	public Map<Integer, List<Integer>> getAdjListGraph() {
		return adjListGraph;
	}

	public void setAdjListGraph(Map<Integer, List<Integer>> adjListGraph) {
		this.adjListGraph = adjListGraph;
	}

	@Override
	public void implementAddVertex() {
		adjListGraph.put(super.getVertices(), new ArrayList<Integer>());
	}

	@Override
	public List<Integer> getAllNeighbors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void implementAddEdge(int v, int u) {
		(adjListGraph.get(v)).add(u);
	}

}
