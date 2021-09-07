package com.ds.stackandgraph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	public final int MAX_INT = 4;
	public Vertex vertxArr[];
	public int[][] adjMatrix;
	public Stack stack;
	public Queue queue;
	int nVertex;
	public LinkedList<Integer> adj[]; // Adjacency List

	public Graph() {
		vertxArr = new Vertex[MAX_INT];
		adjMatrix = new int[MAX_INT][MAX_INT];
		nVertex = 0;
		for (int i = 0; i < MAX_INT; i++) {
			for (int j = 0; j < MAX_INT; j++) {
				adjMatrix[i][j] = 0;
			}
		}
		stack = new Stack<>();
		queue = new LinkedList<Integer>();

	}

	Graph(int number) {
		vertxArr = new Vertex[number];
		adj = new LinkedList[number];
		for (int i = 0; i < number; ++i)
			adj[i] = new LinkedList();
	}

	public void addVertex(char data) {
		Vertex vertx = new Vertex(data);
		vertxArr[nVertex++] = vertx;
	}

	public void addEdge(int i, int j) {
		adjMatrix[i][j] = 1;
	}

	public void addEdgeList(int i, int j) {
		adj[i].add(j);
	}

	public int getAdjacentVertx(int v) {
		for (int j = 0; j < nVertex; j++) {
			if (adjMatrix[v][j] == 1 && vertxArr[j].wasVisited == false) {
				return j;
			}
		}
		return -1;
	}

	public void displayVertx(int v) {
		System.out.println(vertxArr[v].label);
	}

	public void DFS() {
		vertxArr[0].wasVisited = true;
		displayVertx(0);
		stack.push(0);
		while (!stack.isEmpty()) {
			int v = getAdjacentVertx((int) stack.peek());
			if (v == -1) {
				stack.pop();
			} else {
				vertxArr[v].wasVisited = true;
				displayVertx(v);
				stack.push(v);
			}
		}
		// rseting for next iterarion
		for (int j = 0; j < nVertex; j++) {
			vertxArr[j].wasVisited = false;
		}
	}

	public void BFS() {
		vertxArr[0].wasVisited = true;
		displayVertx(0);
		queue.add(0);
		while (!queue.isEmpty()) {
			int v1 = (int) queue.remove();
			int v2 = -1;
			while ((v2 = getAdjacentVertx(v1)) != -1) {
				vertxArr[v2].wasVisited = true;
				displayVertx(v2);
				queue.add(v2);

			}

		}
		for (int j = 0; j < nVertex; j++) {
			vertxArr[j].wasVisited = false;
		}
	}

	public boolean findPathExist(char data) {
		vertxArr[0].wasVisited = true;
		displayVertx(0);
		queue.add(0);
		while (!queue.isEmpty()) {
			int v1 = (int) queue.remove();
			int v2 = 0;
			while ((v2 = getAdjacentVertx(v1)) != -1) {
				if (data == vertxArr[v2].label) {
					return true;
				}
				vertxArr[v2].wasVisited = true;
				displayVertx(v2);
				queue.add(v2);

			}
		}
		return false;
	}
	// rseting for next iterarion

}
