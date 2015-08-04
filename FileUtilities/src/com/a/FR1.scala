package com.a

import scala.io.Source
import scala.util.matching.Regex


/**
 * @author 
 */
object FR1 {
  def main(args: Array[String]) : Unit = {
    val file = Source.fromFile("")
    val regex = new Regex("")
    
    for (line <- file.getLines()) {
      println(line)
    }
  }
}