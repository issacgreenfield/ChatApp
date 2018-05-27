import Model.Message;

public class ChatApp {

	public static void main(String[] args) {
		
		
		
//		Display display = new Display();
//		Shell shell = new Shell(display);
//		Button loginBtn = new Button(shell, SWT.PUSH);
//		
//		
//		shell.setText("This is my chat Application");
//		//shell.setLayout(Fillayout());
//		
//		
//		//http://www.vogella.com/tutorials/SWT/article.html
//		// Shell can be used as container
//		Label label = new Label(shell, SWT.BORDER);
//		label.setText("This is a label:");
//		label.setToolTipText("This is the tooltip of this label");
//
//		Text text = new Text(shell, SWT.NONE);
//		text.setText("This is the text in the text widget");
//		text.setBackground(display.getSystemColor(SWT.COLOR_BLACK));
//		text.setForeground(display.getSystemColor(SWT.COLOR_WHITE));
//
//		loginBtn.addSelectionListener(new SelectionAdapter() {
//		    @Override
//		    public void widgetSelected(SelectionEvent e) {
//		        System.out.println("Called!");
//		    }
//		});
//		
//		// set widgets size to their preferred size
//		text.pack();
//		label.pack();
//		loginBtn.pack();
//		
//		shell.open();
//		while (!shell.isDisposed()) {
//			if (!display.readAndDispatch()) display.sleep();
//			}
//				display.dispose();
//			}

	}
	
	private boolean testClass()
	{
		String[] names = new String[1];
		names[0] = new String("you");
		Message msg = new Message("me", names, "hello world");
		
		displayMessage(msg);
		
		return true;
	}
	
	private void displayMessage(Message msg)
	{
		System.out.println("The message is from: " + msg.getFromUsername());
		System.out.print("The message is to: ");
		String[] messageTo = msg.getToUsernames();
		for (int i = 0; i < messageTo.length; i++)
		{
			System.out.print(messageTo[i] + ", ");
		}
		System.out.println();
		System.out.println("The message reads: " + msg.getMessageText());
	}
	
	
	
	
}

