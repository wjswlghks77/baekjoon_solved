import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Exception

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    while (true) {
        val (a, b) = r.readLine()!!.split(" ").map { it.toIntOrNull() }
        w.write((a!!.plus(b!!)).toString() + "\n")
    }
    w.close()
}