package com.example.appioniccaller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
  }

  public void openProject1(View view) {
    startActivity(new Intent(this, io.ionic.starter.MainActivity.class));
  }

  public void openProject2(View view) {
    startActivity(new Intent(this, io.ionic.starter.project2.MainActivity.class));
  }
}
