package com.ds.tree;

public class TreeDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree();
		tree.insertRecursion(50);
		tree.insertRecursion(40);
		tree.insertRecursion(70);
		tree.insertRecursion(30);
		// tree.insert(60);
		// tree.insert(80);
		// tree.insertRecursion(90);
		// System.out.println(tree.findData(90).data);
		// tree.postOrder(tree.root);
		// System.out.println(tree.couuntNodes(tree.root));
		// System.out.println(tree.getLeafNodeCount(tree.root));

		TraversalWithouRecursion tss = new TraversalWithouRecursion();
		Tree tvs = new Tree();
		System.out.println("Pre order traversal ============== ");
		tvs.preOrder(tree.root);

		System.out.println("Pre order traversal without recursion ============== ");
		tss.preOrder(tree.root);

		System.out.println("In order traversal ============== ");
		tvs.inOrder(tree.root);

		System.out.println("In order traversal without RECURSION ============== ");
		TraversalWithouRecursion.INOrderWithoutREC(tree.root);

		System.out.println("Post order traversal ============== ");
		tvs.postOrder(tree.root);
		// ArrayList<Integer> list = tss.preOrderTraversal(tree.root);
		/*
		 * ArrayList<Integer> list = tss.inOrderTraversal(tree.root); Iterator<Integer>
		 * itr=list.iterator(); while(itr.hasNext()){
		 * System.out.println(itr.next().intValue()); }
		 */

	}

}
