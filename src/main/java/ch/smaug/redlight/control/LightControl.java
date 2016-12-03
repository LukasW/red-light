package ch.smaug.redlight.control;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.smaug.redlight.pi.RaspberryPiGateway;

@ApplicationScoped
public class LightControl {
	private final static Logger LOG = LoggerFactory.getLogger(LightControl.class);

	@Inject
	private RaspberryPiGateway raspberryPiGateway;

	public void initialize() {
		LOG.info("initialize");
	}

	public void on() {
		raspberryPiGateway.setOutput(true);
	}

	public void off() {
		raspberryPiGateway.setOutput(false);
	}

}
