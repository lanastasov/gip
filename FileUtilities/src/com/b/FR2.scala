package com.b

import scala.io.Source
import scala.util.matching.Regex


/**
 * @author 
 */
object FR2 {
  def main(args: Array[String]) : Unit = {
    val url = getClass.getResource("/sample.txt")
    val file = Source.fromURL(url)
    val regex = new Regex("([a-zA-Z:{, \"]+value\": \")(.)([a-zA-Z:}, \"]+)")

    // line added from br-win second attempt
    // line added from br-win from win
    // line added from br-win from win 2

    // line added to br-ub from win
    for (line <- file.getLines()) {
      line match {
        case regex(m1, m2, m3) => println(s"$m1" + s"$m2".toUpperCase() + s"$m3")
      }
    }
    
    
  }
}