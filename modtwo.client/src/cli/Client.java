package cli;

import prov.Prov;
import service.spi.Photographer;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

public class Client {
  public static void main(String[] args) throws Throwable {
    System.out.println("Message is " + prov.Prov.message);

    // this, without configuration would actually prevent my
    // code from even opening a file for reading on my own machine
//    System.setSecurityManager(new SecurityManager());

    Class<?> cl = Class.forName("prov.Prov");
    Field f = cl.getDeclaredField("secretMessage");
    f.setAccessible(true);
    f.set(null, "Hahahaha! I hacked you!");
    System.out.println(Prov.getMessage());

    ServiceLoader<Photographer> loader = ServiceLoader.load(Photographer.class);
    for (Photographer p : loader) {
      System.out.println(p.takePhoto("My kids"));
      System.out.println(p.getClass());
    }
  }
}
