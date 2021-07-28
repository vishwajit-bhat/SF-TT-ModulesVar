package cli;

import prov.Prov;

import java.lang.reflect.Field;

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
  }
}
