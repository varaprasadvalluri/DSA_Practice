package com.ds.avltree;

public class TrieNode {

	private static int ALPHABET_SIZE = 26;

	TrieNode[] children = new TrieNode[ALPHABET_SIZE];

	// isLeaf is true if the node represents
	// end of a word
	boolean isLeaf;
	char data;

	TrieNode() {
		isLeaf = false;
		for (int i = 0; i < ALPHABET_SIZE; i++)
			children[i] = null;
	}

	TrieNode(char ch) {
		isLeaf = false;
		for (int i = 0; i < ALPHABET_SIZE; i++)
			children[i] = null;
		this.data = ch;
	}

}
