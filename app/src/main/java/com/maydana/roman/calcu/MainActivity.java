package com.maydana.roman.calcu;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvProceso;
    private TextView tvResutado;

    private Button btPunto;
    private Button btCero;
    private Button btIgual;
    private Button btUno;
    private Button btDos;
    private Button btTres;
    private Button btCuatro;
    private Button btCinco;
    private Button btSeis;
    private Button btSiete;
    private Button btOcho;
    private Button btNueve;
    private Button btSumar;
    private Button btRestar;
    private Button btMultp;
    private Button btDividir;
    private Button btLimpiar;
    private ImageButton btRotar;


    public static double resultado;
    public static double num1 = 0, num2 = 0;
    public static String a = "0", oper = "";
    public static boolean decimal = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btPunto = (Button) findViewById(R.id.btPunto);
        btCero = (Button) findViewById(R.id.btCero);
        btUno = (Button) findViewById(R.id.btUno);
        btDos = (Button) findViewById(R.id.btDos);
        btTres = (Button) findViewById(R.id.btTres);
        btCuatro = (Button) findViewById(R.id.btCuatro);
        btCinco = (Button) findViewById(R.id.btCinco);
        btSeis = (Button) findViewById(R.id.btSeis);
        btSiete = (Button) findViewById(R.id.btSiete);
        btOcho = (Button) findViewById(R.id.btOcho);
        btNueve = (Button) findViewById(R.id.btNueve);
        btSumar = (Button) findViewById(R.id.btSumar);
        btRestar = (Button) findViewById(R.id.btRestar);
        btMultp = (Button) findViewById(R.id.btMultip);
        btDividir = (Button) findViewById(R.id.btDivision);
        btLimpiar = (Button) findViewById(R.id.btLimpiar);
        btRotar = (ImageButton) findViewById(R.id.btRotar);
        btIgual = (Button) findViewById(R.id.btIgual);


        btPunto.setOnClickListener(this);
        btCero.setOnClickListener(this);
        btUno.setOnClickListener(this);
        btDos.setOnClickListener(this);
        btTres.setOnClickListener(this);
        btCuatro.setOnClickListener(this);
        btCinco.setOnClickListener(this);
        btSeis.setOnClickListener(this);
        btSiete.setOnClickListener(this);
        btOcho.setOnClickListener(this);
        btNueve.setOnClickListener(this);
        btSumar.setOnClickListener(this);
        btRestar.setOnClickListener(this);
        btMultp.setOnClickListener(this);
        btDividir.setOnClickListener(this);
        btLimpiar.setOnClickListener(this);
        btRotar.setOnClickListener(this);
        btIgual.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        tvResutado = (TextView) findViewById(R.id.tvResultado);
        tvProceso = (TextView) findViewById(R.id.tvProceso);
        String x = "";


        try {

            switch (id) {
                case R.id.btUno:
                    a += "1";
                    tvProceso.setText(tvProceso.getText().toString() + "1");
                    break;
                case R.id.btDos:
                    a += "2";
                    tvProceso.setText(tvProceso.getText().toString() + "2");
                    break;
                case R.id.btTres:
                    a += "3";
                    tvProceso.setText(tvProceso.getText().toString() + "3");
                    break;
                case R.id.btCuatro:
                    a += "4";
                    tvProceso.setText(tvProceso.getText().toString() + "4");
                    break;
                case R.id.btCinco:
                    a += "5";
                    tvProceso.setText(tvProceso.getText().toString() + "5");
                    break;
                case R.id.btSeis:
                    a += "6";
                    tvProceso.setText(tvProceso.getText().toString() + "6");
                    break;
                case R.id.btSiete:
                    a += "7";
                    tvProceso.setText(tvProceso.getText().toString() + "7");
                    break;
                case R.id.btOcho:
                    a += "8";
                    tvProceso.setText(tvProceso.getText().toString() + "8");
                    break;
                case R.id.btNueve:
                    a += "9";
                    tvProceso.setText(tvProceso.getText().toString() + "9");
                    break;
                case R.id.btCero:
                    a += "0";
                    tvProceso.setText(tvProceso.getText().toString() + "0");
                    break;
                case R.id.btPunto:
                    if (!decimal) {
                        a += ".";
                        tvProceso.setText(tvProceso.getText().toString() + ".");
                        decimal = true;

                    } else return;
                    break;


                case R.id.btSumar:
                    if (oper == "") {
                        if (num1 == 0)
                            num1 = Double.parseDouble(a.toString());
                        tvProceso.setText(tvProceso.getText().toString() + "+");
                        a = "";
                    } else {
                        x = tvProceso.getText().toString();
                        x = x.substring(x.length() - 1, x.length());
                        if (x.equals(oper) || x.equals(oper) || x.equals(oper) || x.equals(oper))
                            tvProceso.setText(tvProceso.getText().toString().substring(0, tvProceso.getText().toString().length() - 1) + "+");
                        else {
                            actNum2();
                            tvProceso.setText(resultado + "" + "+");
                        }

                    }
                    oper = "+";
                    decimal = false;
                    break;
                case R.id.btRestar:
                    if (oper == "") {
                        if (num1 == 0)
                            num1 = Double.parseDouble(a.toString());
                        tvProceso.setText(tvProceso.getText().toString() + "-");
                        a = "";
                    } else {
                        x = tvProceso.getText().toString();
                        x = x.substring(x.length() - 1, x.length());
                        if (x.equals(oper) || x.equals(oper) || x.equals(oper) || x.equals(oper))
                            tvProceso.setText(tvProceso.getText().toString().substring(0, tvProceso.getText().toString().length() - 1) + "-");
                        else{
                            actNum2();
                            tvProceso.setText(resultado + "" + "-");
                        }

                    }
                    oper = "-";
                    decimal = false;
                    break;
                case R.id.btMultip:
                    if (oper == "") {
                        if (num1 == 0)
                            num1 = Double.parseDouble(a.toString());
                        tvProceso.setText(tvProceso.getText().toString() + "*");
                        a = "";
                    } else {
                        x = tvProceso.getText().toString();
                        x = x.substring(x.length() - 1, x.length());
                        if (x.equals(oper) || x.equals(oper) || x.equals(oper) || x.equals(oper))
                            tvProceso.setText(tvProceso.getText().toString().substring(0, tvProceso.getText().toString().length() - 1) + "*");
                        else {
                            actNum2();
                            tvProceso.setText(resultado + "" + "*");
                        }

                    }
                    oper = "*";
                    decimal = false;

                    break;
                case R.id.btDivision:
                    if (oper == "") {
                        if (num1 == 0)
                            num1 = Double.parseDouble(a.toString());
                        tvProceso.setText(tvProceso.getText().toString() + "/");
                        a = "";
                    } else {
                        x = tvProceso.getText().toString();
                        x = x.substring(x.length() - 1, x.length());
                        if (x.equals(oper) || x.equals(oper) || x.equals(oper) || x.equals(oper))
                            tvProceso.setText(tvProceso.getText().toString().substring(0, tvProceso.getText().toString().length() - 1) + "/");
                        else {
                            actNum2();
                            tvProceso.setText(resultado + "" + "/");
                        }

                    }
                    oper = "/";
                    decimal = false;

                    break;
                case R.id.btLimpiar:
                    limpiar();
                    break;
                case R.id.btIgual:
                    num2 = Double.parseDouble(a);
                    operar();
                    tvProceso.setText(String.valueOf(resultado));
                    num1 = resultado;
                    oper = "";
                    a = "0";
                    tvResutado.setText("");
                    break;


            }

        } catch (Exception e) {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    private void limpiar() {
        num1 = 0;
        num2 = 0;
        a = "0";
        oper = "";
        tvProceso.setText("");
        decimal = false;
        tvResutado.setText("");
    }


    private void actNum2() {
        num2 = Double.parseDouble(a.toString());
        operar();

        num1 = resultado;
        a = "0";

    }

    private void operar() {

        if (oper.equals("+")) {
            resultado = num1 + num2;
        } else if (oper.equals("-"))
            resultado = num1 - num2;
        else if (oper.equals("*"))
            resultado = num1 * num2;
        else if (oper.equals("/"))
            resultado = num1 / num2;
        tvResutado.setText(resultado + "");
    }

}
