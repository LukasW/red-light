package ch.smaug.redlight.pi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.lang.reflect.InvocationTargetException;

import javax.annotation.Priority;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

@ApplicationScoped
@Alternative
@Priority(10000)
public class RaspberryPiGatewayMock implements RaspberryPiGateway {

	private JFrame frame;
	private Color color = Color.GRAY;

	public RaspberryPiGatewayMock() {
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				@Override
				public void run() {
					frame = new JFrame("red-light");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.add(new LightPanel());
					frame.pack();
					frame.setVisible(true);
				}
			});
		} catch (InvocationTargetException | InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void setOutput(final boolean on) {
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				@Override
				public void run() {
					color = on ? Color.YELLOW : Color.GRAY;
					frame.repaint();
				}
			});
		} catch (InvocationTargetException | InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	private class LightPanel extends JPanel {
		private static final long serialVersionUID = 1L;

		@Override
		public Dimension getPreferredSize() {
			return new Dimension(100, 100);
		}

		@Override
		public void paintComponent(final Graphics g) {
			super.paintComponent(g);
			g.setColor(color);
			g.fillOval(0, 0, getSize().width, getSize().height);
		}
	}

}
