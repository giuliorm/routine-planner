package controllers

import javax.inject._

import play.api.mvc._

/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
@Singleton
class HomeController @Inject()(cc: ControllerComponents)(implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {

  private val title = "My Routine Planner"
  private val hello = "Welcome to the my routine Planner"
  private val menuItems = List("Projects", "Planning", "Calendar")
  /**
    * Create an Action to render an HTML page with a welcome message.
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def index = Action {

    Ok(views.html.index(title, hello, menuItems))
  }

}
