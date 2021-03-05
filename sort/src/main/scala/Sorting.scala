class Sorting {

  //Implementation of bubble sort
  //Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
  def sort(array : Array[Int]) : Array[Int] = {
    for(i<- 1 until   array.length){
      for(j <- (i-1) until -1 by -1){
        if(array(j)>array(j+1)){
          val temp=array(j)
          array(j)=array(j+1)
          array(j+1)=temp
        }
      }
    }
    array
  }
}
