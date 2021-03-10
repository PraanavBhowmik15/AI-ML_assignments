package Table
class TableApi {
  //Making a table function to generate table in the input list
  def createTable(list: List[Int]): List[List[Int]] ={
    val listOfTable = for(value <- list) yield {             //creating a list in which the input's list table will be saved
      val elementsOfTable= for(tableValue<-1 until 11)yield{ //generating table of one value from the list and creating a sub-list of it
        value*tableValue                                     //table operation
      }
      elementsOfTable.toList
    }
    listOfTable                                              //returning the list of table
  }
}
