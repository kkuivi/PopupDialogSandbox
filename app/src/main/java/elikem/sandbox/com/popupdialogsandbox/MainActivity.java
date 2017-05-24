package elikem.sandbox.com.popupdialogsandbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void thumbsUp(View view) {

        PopupDialogFragment popupDialogFragment = PopupDialogFragment.getNewPopupDialogFragment("Good", R.drawable.thumb_up);
        popupDialogFragment.show(getSupportFragmentManager(), "");

    }

    public void thumbsDown(View view) {

        PopupDialogFragment popupDialogFragment = PopupDialogFragment.getNewPopupDialogFragment("Bad", R.drawable.thumb_down);
        popupDialogFragment.show(getSupportFragmentManager(), "");

    }
}
