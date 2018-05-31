/**
  * Created by PC-User on 2018/05/31.
  */
object Movelist {
  val moves :List[Point => Option[Point]] = {
    def pointUp(point: Point):Option[Point] =





      def nextMove(point: Point , x:Int, y:Int):Option[Point] = {
        val x = point.x + x
        val y = point.y + y
        if (x < 0 || y < 0 || x > 7  || y > 0) None
        else Option(Point(x,y))
      }

  }

}
