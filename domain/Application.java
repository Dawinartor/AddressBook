package domain;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;

import google.gson.Gson;
import valueObjects.Addressbook;
import valueObjects.Person;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;

public class Application {
	// runs the main application
	public static void main(String[] args) {
		System.out.println("a");
		try {
			writeToFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			readFromFile();
		} catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void writeToFile() throws Exception {
		Person hans = new Person("hans", "m�ller", "fgt", 0006, "1.1.1", 28, "aaastra�e1");
		LinkedList<Person> list = new LinkedList<>();
		list.add(hans);
		Addressbook addressbook = new Addressbook(list);
		FileWriter wr = new FileWriter("file.json");
		Gson gson = new Gson();
		//System.out.println(addressbook.toString());
		gson.toJson(addressbook, wr);
		wr.flush();
		wr.close();
	}
	
	public static void readFromFile() throws JsonIOException, JsonSyntaxException, FileNotFoundException {
		Gson gson = new Gson();
		Addressbook a = gson.fromJson(new JsonReader(new FileReader("file.json")), Addressbook.class);
	}
}
