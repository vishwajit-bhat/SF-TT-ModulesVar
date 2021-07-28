package photog2;

import service.spi.Photographer;

public class SpySatellite implements Photographer {
  @Override
  public String takePhoto(String subject) {
    return "beep beep beep picture of your licese plate and " + subject;
  }
}
