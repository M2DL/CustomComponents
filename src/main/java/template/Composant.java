package template;

import java.util.Properties;

/**
 * Created by seb on 10/02/17.
 */
public class Composant extends SuperType{

    private String id;

    private Properties proprietes;

    @Override
    public Object methodeServiceProvide1() {
        Object myObject = this.methodeRequise1();
        return myObject;
    }

    @Override
    public Object methodeServiceProvide2() {
        Object myObject = this.methodeRequise2();
        return myObject;
    }
}
