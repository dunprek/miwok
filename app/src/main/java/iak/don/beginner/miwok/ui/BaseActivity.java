package iak.don.beginner.miwok.ui;

import android.content.DialogInterface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import iak.don.beginner.miwok.R;

/**
 * Created by don on 11/27/2016.
 */
public class BaseActivity extends AppCompatActivity {
    public void showBackArrow(){
        ActionBar toolbar = getSupportActionBar();
        if(toolbar != null){
            toolbar.setDisplayHomeAsUpEnabled(true);
        } else {
            showErrorAlert("Toolbar is not set");
        }
    }

    public void showHomeButton(){
        ActionBar toolbar = getSupportActionBar();
        if(toolbar != null){
            toolbar.setDisplayShowHomeEnabled(true);
        } else {
            showErrorAlert("Toolbar is not set");
        }
    }

    public void setToolbarTitle(String title){
        ActionBar toolbar = getSupportActionBar();
        if(toolbar != null){
            toolbar.setTitle(title);
        } else {
            showErrorAlert("Toolbar is not set");
        }
    }

    public void showErrorAlert(String message){
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle(R.string.alert_title)
                .setMessage(message)
                .setPositiveButton(R.string.close, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();
        alertDialog.show();

        //set dialog button color
        //get color
        int buttonColor = getResources().getColor(R.color.colorAccent);
        //get the positive button
        Button pbutton = alertDialog.getButton(DialogInterface.BUTTON_POSITIVE);
        //set the color to the buttton
        pbutton.setTextColor(buttonColor);
    }
}
