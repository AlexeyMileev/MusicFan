package ru.netology

val amount : Int = 15_000 //Сумма покупки
val customerVip = true // Постоянный покупатель
val discount_1 = 100 // Сумма скидки в руб.
val discount_2 = 0.95 // Скидка 5%
val discountVip = 0.99 // Скидка 1% для постоянных покупателей
// totalAmount - итоговая сумма

fun main() {
     val totalAmount : Int = if(amount in 1_001..10_000 && !customerVip) {
        amount - discount_1
    } else if(amount in 1_001..10_000 && customerVip) {
         ((amount - discount_1) * discountVip).toInt()
    } else if(amount > 10_000 && !customerVip) {
         (amount * discount_2).toInt()
    } else if(amount > 10_000 && customerVip) {
         ((amount * discount_2) * discountVip).toInt()
    } else {
        amount
    }
    println("Стоимость покупки составляет $totalAmount руб.")

}