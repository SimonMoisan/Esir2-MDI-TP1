package mailbox;

import java.util.ArrayList;

public abstract class Subject {
	
	protected ArrayList<Observer> listeObservers = new ArrayList<Observer>();
	
	public void attach(Observer o) {
		listeObservers.add(o);
	}
	
	public void detach() {
		listeObservers = new ArrayList<Observer>();
	}
	
	public abstract void notifyObserver();
}
