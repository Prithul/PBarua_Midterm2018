package datastructure;

/*
 * Demonstrate how to use Map that includes storing and retrieving elements.
 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
 * Use For Each loop and while loop with Iterator to retrieve data.
 *
 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
 */
/**
 * Author: Papri Barua
 */

import com.mongodb.*;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {


		List<String> listA = new ArrayList<>();
		listA.add("A little learning is a dangerous thing");
		listA.add("A lick and the promise");
		listA.add("A barking dog seldom bites");

		List<String> listB = new ArrayList<>();
		listB.add("Ball is in your court");
		listB.add("Balloon goes up");
		listB.add("Ballpark figure");

		List<String> listC = new ArrayList<>();
		listC.add("Cats and dogs");
		listC.add("Cast your eye over");
		listC.add("Castles in the air");

		Map<String, List<String>> map = new HashMap<>();
		map.put("A", listA);
		map.put("B", listB);
		map.put("C", listC);

		System.out.println("Retrieving data from map (after insertion) using For-Each...... ");

		// For-Each
		for(Map.Entry entry : map.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		map.remove("B");

		Set entrySet = map.entrySet();
		Iterator it = entrySet.iterator();

		System.out.println("\nRetrieving data from map (after deletion) using Iterator...... ");

		// Iterator
		while(it.hasNext()){
			Map.Entry m = (Map.Entry)it.next();
			System.out.println("Key is: "+ m.getKey() +
					" & " +
					" value is: "+ m.getValue());
		}

		try{

			Mongo mongo = new Mongo("localhost", 27017);
			DB db = mongo.getDB("students");
			DBCollection collection = db.getCollection("hashmap");

			System.out.println("Database Connected!");

			BasicDBObject document = new BasicDBObject();
			collection.insert(new BasicDBObject(map));
			DBCursor cursorDocMap = collection.find();

			while (cursorDocMap.hasNext()) {
				System.out.println(cursorDocMap.next());
			}

		}catch(Exception e){

		}

	}

}
