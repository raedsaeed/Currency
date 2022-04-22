
import com.google.gson.annotations.SerializedName

data class LiveResponse(
    @SerializedName("date")
    val date: String = "",
    @SerializedName("historical")
    val historical: Boolean = false,
    @SerializedName("privacy")
    val privacy: String = "",
    @SerializedName("quotes")
    val quotes: Quotes = Quotes(),
    @SerializedName("source")
    val source: String = "",
    @SerializedName("success")
    val success: Boolean = false,
    @SerializedName("terms")
    val terms: String = "",
    @SerializedName("timestamp")
    val timestamp: Int = 0
) {
    data class Quotes(
        @SerializedName("USDAED")
        val uSDAED: Double = 0.0,
        @SerializedName("USDAFN")
        val uSDAFN: Double = 0.0,
        @SerializedName("USDALL")
        val uSDALL: Double = 0.0,
        @SerializedName("USDAMD")
        val uSDAMD: Double = 0.0,
        @SerializedName("USDANG")
        val uSDANG: Double = 0.0,
        @SerializedName("USDAOA")
        val uSDAOA: Double = 0.0,
        @SerializedName("USDARS")
        val uSDARS: Double = 0.0,
        @SerializedName("USDAUD")
        val uSDAUD: Double = 0.0,
        @SerializedName("USDAWG")
        val uSDAWG: Double = 0.0,
        @SerializedName("USDAZN")
        val uSDAZN: Double = 0.0,
        @SerializedName("USDBAM")
        val uSDBAM: Double = 0.0,
        @SerializedName("USDBBD")
        val uSDBBD: Double = 0.0,
        @SerializedName("USDBDT")
        val uSDBDT: Double = 0.0,
        @SerializedName("USDBGN")
        val uSDBGN: Double = 0.0,
        @SerializedName("USDBHD")
        val uSDBHD: Double = 0.0,
        @SerializedName("USDBIF")
        val uSDBIF: Double = 0.0,
        @SerializedName("USDBMD")
        val uSDBMD: Int = 0,
        @SerializedName("USDBND")
        val uSDBND: Double = 0.0,
        @SerializedName("USDBOB")
        val uSDBOB: Double = 0.0,
        @SerializedName("USDBRL")
        val uSDBRL: Double = 0.0,
        @SerializedName("USDBSD")
        val uSDBSD: Double = 0.0,
        @SerializedName("USDBTC")
        val uSDBTC: Double = 0.0,
        @SerializedName("USDBTN")
        val uSDBTN: Double = 0.0,
        @SerializedName("USDBWP")
        val uSDBWP: Double = 0.0,
        @SerializedName("USDBYN")
        val uSDBYN: Double = 0.0,
        @SerializedName("USDBYR")
        val uSDBYR: Int = 0,
        @SerializedName("USDBZD")
        val uSDBZD: Double = 0.0,
        @SerializedName("USDCAD")
        val uSDCAD: Double = 0.0,
        @SerializedName("USDCDF")
        val uSDCDF: Double = 0.0,
        @SerializedName("USDCHF")
        val uSDCHF: Double = 0.0,
        @SerializedName("USDCLF")
        val uSDCLF: Double = 0.0,
        @SerializedName("USDCLP")
        val uSDCLP: Double = 0.0,
        @SerializedName("USDCNY")
        val uSDCNY: Double = 0.0,
        @SerializedName("USDCOP")
        val uSDCOP: Double = 0.0,
        @SerializedName("USDCRC")
        val uSDCRC: Double = 0.0,
        @SerializedName("USDCUC")
        val uSDCUC: Int = 0,
        @SerializedName("USDCUP")
        val uSDCUP: Double = 0.0,
        @SerializedName("USDCVE")
        val uSDCVE: Double = 0.0,
        @SerializedName("USDCZK")
        val uSDCZK: Double = 0.0,
        @SerializedName("USDDJF")
        val uSDDJF: Double = 0.0,
        @SerializedName("USDDKK")
        val uSDDKK: Double = 0.0,
        @SerializedName("USDDOP")
        val uSDDOP: Double = 0.0,
        @SerializedName("USDDZD")
        val uSDDZD: Double = 0.0,
        @SerializedName("USDEGP")
        val uSDEGP: Double = 0.0,
        @SerializedName("USDERN")
        val uSDERN: Double = 0.0,
        @SerializedName("USDETB")
        val uSDETB: Double = 0.0,
        @SerializedName("USDEUR")
        val uSDEUR: Double = 0.0,
        @SerializedName("USDFJD")
        val uSDFJD: Double = 0.0,
        @SerializedName("USDFKP")
        val uSDFKP: Double = 0.0,
        @SerializedName("USDGBP")
        val uSDGBP: Double = 0.0,
        @SerializedName("USDGEL")
        val uSDGEL: Double = 0.0,
        @SerializedName("USDGGP")
        val uSDGGP: Double = 0.0,
        @SerializedName("USDGHS")
        val uSDGHS: Double = 0.0,
        @SerializedName("USDGIP")
        val uSDGIP: Double = 0.0,
        @SerializedName("USDGMD")
        val uSDGMD: Double = 0.0,
        @SerializedName("USDGNF")
        val uSDGNF: Double = 0.0,
        @SerializedName("USDGTQ")
        val uSDGTQ: Double = 0.0,
        @SerializedName("USDGYD")
        val uSDGYD: Double = 0.0,
        @SerializedName("USDHKD")
        val uSDHKD: Double = 0.0,
        @SerializedName("USDHNL")
        val uSDHNL: Double = 0.0,
        @SerializedName("USDHRK")
        val uSDHRK: Double = 0.0,
        @SerializedName("USDHTG")
        val uSDHTG: Double = 0.0,
        @SerializedName("USDHUF")
        val uSDHUF: Double = 0.0,
        @SerializedName("USDIDR")
        val uSDIDR: Double = 0.0,
        @SerializedName("USDILS")
        val uSDILS: Double = 0.0,
        @SerializedName("USDIMP")
        val uSDIMP: Double = 0.0,
        @SerializedName("USDINR")
        val uSDINR: Double = 0.0,
        @SerializedName("USDIQD")
        val uSDIQD: Double = 0.0,
        @SerializedName("USDIRR")
        val uSDIRR: Double = 0.0,
        @SerializedName("USDISK")
        val uSDISK: Double = 0.0,
        @SerializedName("USDJEP")
        val uSDJEP: Double = 0.0,
        @SerializedName("USDJMD")
        val uSDJMD: Double = 0.0,
        @SerializedName("USDJOD")
        val uSDJOD: Double = 0.0,
        @SerializedName("USDJPY")
        val uSDJPY: Double = 0.0,
        @SerializedName("USDKES")
        val uSDKES: Double = 0.0,
        @SerializedName("USDKGS")
        val uSDKGS: Double = 0.0,
        @SerializedName("USDKHR")
        val uSDKHR: Double = 0.0,
        @SerializedName("USDKMF")
        val uSDKMF: Double = 0.0,
        @SerializedName("USDKPW")
        val uSDKPW: Double = 0.0,
        @SerializedName("USDKRW")
        val uSDKRW: Double = 0.0,
        @SerializedName("USDKWD")
        val uSDKWD: Double = 0.0,
        @SerializedName("USDKYD")
        val uSDKYD: Double = 0.0,
        @SerializedName("USDKZT")
        val uSDKZT: Double = 0.0,
        @SerializedName("USDLAK")
        val uSDLAK: Double = 0.0,
        @SerializedName("USDLBP")
        val uSDLBP: Double = 0.0,
        @SerializedName("USDLKR")
        val uSDLKR: Double = 0.0,
        @SerializedName("USDLRD")
        val uSDLRD: Double = 0.0,
        @SerializedName("USDLSL")
        val uSDLSL: Double = 0.0,
        @SerializedName("USDLTL")
        val uSDLTL: Double = 0.0,
        @SerializedName("USDLVL")
        val uSDLVL: Double = 0.0,
        @SerializedName("USDLYD")
        val uSDLYD: Double = 0.0,
        @SerializedName("USDMAD")
        val uSDMAD: Double = 0.0,
        @SerializedName("USDMDL")
        val uSDMDL: Double = 0.0,
        @SerializedName("USDMGA")
        val uSDMGA: Double = 0.0,
        @SerializedName("USDMKD")
        val uSDMKD: Double = 0.0,
        @SerializedName("USDMMK")
        val uSDMMK: Double = 0.0,
        @SerializedName("USDMNT")
        val uSDMNT: Double = 0.0,
        @SerializedName("USDMOP")
        val uSDMOP: Double = 0.0,
        @SerializedName("USDMRO")
        val uSDMRO: Double = 0.0,
        @SerializedName("USDMUR")
        val uSDMUR: Double = 0.0,
        @SerializedName("USDMVR")
        val uSDMVR: Double = 0.0,
        @SerializedName("USDMWK")
        val uSDMWK: Double = 0.0,
        @SerializedName("USDMXN")
        val uSDMXN: Double = 0.0,
        @SerializedName("USDMYR")
        val uSDMYR: Double = 0.0,
        @SerializedName("USDMZN")
        val uSDMZN: Double = 0.0,
        @SerializedName("USDNAD")
        val uSDNAD: Double = 0.0,
        @SerializedName("USDNGN")
        val uSDNGN: Double = 0.0,
        @SerializedName("USDNIO")
        val uSDNIO: Double = 0.0,
        @SerializedName("USDNOK")
        val uSDNOK: Double = 0.0,
        @SerializedName("USDNPR")
        val uSDNPR: Double = 0.0,
        @SerializedName("USDNZD")
        val uSDNZD: Double = 0.0,
        @SerializedName("USDOMR")
        val uSDOMR: Double = 0.0,
        @SerializedName("USDPAB")
        val uSDPAB: Double = 0.0,
        @SerializedName("USDPEN")
        val uSDPEN: Double = 0.0,
        @SerializedName("USDPGK")
        val uSDPGK: Double = 0.0,
        @SerializedName("USDPHP")
        val uSDPHP: Double = 0.0,
        @SerializedName("USDPKR")
        val uSDPKR: Double = 0.0,
        @SerializedName("USDPLN")
        val uSDPLN: Double = 0.0,
        @SerializedName("USDPYG")
        val uSDPYG: Double = 0.0,
        @SerializedName("USDQAR")
        val uSDQAR: Double = 0.0,
        @SerializedName("USDRON")
        val uSDRON: Double = 0.0,
        @SerializedName("USDRSD")
        val uSDRSD: Double = 0.0,
        @SerializedName("USDRUB")
        val uSDRUB: Double = 0.0,
        @SerializedName("USDRWF")
        val uSDRWF: Double = 0.0,
        @SerializedName("USDSAR")
        val uSDSAR: Double = 0.0,
        @SerializedName("USDSBD")
        val uSDSBD: Double = 0.0,
        @SerializedName("USDSCR")
        val uSDSCR: Double = 0.0,
        @SerializedName("USDSDG")
        val uSDSDG: Double = 0.0,
        @SerializedName("USDSEK")
        val uSDSEK: Double = 0.0,
        @SerializedName("USDSGD")
        val uSDSGD: Double = 0.0,
        @SerializedName("USDSHP")
        val uSDSHP: Double = 0.0,
        @SerializedName("USDSLL")
        val uSDSLL: Double = 0.0,
        @SerializedName("USDSOS")
        val uSDSOS: Double = 0.0,
        @SerializedName("USDSRD")
        val uSDSRD: Double = 0.0,
        @SerializedName("USDSTD")
        val uSDSTD: Double = 0.0,
        @SerializedName("USDSVC")
        val uSDSVC: Double = 0.0,
        @SerializedName("USDSYP")
        val uSDSYP: Double = 0.0,
        @SerializedName("USDSZL")
        val uSDSZL: Double = 0.0,
        @SerializedName("USDTHB")
        val uSDTHB: Double = 0.0,
        @SerializedName("USDTJS")
        val uSDTJS: Double = 0.0,
        @SerializedName("USDTMT")
        val uSDTMT: Double = 0.0,
        @SerializedName("USDTND")
        val uSDTND: Double = 0.0,
        @SerializedName("USDTOP")
        val uSDTOP: Double = 0.0,
        @SerializedName("USDTRY")
        val uSDTRY: Double = 0.0,
        @SerializedName("USDTTD")
        val uSDTTD: Double = 0.0,
        @SerializedName("USDTWD")
        val uSDTWD: Double = 0.0,
        @SerializedName("USDTZS")
        val uSDTZS: Double = 0.0,
        @SerializedName("USDUAH")
        val uSDUAH: Double = 0.0,
        @SerializedName("USDUGX")
        val uSDUGX: Double = 0.0,
        @SerializedName("USDUSD")
        val uSDUSD: Int = 0,
        @SerializedName("USDUYU")
        val uSDUYU: Double = 0.0,
        @SerializedName("USDUZS")
        val uSDUZS: Double = 0.0,
        @SerializedName("USDVEF")
        val uSDVEF: Double = 0.0,
        @SerializedName("USDVND")
        val uSDVND: Int = 0,
        @SerializedName("USDVUV")
        val uSDVUV: Double = 0.0,
        @SerializedName("USDWST")
        val uSDWST: Double = 0.0,
        @SerializedName("USDXAF")
        val uSDXAF: Double = 0.0,
        @SerializedName("USDXAG")
        val uSDXAG: Double = 0.0,
        @SerializedName("USDXAU")
        val uSDXAU: Double = 0.0,
        @SerializedName("USDXCD")
        val uSDXCD: Double = 0.0,
        @SerializedName("USDXDR")
        val uSDXDR: Double = 0.0,
        @SerializedName("USDXOF")
        val uSDXOF: Double = 0.0,
        @SerializedName("USDXPF")
        val uSDXPF: Double = 0.0,
        @SerializedName("USDYER")
        val uSDYER: Double = 0.0,
        @SerializedName("USDZAR")
        val uSDZAR: Double = 0.0,
        @SerializedName("USDZMK")
        val uSDZMK: Double = 0.0,
        @SerializedName("USDZMW")
        val uSDZMW: Double = 0.0,
        @SerializedName("USDZWL")
        val uSDZWL: Double = 0.0
    )
}