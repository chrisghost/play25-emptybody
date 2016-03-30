package controllers

import akka.actor.ActorSystem
import javax.inject._
import play.api._
import play.api.mvc._
import scala.concurrent.{ExecutionContext, Future, Promise}

@Singleton
class EmptyBody  @Inject() (actorSystem: ActorSystem)(implicit exec: ExecutionContext) extends Controller {

  def hiAsync = Action.async { _ => Future.successful(Ok("Hi (async)")) }
  def hi = Action { _ => Ok("Hi") }

}
