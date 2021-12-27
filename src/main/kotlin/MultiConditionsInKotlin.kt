fun main() {

    /*
    when -> with Enum value
    */
    val state = State.values().random()
    printState(state)

    /*
    when -> with Int value
    */
    val integerList = listOf(1,2,3,4)
    printIntValue(integerList)

    /*
    when -> with String value
    */
    val stringList = listOf("Erselan","Khan","Android","KotlinVsJava")
    printStringValue(stringList)

}

private fun printStringValue(stringList: List<String>) {
    when (stringList.random()) {
        stringList[0] -> {
            println("String value: ${stringList[0]}")
        }
        stringList[1] -> {
            println("String value: ${stringList[1]}")
        }
        stringList[2] -> {
            println("String value: ${stringList[2]}")
        }
        stringList[3] -> {
            println("String value: ${stringList[3]}")
        }
    }
}

private fun printIntValue(integerList: List<Int>) {
    when (integerList.random()) {
        1 -> {
            println("Int value: ${integerList[0]}")
        }
        2 -> {
            println("Int value: ${integerList[1]}")
        }
        3 -> {
            println("Int value: ${integerList[2]}")
        }
        4 -> {
            println("Int value: ${integerList[3]}")
        }
    }
}

private fun printState(state: State) {
    when (state) {
        State.NOT_STARTED -> {
            println("State: $state")
        }
        State.STARTED -> {
            println("State: $state")
        }
        State.IN_PROGRESS -> {
            println("State: $state")
        }
        State.COMPLETED -> {
            println("State: $state")
        }
        State.CANCELLED -> {
            println("State: $state")
        }
    }
}

enum class State {
    NOT_STARTED, STARTED, IN_PROGRESS, COMPLETED, CANCELLED,
}