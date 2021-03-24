import java.time._
import scala.concurrent._
import ExecutionContext.Implicits.global
trait Food
trait  Ingridient extends Food {
  def delicious:Boolean
}
case object Tomato extends Ingridient{
  override def delicious: Boolean = false
}
case object Potato extends Ingridient{
  override def delicious: Boolean = true
}
case object Chilli extends Ingridient{
  override def delicious: Boolean = true
}

val chili: Chilli.type =Chilli

val ingridient:Ingridient=chili
val a :Any=ingridient

def filterDelicious[A >: Ingridient](ingridient: List[A]):List[A]=
  ingridient.collect{
    case i: Ingridient=>i
  }.filter(_.delicious)

//filterDelicious[Food](List(chili,Tomato,Potato))

trait Box[+A]
val boxchili:Box[Chilli.type] = ???
val boxI:Box[Ingridient]=boxchili

//Futures

Future{
  Thread.sleep(500)
  println(s"This is the future time at ${LocalTime.now}")
  }
println(s"This is the present at ${LocalTime.now}")

