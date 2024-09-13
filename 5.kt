import kotlin.math.log
import kotlin.math.pow
import kotlin.math.round

fun main() {
    println("Введите целое число n и основание степени x через пробел (например, 8 2):")
    val input = readLine() ?: ""

    val parts = input.split(" ")
    if (parts.size != 2) {
        println("Ошибка: Введите два числа, разделенные пробелом.")
        return
    }

    val n = parts[0].toIntOrNull()
    val x = parts[1].toDoubleOrNull()

    if (n == null || n <= 0 || x == null || x <= 0) {
        println("Ошибка: Введены некорректные значения.")
        return
    }

    val y = log(n.toDouble(), x)
    val roundedY = round(y).toInt()

    if (x.pow(roundedY) == n.toDouble()) {
        println("Результат: Целочисленный показатель степени y = $roundedY")
    } else {
        println("Целочисленный показатель не существует")
    }
}
