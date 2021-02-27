fun main(args: Array<String>) {
    val weatherData = WeatherData()
    val currentDisplay = CurrentConditionsDisplay(weatherData)

    weatherData.setMeasurements(80f, 65f, 30f)
    weatherData.setMeasurements(85f, 70f, 35f)
    weatherData.setMeasurements(90f, 75f, 40f)




}
