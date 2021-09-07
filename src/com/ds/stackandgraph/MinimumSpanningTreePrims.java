package com.ds.stackandgraph;

public class MinimumSpanningTreePrims {
	private static final int V = 4; // number of vertex

	int minKey(int key[], Boolean mstSet[]) {
		// Initialize min value
		int min = Integer.MAX_VALUE;
		int min_index = -1;

		for (int i = 0; i < V; i++)
			if (mstSet[i] == false && key[i] < min) {
				min = key[i];
				min_index = i;
			}

		return min_index;
	}

	// A utility function to print the constructed MST stored in
	// parent[]
	void printMST(int parent[], int n, int graph[][]) {
		System.out.println("Edge   Weight");
		for (int i = 1; i < V; i++)
			System.out.println(parent[i] + " - " + i);
	}

	// Function to construct and print MST for a graph represented
	// using adjacency matrix representation
	void primMST(int graph[][]) {
		// Array to store constructed MST
		int constructedMST[] = new int[V];

		// Key values used to pick minimum weight edge in cut
		int key[] = new int[V]; // weitgh

		// To represent set of vertices not yet included in MST
		Boolean inMST[] = new Boolean[V]; // this is in MST or NOT

		// Initialize all keys as INFINITE
		for (int i = 0; i < V; i++) {
			key[i] = Integer.MAX_VALUE;
			inMST[i] = false;
		}

		// Always include first 1st vertex in MST.
		key[0] = 0; // Make key 0 so that this vertex is
					// picked as first vertex
		constructedMST[0] = 0; // First node is always root of MST

		// The MST will have V vertices
		for (int count = 0; count < V - 1; count++) {
			// Pick thd minimum key vertex from the set of vertices
			// not yet included in MST
			int u = minKey(key, inMST);

			// Add the picked vertex to the MST Set
			inMST[u] = true;

			// Update key value and parent index of the adjacent
			// vertices of the picked vertex. Consider only those
			// vertices which are not yet included in MST
			for (int i = 0; i < V; i++)

				// graph[u][v] is non zero only for adjacent vertices of m
				// mstSet[v] is false for vertices not yet included in MST
				// Update the key only if graph[u][v] is smaller than key[v]
				if (graph[u][i] != 0 && inMST[i] == false && graph[u][i] < key[i]) {
					constructedMST[i] = u;
					key[i] = graph[u][i];
				}
		}

		// print the constructed MST
		printMST(constructedMST, V, graph);
	}

	public static void main(String[] args) {

		MinimumSpanningTreePrims t = new MinimumSpanningTreePrims();
		int graph[][] = new int[][] { { 0, 10, 30, 15 }, { 10, 0, 40, 0 }, { 30, 40, 0, 50 }, { 15, 0, 50, 0 } };

		// Print the solution
		t.primMST(graph);
	}
}
