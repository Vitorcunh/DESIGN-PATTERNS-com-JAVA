package builderpattern;

public class Car {
    private final String engine;
    private final String wheels;
    private final String color;
    private final Boolean airConditioner;
    private final Boolean eletricWindow;
    private final Integer doorQnt;

    private Car(Builder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.color = builder.color;
        this.airConditioner = builder.airConditioner;
        this.eletricWindow = builder.eletricWindow;
        this.doorQnt = builder.doorQnt;
    }

    public static class Builder {
        private String engine;
        private String wheels;
        private String color;
        private Boolean airConditioner;
        private Boolean eletricWindow;
        private Integer doorQnt;

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

        public Builder setAirConditioner(Boolean airConditioner) {
            this.airConditioner = airConditioner;
            return this;
        }

        public Builder setEletricWindow(Boolean eletricWindow) {
            this.eletricWindow = eletricWindow;
            return this;
        }

        public Builder setDoorQnt(Integer doorQnt) {
            this.doorQnt = doorQnt;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels='" + wheels + '\'' +
                ", color='" + color + '\'' +
                ", airConditioner=" + airConditioner +
                ", eletricWindow=" + eletricWindow +
                ", doorQnt=" + doorQnt +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setEngine("V8")
                .setWheels("18 inch")
                .setColor("Red")
                .setAirConditioner(true)
                .setEletricWindow(true)
                .setDoorQnt(4)
                .build();

        System.out.println(car);
    }
}
