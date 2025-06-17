import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TemperatureSpec extends AnyFlatSpec with Matchers {

  "Temperature class" should "be initialized with degrees and scale" in {
    val temp = new Temperature(25.0, "C")
    temp.degrees should be (25.0)
    temp.scale should be ("C")
  }

  it should "be created via the apply method" in {
    val temp = Temperature(25.0, "C")
    temp.degrees should be (25.0)
    temp.scale should be ("C")
  }

  it should "be created via the celsius factory method" in {
    val temp = Temperature.celsius(25.0)
    temp.degrees should be (25.0)
    temp.scale should be ("C")
  }

  it should "be created via the fahrenheit factory method" in {
    val temp = Temperature.fahrenheit(77.0)
    temp.degrees should be (77.0)
    temp.scale should be ("F")
  }

  it should "be created via the kelvin factory method" in {
    val temp = Temperature.kelvin(298.15)
    temp.degrees should be (298.15)
    temp.scale should be ("K")
  }

  it should "convert from Celsius to Celsius correctly" in {
    val temp = Temperature.celsius(25.0)
    val converted = temp.toCelsius
    converted.degrees should be (25.0)
    converted.scale should be ("C")
  }

  it should "convert from Fahrenheit to Celsius correctly" in {
    val temp = Temperature.fahrenheit(68.0)
    val converted = temp.toCelsius
    converted.degrees should be (20.0 +- 0.01) // allow for floating point imprecision
    converted.scale should be ("C")
  }

  it should "convert from Kelvin to Celsius correctly" in {
    val temp = Temperature.kelvin(298.15)
    val converted = temp.toCelsius
    converted.degrees should be (25.0 +- 0.01) // allow for floating point imprecision
    converted.scale should be ("C")
  }

  it should "convert from Celsius to Fahrenheit correctly" in {
    val temp = Temperature.celsius(25.0)
    val converted = temp.toFahrenheit
    converted.degrees should be (77.0 +- 0.01) // allow for floating point imprecision
    converted.scale should be ("F")
  }

  it should "convert from Fahrenheit to Fahrenheit correctly" in {
    val temp = Temperature.fahrenheit(77.0)
    val converted = temp.toFahrenheit
    converted.degrees should be (77.0)
    converted.scale should be ("F")
  }

  it should "convert from Kelvin to Fahrenheit correctly" in {
    val temp = Temperature.kelvin(298.15)
    val converted = temp.toFahrenheit
    converted.degrees should be (77.0 +- 0.01) // allow for floating point imprecision
    converted.scale should be ("F")
  }

  it should "convert from Celsius to Kelvin correctly" in {
    val temp = Temperature.celsius(25.0)
    val converted = temp.toKelvin
    converted.degrees should be (298.15 +- 0.01) // allow for floating point imprecision
    converted.scale should be ("K")
  }

  it should "convert from Fahrenheit to Kelvin correctly" in {
    val temp = Temperature.fahrenheit(77.0)
    val converted = temp.toKelvin
    converted.degrees should be (298.15 +- 0.01) // allow for floating point imprecision
    converted.scale should be ("K")
  }

  it should "convert from Kelvin to Kelvin correctly" in {
    val temp = Temperature.kelvin(298.15)
    val converted = temp.toKelvin
    converted.degrees should be (298.15)
    converted.scale should be ("K")
  }

  it should "format correctly in toString" in {
    Temperature.celsius(25.0).toString should be ("25.0C")
    Temperature.fahrenheit(77.0).toString should be ("77.0F")
    Temperature.kelvin(298.15).toString should be ("298.15K")
  }

  // Testing temperature conversions with different values
  it should "convert freezing point of water correctly" in {
    val freezingC = Temperature.celsius(0.0)
    val freezingF = freezingC.toFahrenheit
    val freezingK = freezingC.toKelvin

    freezingF.degrees should be (32.0 +- 0.01)
    freezingK.degrees should be (273.15 +- 0.01)
  }

  it should "convert boiling point of water correctly" in {
    val boilingC = Temperature.celsius(100.0)
    val boilingF = boilingC.toFahrenheit
    val boilingK = boilingC.toKelvin

    boilingF.degrees should be (212.0 +- 0.01)
    boilingK.degrees should be (373.15 +- 0.01)
  }

  it should "handle conversions from extreme temperatures" in {
    val absoluteZeroK = Temperature.kelvin(0.0)
    val absoluteZeroC = absoluteZeroK.toCelsius
    val absoluteZeroF = absoluteZeroK.toFahrenheit

    absoluteZeroC.degrees should be (-273.15 +- 0.01)
    absoluteZeroF.degrees should be (-459.67 +- 0.01)
  }
}
