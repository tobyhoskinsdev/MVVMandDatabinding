package examples.aaronhoskins.com.mvvmanddatabinding.model.car;

import android.databinding.Bindable;
import android.databinding.Observable;
import android.databinding.ObservableField;
import android.databinding.adapters.TextViewBindingAdapter;

public class Car {
    private String make;
    private String model;
    private String year;
    private String engine;
    private String transmission;
    private String titleStatus;

    private ObservableField<String> makeObs = new ObservableField<>();
    private ObservableField<String> modelObs = new ObservableField<>();
    private ObservableField<String> yearObs = new ObservableField<>();
    private ObservableField<String> engineObs = new ObservableField<>();
    private ObservableField<String> transmissionObs = new ObservableField<>();
    private ObservableField<String> titleStatusObs = new ObservableField<>();

    public ObservableField<String> getMakeObs() {
        return makeObs;
    }

    public ObservableField<String> getModelObs() {
        return modelObs;
    }

    public ObservableField<String> getYearObs() {
        return yearObs;
    }

    public ObservableField<String> getEngineObs() {
        return engineObs;
    }

    public ObservableField<String> getTransmissionObs() {
        return transmissionObs;
    }

    public ObservableField<String> getTitleStatusObs() {
        return titleStatusObs;
    }

    public Car() {

    }

    public Car(String make, String model, String year, String engine, String transmission, String titleStatus) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.transmission = transmission;
        this.titleStatus = titleStatus;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {

        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getTitleStatus() {
        return titleStatus;
    }

    public void setTitleStatus(String titleStatus) {
        this.titleStatus = titleStatus;
    }
}
