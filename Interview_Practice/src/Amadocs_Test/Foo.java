package Amadocs_Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Foo {

	public static void main(String[] args) {
		List<String>things=new ArrayList<>();
		things.add("stuff");
		things.add("man");
		things.add("girl");
		things.add("char");
		things.add("mouse");
		
		List<String>syncThings = Collections.synchronizedList(things);
				
							//1 Collections.synchronizedList(things);
		System.out.println(syncThings);
	}

}
