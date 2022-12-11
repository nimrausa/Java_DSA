package Lec_51;

import java.util.*;




public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagram(arr));
		
	}
	public static List<List<String>> groupAnagram(String [] str){
		
			HashMap <String, List <String>> map=new HashMap <>();
			for (int i = 0; i < str.length; i++) {
				String s=str[i];//eat
				String Key=keyfunc(s);
				if(!map.containsKey(Key)) {
					map.put(Key, new ArrayList<>());
				}
				map.get(Key).add(s);
				//System.out.print(map);
			}
		
	List<List<String>> ans=new ArrayList<>();
	for(String key : map.keySet()) {
		ans.add(map.get(key));
	}
	return ans;
	}

	public static String keyfunc(String s) {
		int [] freq=new int [26];
		for (int i = 0; i < s.length(); i++) {
			//System.out.print(freq[i] + " ");
			char ch=s.charAt(i);
			freq[ch-'a']++;
		}
	
	StringBuilder sb=new StringBuilder();
	for(int i=0; i<freq.length; i++) {	
		if(freq[i]>0) {
			char ch=(char) ('a'+i);
			//System.out.print(ch+ " ");
			sb.append(ch);
			sb.append(freq[i]);
		//	System.out.print(sb + " ");
			
		}
		
	}
	return sb.toString();
	}
}
