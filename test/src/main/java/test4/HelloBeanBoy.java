package test4;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class HelloBeanBoy implements HelloBean {

	Boy helloBoy;
	String msg;

	private HelloBeanBoy(Boy helloBoy, String msg) {
		this.helloBoy = helloBoy;
		this.msg = msg;
	}

	private HelloBeanBoy(String msg) {
		this.msg = msg;
	}

	public void setHelloBoy(Boy helloBoy) {
		this.helloBoy = helloBoy;
	}

	
	@Override
	public void printHello(String msg) {

		List myList = helloBoy.myList;

		for (int i = 0; i < myList.size(); i++) {
			System.out.println("이름 " + myList.get(i));
		}
		System.out.println(helloBoy.name + "  " + msg);

		
		
		// Map
		Map<String, String> myMap = helloBoy.myMap;

		Set<String> entryKey = myMap.keySet();

		Iterator<String> it = entryKey.iterator();

		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + "=" + myMap.get(key));
		}

		
		
		// Properties
		Properties myJdbc = helloBoy.myJdbc;
		Enumeration<String> propertyNames = (Enumeration<String>) myJdbc.propertyNames();

		while (propertyNames.hasMoreElements()) {
			String prop = propertyNames.nextElement();
			System.out.println(prop + "=" + myJdbc.getProperty(prop));
		}
		Set<String> mySet = helloBoy.mySet;
		it = mySet.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
