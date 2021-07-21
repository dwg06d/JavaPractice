import java.util.*;

public class Workspace {
    public static void main(String[] args) {

        HashMap<String, String> carInventory = new HashMap<String,String>();
        carInventory.put("Honda", "Prelude");
        carInventory.put("BMW", "335");
        carInventory.put("Toyota", "Avalon");
        carInventory.put("Chevy", "Tahoe");
        carInventory.put("Tesla", "Roadster");
        Scanner carType = new Scanner(System.in);
        System.out.println("What car model would you like to see?");
        String myCar = carType.nextLine();
        if (carInventory.containsKey(myCar)) {

            System.out.println("Oh, you're looking for a " + myCar + " We have that right over here!");
        } else System.out.println("Sorry we dont offer that model!");



    }

    }






//                            NOTES

//        //creates an array of strings
//        String[] fruit;
//
//        //creates an array of integers
//        int[] classSize;
//
//        //creates an array of boolean
//        boolean[] brokenLights;

//        //creates an array of names
//        String[] names = {"John", "Daryl", "Mike", "Sarah", "Michelle"};
//        System.out.println(names[2]);

//        List <data-type> list1= new ArrayList();
//        List <data-type> list2 = new LinkedList();
//        List <data-type> list3 = new Vector();
//        List <data-type> list4 = new Stack();



//names = {John, Heather, Joe, Finn} //original ArrayList
//
////reverse the contents by calling Collections.reverse(ArrayListName)
//        Collections.reverse(names);
//=>[Finn, Joe, Heather, John] //after reversing the elements
//
//
////Get the size of the ArrayList
//        System.out.println(names.size());
//=> 4
//
////Checks the array list for a specific element
//        names.contains("Heather")
//                => true
//
////remove all elements from list
//        names.clear();
// => names ={}


//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(5);
//        arrayList.add(7);
//        arrayList.add(9);
//        arrayList.add(0, 9);
//        System.out.println(arrayList.get(2));
//        System.out.println(arrayList.get(0));
//        arrayList.remove(0);
//
//
////                                      String to Array to Arraylist
//
//
//        String myString = "I really love icecream!";
//        String str[] = myString.split(" ");
//        List<String> arrayString = new ArrayList<String>();
//        arrayString = Arrays.asList(str);
//        System.out.println(arrayString.toString());


////Creates a HashMap with a String as key and Integer as the value it points to
//        HashMap<String, Integer> person = new HashMap<>();
//
//        person.put("Joan", 21);
//        person.put("Anna", 34);
//        person.put("Mike", 55);
//        person.put("Daniel", 42);
//        person.get("Joan");
//        System.out.println(person.get("Joan"));
//        person.remove("Mike");
//        person.put("Joan", 42);
//        System.out.println(person.containsKey("Daniel"));


//        person.put("Joan", 21);
//        person.put("Anna", 34);
//        person.put("Mike", 55);
//        person.put("Daniel", 42);
//        person.get("Joan");
//        System.out.println(person.get("Joan"));
//        person.remove("Mike");
//        person.put("Joan", 42);
//        System.out.println(person.containsKey("Daniel"));
//
//
////loop through the hash map and return each key/value pair
//        for (Map.Entry<String, Integer> entry : person.entrySet()){
//        String key = entry.getKey();
//        Integer value = entry.getValue();
//        System.out.println(key + ":" + value);