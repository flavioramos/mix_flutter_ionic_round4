package io.ionic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import io.ionic.starter.MainActivity;
import io.ionic.starter.R;

public class HomeActivity extends Activity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
  }

  public void openProject1(View view) {
    startActivity(new Intent(this, MainActivity.class));
  }

  public void openProject2(View view) {

  }
}
