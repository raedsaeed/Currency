package com.raed.currency.data.models


import com.google.gson.annotations.SerializedName

data class LatestResponse(
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
        var uSDAED: Float = 0f

        @SerializedName("USDAFN")
        var uSDAFN: Float = 0f

        @SerializedName("USDALL")
        var uSDALL: Float = 0f

        @SerializedName("USDAMD")
        var uSDAMD: Float = 0f

        @SerializedName("USDANG")
        var uSDANG: Float = 0f

        @SerializedName("USDAOA")
        var uSDAOA: Float = 0f

        @SerializedName("USDARS")
        var uSDARS: Float = 0f

        @SerializedName("USDAUD")
        var uSDAUD: Float = 0f

        @SerializedName("USDAWG")
        var uSDAWG: Float = 0f

        @SerializedName("USDAZN")
        var uSDAZN: Float = 0f

        @SerializedName("USDBAM")
        var uSDBAM: Float = 0f

        @SerializedName("USDBBD")
        var uSDBBD: Float = 0f

        @SerializedName("USDBDT")
        var uSDBDT: Float = 0f

        @SerializedName("USDBGN")
        var uSDBGN: Float = 0f

        @SerializedName("USDBHD")
        var uSDBHD: Float = 0f

        @SerializedName("USDBIF")
        var uSDBIF: Float = 0f

        @SerializedName("USDBMD")
        var uSDBMD: Float = 0f

        @SerializedName("USDBND")
        var uSDBND: Float = 0f

        @SerializedName("USDBOB")
        var uSDBOB: Float = 0f

        @SerializedName("USDBRL")
        var uSDBRL: Float = 0f

        @SerializedName("USDBSD")
        var uSDBSD: Float = 0f

        @SerializedName("USDBTC")
        var uSDBTC: Float = 0f

        @SerializedName("USDBTN")
        var uSDBTN: Float = 0f

        @SerializedName("USDBWP")
        var uSDBWP: Float = 0f

        @SerializedName("USDBYN")
        var uSDBYN: Float = 0f

        @SerializedName("USDBYR")
        var uSDBYR: Float = 0f

        @SerializedName("USDBZD")
        var uSDBZD: Float = 0f

        @SerializedName("USDCAD")
        var uSDCAD: Float = 0f

        @SerializedName("USDCDF")
        var uSDCDF: Float = 0f

        @SerializedName("USDCHF")
        var uSDCHF: Float = 0f

        @SerializedName("USDCLF")
        var uSDCLF: Float = 0f

        @SerializedName("USDCLP")
        var uSDCLP: Float = 0f

        @SerializedName("USDCNY")
        var uSDCNY: Float = 0f

        @SerializedName("USDCOP")
        var uSDCOP: Float = 0f

        @SerializedName("USDCRC")
        var uSDCRC: Float = 0f

        @SerializedName("USDCUC")
        var uSDCUC: Float = 0f

        @SerializedName("USDCUP")
        var uSDCUP: Float = 0f

        @SerializedName("USDCVE")
        var uSDCVE: Float = 0f

        @SerializedName("USDCZK")
        var uSDCZK: Float = 0f

        @SerializedName("USDDJF")
        var uSDDJF: Float = 0f

        @SerializedName("USDDKK")
        var uSDDKK: Float = 0f

        @SerializedName("USDDOP")
        var uSDDOP: Float = 0f

        @SerializedName("USDDZD")
        var uSDDZD: Float = 0f

        @SerializedName("USDEGP")
        var uSDEGP: Float = 0f

        @SerializedName("USDERN")
        var uSDERN: Float = 0f

        @SerializedName("USDETB")
        var uSDETB: Float = 0f

        @SerializedName("USDEUR")
        var uSDEUR: Float = 0f

        @SerializedName("USDFJD")
        var uSDFJD: Float = 0f

        @SerializedName("USDFKP")
        var uSDFKP: Float = 0f

        @SerializedName("USDGBP")
        var uSDGBP: Float = 0f

        @SerializedName("USDGEL")
        var uSDGEL: Float = 0f

        @SerializedName("USDGGP")
        var uSDGGP: Float = 0f

        @SerializedName("USDGHS")
        var uSDGHS: Float = 0f

        @SerializedName("USDGIP")
        var uSDGIP: Float = 0f

        @SerializedName("USDGMD")
        var uSDGMD: Float = 0f

        @SerializedName("USDGNF")
        var uSDGNF: Float = 0f

        @SerializedName("USDGTQ")
        var uSDGTQ: Float = 0f

        @SerializedName("USDGYD")
        var uSDGYD: Float = 0f

        @SerializedName("USDHKD")
        var uSDHKD: Float = 0f

        @SerializedName("USDHNL")
        var uSDHNL: Float = 0f

        @SerializedName("USDHRK")
        var uSDHRK: Float = 0f

        @SerializedName("USDHTG")
        var uSDHTG: Float = 0f

        @SerializedName("USDHUF")
        var uSDHUF: Float = 0f

        @SerializedName("USDIDR")
        var uSDIDR: Float = 0f

        @SerializedName("USDILS")
        var uSDILS: Float = 0f

        @SerializedName("USDIMP")
        var uSDIMP: Float = 0f

        @SerializedName("USDINR")
        var uSDINR: Float = 0f

        @SerializedName("USDIQD")
        var uSDIQD: Float = 0f

        @SerializedName("USDIRR")
        var uSDIRR: Float = 0f

        @SerializedName("USDISK")
        var uSDISK: Float = 0f

        @SerializedName("USDJEP")
        var uSDJEP: Float = 0f

        @SerializedName("USDJMD")
        var uSDJMD: Float = 0f

        @SerializedName("USDJOD")
        var uSDJOD: Float = 0f

        @SerializedName("USDJPY")
        var uSDJPY: Float = 0f

        @SerializedName("USDKES")
        var uSDKES: Float = 0f

        @SerializedName("USDKGS")
        var uSDKGS: Float = 0f

        @SerializedName("USDKHR")
        var uSDKHR: Float = 0f

        @SerializedName("USDKMF")
        var uSDKMF: Float = 0f

        @SerializedName("USDKPW")
        var uSDKPW: Float = 0f

        @SerializedName("USDKRW")
        var uSDKRW: Float = 0f

        @SerializedName("USDKWD")
        var uSDKWD: Float = 0f

        @SerializedName("USDKYD")
        var uSDKYD: Float = 0f

        @SerializedName("USDKZT")
        var uSDKZT: Float = 0f

        @SerializedName("USDLAK")
        var uSDLAK: Float = 0f

        @SerializedName("USDLBP")
        var uSDLBP: Float = 0f

        @SerializedName("USDLKR")
        var uSDLKR: Float = 0f

        @SerializedName("USDLRD")
        var uSDLRD: Float = 0f

        @SerializedName("USDLSL")
        var uSDLSL: Float = 0f

        @SerializedName("USDLTL")
        var uSDLTL: Float = 0f

        @SerializedName("USDLVL")
        var uSDLVL: Float = 0f

        @SerializedName("USDLYD")
        var uSDLYD: Float = 0f

        @SerializedName("USDMAD")
        var uSDMAD: Float = 0f

        @SerializedName("USDMDL")
        var uSDMDL: Float = 0f

        @SerializedName("USDMGA")
        var uSDMGA: Float = 0f

        @SerializedName("USDMKD")
        var uSDMKD: Float = 0f

        @SerializedName("USDMMK")
        var uSDMMK: Float = 0f

        @SerializedName("USDMNT")
        var uSDMNT: Float = 0f

        @SerializedName("USDMOP")
        var uSDMOP: Float = 0f

        @SerializedName("USDMRO")
        var uSDMRO: Float = 0f

        @SerializedName("USDMUR")
        var uSDMUR: Float = 0f

        @SerializedName("USDMVR")
        var uSDMVR: Float = 0f

        @SerializedName("USDMWK")
        var uSDMWK: Float = 0f

        @SerializedName("USDMXN")
        var uSDMXN: Float = 0f

        @SerializedName("USDMYR")
        var uSDMYR: Float = 0f

        @SerializedName("USDMZN")
        var uSDMZN: Float = 0f

        @SerializedName("USDNAD")
        var uSDNAD: Float = 0f

        @SerializedName("USDNGN")
        var uSDNGN: Float = 0f

        @SerializedName("USDNIO")
        var uSDNIO: Float = 0f

        @SerializedName("USDNOK")
        var uSDNOK: Float = 0f

        @SerializedName("USDNPR")
        var uSDNPR: Float = 0f

        @SerializedName("USDNZD")
        var uSDNZD: Float = 0f

        @SerializedName("USDOMR")
        var uSDOMR: Float = 0f

        @SerializedName("USDPAB")
        var uSDPAB: Float = 0f

        @SerializedName("USDPEN")
        var uSDPEN: Float = 0f

        @SerializedName("USDPGK")
        var uSDPGK: Float = 0f

        @SerializedName("USDPHP")
        var uSDPHP: Float = 0f

        @SerializedName("USDPKR")
        var uSDPKR: Float = 0f

        @SerializedName("USDPLN")
        var uSDPLN: Float = 0f

        @SerializedName("USDPYG")
        var uSDPYG: Float = 0f

        @SerializedName("USDQAR")
        var uSDQAR: Float = 0f

        @SerializedName("USDRON")
        var uSDRON: Float = 0f

        @SerializedName("USDRSD")
        var uSDRSD: Float = 0f

        @SerializedName("USDRUB")
        var uSDRUB: Float = 0f

        @SerializedName("USDRWF")
        var uSDRWF: Float = 0f

        @SerializedName("USDSAR")
        var uSDSAR: Float = 0f

        @SerializedName("USDSBD")
        var uSDSBD: Float = 0f

        @SerializedName("USDSCR")
        var uSDSCR: Float = 0f

        @SerializedName("USDSDG")
        var uSDSDG: Float = 0f

        @SerializedName("USDSEK")
        var uSDSEK: Float = 0f

        @SerializedName("USDSGD")
        var uSDSGD: Float = 0f

        @SerializedName("USDSHP")
        var uSDSHP: Float = 0f

        @SerializedName("USDSLL")
        var uSDSLL: Float = 0f

        @SerializedName("USDSOS")
        var uSDSOS: Float = 0f

        @SerializedName("USDSRD")
        var uSDSRD: Float = 0f

        @SerializedName("USDSTD")
        var uSDSTD: Float = 0f

        @SerializedName("USDSVC")
        var uSDSVC: Float = 0f

        @SerializedName("USDSYP")
        var uSDSYP: Float = 0f

        @SerializedName("USDSZL")
        var uSDSZL: Float = 0f

        @SerializedName("USDTHB")
        var uSDTHB: Float = 0f

        @SerializedName("USDTJS")
        var uSDTJS: Float = 0f

        @SerializedName("USDTMT")
        var uSDTMT: Float = 0f

        @SerializedName("USDTND")
        var uSDTND: Float = 0f

        @SerializedName("USDTOP")
        var uSDTOP: Float = 0f

        @SerializedName("USDTRY")
        var uSDTRY: Float = 0f

        @SerializedName("USDTTD")
        var uSDTTD: Float = 0f

        @SerializedName("USDTWD")
        var uSDTWD: Float = 0f

        @SerializedName("USDTZS")
        var uSDTZS: Float = 0f

        @SerializedName("USDUAH")
        var uSDUAH: Float = 0f

        @SerializedName("USDUGX")
        var uSDUGX: Float = 0f

        @SerializedName("USDUSD")
        var uSDUSD: Float = 0f

        @SerializedName("USDUYU")
        var uSDUYU: Float = 0f

        @SerializedName("USDUZS")
        var uSDUZS: Float = 0f

        @SerializedName("USDVEF")
        var uSDVEF: Float = 0f

        @SerializedName("USDVND")
        var uSDVND: Float = 0f

        @SerializedName("USDVUV")
        var uSDVUV: Float = 0f

        @SerializedName("USDWST")
        var uSDWST: Float = 0f

        @SerializedName("USDXAF")
        var uSDXAF: Float = 0f

        @SerializedName("USDXAG")
        var uSDXAG: Float = 0f

        @SerializedName("USDXAU")
        var uSDXAU: Float = 0f

        @SerializedName("USDXCD")
        var uSDXCD: Float = 0f

        @SerializedName("USDXDR")
        var uSDXDR: Float = 0f

        @SerializedName("USDXOF")
        var uSDXOF: Float = 0f

        @SerializedName("USDXPF")
        var uSDXPF: Float = 0f

        @SerializedName("USDYER")
        var uSDYER: Float = 0f

        @SerializedName("USDZAR")
        var uSDZAR: Float = 0f

        @SerializedName("USDZMK")
        var uSDZMK: Float = 0f

        @SerializedName("USDZMW")
        var uSDZMW: Float = 0f

        @SerializedName("USDZWL")
        var uSDZWL: Float = 0f
    }
}