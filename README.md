# red-light

## Part List
|Part|Conrad|Price|
|LED|123|12.23Fr|




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
