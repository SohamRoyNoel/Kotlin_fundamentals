import com.dom.constClassic
import com.dom.seperateClass

fun main(args:Array<String>){
    var names = seperateClass()
    names.sepname = "Domics"
    names.printer();

    // Trying Constructor
    var const = constClassic("Maria");
    const.dispConst()
}