/*
 * To the extent possible under law, Red Hat, Inc. has dedicated all copyright 
 * to this software to the public domain worldwide, pursuant to the CC0 Public 
 * Domain Dedication. This software is distributed without any warranty.  See 
 * <http://creativecommons.org/publicdomain/zero/1.0/>.
 */

package com.redhat.gss.jaxws;

import org.jboss.logging.Logger;
import javax.naming.InitialContext;
import javax.annotation.PostConstruct;
import java.util.Iterator;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import java.util.ArrayList;

@javax.jws.WebService(serviceName="HelloWS", portName="hello")
public class HelloWSImpl
{
  private Logger log = Logger.getLogger(this.getClass().getName());

  public String hello(String name) throws Exception
  {
    try
    {
      log.info(new String(("I'm über cool, " + name).getBytes(), "UTF-8"));
      return "Hello, " + name;
    }
    catch(Exception e)
    {
      log.error("", e);
      return "Fail";
    }
  }
}
