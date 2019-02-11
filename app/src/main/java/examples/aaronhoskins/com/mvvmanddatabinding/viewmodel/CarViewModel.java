package examples.aaronhoskins.com.mvvmanddatabinding.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;

import com.android.databinding.library.baseAdapters.BR;

import examples.aaronhoskins.com.mvvmanddatabinding.model.car.Car;

public class CarViewModel extends AndroidViewModel {
    MutableLiveData<Car> carMutableLiveData;
    public CarViewModel(@NonNull Application application){
        super(application);
        carMutableLiveData = new MutableLiveData<>();
    }

    public LiveData<Car> getLiveDataCar() {
        return carMutableLiveData;
    }
    public void handleClick(View view) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Handler handler = new Handler(Looper.getMainLooper());
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            carMutableLiveData.setValue(new Car(
                                    "BMW",
                                    "535i",
                                    "2008",
                                    "3.0 V6 TT",
                                    "6 speed",
                                    "Clean"
                            ));

                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}


//    public String getCarModel() {
//        return car.getModel();
//    }
//
//    public String getCarYear() {
//        return car.getYear();
//    }
//    public String getCarEngine() {
//        return car.getEngine();
//    }
//    public String getCarTransmission() {
//        return car.getTransmission();
//    }
//    public String getCarTitleStatus() {
//        return car.getTitleStatus();
//    }

//
//        car.setMake("BMW");
//        car.setModel("5 Series");
//        car.setEngine("3.0 V6 TT");
//        car.setTransmission("6 Speed");
//        car.setYear("2008");
//        car.setTitleStatus("Clean");
//        car.getMake().get();
//        Log.d("TAG", "handleClick: " + car.getMake().get());

