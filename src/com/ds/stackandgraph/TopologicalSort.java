package com.ds.stackandgraph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSort {
	private int nVertex; // No. of vertices
	private LinkedList<Integer> adj[]; // Adjacency List

	// Constructor
	TopologicalSort(int totalVertex) {
		nVertex = totalVertex;
		adj = new LinkedList[nVertex];
		for (int i = 0; i < nVertex; ++i)
			adj[i] = new LinkedList();
	}

	void addEdge(int v, int w) {
		adj[v].add(w);
	}

	void topologicalSortUtil(int v, boolean visited[], Stack stack) {
		// Mark the current node as visited.
		visited[v] = true;
		Integer i;

		// Recur for all the vertices adjacent to this
		// vertex
		Iterator<Integer> it = adj[v].iterator();
		while (it.hasNext()) {
			i = it.next();
			if (!visited[i])
				topologicalSortUtil(i, visited, stack);
		}

		// Push current vertex to stack which stores result
		stack.push(new Integer(v));
	}

	// The function to do Topological Sort. It uses
	// recursive topologicalSortUtil()
	void topologicalSort() {
		Stack stack = new Stack();

		// Mark all the vertices as not visited
		boolean visited[] = new boolean[nVertex];
		for (int i = 0; i < nVertex; i++) {
			visited[i] = false;
		}

		// Call the recursive helper function to store
		// Topological Sort starting from all vertices
		// one by one
		for (int i = 0; i < nVertex; i++) {
			if (visited[i] == false)
				topologicalSortUtil(i, visited, stack);
		}

		// Print contents of stack
		while (stack.empty() == false) {
			System.out.print(stack.pop() + " ");
		}
	}

	// Driver method
	public static void main(String args[]) {
		// Create a graph given in the above diagram
		TopologicalSort g = new TopologicalSort(6);
		g.addEdge(5, 2);
		g.addEdge(5, 0);
		g.addEdge(4, 0);
		g.addEdge(4, 1);
		g.addEdge(2, 3);
		g.addEdge(3, 1);

		System.out.println("Following is a Topological " + "sort of the given graph");
		g.topologicalSort();
	}

}
