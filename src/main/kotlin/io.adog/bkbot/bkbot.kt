package io.adog.bkbot
import io.adog.seprate.*

class bkbot(){
    val sep: seprate;
    init{
        this.sep = seprate();
    }

    public fun run(){
        console.log(this.sep.a("翁爷的鸡至少七万5千四百二十八厘米"));
    }
}