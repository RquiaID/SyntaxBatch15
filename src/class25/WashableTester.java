package class25;
 public class WashableTester{
public static void main(String[] args) {

        WashAble [] washAbles={new SmartWatch(),
        new Inverter(),new Phone()};

        for(WashAble w:washAbles){
        w.wash();
        }
        }
        }
