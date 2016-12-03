package ch.smaug.redlight.pi;

import javax.inject.Named;

@Named
public interface RaspberryPiGateway {

	void setOutput(boolean on);
}