package src;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import resources.FlightResource;
import resources.LameDuckReservationResource;

/**
 * Created by liyiran on 2016/11/19.
 */
public class LameDuckApplication extends Application<Configuration> {
    public static void main(String[] args) throws Exception {
        new LameDuckApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(Configuration configuration,
                    Environment environment) {
        final LameDuckReservationResource resource = new LameDuckReservationResource();
        final FlightResource flightResource = new FlightResource();
        environment.jersey().register(resource);
        environment.jersey().register(flightResource);
    }
}
