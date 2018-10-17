fun main(args: Array<String>){
    var area_of_cube = vol(10,10,10)
    var area_of_rect = vol(10,15)

    println("Cube : ${area_of_cube}")
    println("Rect : ${area_of_rect}")
}

@JvmOverloads
fun vol(len:Int=1, wid:Int=1, hgt:Int=1):Int{
    return len*wid*hgt;
}