

class WeatherData() : Subject {

    private var temperature: Float = 0f
    private var humidity: Float = 0f
    private var pressure: Float = 0f
    private var observers: MutableList<Observer> = mutableListOf()

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        val i = observers.indexOf(o)
        if (i >= 0) {
            observers.removeAt(i)
        }
    }

    override fun notifiObservers() {
        for (i in 0 until observers.size) {
            val observer = observers.get(i)
            observer.update(temperature, humidity, pressure)
        }
    }

    fun measurementsChanged() {
        notifiObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
    // Другие методы
}