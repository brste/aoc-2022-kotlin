fun main() {
    fun topK(input: List<String>, k: Int) : List<Int> {
        val caloriesOfElves = mutableListOf<Int>()
        var sum = 0
        for (line in input) {
            if (line.isBlank()) {
                caloriesOfElves.add(sum)
                sum = 0
            } else {
                sum += line.toInt()
            }
        }
        // empty line at the end -> we don't need to do a last caloriesOfElves.ad(sum)

        return caloriesOfElves.sortedDescending().take(k)
    }

    fun part1(input: List<String>): Int = topK(input, 1).first()

    fun part2(input: List<String>): Int = topK(input, 3).sum()

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 24000)

    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
