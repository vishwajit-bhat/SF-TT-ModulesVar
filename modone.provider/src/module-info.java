/*open*/ module modone.provider {
//  exports prov to modtwo.client, badmodule;
  exports prov;
  exports shared;
//  opens prov to modtwo.client, badmodule;
  opens prov;
}
