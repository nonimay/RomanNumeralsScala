import org.scalatest._

class RomanNumeralsSpec extends FlatSpec with Matchers {

  it should "convert 1 to I" in {
    RomanNumerals.convertDecimalToRoman(1) should be("I")
  }

  it should "convert 2 to II" in {
    RomanNumerals.convertDecimalToRoman(2) should be("II")
  }

  it should "convert 3 to III" in {
    RomanNumerals.convertDecimalToRoman(3) should be("III")
  }
}




