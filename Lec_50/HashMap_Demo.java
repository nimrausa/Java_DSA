package Lec_50;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			HashMap<String, Integer> map=new HashMap <>();
			map.put("Stan", 20);
			map.put("Tom", 30);
			map.put("Jerry", 50);
			map.put("Mike", 90);
			map.put("Axe", 20);
			map.put("kile", 90);
			
			
			System.out.println(map.containsKey("Tom"));
			System.out.println("Tom");
			System.out.println(map);
			System.out.println(map.remove("Stan"));
			System.out.println(map);
			
		}

	}


