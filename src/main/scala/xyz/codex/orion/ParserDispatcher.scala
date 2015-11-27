package xyz.codex.orion

import akka.actor.Actor
import akka.event.{LoggingAdapter, Logging}
import xyz.codex.orion.ParserDispatcher.{RussiaToday, Lenta, Twitter}

/**
  *
  * @author eliseev
  */

object ParserDispatcher {
  case object Twitter
  case object Lenta
  case object RussiaToday
}

class ParserDispatcher extends Actor {
  private val logger: LoggingAdapter = Logging(context.system, this)

  override def receive: Receive = {
    case Twitter => logger.info("Parsing Twitter")
    case Lenta => logger.info("Parsing Lenta")
    case RussiaToday => logger.info("Parsing Russia Today")
  }
}


