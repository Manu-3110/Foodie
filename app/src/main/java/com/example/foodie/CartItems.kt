package com.example.foodie

class CartItems {
    package com.example.cakepalace

    import androidx.room.Entity
    import androidx.room.PrimaryKey


    @Entity (tableName= "Products")
    class CartItems(
        @PrimaryKey(autoGenerate = true)
        val id: Long=0,
        val cost:Int,
        val quantity:Int,
        val name:String
    )
}