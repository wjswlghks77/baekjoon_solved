import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val t = r.readLine().toInt()
    for (i in 0 until t) {
        val (a, b) = r.readLine()!!.split(" ").map { it.toInt() }
        w.write((a + b).toString() + "\n")
    }
    w.close()
}