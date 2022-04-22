package com.raed.currency.data.models


import com.google.gson.annotations.SerializedName

data class CurrencyResponse(
    @SerializedName("date")
    var date: String = "",
    @SerializedName("historical")
    var historical: Boolean = false,
    @SerializedName("privacy")
    var privacy: String = "",
    @SerializedName("quotes")
    var quotes: Quotes = Quotes(),
    @SerializedName("source")
    var source: String = "",
    @SerializedName("success")
    var success: Boolean = false,
    @SerializedName("terms")
    var terms: String = "",
    @SerializedName("timestamp")
    var timestamp: Int = 0
) {
    class Quotes {
        @SerializedName("USDAED")
        var USDAED: Float = 0f

        @SerializedName("USDAFN")
        var USDAFN: Float = 0f

        @SerializedName("USDALL")
        var USDALL: Float = 0f

        @SerializedName("USDAMD")
        var USDAMD: Float = 0f

        @SerializedName("USDANG")
        var USDANG: Float = 0f

        @SerializedName("USDAOA")
        var USDAOA: Float = 0f

        @SerializedName("USDARS")
        var USDARS: Float = 0f

        @SerializedName("USDAUD")
        var USDAUD: Float = 0f

        @SerializedName("USDAWG")
        var USDAWG: Float = 0f

        @SerializedName("USDAZN")
        var USDAZN: Float = 0f

        @SerializedName("USDBAM")
        var USDBAM: Float = 0f

        @SerializedName("USDBBD")
        var USDBBD: Float = 0f

        @SerializedName("USDBDT")
        var USDBDT: Float = 0f

        @SerializedName("USDBGN")
        var USDBGN: Float = 0f

        @SerializedName("USDBHD")
        var USDBHD: Float = 0f

        @SerializedName("USDBIF")
        var USDBIF: Float = 0f

        @SerializedName("USDBMD")
        var USDBMD: Float = 0f

        @SerializedName("USDBND")
        var USDBND: Float = 0f

        @SerializedName("USDBOB")
        var USDBOB: Float = 0f

        @SerializedName("USDBRL")
        var USDBRL: Float = 0f

        @SerializedName("USDBSD")
        var USDBSD: Float = 0f

        @SerializedName("USDBTC")
        var USDBTC: Float = 0f

        @SerializedName("USDBTN")
        var USDBTN: Float = 0f

        @SerializedName("USDBWP")
        var USDBWP: Float = 0f

        @SerializedName("USDBYN")
        var USDBYN: Float = 0f

        @SerializedName("USDBYR")
        var USDBYR: Float = 0f

        @SerializedName("USDBZD")
        var USDBZD: Float = 0f

        @SerializedName("USDCAD")
        var USDCAD: Float = 0f

        @SerializedName("USDCDF")
        var USDCDF: Float = 0f

        @SerializedName("USDCHF")
        var USDCHF: Float = 0f

        @SerializedName("USDCLF")
        var USDCLF: Float = 0f

        @SerializedName("USDCLP")
        var USDCLP: Float = 0f

        @SerializedName("USDCNY")
        var USDCNY: Float = 0f

        @SerializedName("USDCOP")
        var USDCOP: Float = 0f

        @SerializedName("USDCRC")
        var USDCRC: Float = 0f

        @SerializedName("USDCUC")
        var USDCUC: Float = 0f

        @SerializedName("USDCUP")
        var USDCUP: Float = 0f

        @SerializedName("USDCVE")
        var USDCVE: Float = 0f

        @SerializedName("USDCZK")
        var USDCZK: Float = 0f

        @SerializedName("USDDJF")
        var USDDJF: Float = 0f

        @SerializedName("USDDKK")
        var USDDKK: Float = 0f

        @SerializedName("USDDOP")
        var USDDOP: Float = 0f

        @SerializedName("USDDZD")
        var USDDZD: Float = 0f

        @SerializedName("USDEGP")
        var USDEGP: Float = 0f

        @SerializedName("USDERN")
        var USDERN: Float = 0f

        @SerializedName("USDETB")
        var USDETB: Float = 0f

        @SerializedName("USDEUR")
        var USDEUR: Float = 0f

        @SerializedName("USDFJD")
        var USDFJD: Float = 0f

        @SerializedName("USDFKP")
        var USDFKP: Float = 0f

        @SerializedName("USDGBP")
        var USDGBP: Float = 0f

        @SerializedName("USDGEL")
        var USDGEL: Float = 0f

        @SerializedName("USDGGP")
        var USDGGP: Float = 0f

        @SerializedName("USDGHS")
        var USDGHS: Float = 0f

        @SerializedName("USDGIP")
        var USDGIP: Float = 0f

        @SerializedName("USDGMD")
        var USDGMD: Float = 0f

        @SerializedName("USDGNF")
        var USDGNF: Float = 0f

        @SerializedName("USDGTQ")
        var USDGTQ: Float = 0f

        @SerializedName("USDGYD")
        var USDGYD: Float = 0f

        @SerializedName("USDHKD")
        var USDHKD: Float = 0f

        @SerializedName("USDHNL")
        var USDHNL: Float = 0f

        @SerializedName("USDHRK")
        var USDHRK: Float = 0f

        @SerializedName("USDHTG")
        var USDHTG: Float = 0f

        @SerializedName("USDHUF")
        var USDHUF: Float = 0f

        @SerializedName("USDIDR")
        var USDIDR: Float = 0f

        @SerializedName("USDILS")
        var USDILS: Float = 0f

        @SerializedName("USDIMP")
        var USDIMP: Float = 0f

        @SerializedName("USDINR")
        var USDINR: Float = 0f

        @SerializedName("USDIQD")
        var USDIQD: Float = 0f

        @SerializedName("USDIRR")
        var USDIRR: Float = 0f

        @SerializedName("USDISK")
        var USDISK: Float = 0f

        @SerializedName("USDJEP")
        var USDJEP: Float = 0f

        @SerializedName("USDJMD")
        var USDJMD: Float = 0f

        @SerializedName("USDJOD")
        var USDJOD: Float = 0f

        @SerializedName("USDJPY")
        var USDJPY: Float = 0f

        @SerializedName("USDKES")
        var USDKES: Float = 0f

        @SerializedName("USDKGS")
        var USDKGS: Float = 0f

        @SerializedName("USDKHR")
        var USDKHR: Float = 0f

        @SerializedName("USDKMF")
        var USDKMF: Float = 0f

        @SerializedName("USDKPW")
        var USDKPW: Float = 0f

        @SerializedName("USDKRW")
        var USDKRW: Float = 0f

        @SerializedName("USDKWD")
        var USDKWD: Float = 0f

        @SerializedName("USDKYD")
        var USDKYD: Float = 0f

        @SerializedName("USDKZT")
        var USDKZT: Float = 0f

        @SerializedName("USDLAK")
        var USDLAK: Float = 0f

        @SerializedName("USDLBP")
        var USDLBP: Float = 0f

        @SerializedName("USDLKR")
        var USDLKR: Float = 0f

        @SerializedName("USDLRD")
        var USDLRD: Float = 0f

        @SerializedName("USDLSL")
        var USDLSL: Float = 0f

        @SerializedName("USDLTL")
        var USDLTL: Float = 0f

        @SerializedName("USDLVL")
        var USDLVL: Float = 0f

        @SerializedName("USDLYD")
        var USDLYD: Float = 0f

        @SerializedName("USDMAD")
        var USDMAD: Float = 0f

        @SerializedName("USDMDL")
        var USDMDL: Float = 0f

        @SerializedName("USDMGA")
        var USDMGA: Float = 0f

        @SerializedName("USDMKD")
        var USDMKD: Float = 0f

        @SerializedName("USDMMK")
        var USDMMK: Float = 0f

        @SerializedName("USDMNT")
        var USDMNT: Float = 0f

        @SerializedName("USDMOP")
        var USDMOP: Float = 0f

        @SerializedName("USDMRO")
        var USDMRO: Float = 0f

        @SerializedName("USDMUR")
        var USDMUR: Float = 0f

        @SerializedName("USDMVR")
        var USDMVR: Float = 0f

        @SerializedName("USDMWK")
        var USDMWK: Float = 0f

        @SerializedName("USDMXN")
        var USDMXN: Float = 0f

        @SerializedName("USDMYR")
        var USDMYR: Float = 0f

        @SerializedName("USDMZN")
        var USDMZN: Float = 0f

        @SerializedName("USDNAD")
        var USDNAD: Float = 0f

        @SerializedName("USDNGN")
        var USDNGN: Float = 0f

        @SerializedName("USDNIO")
        var USDNIO: Float = 0f

        @SerializedName("USDNOK")
        var USDNOK: Float = 0f

        @SerializedName("USDNPR")
        var USDNPR: Float = 0f

        @SerializedName("USDNZD")
        var USDNZD: Float = 0f

        @SerializedName("USDOMR")
        var USDOMR: Float = 0f

        @SerializedName("USDPAB")
        var USDPAB: Float = 0f

        @SerializedName("USDPEN")
        var USDPEN: Float = 0f

        @SerializedName("USDPGK")
        var USDPGK: Float = 0f

        @SerializedName("USDPHP")
        var USDPHP: Float = 0f

        @SerializedName("USDPKR")
        var USDPKR: Float = 0f

        @SerializedName("USDPLN")
        var USDPLN: Float = 0f

        @SerializedName("USDPYG")
        var USDPYG: Float = 0f

        @SerializedName("USDQAR")
        var USDQAR: Float = 0f

        @SerializedName("USDRON")
        var USDRON: Float = 0f

        @SerializedName("USDRSD")
        var USDRSD: Float = 0f

        @SerializedName("USDRUB")
        var USDRUB: Float = 0f

        @SerializedName("USDRWF")
        var USDRWF: Float = 0f

        @SerializedName("USDSAR")
        var USDSAR: Float = 0f

        @SerializedName("USDSBD")
        var USDSBD: Float = 0f

        @SerializedName("USDSCR")
        var USDSCR: Float = 0f

        @SerializedName("USDSDG")
        var USDSDG: Float = 0f

        @SerializedName("USDSEK")
        var USDSEK: Float = 0f

        @SerializedName("USDSGD")
        var USDSGD: Float = 0f

        @SerializedName("USDSHP")
        var USDSHP: Float = 0f

        @SerializedName("USDSLL")
        var USDSLL: Float = 0f

        @SerializedName("USDSOS")
        var USDSOS: Float = 0f

        @SerializedName("USDSRD")
        var USDSRD: Float = 0f

        @SerializedName("USDSTD")
        var USDSTD: Float = 0f

        @SerializedName("USDSVC")
        var USDSVC: Float = 0f

        @SerializedName("USDSYP")
        var USDSYP: Float = 0f

        @SerializedName("USDSZL")
        var USDSZL: Float = 0f

        @SerializedName("USDTHB")
        var USDTHB: Float = 0f

        @SerializedName("USDTJS")
        var USDTJS: Float = 0f

        @SerializedName("USDTMT")
        var USDTMT: Float = 0f

        @SerializedName("USDTND")
        var USDTND: Float = 0f

        @SerializedName("USDTOP")
        var USDTOP: Float = 0f

        @SerializedName("USDTRY")
        var USDTRY: Float = 0f

        @SerializedName("USDTTD")
        var USDTTD: Float = 0f

        @SerializedName("USDTWD")
        var USDTWD: Float = 0f

        @SerializedName("USDTZS")
        var USDTZS: Float = 0f

        @SerializedName("USDUAH")
        var USDUAH: Float = 0f

        @SerializedName("USDUGX")
        var USDUGX: Float = 0f

        @SerializedName("USDUSD")
        var USDUSD: Float = 0f

        @SerializedName("USDUYU")
        var USDUYU: Float = 0f

        @SerializedName("USDUZS")
        var USDUZS: Float = 0f

        @SerializedName("USDVEF")
        var USDVEF: Float = 0f

        @SerializedName("USDVND")
        var USDVND: Float = 0f

        @SerializedName("USDVUV")
        var USDVUV: Float = 0f

        @SerializedName("USDWST")
        var USDWST: Float = 0f

        @SerializedName("USDXAF")
        var USDXAF: Float = 0f

        @SerializedName("USDXAG")
        var USDXAG: Float = 0f

        @SerializedName("USDXAU")
        var USDXAU: Float = 0f

        @SerializedName("USDXCD")
        var USDXCD: Float = 0f

        @SerializedName("USDXDR")
        var USDXDR: Float = 0f

        @SerializedName("USDXOF")
        var USDXOF: Float = 0f

        @SerializedName("USDXPF")
        var USDXPF: Float = 0f

        @SerializedName("USDYER")
        var USDYER: Float = 0f

        @SerializedName("USDZAR")
        var USDZAR: Float = 0f

        @SerializedName("USDZMK")
        var USDZMK: Float = 0f

        @SerializedName("USDZMW")
        var USDZMW: Float = 0f

        @SerializedName("USDZWL")
        var USDZWL: Float = 0f
    }
}