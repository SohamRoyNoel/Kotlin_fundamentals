/*
        fun main(args: Array<String>){
            for (i in 1..3){
                for(j in 1..3){
                    if (j == 2){
                        break
                    }
                    println("$i $j")
                }
            }
        }
*/
/*
* 1 1
* 2 1
* 3 1
* */

// ANNOTATION can be any name EX: dish

/*
            fun main(args: Array<String>){
                dish@ for (i in 1..3){
                    for(j in 1..3){
                        if (j == 2){
                            break@dish // use annotation to say BREAK ONLY THE FIRST LOOP Not SECOND
                        }
                        println("$i $j")
                    }
                }
            }
*/
/*
* 1 1
*/

// Continue : skips the work and continues from beginning
/*
            fun main(args: Array<String>){
                for (i in 1..5){
                    if (i == 2){
                        continue
                    }
                    println("$i")
                }
            }
*/
/*1 3 4 5*/
fun main(args: Array<String>){
    for (i in 1..3){
        for(j in 1..3){
            if (j == 2){
                continue
            }
            println("$i $j")
        }
    }
}

/*
    1 1
    1 2
    1 3
    2 1
    2 2
    2 3
    3 1
    3 2
    3 3
* */
// using continue
/*
1 1
1 3
2 1
2 3
3 1
3 3
 */