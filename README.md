# Red Light

## Part List
| Description | Conrad PartNr | Price (in CHF) |
| --- | --- | --- |
| Raspberry Pi Model A+ 256 MB ohne Betriebssystem | 1299810 - 62 | 29.95 |
| Raspberry Pi® WLAN-Stick EDIMAX EW-7811Un | 993655 - 62 | 9.95 |
| LED bedrahtet Rot Rund 5 mm 5500 mcd 4 ° 20 mA 1.9 V Vishay TLHK 5800 | 184350 - 62 | 0.45 |
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
    
## Links
http://pi4j.com/pins/model-a-plus.html
