import java.util.*;


public class CountDuplicatedList {

  public static void main(String[] args) {
  String[] name = new String [] {};
  String[] arr = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};
  List<String> keys_list = new ArrayList<String>();
  
  for (int i = 0; i < arr.length; i++) {
    name = arr[i].split(" ");
    keys_list.add(name[0]);
  }


 	Map<String, Integer> map = new HashMap<String, Integer>();

	for (String temp : keys_list) {
		Integer count = map.get(temp);
		map.put(temp, (count == null) ? 1 : count + 1);
	}
	
  
	System.out.println("\nСортированный список");
	Map<String, Integer> treeMap = new TreeMap<String, Integer>(map);
	printMap(treeMap);
  }
  public static void printMap(Map<String, Integer> map){
  List <String> my_list = new ArrayList<>();
	for (Map.Entry<String, Integer> entry : map.entrySet()) {
    my_list.add(entry.getValue() + " раз(а) - " + entry.getKey());
    //my_list.add(entry.getKey());
    Collections.sort(my_list, Collections.reverseOrder());
        System.out.println(entry.getValue() + " " + entry.getKey());
      }

      System.out.println(String.join("; ", my_list));
    }
	}	