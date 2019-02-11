package examples.aaronhoskins.com.mvvmanddatabinding.view.activities;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import examples.aaronhoskins.com.mvvmanddatabinding.R;
import examples.aaronhoskins.com.mvvmanddatabinding.databinding.ActivityMainBinding;
import examples.aaronhoskins.com.mvvmanddatabinding.model.car.Car;
import examples.aaronhoskins.com.mvvmanddatabinding.viewmodel.CarViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        CarViewModel viewModel = ViewModelProviders.of(this).get(CarViewModel.class);
        //activityMainBinding.setViewModel(new CarViewModel(this.getApplication()));
        activityMainBinding.setCar(new Car());
        activityMainBinding.executePendingBindings();
        viewModel.getLiveDataCar().observe(this, new Observer<Car>() {
            @Override
            public void onChanged(@Nullable Car car) {
                Log.d("TAG", "onChanged: " + car);
            }
        });
        activityMainBinding.setViewModel(viewModel);
    }
}
