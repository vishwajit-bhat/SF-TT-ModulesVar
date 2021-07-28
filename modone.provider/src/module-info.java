/*open*/ module modone.provider {
//  exports prov to modtwo.client, badmodule;
  exports prov;
  exports shared;
  exports service.spi;

//  opens prov to modtwo.client, badmodule;
  opens prov;

  // provide access to an implementation
  provides service.spi.Photographer with service.impl.DadWithCamera;
}
