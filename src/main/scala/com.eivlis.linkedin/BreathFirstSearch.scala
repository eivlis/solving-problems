package com.eivlis.linkedin

import java.util.{Comparator, PriorityQueue}

/**
 * Given a list of points, a central point, and an integer k, find the nearest k points from the central point.
 *
 * For example, given the list of points [(0, 0), (5, 4), (3, 1)],
 * the central point (1, 2), and k = 2, return [(0, 0), (3, 1)].
 */
object NearestPoints extends App {

  case class Point(x: Int, y: Int)

//  def distance(p1: Point, p2: Point): Double = {
//    Math.sqrt((p1.x - p2.x) ^ 2 + (p1.y - p2.y) ^ 2)
//  }
//
//  def calculate(points: Array[Point], center: Point, count: Int): Array[Point] = {
//    if(count > points.length) {
//      points
//    } else {
//      val comparator: Comparator[Point] = (p1: Point, p2: Point) => distance(p1, center).compareTo(distance(p1, center))
//      val priorityQueue = new PriorityQueue[Point](comparator)
//
//      for(i <- 0 until points.length){
//       priorityQueue.add(points(i))
//      }
//    }
//  }






}
