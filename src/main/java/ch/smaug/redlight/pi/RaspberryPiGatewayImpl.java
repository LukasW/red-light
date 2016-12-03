package ch.smaug.redlight.pi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;

@ApplicationScoped
@Default
@Path("/")
public class RaspberryPiGatewayImpl implements RaspberryPiGateway {

	private final static Logger LOG = LoggerFactory.getLogger(RaspberryPiGatewayImpl.class);

	private final GpioController gpioController;
	private final GpioPinDigitalOutput gpio01;

	RaspberryPiGatewayImpl() {
		gpioController = GpioFactory.getInstance();
		gpio01 = gpioController.provisionDigitalOutputPin(RaspiPin.GPIO_29);
	}

	@Override
	public void setOutput(final boolean on) {
		LOG.info("Set gpio_21 t0 " + on);
		gpio01.setState(on);
	}
}