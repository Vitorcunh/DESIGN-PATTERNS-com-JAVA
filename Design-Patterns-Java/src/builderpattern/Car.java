package builderpattern;

public class Car {
    private String engine;
    private String wheels;
    private String color;
    private Boolean airConditioner;
    private Boolean eletricWindow;
    private Integer doorQnt;

    private Car(Builder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.color = builder.color;
    }

    public static class Builder {
        private String engine;
        private String wheels;
        private String color;

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setWheels(String wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
// Uso do Builder
Car car = new Car.Builder()
    .setEngine("V8")
    .setWheels("18 inch")
    .setColor("Red")
    .build();


// Ou, usando Lombok
import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Car {
    private String engine;
    private String wheels;
    private String color;
}