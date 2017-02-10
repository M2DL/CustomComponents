import interfaces.ServiceProvide1;
import interfaces.ServiceProvide2;
import interfaces.ServiceRequire1;
import interfaces.ServiceRequire2;

/**
 * Created by seb on 10/02/17.
 */
public abstract class SuperType implements ServiceProvide1, ServiceProvide2 {

    ServiceRequire1 requis1;

    ServiceRequire2 requis2;

    protected Object methodeRequise1() {
        return requis1;
    }

    protected Object methodeRequise2() {
        return requis2;
    }
}
