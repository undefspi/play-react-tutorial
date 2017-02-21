package controllers

import play.api.mvc._


class TicTacToe extends Controller{
  def index = Action {
    Ok(views.html.tictactoe("Welcome to Tic Tac Toe"))
  }
}
