package com.example.asusrog.konvertersuhu;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editsuhu;
    Spinner spinnersuhu1, spinnersuhu2;
    Button btnReset,btnConvert;
    TextView textHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editsuhu = (EditText)findViewById(R.id.edit_suhu);
        spinnersuhu1 = (Spinner)findViewById(R.id.Spinner1);
        spinnersuhu2 = (Spinner)findViewById(R.id.Spinner2);
        btnReset = (Button)findViewById(R.id.reset);
        btnConvert = (Button)findViewById(R.id.convert);
        textHasil = (TextView)findViewById(R.id.TextConvert);

        //Convert suhu
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double suhu = Double.parseDouble(editsuhu.getText().toString());
                int index1 = spinnersuhu1.getSelectedItemPosition();
                int index2 = spinnersuhu2.getSelectedItemPosition();
                double hasil;
                switch (index1){
                    case 0:
                        switch (index2){
                            case 0:
                                hasil = suhu;
                                break;
                            case 1:
                                hasil = (suhu-273.15)*4/5;
                                break;
                            case 2:
                                hasil = (suhu-273)*1.8+32;
                                break;
                            case 3:
                                hasil = suhu-273.15;
                                break;
                            default:
                                hasil = 0;
                                break;
                    }
                     break;
                    case 1:
                        switch (index2){
                            case 0:
                                hasil = suhu*5/4+273.15;
                                break;
                            case 1:
                                hasil = suhu;
                                break;
                            case 2:
                                hasil = suhu*9/4+32;
                                break;
                            case 3:
                                hasil = suhu*5/4;
                                break;
                            default:
                                hasil = 0;
                                break;
                        }
                        break;
                    case 2:
                        switch (index2){
                            case 0:
                                hasil = (suhu+459.67)*5/9;
                                break;
                            case 1:
                                hasil = (suhu-32)*4/9;
                                break;
                            case 2:
                                hasil = suhu;
                                break;
                            case 3:
                                hasil = (suhu-32)*5/9;
                                break;
                            default:
                                hasil = 0;
                                break;
                        }
                        break;
                    case 3:
                        switch (index2){
                            case 0:
                                hasil = suhu+273.15;
                                break;
                            case 1:
                                hasil = suhu*4/5;
                                break;
                            case 2:
                                hasil = suhu*9/5+32;
                                break;
                            case 3:
                                hasil = suhu;
                                break;
                            default:
                                hasil = 0;
                                break;
                        }
                        break;
                    default:
                        hasil= 0;
                        break;
                }
                String hasilConvert= hasil+ "";
                textHasil.setText(hasilConvert);
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double hasil = 0;
                String hasilConvert= hasil+ "";
                textHasil.setText(hasilConvert);
            }
        });
    }
}
