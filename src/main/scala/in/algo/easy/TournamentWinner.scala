package in.algo.easy

import scala.collection.mutable.Map

object TournamentWinner {
  private def tournamentWinner(competitions: List[List[String]], results: List[Int]): String = {
    val teamPoints = Map[String, Int]().withDefaultValue(0)

    for ((matchup, result) <- competitions.zip(results)) do
      val homeTeam = matchup.head
      val awayTeam = matchup(1)

      if result == 1 then
        teamPoints(homeTeam) += 3
      else
        teamPoints(awayTeam) += 3

    val winner = teamPoints.maxBy(_._2)
    winner._1
  }

  def main(args: Array[String]): Unit = {
    val competitions = List(
      List("HTML", "C#"),
      List("C#", "Python"),
      List("Python", "HTML")
    )

    val results = List(0, 0, 1)

    val winner = tournamentWinner(competitions, results)
    println(winner)
  }
}

