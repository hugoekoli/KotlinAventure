
fun calculDefenseTotal(défense: Int, armure: Int, qualité: Int): Int {
    var score = défense + armure + qualité
    return score
}
fun main() {
    println(calculDefenseTotal(6,4,6))

}