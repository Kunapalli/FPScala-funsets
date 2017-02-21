package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(2), 1))
  
  val s1 = singletonSet(1)
  val s2 = singletonSet(2)
  val s3 = singletonSet(3)
  val s4 = singletonSet(3)
  val s5 = singletonSet(4)
  val s6 = singletonSet(5)
  val s7 = singletonSet(7)
  val s8 = singletonSet(8)
  val s9 = singletonSet(9)
  
  val xe = union(union(union(singletonSet(10), s8), singletonSet(6)), singletonSet(3))
  
  val x1 = union(union(s1, s2), s3)
  val x2 = union(union(s4, s5), s6)
  val x3 = union(union(s7, s8), s9)
  printSet(x1)
  printSet(x2)
  printSet(union(x1,x2))
  printSet(intersect(x1,x2))
  printSet(diff(x1,x2))
  val x4 = union(union(x1,x2),x3)
  printSet(x4)
  //println("forall for ", forall(xe, even)) 
  printSet(map(x4, x=>x+1))
  printSet(xe)
  println(exists(xe, x=> x == 11))
}
