fun bouledeFeu(lanceursort: Int,cible: Int,attaque: Int, deftotalecible: Int, nbpvcible: Int): Int{
    var nombredegats =  lanceDes(attaque/3,6)
    nombredegats -= deftotalecible
    var pv = nbpvcible
    pv -= nombredegats
    if (pv < 0){
        pv = 0
    }
    println("$lanceursort lance une boule de feu et inflige points de dégâts à $cible")
}