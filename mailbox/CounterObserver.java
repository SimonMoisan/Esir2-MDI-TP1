package mailbox;

import javax.swing.JLabel;

public class CounterObserver extends JLabel implements Observer {
	
	@Override
	public void update(Subject s) {
		int counter = ((MailBox) s).getNbreMail();
		super.setText( String.valueOf(counter));
	}
}
