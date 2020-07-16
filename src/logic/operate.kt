package logic

external fun require(module: String): dynamic

val Big = require("big.js")

fun isNumber(number: String): Boolean = number.matches("/[0-9]+/")

fun operate(numberOne: String, numberTwo: String, operation: String): String = run {
    val one = if(numberOne.isNotBlank()) Big(numberOne) else Big("0")
    val two = if(numberTwo.isNotBlank()) Big(numberTwo) else if (operation == "x" || operation == "÷") Big("1") else Big("0")
    when(operation){
        "+" -> one.plus(two)
        "-" -> one.minus(two)
        "x" -> one.times(two)
        "÷" -> one.div(two)
        else -> throw error("Unknown operation $operation")
    }
} as String
