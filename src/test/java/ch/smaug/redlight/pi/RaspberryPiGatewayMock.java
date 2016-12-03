package ch.smaug.redlight.pi;

import javax.annotation.Priority;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.swing.JFrame;
import javax.swing.JLabel;

import ch.smaug.redlight.pi.RaspberryPiGateway;

@ApplicationScoped
@Alternative
@Priority(10000)
public class RaspberryPiGatewayMock  implements RaspberryPiGateway {

	RaspberryPiGatewayMock() {
		JFrame frame = new JFrame("HelloWorldSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add the ubiquitous "Hello World" label.
		JLabel label = new JLabel("Hello World");
		frame.getContentPane().add(label);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void setOutput(final boolean on) {
		// TODO Auto-generated method stub

	}

}
