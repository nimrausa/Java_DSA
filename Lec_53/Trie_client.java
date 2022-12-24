package Lec_53;

public class Trie_client {

	TriesContacts t =new TriesContacts();
	public static void main(String[] args) {
		TriesContacts t=new TriesContacts();
	t.insert("app");
	t.insert("apple");
	t.insert("raj");
	t.insert("go");
	t.insert("mango");
	t.insert("rat");
	t.insert("rat");
	t.insert("starfish");
	t.insert("starworld");
	System.out.println(t.Search("ap"));
	System.out.println(t.Search("apple"));
	//System.out.println(t.startsWith("ap"));
	System.out.println(t.countstartsWith("a"));
	}
	
}
