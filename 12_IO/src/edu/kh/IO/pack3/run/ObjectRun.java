package edu.kh.IO.pack3.run;

import edu.kh.IO.pack3.model.service.ObjectService;

public class ObjectRun {

	public static void main(String[] args) {
		ObjectService service = new ObjectService();
		service.objectOutput();
		// [직렬화가 되어있지 않다]
		//java.io.NotSerializableException 
		service.objectInput();
	}

}
