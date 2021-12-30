fun main() {

    /*
    using val, to assign value only one time
    */
    val assignValueOnlyOneTime = "Erselan Khan"
    /*assignValueOnlyOneTime = ""*/

    /*
    using var, to assign value multiple times
    */
    var assignValueMultipleTimes = "Erselan Khan"
    assignValueMultipleTimes = "Arsalan Khan"

    /*
    Accessing method from class object
    */
    val keywordsKotlin = KeywordsKotlin()
    keywordsKotlin.objectBoundMethod()

    /*
    calling method of singleton class
    */
    SingletonClass.methodOfSingletonClass()

    /*
    Accessing method from class
    */
    KeywordsKotlin.classBoundMethod()
}

class KeywordsKotlin {
    companion object {
        fun classBoundMethod() {
            println("This is class bound method")
        }
    }

    fun objectBoundMethod() {
        println("This is object bound method")
    }
}

class ChildClassOne : ExtendableClass() {

}

/*
using open, allows subclassing a class or overriding a member
*/
open class ExtendableClass {

}

/*class ChildClassTwo : NonExtendableClass() {

}*/

/*
by default all classes are non-extendable in Kotlin
*/
class NonExtendableClass {

}

/*
using object, to make class Singleton
*/
object SingletonClass {
    fun methodOfSingletonClass() {
        println("This is a method of singleton class")
    }
}