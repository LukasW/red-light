# Red Light

## Part List
| Description | Conrad PartNr | Price (in CHF) |
| --- | --- | --- |
| Raspberry Pi Model A+ 256 MB ohne Betriebssystem | 1299810 - 62 | 29.95 |
| LED bedrahtet Rot Rund 5 mm 5500 mcd 4 ° 20 mA 1.9 V Vishay TLHK 5800 | 184350 - 62 | 0.45 |

![alt text](https://github.com/LukasW/red-light/raw/master/red-light.png "First schematics")

## Software Installation on Raspberry

Configure network

Install [Apache Commons Daemon](http://commons.apache.org/proper/commons-daemon/jsvc.html)
> sudo apt-get install jsvc

Install [Pi4J](http://pi4j.com/)
> curl -s get.pi4j.com | sudo bash

Install Java 8 (JDK)
> sudo apt-get install oracle-java8-jdk

Set Java 8 as default
> sudo update-alternatives --config java


Configure settings.xml

     <server>
      <id>red-light</id>
      <username>pi</username>
      <password>***</password>
    </server>
    
## Links
http://pi4j.com/pins/model-a-plus.html
