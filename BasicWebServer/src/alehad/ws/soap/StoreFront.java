package alehad.ws.soap;

import java.util.ArrayList;
import java.util.List;

public class StoreFront {

	public List<String> getOptions()
	{
		List<String> options = new ArrayList<String>();
		
		options.add("Option 1");
		options.add("Option 2");
		
		return options;
	}
}
