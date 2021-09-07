package com.ds.avltree;

public class Trie {
	private static TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	static void insert(String key) {
		key = key.toLowerCase();
		int length = key.length();
		int index;

		TrieNode trieNode = root;

		for (int i = 0; i < length; i++) {
			index = key.charAt(i) - 'a';
			if (trieNode.children[index] == null) {
				TrieNode temp = new TrieNode(key.charAt(i));
				trieNode.children[index] = temp;
			}

			trieNode = trieNode.children[index];
		}

		// mark last node as leaf
		trieNode.isLeaf = true;
	}

	// Returns true if key presents in trie, else false
	static boolean search(String key) {
		key = key.toLowerCase();
		int length = key.length();
		int index;
		TrieNode trieNode = root;

		for (int i = 0; i < length; i++) {
			index = key.charAt(i) - 'a';

			if (trieNode.children[index] == null)
				return false;

			trieNode = trieNode.children[index];
		}

		return (trieNode != null && trieNode.isLeaf);
	}
}
