import service.spi.Photographer;

module another.photographer {
  requires modone.provider;
  provides Photographer with photog2.SpySatellite;
}