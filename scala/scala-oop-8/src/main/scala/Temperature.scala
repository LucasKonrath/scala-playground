class Temperature (val degrees: Double, val scale: String) {
  override def toString = degrees + scale

  def toCelsius: Temperature = scale match {
    case "F" => new Temperature((degrees - 32) * 5 / 9, "C")
    case "C" => this
    case "K" => new Temperature((degrees - 273.15), "C")
  }

  def toFahrenheit: Temperature = scale match {
    case "F" => this
    case "C" => new Temperature((degrees * 9 / 5) + 32, "F")
    case "K" => new Temperature((degrees - 273.15) * 9 / 5 + 32, "F")
  }

  def toKelvin: Temperature = scale match {
    case "F" => new Temperature((degrees + 459.67) * 5 / 9, "K")
    case "C" => new Temperature(degrees + 273.15, "K")
    case "K" => this
  }
}

object Temperature {
  def apply(degrees: Double, scale: String): Temperature = new Temperature(degrees, scale)
  def celsius(degrees: Double): Temperature = new Temperature(degrees, "C")
  def fahrenheit(degrees: Double): Temperature = new Temperature(degrees, "F")
  def kelvin(degrees: Double): Temperature = new Temperature(degrees, "K")
}
