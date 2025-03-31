package com.example.myapplication

/*fun main() {
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(2, 3, 4)
    val list3 = list1.union(list2)
    print(list3)



    val list4 = mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    print(list4.skip())

}

fun List<Int>.skip(n : Int=2): List<Int> {
    return this.filterIndexed{index, _ -> index % n == 0}
}*/

open class BCSDLabUser(
    val name: String
    )

class BCSDLab_Beginner(
    name: String,
    var task: Int,
    ) : BCSDLabUser(name)

class BCSDLab_Regular(
    name: String,
    val pay: String,
    ): BCSDLabUser(name)

class BCSDLab_Mentor(
    name: String,
    val email: String?,
    ): BCSDLabUser(name)

fun main() {
    val ys = BCSDLab_Beginner("김영수", 0)
    val bg = BCSDLab_Beginner("양비긴", 3)
    println(ys.name)
    println(ys.task)
    println(bg.name)
    println(bg.task)

    val wj = BCSDLab_Regular("공우진", "O")
    val rg = BCSDLab_Regular("레귤러", "X")
    println(wj.name)
    println(wj.pay)
    println(rg.name)
    println(rg.pay)

    val mt = BCSDLab_Mentor("멘토", null)
    val ymt = BCSDLab_Mentor("양멘토",null)
    println(mt.name)
    println(mt.email)
    println(ymt.name)
    println(ymt.email)

    val BCSD: List<BCSDLabUser> = listOf(ys, bg, wj, rg, mt, ymt)

    /*d*/val all_beginner = BCSD.filterIsInstance<BCSDLab_Beginner>()
    println("모든 비기너 목록 : "+ all_beginner.map{it.name})
    /*e*/val task_3_begginer = all_beginner.filter { it.task >= 3 }
    println("과제를 3회 이상 수행하지 않은 비기너 목록 : "+task_3_begginer.map{it.name})

    val all_regular = BCSD.filterIsInstance<BCSDLab_Regular>()
    /*f*/val not_pay = all_regular.filter { it.pay == "X" }
    println("이번달 회비를 내지 않은 레귤러 목록 : "+ all_regular.map{it.name})

    /*g*/val firstname = BCSD.filter { it.name.startsWith("양") }
    println("성이 양씨인 사람 목록 : "+ firstname)
}