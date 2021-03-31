//Author - Praanav Bhowmik

package org.knoldus.bootstrap

import org.knoldus.dao.Dao
import org.knoldus.models._
import org.knoldus.repo.UserRepository
import org.knoldus.validate.UserValidate

object Application extends App {

    val repository : Dao[User] = new UserRepository
    val operations = new UserValidate(repository)
    val userAdmin = User( 1, "Bill Gates" , UserType.ADMIN)
    val userCustomer = User(2 , "Gary larson" , UserType.CUSTOMER)
    print(operations.addUser(userAdmin))            //Adding Data.
    print(operations.addUser(userCustomer))         //Adding Data
    //print("LIST OF USERS\n")
    //print(operations.getUserList())
    operations.getUserList
    //print("Fetching Name by ID: \n")
    operations.getUser(1) //RETRIEVING NAME BY ID
    //print(operations.getUser(1))
    print("\nChanging Name: ")
    //Changes Name of User whose Id(1) is passed in the method.
    if(operations.changeUserName(1 , "Satya Nadela")) {
      print("Updated")
    }
    else {
      print("Could not Update Name.")
    }
    operations.removeUser(2) // Deletes User with id 2.
}
