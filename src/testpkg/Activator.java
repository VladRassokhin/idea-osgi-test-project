package testpkg;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
    @Override
    public void start(BundleContext context) {
        System.out.println("Activator.start");
        System.out.println("context = [" + context + "]");
    }

    @Override
    public void stop(BundleContext context) {
        System.out.println("Activator.stop");
        System.out.println("context = [" + context + "]");
    }
}
