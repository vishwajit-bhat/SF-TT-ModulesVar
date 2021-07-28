import service.spi.Photographer;

module modtwo.client {
  requires modone.provider;
  uses Photographer;
}