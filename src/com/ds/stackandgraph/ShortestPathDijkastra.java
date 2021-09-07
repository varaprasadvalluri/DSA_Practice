package com.ds.stackandgraph;

public class ShortestPathDijkastra {
	static final int V = 4;

	int minDistance(int dist[], Boolean sptSet[]) {
		int min = Integer.MAX_VALUE;
		int min_index = -1;

		for (int v = 0; v < V; v++)
			if (sptSet[v] == false && dist[v] <= min) {
				min = dist[v];
				min_index = v;
			}

		return min_index;
	}

	void dijkstra(int graph[][], int src) {
		String[] result = new String[V];
		int dist[] = new int[V];
		Boolean sptSet[] = new Boolean[V];

		// Initialize all distances as INFINITE and stpSet[] as false
		for (int i = 0; i < V; i++) {
			dist[i] = Integer.MAX_VALUE;
			sptSet[i] = false;
		}

		// Distance of source vertex from itself is always 0
		dist[src] = 0;

		// Find shortest path for all vertices
		for (int count = 0; count < V - 1; count++) {
			// pick minimum distance
			int u = minDistance(dist, sptSet);

			// Mark the picked vertex as processed
			sptSet[u] = true;

			// Update dist value of the adjacent vertices of the
			// picked vertex.
			for (int v = 0; v < V; v++) {

				// Update dist[v] only if is not in sptSet, there is an
				// edge from u to v, and total weight of path from src to
				// v through u is smaller than current value of dist[v]
				if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
					dist[v] = dist[u] + graph[u][v];
					String temp = dist[v] + " " + u;
					result[v] = temp;
				}

			}
		}

		// print the constructed distance array
		System.out.println(result);
		printSolution(result, V);
	}

	void printSolution(String dist[], int n) {
		System.out.println("Vertex   Distance from Source");
		for (int i = 0; i < V; i++)
			System.out.println(i + " tt " + dist[i]);
	}

	// Driver method
	public static void main(String[] args) {
		/* Let us create the example graph discussed above */
		int graph[][] = new int[][] { { 0, 10, 20, 0 }, { 0, 0, 5, 16 }, { 0, 0, 0, 20 }, { 0, 0, 0, 0 } };
		ShortestPathDijkastra t = new ShortestPathDijkastra();
		t.dijkstra(graph, 0);
	}
}
