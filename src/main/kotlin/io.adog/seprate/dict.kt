package io.adog.seprate



public fun dict(mode: dynamic){
    println(mode);
}

public fun swapeAll(seprated: dynamic): Array<dynamic>{
    var re = js("[]");
    for(i in seprated){
        var b = swape(i.p);
        js("re.push({w:i.w,p:b})");
    }
    return re;
}

public fun swape(postag: Int): String{
    var re: String;
    when {
        postag == 0x40000000 -> re = "adj" // 形容词 形语素
        postag == 0x20000000 -> re = "dif" // 区别词 区别语素
        postag == 0x10000000 -> re = "con" // 连词 连语素
        postag == 0x08000000 -> re = "adv" // 副词 副语素
        postag == 0x04000000 -> re = "omg" // 叹词 叹语素
        postag == 0x02000000 -> re = "dir" // 方位词 方位语素
        postag == 0x01000000 -> re = "lon" // 成语
        postag == 0x00800000 -> re = "feq" // 习语
        postag == 0x00400000 -> re = "num" // 数词 数语素
        postag == 0x00200000 -> re = "nuw" // 数量词
        postag == 0x00100000 -> re = "n"   // 名词 名语素
        postag == 0x00080000 -> re = "snd" // 拟声词
        postag == 0x00040000 -> re = "use" // 介词
        postag == 0x00020000 -> re = "nun" // 量词 量语素
        postag == 0x00010000 -> re = "rep" // 代词 代语素
        postag == 0x00008000 -> re = "loc" // 处所词
        postag == 0x00004000 -> re = "tim" // 时间词
        postag == 0x00002000 -> re = "hlp" // 助词 助语素
        postag == 0x00001000 -> re = "v"   // 动词 动语素
        postag == 0x00000800 -> re = "com" // 标点符号
        postag == 0x00000400 -> re = "prt" // 非语素字
        postag == 0x00000200 -> re = "nah" // 语气词 语气语素
        postag == 0x00000100 -> re = "buf" // 状态词
        postag == 0x00000080 -> re = "nam" // 人名
        postag == 0x00000040 -> re = "plc" // 地名
        postag == 0x00000020 -> re = "org" // 机构团体
        postag == 0x00000010 -> re = "eng" // 外文字符
        postag == 0x00000008 -> re = "otr" // 其他专名
        postag == 0x00000004 -> re = "fnt" // 前接成分
        postag == 0x00000002 -> re = "bhd" // 后接成分
        postag == 0x00000000 -> re = "nul" // 未知词性
        postag == 0x00000001 -> re = "url" // 网址、邮箱地址
        else -> re = "NAN"
    }
    return re;
}