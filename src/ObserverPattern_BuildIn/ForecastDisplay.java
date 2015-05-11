package ObserverPattern_BuildIn;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

	Observable observable;
	private float currentPressure = 29.92f;
	private float lastPressure;
	
	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void display() {
		System.out.println("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	public void update(Observable observalbe, Object arg) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)observalbe;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}

}
