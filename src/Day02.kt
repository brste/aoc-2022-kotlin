fun main() {
    val pointsByShape = mapOf("X" to 1, "Y" to 2, "Z" to 3)
    val leftBeatsRight = mapOf("Y" to "A", "X" to "C", "Z" to "B")
    val draw = mapOf("X" to "A", "Y" to "B", "Z" to "C")

    fun String.beats(other: String): Boolean = other == leftBeatsRight[this]

    fun String.draw(other: String): Boolean = other == draw[this]


    fun part1(input: List<String>): Int {
        return input
            .map { it.split(" ") }
            .sumOf { (other, me) ->
                when {
                    me.beats(other) -> 6 + pointsByShape[me]!!
                    me.draw(other) ->  3 + pointsByShape[me]!!
                    else -> 0 + pointsByShape[me]!!
                }
            }
    }

    fun part2(input: List<String>): Int {
        return 0
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    check(part1(testInput) == 15)

    val input = readInput("Day02")
    part1(input).println()
    part2(input).println()
}
