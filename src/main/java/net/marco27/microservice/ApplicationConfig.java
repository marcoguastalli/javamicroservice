package net.marco27.microservice;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * https://gist.github.com/ivargrimstad/c368221fa079285856e7
 */
@ApplicationPath("/")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();
        resources.add(HelloJavaMicroService.class);
        return resources;
    }
}
