fun calculDegatArme(nbDes:Int,nbFaces:Int,bonusqualité:Int,seuilcritique:Int,multiplicateurcritique:Int){
    var degat=lanceDes(nbDes,nbFaces)
    if (degat >= seuilcritique) {
        degat = degat * multiplicateurcritique
    }
    degat+ bonusqualité


fun main() {
    print(calculDegatArme(8,9,5,4,7))
}

}