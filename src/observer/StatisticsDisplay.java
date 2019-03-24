package observer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StatisticsDisplay implements Observer, DisplayElement {

    private Subject weatherData;
    private List<Float> temperatures;

    public StatisticsDisplay(Subject weatherData) {
        this.temperatures = new ArrayList<>();
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        Float avg = this.temperatures.stream().reduce((a, b) -> a + b).orElseThrow() / this.temperatures.size();
        Float max = this.temperatures.stream().max(Comparator.comparing(f -> f)).orElseThrow();
        Float min = this.temperatures.stream().min(Comparator.comparing(f -> f)).orElseThrow();

        String message = String.format("Avg/Max/Min temperature = %.1fF, %.1fF, %.1fF", avg, max, min);
        System.out.println(message);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperatures.add(temp);
        this.display();
    }
}
