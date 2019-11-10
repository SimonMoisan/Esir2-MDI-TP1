package mailbox;

import javax.swing.JLabel;

public class MailObserver extends JLabel implements Observer {

	
	@Override
	public void update(Subject s) {
		Mail lastMail = ((MailBox) s).getLastMail();
		super.setText(lastMail.getSubject());

	}

}
