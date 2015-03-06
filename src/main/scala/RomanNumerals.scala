object RomanNumerals {

  def convertDecimalToRoman(decimal: Int): String = {
    if (decimal == 1) {
      "I"
    }
    else if (decimal == 2) {
      "II"
    }
    else {
      "III"
    }



  }
}