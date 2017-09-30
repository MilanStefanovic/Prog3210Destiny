package com.example.mstefanovic2598.destiny2app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import java.text.DecimalFormat;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class LightCalculator extends AppCompatActivity implements OnEditorActionListener{


    private TextView txtKinetic;
    private TextView txtEnergy;
    private TextView txtPower;
    private TextView txtHelmet;
    private TextView txtGauntlet;
    private TextView txtChest;
    private TextView txtLegs;
    private TextView txtClassItem;
    private TextView txtTotal;

    private EditText editKinetic;
    private EditText editEnergy;
    private EditText editPower;
    private EditText editHelmet;
    private EditText editGauntlet;
    private EditText editChest;
    private EditText editLegs;
    private EditText editClassItem;
    private EditText editTotal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_calculator);

        txtKinetic = (TextView) findViewById(R.id.textKineticWeapon);
        txtEnergy = (TextView) findViewById(R.id.textEnergyWeapon);
        txtPower = (TextView) findViewById(R.id.textPowerWeapon);
        txtHelmet = (TextView) findViewById(R.id.textHelmet);
        txtGauntlet = (TextView) findViewById(R.id.textGauntlets);
        txtChest = (TextView) findViewById(R.id.textChest);
        txtLegs = (TextView) findViewById(R.id.textLegs);
        txtClassItem = (TextView) findViewById(R.id.textClassItem);
        txtTotal = (TextView) findViewById(R.id.textTotal);

        /*txtKinetic.setEnabled(false);
        txtEnergy.setEnabled(false);
        txtPower.setEnabled(false);
        txtHelmet.setEnabled(false);
        txtGauntlet.setEnabled(false);
        txtChest.setEnabled(false);
        txtLegs.setEnabled(false);
        txtClassItem.setEnabled(false);
        txtTotal.setEnabled(false);
        editTotal.setEnabled(false);*/

        editKinetic = (EditText) findViewById(R.id.editKineticWeapon);
        editEnergy = (EditText) findViewById(R.id.editEnergyWeapon);
        editPower = (EditText) findViewById(R.id.editPowerWeapon);
        editHelmet = (EditText) findViewById(R.id.editHelmet);
        editGauntlet = (EditText) findViewById(R.id.editGauntlets);
        editChest = (EditText) findViewById(R.id.editChest);
        editLegs = (EditText) findViewById(R.id.editLegs);
        editClassItem = (EditText) findViewById(R.id.editClassItem);
        editTotal = (EditText) findViewById(R.id.editTotal);

        editKinetic.setOnEditorActionListener(this);
        editEnergy.setOnEditorActionListener(this);
        editPower.setOnEditorActionListener(this);
        editHelmet.setOnEditorActionListener(this);
        editGauntlet.setOnEditorActionListener(this);
        editChest.setOnEditorActionListener(this);
        editLegs.setOnEditorActionListener(this);
        editClassItem.setOnEditorActionListener(this);



        //calculatePopup();


    }

    public void calculatePopup(){

        String kineticAmountString = editKinetic.getText().toString();
        int kineticAmount;
        if (kineticAmountString.equals("")){
            kineticAmount = 0;
            editKinetic.setError("Please enter number");
        }
        else{
            kineticAmount = Integer.parseInt(kineticAmountString);
        }

        String energyAmountString = editEnergy.getText().toString();
        int energyAmount;
        if (energyAmountString.equals("")){
            energyAmount = 0;
            editEnergy.setError("Please enter number");
        }
        else{
            energyAmount = Integer.parseInt(kineticAmountString);
        }

        String powerAmountString = editPower.getText().toString();
        int powerAmount;
        if (powerAmountString.equals("")){
            powerAmount = 0;
            editPower.setError("Please enter number");
        }
        else{
            powerAmount = Integer.parseInt(kineticAmountString);
        }

        String helmetAmountString = editHelmet.getText().toString();
        int helmetAmount;
        if (helmetAmountString.equals("")){
            helmetAmount = 0;
            editHelmet.setError("Please enter number");
        }
        else{
            helmetAmount = Integer.parseInt(kineticAmountString);
        }

        String gauntletAmountString = editGauntlet.getText().toString();
        int gauntletAmount;
        if (gauntletAmountString.equals("")){
            gauntletAmount = 0;
            editGauntlet.setError("Please enter number");
        }
        else{
            gauntletAmount = Integer.parseInt(kineticAmountString);
        }

        String chestAmountString = editChest.getText().toString();
        int chestAmount;
        if (chestAmountString.equals("")){
            chestAmount = 0;
            editChest.setError("Please enter number");
        }
        else{
            chestAmount = Integer.parseInt(kineticAmountString);
        }

        String legsAmountString = editLegs.getText().toString();
        int legsAmount;
        if (legsAmountString.equals("")){
            legsAmount = 0;
            editLegs.setError("Please enter number");
        }
        else{
            legsAmount = Integer.parseInt(kineticAmountString);
        }

        String classItemAmountString = editClassItem.getText().toString();
        int classItemAmount;
        if (classItemAmountString.equals("")){
            classItemAmount = 0;
            editClassItem.setError("Please enter number");
        }
        else{
            classItemAmount = Integer.parseInt(kineticAmountString);
        }

        double lightTotal = (kineticAmount * 0.143) + (energyAmount * 0.143) + (powerAmount * 0.143) + (helmetAmount * 0.119) +
                (gauntletAmount * 0.119) + (chestAmount * 0.119) + (legsAmount * 0.119) + (classItemAmount * 0.095);

        //DecimalFormat df = new DecimalFormat("#0.00");
        editTotal.setText(Double.toString(lightTotal));

    }

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event){
        calculatePopup();
        return false;
    }


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }
}
