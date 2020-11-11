import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserDatabase extends FlatFileDatabase<String, User>{

	public UserDatabase() {}
	public UserDatabase(String filename) throws IOException {
		openFile(filename);
	}


	@Override
	public void add(User obj) {
		hashmap.put(obj.getUsername(), obj);
	}
	@Override
	public User parseLine(String line) {		
		User user = new User();
		user.fromFlatFileString(line);
		return user;
	}

}
