package service.impl;

import service.spi.Photographer;

public class DadWithCamera implements Photographer {
  @Override
  public String takePhoto(String subject) {
    return "here look, lovely photo of " + subject;
  }
}
