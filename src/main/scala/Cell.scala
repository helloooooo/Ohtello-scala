sealed trait Cell{
  def show :String
}

case object Black extends Cell{
  override def show: String = "●"
}
case object White extends Cell{
  override def show: String = "○"
}
case object Empty extends Cell{
  override def show: String = " "
}