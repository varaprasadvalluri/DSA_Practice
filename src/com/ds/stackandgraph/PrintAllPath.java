package com.ds.stackandgraph;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintAllPath {
	public static void main(String args[]) {
		Graph grap = new Graph(4);
		grap.addVertex('A');
		grap.addVertex('B');
		grap.addVertex('C');
		grap.addVertex('D');
		grap.addEdgeList(0, 1);
		grap.addEdgeList(0, 2);
		grap.addEdgeList(0, 3);
		grap.addEdgeList(1, 3);
		grap.addEdgeList(2, 0);
		grap.addEdgeList(2, 1);

		PrintAllPath path = new PrintAllPath();
		ArrayList<Integer> list = new ArrayList<>();
		path.printAllPath(0, 3, grap, list);

	}

	public void printAllPath(int src, int dest, Graph gp, ArrayList<Integer> path) {
		path.add(src);
		if (src == dest) {
			System.out.println(path);
			path.remove(new Integer(src));
			return;
		} else {
			Iterator<Integer> it = gp.adj[src].iterator();
			while (it.hasNext()) {
				int temp = it.next();
				if (!path.contains(temp)) {
					printAllPath(temp, dest, gp, path);
				}
			}
			path.remove(new Integer(src));
		}

	}
}
