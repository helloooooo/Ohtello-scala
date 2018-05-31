case class Board(cells: Vector[Vector[Cell]]){
  def show:String = cells.map(row =>
    row.map(" " + _.show + " ").mkString("")).mkString("\n")+"\n"
}
object Board{
  def apply(): Board = {
    Board(Vector(
      Vector.fill(8)(Empty),
      Vector.fill(8)(Empty),
      Vector.fill(8)(Empty),
      Vector(Empty,Empty,Empty,Black,White,Empty,Empty,Empty),
      Vector(Empty,Empty,Empty,White,Black,Empty,Empty,Empty),
      Vector.fill(8)(Empty),
      Vector.fill(8)(Empty),
      Vector.fill(8)(Empty)
    )
    )
  }
}
