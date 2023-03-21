package com.example.alohachat.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.alohachat.Fragment.SplashFragment;
import com.example.alohachat.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Sử dụng FragmentManager để quản lý các Fragment
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Bắt đầu một giao dịch Fragment
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Thêm Fragment vào giao dịch bằng phương thức add()
        SplashFragment fragment = new SplashFragment();
        fragmentTransaction.add(R.id.fragment_container, fragment);

        // Hoàn thành giao dịch Fragment bằng phương thức commit()
        fragmentTransaction.commit();


    }
}