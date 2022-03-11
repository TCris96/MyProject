package com.sda.task.enums.task3;

public enum TemperatureConvert {
    C_F('C', 'F', new Converter() {
        @Override
        public float converter(float tempIn) {
            return (tempIn * 5 / 9) + 32;
        }
    }),
    C_K('C', 'K', new Converter() {
        @Override
        public float converter(float tempIn) {
            return tempIn + 273.15f;
        }
    }),
    K_C('K', 'C', new Converter() {
        @Override
        public float converter(float tempIn) {
            return tempIn - 273.15f;
        }
    }),
    F_C('F', 'C', new Converter() {
        @Override
        public float converter(float tempIn) {
            return (tempIn - 32) * 5 / 9;
        }
    }),
    F_K('F', 'K', new Converter() {
        @Override
        public float converter(float tempIn) {
            return (tempIn - 32f) * 5 / 9 + 273.15f;
        }
    }),
    K_F('K', 'F', new Converter() {
        @Override
        public float converter(float tempIn) {
            return (tempIn + 273.15f) * 5 / 9 + 32;
        }
    });

    private char input;
    private char output;
    private Converter converter;

    TemperatureConvert(char input, char output, Converter converter) {
        this.input = input;
        this.output = output;
        this.converter = converter;
    }

    public static float convertTemperature(char input, char output, float temp){
        for(TemperatureConvert temperatureConvert : values()){
            if(temperatureConvert.input == input && temperatureConvert.output == output){
                return temperatureConvert.converter.converter(temp);
            }
        }
        return 0;
    }
}
