package mailbox;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



public class MailBox extends Subject{
	
	List<Mail> mail = new ArrayList<Mail>();
	
	private MailBox(){
		
	}
	private static MailBox instance = null;
	
	public static MailBox getInstance() {
		if (instance==null)
			instance = new MailBox();
		return instance;
	}
	
	/**
	 * New message
	 * @param m
	 */
	public void addMail(Mail m ){ 
		this.mail.add(m);
		notifyObserver();
	}


	public Mail getLastMail() {
		return this.mail.get(mail.size()-1);
	}
	
	/*
	public Mail readMail(int i) {
		return this.mail.get(mail.size()-1);
	}
	*/

	public Integer getNbreMail() {
		return this.mail.size();
	}
	
	public boolean isEmpty() {
		return this.mail.isEmpty();
	}


	@Override
	public void notifyObserver() {
		for (Observer Observer: listeObservers) {
			Observer.update(this);
		}
	}

		
	
	
}
