package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {
	// turnOn()	 abstract method overriding
	@Override
	public void turnOn() {
		System.out.println("Turn on the TV");
	}

	// turnOff() abstract method overriding
	@Override
	public void turnOff()	{
		System.out.println("Turn off the TV");
	}

	// search() abstract method overriding
	@Override
	public void search(String url) {
		System.out.println("search for " + url);
	}
}
