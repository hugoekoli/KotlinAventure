fun attaque(pvcible: Int, degatarme: Int, defensetotal: Int): Int{
    var arme = degatarme
    if (arme > 0) {
        arme = 0
    }
    var pvcible = pvcible - arme
    if (arme > 0){
        arme = 0
    }
    println("$pvcible attaque $pvcible pour $degatarme")
}