/**
 *  Copyright (C) 2009-2013 Typesafe Inc. <http://www.typesafe.com>
 */
package sample.remote.calculator

/*
 * comments like //#<tag> are there for inclusion into docs, please don’t remove
 */

import akka.kernel.Bootable
import akka.actor.{ Props, Actor, ActorSystem }
import com.typesafe.config.ConfigFactory


class DaemonApplication extends Bootable {
  //#setup
  val system = ActorSystem("DaemonApplication",  ConfigFactory.load.getConfig("calculator"))
  //#setup

  def startup() {
  }

  def shutdown() {
    system.shutdown()
  }
}

object DaemonApp {
  def main(args: Array[String]) {
    new DaemonApplication
    println("Started Daemon Application - waiting for actor creation.... ")
  }
}
