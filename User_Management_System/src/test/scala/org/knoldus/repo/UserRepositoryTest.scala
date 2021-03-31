//Author - Praanav Bhowmik

package org.knoldus.repo

import org.knoldus.models.{User, UserType}
import org.scalatest.flatspec.AnyFlatSpec

class UserRepositoryTest extends AnyFlatSpec {

  val userRepository = new UserRepository
  val userAdmin: User = User( 1, "Mark Zukerberg" , UserType.ADMIN)
  val userCustomer: User = User(2 , "Davidson Harley" , UserType.CUSTOMER)
  val userCustomerTwo: User = User(3 , "Sundar Pichai" , UserType.CUSTOMER)

  val input1 = 4

  "Validating createUser" should " is valid when adding admin" in {
    assert(userRepository.createUser(userAdmin))
  }

  "Validating createUser" should " is valid when adding customer" in {
    assert(userRepository.createUser(userCustomer))
  }

  "Validating getUserList" should " is valid" in {
    val actualResult = userRepository.listUser()
    val expectedResult = List(userAdmin,userCustomer)
    assert(actualResult != expectedResult)
  }

  "Validating listUserId" should " is valid" in {
    val actualResult = userRepository.listUserId()
    val expectedResult = List(1,2)
    assert(actualResult != expectedResult)
  }
  "Validating listUserId" should " is invalid" in {
    val actualResult = userRepository.listUserId()
    val expectedResult = List(1)
    assert(actualResult != expectedResult)
  }

  "Validating updateUser" should " is valid" in {
    assert(userRepository.updateUser(1, "Elon Musk"))
  }

  "Validating updateUser" should "be invalid" in {
    assert(!userRepository.updateUser(input1, "Warren Buffet"))
  }


  "Validating deleteUser" should "be valid" in {
    assert(userRepository.deleteUser(1))
  }
  "Validating deleteUser" should "be invalid" in {
    assert(userRepository.deleteUser(input1))
  }


  "Validating getUserNameById" should "be valid" in {
    val actualResult = userRepository.getUserNameById(2)
    val expectedResult = "Davidson Harley"
    assert(actualResult === expectedResult)
  }
  "Validating getUserNameById" should "be invalid" in {
    val actualResult = userRepository.getUserNameById(2)
    val expectedResult = "Ziyech"
    assert(actualResult != expectedResult)
    userRepository.deleteUser(1)
    userRepository.deleteUser(2)
    userRepository.deleteUser(3)
  }

  /* DatabaseConnection_Api File Method Testing */

  //Test case for insertUserDatabase method
  "Validating insertUserDatabase" should "be valid when adding admin" in {
    val actualResult = userRepository.insertUserDatabase(userAdmin)
    val expectedResult = true
    assert(actualResult === expectedResult)
  }

  "Validating insertUserDatabase" should "be invalid" in {
    val actualResult = userRepository.insertUserDatabase(userCustomerTwo)
    val expectedResult =  false
    assert(actualResult != expectedResult)
  }

  //Test case for selectUser method
  "Validating selectUser" should "be valid" in {
    val actualResult = userRepository.selectUser()
    val expectedResult = true
    assert(actualResult === expectedResult)
  }

  "Validating selectUser" should "be invalid" in {
    val actualResult = userRepository.selectUser()
    val expectedResult = false
    assert(actualResult != expectedResult)
  }

  //Test case for updateUserDatabase method
  "Validating updateUserDatabase" should "be valid" in {
    val actualResult = userRepository.updateUserDatabase(1,"Elon Musk")
    val expectedResult = true
    assert(actualResult === expectedResult)
  }

  "Validating updateUserDatabase" should "be invalid" in {
    val actualResult = userRepository.updateUserDatabase(input1, "Warren Buffet")
    val expectedResult = false
    assert(actualResult != expectedResult)
  }

  //Test case for deleteUserDatabase method
  "Validating deleteUserDatabase" should "be valid" in {
    val actualResult = userRepository.deleteUserDatabase(1)
    val expectedResult = true
    assert(actualResult === expectedResult)
  }

  "Validating deleteUserDatabase" should "be invalid" in {
    val actualResult = userRepository.deleteUserDatabase(input1)
    val expectedResult = false
    assert(actualResult != expectedResult)
  }

  //Test case for getUserNameByIdDatabase method
  "Validating getUserNameByIdDatabase" should "be valid" in {
    val actualResult = userRepository.getUserNameByIdDatabase(2)
    val expectedResult = true
    assert(actualResult === expectedResult)
  }

  "Validating getUserNameByIdDatabase" should "be invalid" in {
    val actualResult = userRepository.getUserNameByIdDatabase(2)
    val expectedResult = false
    assert(actualResult != expectedResult)
    userRepository.deleteUser(1)
    userRepository.deleteUser(2)
    userRepository.deleteUser(3)
  }
}