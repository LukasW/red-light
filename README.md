# Red Light

## Part List
| Description | Conrad PartNr | Price (in CHF) |
| --- | --- | --- |
| Raspberry Pi Model A+ 256 MB ohne Betriebssystem | 1299810 - 62 | 29.95 |
| Raspberry Pi® WLAN-Stick EDIMAX EW-7811Un | 993655 - 62 | 9.95 |
| LED-Reflektor Chrom | 170206-62 | 3.20 |
| HighPower-LED Rot 75 lm 125 ° 2.9 V 700 mA Luxeon Lumileds LXML-PD01-0040 | 170202-62 | 2.45 |
| microSDHC-Karte 16 GB | 284241 - 62 | 10.95 |
| USB-Ladegerät Steckdose 1200 mA 1 x Micro-USB | 514691 - 62 | 8.95 |

![alt text](https://github.com/LukasW/red-light/raw/master/red-light.png "First schematics")

## Software Installation on Raspberry

Configure network (/etc/network/interfaces)
> auto wlan0
> allow-hotplug wlan0
> iface wlan0 inet dhcp
> wpa-ap-scan 1
> wpa-scan-ssid 1
> wpa-ssid "your-ssid"
> wpa-psk "your-password"

http://www.datenreise.de/raspberry-pi-wlan-einrichten-edimax/

Setup raspberry with raspi-config

Install [Apache Commons Daemon](http://commons.apache.org/proper/commons-daemon/jsvc.html)
> sudo apt-get install jsvc

Install [Pi4J](http://pi4j.com/)
> curl -s get.pi4j.com | sudo bash

Install Java 8 (JDK)
> sudo apt-get install oracle-java8-jdk

Set Java 8 as default
> sudo update-alternatives --config java

## Prepare your environment

Configure settings.xml
```xml
<server>
	<id>red-light</id>
	<username>pi</username>
	<password>***</password>
</server>
```
    
## Running
Turning light on
> http://your-ip:8080/light/api/control/on

Turning light off
> http://your-ip:8080/light/api/control/off

Running locally without pi: Use the ch.smaug.redlight.MockedRedLightRunner class

## Links
http://pi4j.com/pins/model-a-plus.html
http://www.datenreise.de/raspberry-pi-wlan-einrichten-edimax/
