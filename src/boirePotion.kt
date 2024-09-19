fun boirePotion(pvcible: Int, pvmaxcible: Int, puissancepotion: Int): Int{
    var nouvpvcible = puissancepotion + pvcible
    if (nouvpvcible > pvmaxcible) {
        nouvpvcible = pvmaxcible
    }
    var soin = nouvpvcible - pvcible
    println("$nouvpvcible boit une potion est récupere $pvmaxcible")
}