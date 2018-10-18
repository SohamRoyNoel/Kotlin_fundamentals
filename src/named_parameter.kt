fun main(args: Array<String>){
    // General Call
   vols(10,10,10)

    // Named Parameter - Should be same as defined in the function
    vols(wid = 15, hgt = 2, len = 50)
}


fun vols(len:Int=1, wid:Int=1, hgt:Int=1){
    println("Length : ${len}")
    println("Width : ${wid}")
    println("Height : ${hgt}")
}