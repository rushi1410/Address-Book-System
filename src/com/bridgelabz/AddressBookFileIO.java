package com.bridgelabz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AddressBookFileIO {
	public void writeData(Map<String, AddressBook> addressBook) {
		File file = new File("Contacts.txt");
		BufferedWriter bf = null;;
		try {
			bf = new BufferedWriter(new FileWriter(file));

			for (Map.Entry<String, AddressBook> entry : addressBook.entrySet()) {

				bf.write(entry.getKey() + ":" + entry.getValue());

				bf.newLine();
			}
			bf.flush();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static Map<String,  String> readData() {
		Map<String, String> mapFileContents = new HashMap<>();
		BufferedReader br = null;
		try {

			File file = new File("Contacts.txt");

			br = new BufferedReader(new FileReader(file));

			String line = null;

			while ((line = br.readLine()) != null) {

				String[] parts = line.split(":");

				String bookName = parts[0].trim();
				String firstName = parts[1].trim();
				mapFileContents.put(bookName, firstName);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
				}
			}
		}
		return mapFileContents;
	}
}
