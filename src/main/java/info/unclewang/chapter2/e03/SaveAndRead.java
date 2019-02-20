package info.unclewang.chapter2.e03;

import java.io.*;

public class SaveAndRead {

	public static void main(String[] args) {
		try {
			Elvis myObject = Elvis.getInstance();
			FileOutputStream fosRef = new FileOutputStream(new File(
					"myObjectFile.txt"));
			ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);

			oosRef.writeObject(myObject);
			oosRef.close();
			fosRef.close();
			System.out.println(myObject.hashCode());
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fisRef = new FileInputStream(new File(
					"myObjectFile.txt"));
			ObjectInputStream iosRef = new ObjectInputStream(fisRef);
			Elvis myObject = (Elvis) iosRef.readObject();
			iosRef.close();
			fisRef.close();
			System.out.println(myObject.hashCode());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
