
public class StringLog implements StringLogInterface {

	private String[] log;
	private int lastIndex;
	private String name;
	
	public StringLog(String name, int size) {
		this.name = name;
		log = new String[size];
		lastIndex = -1;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean contains(String element) {
		// TODO Auto-generated method stub
		for (int i = 0; i < size(); ++i)
			if (log[i].equals(element))
				return true;
		return false;
	}

	@Override
	public void add(String element) {
		// TODO Auto-generated method stub
		log[lastIndex + 1] = element;
		++lastIndex;
	}

	@Override
	public boolean full() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return lastIndex + 1;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "Log: " + name + "\n";
		for (int i = 0; i < size(); ++i)
			s += (i + 1) + ". " + log[i] + "\n";
		return s;
	}
}
